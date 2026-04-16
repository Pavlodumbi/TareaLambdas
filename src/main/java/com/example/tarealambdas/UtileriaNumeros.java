package com.example.tarealambdas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class UtileriaNumeros {

    public static void multiplicadorPorFactor(ArrayList<Integer> entrada, Integer factor){
        if(factor == null)return;

        entrada.replaceAll(t-> t*factor);
    }

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros){
        if(numeros == null) return new HashSet<>();

        HashSet<Integer> unicos = (HashSet<Integer>) numeros.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .collect(Collectors.toSet());
        return unicos;
    }



}

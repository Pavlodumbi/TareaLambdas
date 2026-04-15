package com.example.tarealambdas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class modificarNumeros {

    public static void multiplicarArrayListFactor(ArrayList<Integer> entrada, int factor){
        entrada.replaceAll(t-> t*factor);
    }

    public static HashSet<Integer> obtenerCuadradosUnicos(ArrayList<Integer> numeros){
        HashSet<Integer> unicos = (HashSet<Integer>) numeros.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .collect(Collectors.toSet());
        return unicos;
    }
}

package com.example.tarealambdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class modificarString {

    public static void aplicarFiltro(ArrayList<String> cadenas, char letra, int longitud){
        cadenas.removeIf(c -> c.length() < longitud || c.charAt(0) == letra);
    }

    public static ArrayList<String> modificarAMayus(ArrayList<String> lista){
        ArrayList<String> nuevo = (ArrayList<String>) lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return nuevo;
    }

    public static HashMap<String,Integer> lengthMap(ArrayList<String> palabras){
        HashMap<String,Integer> claveValor =  (HashMap<String, Integer>) palabras.stream()
                .collect(Collectors.toMap(
                p -> p,
                p -> p.length()
        ));
        return claveValor;
    }
}

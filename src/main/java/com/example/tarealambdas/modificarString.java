package com.example.tarealambdas;

import java.lang.reflect.Array;
import java.util.*;
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

    public static void modificarInventario(HashMap<String,Double> inventario){
        System.out.println("_________________________________________________________");
        System.out.println("Inventario con 10% de descuento:");
        inventario.forEach((clave,valor) -> {
            System.out.print(clave + " - ");
            System.out.println(valor * .9);
        });
        System.out.println("_________________________________________________________");
    }

    public static HashMap<String,Integer> contadorFrecuencias(ArrayList<String> palabras){
        HashMap<String,Integer> palabrasConv = new HashMap<>();

         palabras.forEach(p -> palabrasConv
                .compute(p,(clave,valor) -> valor == null? 1 : valor + 1 ));

         return palabrasConv;

    }

    public static ArrayList<String> clasificarPalabras(HashMap<String,Integer> palabras, int valor){
        ArrayList<String> clasificadas = (ArrayList<String>)  palabras.entrySet()
                .stream()
                .filter(p -> p.getValue() < valor)
                .map(p -> p.getKey())
                .collect(Collectors.toList());
        return clasificadas;
    }

    public static HashSet<String> deduplicarPalabras(String palabraGrandota, int nLetras){
        String[] palabras = palabraGrandota.split(" ");
        HashSet<String> deduplicadas = (HashSet<String>) Arrays.stream(palabras)
                .filter(p -> p.length() < nLetras)
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
        return deduplicadas;
    }
}

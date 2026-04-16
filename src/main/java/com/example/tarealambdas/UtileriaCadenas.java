package com.example.tarealambdas;


import java.util.*;
import java.util.stream.Collectors;

public class UtileriaCadenas {

    public static void filtrarPorLetraYLongitud(ArrayList<String> cadenas, char letra, Integer longitud){
        if(longitud == null || cadenas == null)return;

        cadenas.removeIf(c -> c.length() < longitud || Character.toLowerCase(c.charAt(0)) == Character.toLowerCase(letra));
    }

    public static ArrayList<String> conversorMayusculas(ArrayList<String> lista){
        if(lista == null) return new ArrayList<>();

        ArrayList<String> nuevo = (ArrayList<String>) lista.stream()
                .filter(t-> t != null) //Para que no de error por algun elemento null
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return nuevo;
    }

    public static HashMap<String,Integer> mapaLongitudes(ArrayList<String> palabras){
        if(palabras == null) return new HashMap<>();

        HashMap<String,Integer> claveValor =  (HashMap<String, Integer>) palabras.stream()
                .collect(Collectors.toMap(
                p -> p,
                p -> p.length(),
                        (a,b) -> a
        ));
        return claveValor;
    }

    public static void mostrarDescuentoInventario(HashMap<String,Double> inventario){
        if(inventario == null) return;

        System.out.println("Inventario con 10% de descuento:");
        inventario.forEach((clave,valor) -> {
            System.out.print(clave + " - ");
            System.out.println(valor * .9);
        });
    }

    public static HashMap<String,Integer> contadorFrecuencias(ArrayList<String> palabras){
        if(palabras == null) return new HashMap<>();

        HashMap<String,Integer> palabrasConv = new HashMap<>();

         palabras.forEach(p -> palabrasConv
                .compute(p,(clave,valor) -> valor == null? 1 : valor + 1 ));

         return palabrasConv;

    }

    public static ArrayList<String> clasificadorPalabras(HashMap<String,Integer> palabras, Integer valor){
        if(valor == null || palabras == null)return new ArrayList<>();

        ArrayList<String> clasificadas = (ArrayList<String>)  palabras.entrySet()
                .stream()
                .filter(p -> p.getValue() < valor)
                .map(p -> p.getKey())
                .collect(Collectors.toList());
        return clasificadas;
    }

    public static HashSet<String> deduplicadorPalabras(String palabraGrandota, Integer nLetras){
        if(palabraGrandota == null || nLetras == null) return new HashSet<>();

        String nuevaGrandota = palabraGrandota.replaceAll("\\W+"," ");
        String[] palabras = nuevaGrandota.split("\\s+");

        HashSet<String> deduplicadas = (HashSet<String>) Arrays.stream(palabras)
                .filter(p -> p.length() < nLetras)
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
        return deduplicadas;
    }

    public static void limitadorFrecuencias(HashMap<String,Integer> palabras, Integer limite){
        if(limite == null || palabras == null) return;
        palabras.replaceAll((clave,valor) -> valor > limite?  limite : valor );
    }
}

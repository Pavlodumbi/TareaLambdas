package com.example.tarealambdas;

import jdk.management.HotSpotAOTCacheMXBean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class main {

    static void main(String[] args) {
        ArrayList<Integer> prueba = new ArrayList();

        //Multiplicar por factor
        for(int i = 0; i < 10; i++){
            prueba.add(i);
        }
        modificarNumeros.multiplicarArrayListFactor(prueba,4);
        System.out.println(prueba);


        // Eliminar cadenas si tiene la primera letra o menos de N elementos
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Hola");
        cadenas.add("Como");
        cadenas.add("adios");
        cadenas.add("a esto no se vera");
        cadenas.add("ni");
        modificarString.aplicarFiltro(cadenas, 'a',4);
        System.out.println(cadenas);

        //convertir a mayusculas
        ArrayList<String> convertidos = modificarString.modificarAMayus(cadenas);
        System.out.println(convertidos);

        //Obtener cuadrados Unicos
        ArrayList<Integer>  numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numeros.add(i);
            numeros.add(i);
        }
        System.out.println(numeros);
        HashSet<Integer> cuadradosUnicos = modificarNumeros.obtenerCuadradosUnicos(numeros);
        System.out.println(cuadradosUnicos);


        //Obtener clave y valores de una lista de palabras
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Onrritorinco");
        palabras.add("ballena azul");
        palabras.add("Tom y Jerry");
        palabras.add("enchufe");
        palabras.add("1234");
        System.out.println(palabras);
        HashMap<String,Integer> claveValor = modificarString.lengthMap(palabras);
        System.out.println(claveValor);

        //Modificador de inventario
        HashMap<String,Double> inventario = new HashMap<>();
        inventario.put("Laptop",500.0);
        inventario.put("Perapod",100.0);
        inventario.put("dron de lego", 753.2);
        inventario.put("monitor QHD", 3824.5);
        System.out.println("Inventario antes del descuento:");
        System.out.println(inventario);
        modificarString.modificarInventario(inventario);

        //contador de palabras usamos el mismo ArrayList palabras de arriba
        for(int i = 0; i < 5; i ++){
            palabras.add("Onrritorinco");
            palabras.add("ballena azul");
            palabras.add("Tom y Jerry");
            palabras.add("enchufe");
            palabras.add("1234");
            palabras.add("enchufe");
            palabras.add("1234");
            palabras.add("enchufe");
            palabras.add("1234");
            palabras.add("hola a todos");
            palabras.add("Tom y Jerry");
        }
        System.out.println(palabras);
        HashMap<String,Integer> palabrasFrecuencias =  modificarString.contadorFrecuencias(palabras);
        System.out.println(palabrasFrecuencias);

        //Clasificador de palabras
        System.out.println("Clasificador de palabras:");
        System.out.println("Palabras antes de clasificar: " + palabrasFrecuencias);
        ArrayList<String> clasificadas = modificarString.clasificarPalabras(palabrasFrecuencias,5);
        System.out.println("Palabras clasificadas: " + clasificadas);
    }
}

package com.example.tarealambdas;

import java.util.ArrayList;
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


        ArrayList<String> palabras = new ArrayList<>();

    }
}

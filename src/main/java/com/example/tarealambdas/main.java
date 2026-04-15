package com.example.tarealambdas;

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


    }
}

package com.example.tarealambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    static void main(String[] args) {
        ArrayList<Integer> prueba = new ArrayList();

        //Multiplicar por factor
        for(int i = 0; i < 10; i++){
            prueba.add(i);
        }
        System.out.println("Multiplicar lista por un factor:");
        System.out.println("Antes de modificar:");
        System.out.println(prueba + "\n");

        ModificadorNumeros.multiplicarArrayListFactor(prueba,4);
        System.out.println("Despues de utilizar un factor de 4:");
        System.out.println(prueba);
        System.out.println("____________________________________________________________________________________________________");

        // Eliminar cadenas si tiene la primera letra o menos de N elementos
        System.out.println("Eliminador de cadenas si tiene la primera letra o menos de N elementos");
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Hola");
        cadenas.add("Como");
        cadenas.add("adios");
        cadenas.add("a esto no se vera");
        cadenas.add("a esto tampoco");
        cadenas.add("Tal vez yo si");
        cadenas.add("ni");
        System.out.println("cadena original:");
        System.out.println(cadenas + "\n");

        ModificadorString.aplicarFiltro(cadenas, 'a',4);
        System.out.println("Cadena con filtro letra 'a' o menos de 4 elementos:");
        System.out.println(cadenas);
        System.out.println("____________________________________________________________________________________________________");

        //convertir a mayusculas
        System.out.println("Convertir una lista de palabras a mayusculas a un nuevo ArrayList:");
        System.out.println("cadena original: ");
        System.out.println(cadenas + "\n");

        ArrayList<String> convertidos = ModificadorString.modificarAMayus(cadenas);
        System.out.println("cadena despues de convertir a Mayusculas: ");
        System.out.println(convertidos);
        System.out.println("____________________________________________________________________________________________________");

        //Obtener cuadrados Unicos
        System.out.println("Obtener cuadrados de numeros pares unicos");

        ArrayList<Integer>  numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numeros.add(i);
            numeros.add(i);
        }
        System.out.println("numeros originales:");
        System.out.println(numeros + "\n");
        HashSet<Integer> cuadradosUnicos = ModificadorNumeros.obtenerCuadradosUnicos(numeros);
        System.out.println("Numeros despues de aplicar metodo:");
        System.out.println(cuadradosUnicos);
        System.out.println("____________________________________________________________________________________________________");

        //Obtener clave y valores de una lista de palabras
        System.out.println("Hacer un HashMap de una palabra con su tamaño");
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Onrritorinco");
        palabras.add("ballena azul");
        palabras.add("Tom y Jerry");
        palabras.add("enchufe");
        palabras.add("1234");
        palabras.add("termito");
        System.out.println("Lista de palabras original: ");
        System.out.println(palabras + "\n");

        HashMap<String,Integer> claveValor = ModificadorString.lengthMap(palabras);
        System.out.println("Convertido a HashMap obteniendo su longitud: ");
        System.out.println(claveValor);
        System.out.println("____________________________________________________________________________________________________");

        //Modificador de inventario
        System.out.println("Aplicar un 10% de descuento a productos sin modificar su valor original: ");
        HashMap<String,Double> inventario = new HashMap<>();
        inventario.put("Laptop",500.0);
        inventario.put("Perapod",100.0);
        inventario.put("dron de lego", 753.2);
        inventario.put("monitor QHD", 3824.5);
        System.out.println("Inventario antes del descuento:");
        System.out.println(inventario + "\n");
        ModificadorString.modificarInventario(inventario);

        System.out.println(" \nComprobamos que mantienen su valor original:");
        System.out.println(inventario + "\n");
        System.out.println("____________________________________________________________________________________________________");

        //contador de palabras usamos el mismo ArrayList palabras de arriba
        System.out.println("Metodo para contar cantidad de veces que se repite una palabra: ");
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
        System.out.println("Palabras:");
        System.out.println(palabras + "\n");
        HashMap<String,Integer> palabrasFrecuencias =  ModificadorString.contadorFrecuencias(palabras);
        System.out.println("Palabras en un HashMap contadas:");
        System.out.println(palabrasFrecuencias);
        System.out.println("____________________________________________________________________________________________________");

        //Clasificador de palabras usamos el mismo hashmap de palabras frecuencias
        System.out.println("Clasificador de palabras:");
        System.out.println("Palabras antes de clasificar: ");
        System.out.println(palabrasFrecuencias + "\n");
        ArrayList<String> clasificadas = ModificadorString.clasificarPalabras(palabrasFrecuencias,6);
        System.out.println("Palabras clasificadas: " + clasificadas);
        System.out.println("____________________________________________________________________________________________________");

        //Deduplicar palabras
        System.out.println("Convertir frase larga en Array, filtrar palabras menores a N letras y convertirlas a minusculas: ");
        String palabraGrandota = "Quiero deduplicar esta palabra por lo tanto lo voy a hacer porque quiero y puedo y lo tengo que demostrar como ejemplo por eso tambien lo hago";
        System.out.println(palabraGrandota + "\n");
        HashSet<String> deduplicadas =  ModificadorString.deduplicarPalabras(palabraGrandota, 7);
        System.out.println("Palabra deduplicada: ");
        System.out.println(deduplicadas);
        System.out.println("____________________________________________________________________________________________________");

        //tope de frecuencias samos el mismo hashmap de palabras frecuencias
        System.out.println("Topar frecuencias a un maximo N");
        System.out.println("Limitar frecuencias:");
        System.out.println(palabrasFrecuencias + "\n");
        System.out.println("Limitar a 4 maximo");
        ModificadorString.limitarFrecuencias(palabrasFrecuencias, 4);
        System.out.println(palabrasFrecuencias);
        System.out.println("____________________________________________________________________________________________________");

    }
}

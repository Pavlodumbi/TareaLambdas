package com.example.tarealambdas;

import jdk.jshell.execution.Util;

import java.lang.reflect.Array;
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

        UtileriaNumeros.multiplicadorPorFactor(prueba,4);
        System.out.println("Despues de utilizar un factor de 4:");
        System.out.println(prueba);
        System.out.println("\nCaso edge con factor null:  ");
        UtileriaNumeros.multiplicadorPorFactor(prueba,null);
        System.out.println(prueba);
        System.out.println("(No modifica nada por factor nulo)");

        ArrayList<Integer> vacio = new ArrayList<>();
        UtileriaNumeros.multiplicadorPorFactor(vacio,1);
        System.out.println("\nCaso con una lista vacia:");
        System.out.println(vacio);
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
        System.out.println("Cadena original:");
        System.out.println(cadenas + "\n");

        UtileriaCadenas.filtroSelectivo(cadenas, 'a',4);
        System.out.println("Cadena con filtro letra 'a' o menos de 4 caracteres:");
        System.out.println(cadenas);
        System.out.println("\nCaso longitud nula: ");
        UtileriaCadenas.filtroSelectivo(cadenas, 'b',null);
        System.out.println(cadenas);
        System.out.println("(No modifica nada)");
        System.out.println("\nCaso cadena vacia:");
        ArrayList<String> cadenaVacia = new ArrayList<>();
        UtileriaCadenas.filtroSelectivo(cadenaVacia,'c',3);
        System.out.println(cadenaVacia);

        System.out.println("____________________________________________________________________________________________________");

        //convertir a mayusculas
        System.out.println("Convertir una lista de palabras a mayusculas a un nuevo ArrayList");
        System.out.println("Cadena original: ");
        System.out.println(cadenas + "\n");

        ArrayList<String> convertidos = UtileriaCadenas.conversorMayusculas(cadenas);
        System.out.println("Cadena despues de convertir a Mayusculas: ");
        System.out.println(convertidos);
        System.out.println("Si se envia una cadena vacia: ");
        ArrayList<String> vacia = new ArrayList<>();
        ArrayList<String> recibida = UtileriaCadenas.conversorMayusculas(vacia);
        System.out.println(recibida);
        System.out.println("____________________________________________________________________________________________________");

        //Obtener cuadrados Unicos
        System.out.println("Obtener cuadrados de numeros pares unicos.");

        ArrayList<Integer>  numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numeros.add(i);
            numeros.add(i);
        }
        System.out.println("Numeros originales:");
        System.out.println(numeros + "\n");
        HashSet<Integer> cuadradosUnicos = UtileriaNumeros.cuadradosUnicos(numeros);
        System.out.println("Numeros despues de aplicar metodo:");
        System.out.println(cuadradosUnicos);
        System.out.println("\nCaso de numeros vacio: ");
         ArrayList<Integer> vacios = new ArrayList<>();
        HashSet<Integer> cuadradosUnicosVacio = UtileriaNumeros.cuadradosUnicos(vacios);
        System.out.println(vacios);
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

        HashMap<String,Integer> claveValor = UtileriaCadenas.mapaLongitudes(palabras);
        System.out.println("Convertido a HashMap obteniendo su longitud: ");
        System.out.println(claveValor);
        System.out.println("\nCaso lista vacia: ");
        ArrayList<String> palabrasVacias = new ArrayList<>();
        HashMap<String,Integer> claveValorVacio = UtileriaCadenas.mapaLongitudes(palabrasVacias);
        System.out.println(palabrasVacias);
        System.out.println("____________________________________________________________________________________________________");

        //Modificador de inventario
        System.out.println("Aplicar un 10% de descuento a productos sin modificar su valor original ");
        HashMap<String,Double> inventario = new HashMap<>();
        inventario.put("Laptop",500.0);
        inventario.put("Perapod",100.0);
        inventario.put("dron de lego", 753.2);
        inventario.put("monitor QHD", 3824.5);
        System.out.println("Inventario antes del descuento:");
        System.out.println(inventario + "\n");
        UtileriaCadenas.modificadorInventario(inventario);

        System.out.println(" \nComprobamos que mantienen su valor original:");
        System.out.println(inventario + "\n");
        System.out.println("\nCaso cuando se envia un inventario vacio: ");
        HashMap<String,Double> inventarioVacio = new HashMap<>();
        UtileriaCadenas.modificadorInventario(inventarioVacio);
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
        HashMap<String,Integer> palabrasFrecuencias =  UtileriaCadenas.contadorFrecuencias(palabras);
        System.out.println("Palabras en un HashMap contadas:");
        System.out.println(palabrasFrecuencias);
        System.out.println("\n Caso edge, enviar una lista vacia: ");
        ArrayList<String> vacias = new ArrayList<>();
        HashMap<String,Integer> palabrasSinNada = UtileriaCadenas.contadorFrecuencias(vacias);
        System.out.println(palabrasSinNada);
        System.out.println("____________________________________________________________________________________________________");

        //Clasificador de palabras usamos el mismo hashmap de palabras frecuencias
        System.out.println("Clasificador de palabras:");
        System.out.println("Palabras antes de clasificar: ");
        System.out.println(palabrasFrecuencias + "\n");
        ArrayList<String> clasificadas = UtileriaCadenas.clasificadorPalabras(palabrasFrecuencias,6);
        System.out.println("Palabras clasificadas: " + clasificadas);

        System.out.println("\nSi le enviamos un mapa de clave valor vacio:");
        HashMap<String,Integer> palabrasFrecuenciasVacias =  new HashMap<>();
        ArrayList<String> clasificadasVacia = UtileriaCadenas.clasificadorPalabras(palabrasFrecuenciasVacias,3);
        System.out.println(clasificadasVacia);
        System.out.println("\nCon frecuencia en valor nulo:");
        ArrayList<String> clasificadasConNulo = UtileriaCadenas.clasificadorPalabras(palabrasFrecuenciasVacias,null);
        System.out.println(clasificadasConNulo);
        System.out.println("____________________________________________________________________________________________________");

        //Deduplicar palabras
        System.out.println("Convertir frase larga en Array, filtrar palabras menores a N letras y convertirlas a minusculas ");
        System.out.println("\nPalabra original:");
        String palabraGrandota = "Quiero deduplicar esta palabra por lo tanto lo voy a hacer porque quiero y puedo y lo tengo que demostrar como ejemplo por eso tambien lo hago";
        System.out.println(palabraGrandota + "\n");
        HashSet<String> deduplicadas =  UtileriaCadenas.deduplicadorPalabras(palabraGrandota, 7);
        System.out.println("Palabra deduplicada: ");
        System.out.println(deduplicadas);

        System.out.println("\n Cuando enviamos una palabra nula:");
        HashSet<String> deduplicados = UtileriaCadenas.deduplicadorPalabras(null,2);
        System.out.println(deduplicados);

        System.out.println("\nCuando enviamos un numero N nulo:");
        HashSet<String> deduplicar = UtileriaCadenas.deduplicadorPalabras(palabraGrandota,null);
        System.out.println(deduplicar);
        System.out.println("____________________________________________________________________________________________________");

        //tope de frecuencias samos el mismo hashmap de palabras frecuencias
        System.out.println("Topar frecuencias a un maximo N");
        System.out.println("Limitar frecuencias:");
        System.out.println(palabrasFrecuencias + "\n");
        System.out.println("Limitar a 4 maximo");
        UtileriaCadenas.limitadorFrecuencias(palabrasFrecuencias, 4);
        System.out.println(palabrasFrecuencias);

        System.out.println("\nCaso palabras con frecuencias vacias: ");
        HashMap<String,Integer> palabrasFrecuenciasVacio = new HashMap<>();
        UtileriaCadenas.limitadorFrecuencias(palabrasFrecuenciasVacio,2);
        System.out.println(palabrasFrecuenciasVacias);

        System.out.println("\nCaso limitador de frecuencias nulo:");
        UtileriaCadenas.limitadorFrecuencias(palabrasFrecuencias,null);
        System.out.println(palabrasFrecuencias);
        System.out.println("(No modifica nada)");

        System.out.println("____________________________________________________________________________________________________");

    }
}

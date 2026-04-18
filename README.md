Tarea de Lambdas y Clases de Colección

Descripcion:
En esta tarea se crearon 2 clases que contienen únicamente métodos estáticos: UtileriaNumeros y UtileriaCadena.
Cada una tiene los métodos que corresponden dependiendo de la categoría de datos que manipulan (números o cadenas).
Se realizaron pruebas que demuestran todos los métodos con ejemplos representativos, demostrando el correcto funcionamiento de cada método.

UtileriaNumeros.

métodos que contiene:

- public static void multiplicarElementosPorFactor(ArrayList<Integer> entrada, Integer factor);
  
    Recibe un ArrayList y un factor por el cual se debe multiplicar cada elemento del Arraylist. Modifica directamente el ArrayList enviado.
  
    Ejemplo de uso:
  
      Para utilizarlo, ponemos como ejemplo tener un ArrayList llamado prueba, que contiene números:
  
      prueba contiene -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
  
      UtileriaNumeros.multiplicarElementosPorFactor(prueba,4);
  
      Si imprimimos el ArrayList modificado, todos los elementos deberían de estar multiplicados por 4.
  
      imprime -> [0, 4, 8, 12, 16, 20, 24, 28, 32, 36]
  


- public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> numeros);
  
    Escribe un método estático que dado un ArrayList<Integer> que contiene duplicados, crea un HashSet que contenga únicamente los cuadrados de los números pares únicos de la lista original.
  
    Ejemplo de uso:
  
      Tenemos los números duplicados con nombre numeros  -> [0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9]
  
      HashSet<Integer> cuadradosUnicos = UtileriaNumeros.cuadradosUnicos(numeros);
  
      Numeros despues de aplicar metodo ->  [0, 16, 64, 4, 36]
  




UtileriaCadenas.

métodos que contiene:
- public static void filtrarPorLetraYLongitud(ArrayList<String> cadenas, char letra, Integer longitud);

  Elimina todas las cadenas que comiencen con una letra que recibe como parámetro o que tengan una longitud menor a N caracteres.

    Ejemplo de uso:
      Cadena original -> [Hola, Como, adios, a esto no se vera, a esto tampoco, Tal vez yo si, ni, America]
  
      UtileriaCadenas.filtrarPorLetraYLongitud(cadenas, 'a',4);

      Cadena con filtro letra 'a' o menos de 4 caracteres -> [Hola, Como, Tal vez yo si]


- public static ArrayList<String> conversorMayusculas(ArrayList<String> lista);
  
    Escribe un método estático que dado un ArrayList<String> de palabras, utiliza Collectors.toMap() para crear un HashMap<String, Integer> donde la clave sea la palabra y el valor sea su longitud.
  
    Ejemplo de uso:
  
      cadenas contine -> [Hola, Como, Tal vez yo si]
  
      ArrayList<String> convertidos = UtileriaCadenas.conversorMayusculas(cadenas);
  
      convertidos imprime -> [HOLA, COMO, TAL VEZ YO SI]
  
  
- public static HashMap<String,Integer> mapaLongitudes(ArrayList<String> palabras);

    Escribe un método estático que dado un ArrayList<String> de palabras, utiliza Collectors.toMap() para crear un HashMap<String, Integer> donde la clave sea la palabra y el valor        sea su longitud.

     Ejemplo de uso:
   
       Lista de palabras original -> [Onrritorinco, ballena azul, Tom y Jerry, enchufe, 1234, termito]
       
       HashMap<String,Integer> claveValor = UtileriaCadenas.mapaLongitudes(palabras);
       
       Obteniendo su longitud -> {Tom y Jerry=11, 1234=4, enchufe=7, ballena azul=12, Onrritorinco=12, termito=7}
  
- public static void mostrarDescuentoInventario(HashMap<String,Double> inventario);
  
   Escribe un método estático que dado un HashMap<String, Double> que representa nombres de productos y sus precios. Usa el método forEach() para imprimir un catálogo donde cada          precio tenga un descuento del 10% en la impresión.
  
     Ejemplo de uso:
      
      Inventario antes del descuento -> {Laptop=500.0, Perapod=100.0, dron de lego=753.2, monitor QHD=3824.5}
  
      UtileriaCadenas.mostrarDescuentoInventario(inventario);
  
      Imprime lo siguiente:
  
      Inventario con 10% de descuento:
  
      Laptop - 450.0
  
      Perapod - 90.0

      dron de lego - 677.8800000000001
  
      monitor QHD - 3442.05
  

 - public static HashMap<String,Integer> contadorFrecuencias(ArrayList<String> palabras);

   Toma un ArrayList<String> de palabras (con repeticiones), y utiliza compute() para construir un mapa de frecuencias que muestre cuántas veces aparece cada palabra.
   
     Ejemplo de uso:
   
         Palabras -> [Onrritorinco, ballena azul, Tom y Jerry, enchufe, 1234, termito, termito, Onrritorinco, ballena azul, Tom y Jerry, enchufe, 1234, enchufe, 1234, enchufe, 1234, hola a todos, Tom y Jerry, Onrritorinco, ballena azul, Tom y Jerry, enchufe, 1234, enchufe, 1234, enchufe, 1234, hola a todos, Tom y Jerry, Onrritorinco, ballena azul, Tom y Jerry, enchufe, 1234, enchufe, 1234, enchufe, 1234, hola a todos, Tom y Jerry, Onrritorinco, ballena azul, Tom y Jerry, enchufe, 1234, enchufe, 1234, enchufe, 1234, hola a todos, Tom y Jerry, Onrritorinco, ballena azul, Tom y Jerry, enchufe, 1234, enchufe, 1234, enchufe, 1234, hola a todos, Tom y Jerry]

       HashMap<String,Integer> palabrasFrecuencias =  UtileriaCadenas.contadorFrecuencias(palabras);
   
       Palabras en un HashMap contadas -> {Tom y Jerry=11, 1234=16, hola a todos=5, enchufe=16, ballena azul=6, Onrritorinco=6, termito=2}


- public static ArrayList<String> clasificadorPalabras(HashMap<String,Integer> palabras, Integer valor);

  Dado un HashMap<String, Integer> de palabras y sus frecuencias, usa entrySet().stream() para filtrar a las palabras con frecuencia inferior a un valor dado y guarda solo las palabras que cumplen con el criterio en un ArrayList.

    Ejemplo de uso:
      Palabras antes de clasificar -> {Tom y Jerry=11, 1234=16, hola a todos=5, enchufe=16, ballena azul=6, Onrritorinco=6, termito=2}
  
      ArrayList<String> clasificadas = UtileriaCadenas.clasificadorPalabras(palabrasFrecuencias,6);

      retorna al Arraylist -> [hola a todos, termito]

- public static HashSet<String> deduplicadorPalabras(String palabraGrandota, Integer nLetras);

  Toma una frase larga, la divide en un array de palabras y usa un stream con lambdas para filtrar las palabras de menos de N letras, convertirlas a minúsculas y guardarlas en un HashSet para asegurar que no haya repetidas.

    Ejemplo de uso:
      Palabra original -> Quiero deduplicar esta palabra por lo tanto lo voy a hacer porque quiero y puedo y lo tengo que demostrar como ejemplo por eso tambien lo hago

      HashSet<String> deduplicadas =  UtileriaCadenas.deduplicadorPalabras(palabraGrandota, 7);
  
      Palabra deduplicada en un HashSet -> [que, como, eso, voy, a, lo, quiero, puedo, tanto, hacer, hago, por, esta, tengo, y, porque]

- public static void limitadorFrecuencias(HashMap<String,Integer> palabras, Integer limite);

  Dado un HashMap<String, Integer> de palabras y frecuencias, usa replaceAll() para limitar todas las frecuencias a un máximo de N. Si una frecuencia es mayor a N, se fija exactamente en N mediante una lambda.

    Ejemplo de uso:
      Palabras con frecuencias variadas -> {Tom y Jerry=11, 1234=16, hola a todos=5, enchufe=16, ballena azul=6, Onrritorinco=6, termito=2}
  
      UtileriaCadenas.limitadorFrecuencias(palabrasFrecuencias, 4);
  
      Palabras con frecuencia limitada a 4 -> {Tom y Jerry=4, 1234=4, hola a todos=4, enchufe=4, ballena azul=4, Onrritorinco=4, termito=2}

     
   

  
      
    
    




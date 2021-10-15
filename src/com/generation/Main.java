package com.generation;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    //arreglo declarado en multilinea
    /*
    String universidad[];
    universidad = new String[3];
    */

    //arreglo delarado en ua linea
    /*
    String universidad[] = new String[5];
    universidad [0] = "TESJO";
    universidad [1] = "UPN";
    universidad [2] = "IULA";
    universidad [3] = "UAM";
    universidad [4] = "UNAM";
    universidad [5] = "UPN";
    universidad [6] = "IPN";
    universidad [7] = "TESCO";
    */

     //forma reducida de declarar un arreglo
    /*
    String universidad[] = new String []{"TESJO","UPN","IULA","UAM","UNAM,"UPN","IPN,"TESCO"};
    for(String universidades : universidad){
        System.out.println(universidades);

    }
    */
    System.out.println("-------------- colecciones Set-----------");
    //No puede contener elemntos duplicados

    System.out.println("--------------HashSet-------------------");

    //HashSet sigue un orden aleatorio

    Set <String> frutas = new HashSet(3);
    frutas.add("mango");
    frutas.add("uva");
    frutas.add("lima");
    frutas.add("pera");

    for(String fruta : frutas){
        System.out.println(fruta);
        }
    System.out.println("--------------TreeSet-------------------");
    //ordena los elementos

    Set<String> frutas2 = new TreeSet();
    frutas2.add("mango");
    frutas2.add("uva");
    frutas2.add("lima");
    for (String frutita : frutas2) {
        System.out.println(frutita);
    }

   
   System.out.println("----------LinkedHashSet-----------------");
   // Almacena los valores en orden de inserción
    
   Set<String> frutas3 = new LinkedHashSet<>();
   frutas3.add("mango");
   frutas3.add("uva");
   frutas3.add("lima");
   frutas3.add("pera");

   for (String fruta : frutas3) {
       System.out.println(fruta);
        }

   System.out.println("------------Coleccion List-----------------");
   
   System.out.println("------------ArrayList----------------------");
   // admite elementos duplicados
   
   List<String> frutas4 = new ArrayList<>();
   frutas4.add("mango");
   frutas4.add("uva");
   frutas4.add("lima");
   frutas4.add("pera");

   for (String fruta : frutas4) {
       System.out.println(fruta);
        }

   System.out.println("---------------Elemento-------------------");

   System.out.println(frutas4.get(3));
   int indice = frutas4.indexOf("uva");

   System.out.println(frutas4.get(indice));

   System.out.println("---------------LinkedList----------------");

   List<String> frutas5 = new LinkedList<>();

   frutas5.add("mango");
   frutas5.add("uva");
   frutas5.add("lima");
   frutas5.add("pera");

   for (String fruta : frutas5) {
       System.out.println(fruta);
        }

   System.out.println("--------------Map------------------------");

   System.out.println("--------------HashMap--------------------");
    //Asocia claves con valores
   // No puede tener claves repetidas
   //Solo puede tener un valor asociado a la clave

   Map<Integer, String> universidades = new HashMap< Integer, String >();

  universidades.put(1, "IPN");
  universidades.put(2, "UNAM");
  universidades.put(3, "UAEM");
  universidades.put(4, "UAM");
  universidades.put(5, "TESCO");

  for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
      System.out.println("clave= " + universidad.getKey() + ", valor: " + universidad.getValue());
        }
      System.out.println(universidades.get(3));
    }
} 



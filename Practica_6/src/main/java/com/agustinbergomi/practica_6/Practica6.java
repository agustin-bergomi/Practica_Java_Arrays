package com.agustinbergomi.practica_6;

import java.util.Arrays;

public class Practica6 {
    public static void main(String[] args) {

//        hago un array de enteros
//        los arrays son colecciones de datos
//        los arrays son inmutables (a diferencia de los array list por ejemplo)
//        declaro el tipo de dato y le agrego los corchetes para declarar el array (seguido del nombre de la varaible que va a contener el arreglo).
        int[] array_de_enteros = {1,2,3,4,5};

//        lo siguiente va a arrojar el hashcode
        System.out.println(array_de_enteros);
//        aplico el metodo toString al array de enteros para efectivamente mostrar los valores.
        System.out.println(Arrays.toString(array_de_enteros));

        String[] array_de_palabras = {"Hola", "como", "estas"};
        System.out.println(array_de_palabras);
//        Aca simplemente hago el procedimiento anterior y lo guardo en otra variable para que sea mas legible
        String array_casteado = Arrays.toString(array_de_palabras);
        System.out.println(array_casteado);

    }
}
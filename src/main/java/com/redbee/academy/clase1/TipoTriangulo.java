package com.redbee.academy.clase1;

public class TipoTriangulo {


    /**
     * Elaborar un programa que identifique el tipo de triángulo conociendo sus 3 lados.
     * <p>
     * Escaleno: Todos sus lados son diferentes.
     * Equilátero: Todos sus lados son iguales.
     * Isósceles: Tiene 2 lados iguales.
     *
     * @param lado1
     * @param lado2
     * @param lado3
     * @return
     */
    public static String resolver(int lado1, int lado2, int lado3) {
        Boolean iguales = lado1 == lado2 & lado2 == lado3;
        if(iguales){
            return "Equilátero";
        }else{
            if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                return "Isósceles";
            }
            else {
                return "Escaleno";
            }
        }
    }
}

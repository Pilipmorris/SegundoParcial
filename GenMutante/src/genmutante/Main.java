/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genmutante;

/**
 *
 * @author PILI
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
   /** String[][] matrizADN = {
   
    {"G", "C", "T", "A", "A", "T"},
    {"A", "G", "T", "C", "A", "G"},
    {"T", "C", "G", "T", "A", "C"},
    {"G", "T", "C", "G", "G", "T"},
    {"A", "C", "G", "A", "T", "G"},
    {"T", "A", "G", "C", "T", "C"}
    
};*/
/**String[][] matrizADN = {
    {"T", "G", "C", "A", "G", "T"},
    {"G", "A", "C", "T", "G", "A"},
    {"A", "T", "C", "C", "A", "G"},
    {"A", "G", "T", "C", "C", "T"},
    {"A", "A", "G", "C", "C", "G"},
    {"A", "C", "G", "T", "A", "C"}
};*/
/**String[][] matrizADN = {
    {"G", "A", "T", "C", "G", "C"},
    {"C", "T", "A", "G", "T", "G"},
    {"A", "T", "G", "A", "C", "T"},
    {"G", "C", "T", "G", "A", "A"},
    {"T", "G", "A", "T", "C", "C"},
    {"C", "A", "G", "C", "T", "T"}
};*/
     String[][] matrizADN = {
    {"G", "A", "T", "C", "G", "C"},
    {"C", "T", "A", "G", "T", "G"},
    {"A", "T", "G", "A", "C", "T"},
    {"G", "C", "G", "G", "A", "A"},
    {"T", "G", "G", "T", "C", "C"},
    {"C", "A", "G", "C", "T", "T"}
};

  /** String[][] matrizADN = {
   
    {"G", "C", "T", "A", "A", "T"},
    {"A", "G", "T", "C", "C", "G"},
    {"T", "C", "T", "C", "T", "C"},
    {"G", "T", "C", "G", "T", "T"},
    {"A", "C", "G", "A", "T", "G"},
    {"T", "A", "G", "C", "T", "C"}
    
};*/
 /**
  String[][] matrizADN = {
    {"A", "G", "T", "G", "C", "G"},
    {"T", "G", "C", "A", "T", "C"},
    {"G", "T", "A", "C", "G", "T"},
    {"C", "A", "G", "T", "A", "G"},
    {"T", "G", "C", "T", "G", "A"},
    {"C", "A", "T", "G", "C", "C"}
};*/



        List<List<String>> listaADN = convertirMatrizALista(matrizADN);

        // Verificar si es mutante
        boolean esMutante = MutanteChecker.esMutante(listaADN);

        // Mostrar el resultado
        if (esMutante) {
            System.out.println("La matriz de ADN es mutante.");
        } else {
            System.out.println("La matriz de ADN no es mutante.");
        }
    }
 //Matriz a lista
    private static List<List<String>> convertirMatrizALista(String[][] matriz) {
        List<List<String>> lista = new ArrayList<>();
        for (String[] fila : matriz) {
            lista.add(Arrays.asList(fila));
        }
        return lista;
    }
}

    

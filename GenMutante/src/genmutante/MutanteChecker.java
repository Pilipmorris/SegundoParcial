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
import java.util.List;

public class MutanteChecker {
//Chequear que haya + de un gen mutado
    public static boolean esMutante(List<List<String>> matrizADN) {
 
        int genesMutados = 0;

        if (checkHorizontal(matrizADN)) {
            genesMutados++;
        }

        if (checkVertical(matrizADN)) {
            genesMutados++;
        }

        if (checkDiagonales(matrizADN)) {
            genesMutados++;
        }

        return genesMutados >= 2;}

    private static boolean checkHorizontal(List<List<String>> matrizADN) {
        int n = matrizADN.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - 4; j++) {
                if (matrizADN.get(i).get(j).equals(matrizADN.get(i).get(j + 1)) &&
                        matrizADN.get(i).get(j).equals(matrizADN.get(i).get(j + 2)) &&
                        matrizADN.get(i).get(j).equals(matrizADN.get(i).get(j + 3))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkVertical(List<List<String>> matrizADN) {
        int n = matrizADN.size();
        for (int i = 0; i <= n - 4; i++) {
            for (int j = 0; j < n; j++) {
                if (matrizADN.get(i).get(j).equals(matrizADN.get(i + 1).get(j)) &&
                        matrizADN.get(i).get(j).equals(matrizADN.get(i + 2).get(j)) &&
                        matrizADN.get(i).get(j).equals(matrizADN.get(i + 3).get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonales(List<List<String>> matrizADN) {
        return checkDiagonalesPrincipales(matrizADN) || checkDiagonalesSecundarias(matrizADN);
    }

    private static boolean checkDiagonalesPrincipales(List<List<String>> matrizADN) {
        int n = matrizADN.size();
        for (int i = 0; i <= n - 4; i++) {
            for (int j = 0; j <= n - 4; j++) {
                if (matrizADN.get(i).get(j).equals(matrizADN.get(i + 1).get(j + 1)) &&
                        matrizADN.get(i).get(j).equals(matrizADN.get(i + 2).get(j + 2)) &&
                        matrizADN.get(i).get(j).equals(matrizADN.get(i + 3).get(j + 3))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonalesSecundarias(List<List<String>> matrizADN) {
        int n = matrizADN.size();
        for (int i = 0; i <= n - 4; i++) {
            for (int j = n - 1; j >= 3; j--) {
                if (matrizADN.get(i).get(j).equals(matrizADN.get(i + 1).get(j - 1)) &&
                        matrizADN.get(i).get(j).equals(matrizADN.get(i + 2).get(j - 2)) &&
                        matrizADN.get(i).get(j).equals(matrizADN.get(i + 3).get(j - 3))) {
                    return true;
                }
            }
        }
        return false;
    }
}

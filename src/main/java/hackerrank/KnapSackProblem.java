package hackerrank;

import java.util.Arrays;

/**
 * @author Tolga Duzenli on 3/12/17.
 *         This class provides algorithm solution for 0/1 Knapsack problem based on Dynamic Programming.
 *         I assume parameters are valid, weight and value arrays are filled with positive numbers.
 *         Allowed total weight is bigger than min weight of items.
 */
public class KnapSackProblem {

    public int findMaxValue(int[] weight, int[] value, int maxWeight) {
        int[][] T = new int[weight.length][maxWeight + 1];
        initArray(T);

        for (int i = 0; i < T.length; i++) {
            for (int j = 1; j < T[i].length; j++) {
                if (i == 0) {
                    T[i][j] = value[i];
                } else if (j < weight[i]) {
                    T[i][j] = T[i - 1][j];
                } else {
                    T[i][j] = Math.max(value[i] + T[i - 1][j - weight[i]], T[i - 1][j]);
                }
            }
        }
        printT(T);
        defineSelectedItems(T,weight,value);
        return T[weight.length-1][maxWeight];
    }

    private void printT(int[][] T) {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void initArray(int[][] T) {
        for (int[] row : T)
            Arrays.fill(row, 0);
    }

    private void defineSelectedItems(int[][] T, int[] weight, int[] value){
        int i = T.length - 1;
        int j = T[i].length - 1;
        while(T[i][j] > 0){
            if(T[i][j] == T[i-1][j]){
                i--;
            }else{
                System.out.println("Item is selected, weight: " + weight[i] + " value:" + value[i]);
                j = j - weight[i];
                i--;
            }
        }
    }
}

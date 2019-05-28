import java.util.Arrays;

/**
 * Created by hope_bringer on 28.05.2019.
 * My email is gergelysiladi@gmail.com
 */
public class Main {

    public static void main(String[] args) {

        int[][] mat1 = {{2,3,1,8},{7,4,5,2},{8,2,3,9},{0,2,4,6}};
        int[][] mat2 = {{1,9,5,8},{2,3,7,4},{1,9,9,8},{8,4,2,5}};
        int[][] matRslt = new int[4][4];

/*
        for (int[] row : mat1)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));

*/
        /*for(int i = 0; i< mat1.length; i++){
            System.out.println("");
            for(int j = 0; j< mat1.length; j++){
                System.out.print(mat1[i][j]+" ");
            }
        }
        System.out.println("\n");
        for(int i = 0; i< mat2.length; i++){
            System.out.println("");
            for(int j = 0; j< mat2.length; j++){
                System.out.print(mat2[i][j]+" ");
            }
        }
        System.out.println("\n"+"opačne");
        for(int i = 0; i< mat2.length; i++){
            System.out.println("");
            for(int j = 0; j< mat2.length; j++){
                System.out.print(mat2[j][i]+" ");
            }
        }*/

        for(int i = 0; i< mat1.length; i++){
            System.out.println("");
            for(int j = 0; j < mat2[0].length; j++){
                for(int k = 0; k < mat1[0].length; k++){
                    matRslt[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for (int[] row : matRslt)

            System.out.println(Arrays.toString(row));

       }

}

import java.util.Scanner;
import java.lang.String;
public class dzshka2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        int [][] matrix = {{1,2,3,4}, {5,6,10,12}};
        int stroki = 0;
        for (int i = 0; i < matrix.length; i++ ) {
            double sum = 0;
            double counter = 0;
            for (int j = 0; j < matrix[0].length; j++ ){
                sum += matrix[i][j];
                counter += 1;
            }
            if (sum/counter < n){
                stroki +=1;
            }
        }
        System.out.println(stroki);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            int q = matrix[i][0];
            matrix[i][0] = matrix[i][3];
            matrix[i][3] = q;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

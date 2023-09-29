import java.lang.String;
import java.util.Scanner;
public class dzshka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {-6, -5, -4, -3, 0, 1, 3, 4, 5};
        int min = 100;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min && arr[i] >0) {
                min = arr[i];
            }
        }
        System.out.println(min);
        int first = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                first = i;
                break;
            }
        }
        int last = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0) {
                last = i;
            }
        }
        double counter = 0;
        double sum = 0;
        for(int i  = first+1; i < last; i++){
            counter++;
            sum += arr[i];
        }
        double arf = sum/counter;
        System.out.println(arf);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
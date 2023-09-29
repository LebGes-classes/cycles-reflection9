import java.lang.Math;
public class dzshka3 {
    public static void main(String[] args) {
        for(int i = 10; i < 100; i++){
            if((Math.pow(i/10,2)+Math.pow(i%10,2)) % 17 == 0){
                System.out.println(i);
            }
        }
    }
}

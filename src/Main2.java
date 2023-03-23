import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        for (int i =2; i<100;i++){
            if(checkPrime(i)==true){
                System.out.println(i+" la snt");

            }
        }

    }

    public static boolean checkPrime(int number) {
        boolean check=true;

        for( int i =2; i<number;i++){
            if(number % i==0){
                check =false;
                break;
            }
        }


        return check;
    }
}


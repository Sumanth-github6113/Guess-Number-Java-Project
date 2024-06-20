import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Mini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Mynumber = (int)(Math.random()*100);
        int Usernumber=0;
        do{
            System.out.println("Enter your guess number");
            Usernumber= sc.nextInt();

            if(Usernumber == Mynumber ){
                System.out.println("Your Answer is correct");
                break;
            }
            else if(Usernumber > Mynumber ){
                System.out.println("Your Number is too large");
            }
            else
                System.out.println("Your Number is too small");
        } while(Usernumber >= 0);
        System.out.println("My number is "+Mynumber);
    }
}

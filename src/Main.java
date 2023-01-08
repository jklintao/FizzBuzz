import java.util.Scanner;

public class Main {

    public static int getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        return scanner.nextInt();
    }
    public static void fizzbuzz(int a){
        boolean fizz = a % 5 == 0;
        boolean buzz = a % 3 == 0;

        if (fizz && buzz){
            System.out.println("FizzBuzz");
        } else if (fizz) {
            System.out.println("Fizz");
        } else if (buzz) {
            System.out.println("Buzz");
        } else System.out.println(a);
    }
    public static void main(String[] args) {
        fizzbuzz(getUserInput());
    }
}
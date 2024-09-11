import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner1.nextLine();
        System.out.println("Hello " + name);
    }
}
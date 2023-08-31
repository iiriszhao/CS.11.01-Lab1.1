import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println(age + " year olds should date somebody who is at least " + (7 + (age/2)) + " years old.");


    }
}

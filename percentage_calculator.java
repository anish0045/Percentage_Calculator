import java.util.Scanner;
public class percentage_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Subject 1 marks");
        int Subject1 = scan.nextInt();

        System.out.println("Enter Subject 2 marks");
        int Subject2 = scan.nextInt();

        System.out.println("Enter Subject 3 marks");
        int Subject3 = scan.nextInt();

        System.out.println("Enter Subject 4 marks");
        int Subject4 = scan.nextInt();

        System.out.println("Enter Subject 5 marks");
        int Subject5 = scan.nextInt();

        float percentage = ((Subject1 + Subject2 + Subject3+ Subject4 + Subject5)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);


    }
}

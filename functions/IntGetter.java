import java.util.Scanner;

public class IntGetter {
    public static void main(String[] args){
        int n = getInt("What is the answer?", 10);
        System.out.println("The answer is " + n);
        if (n == 42){
            System.out.println("Welcome, fan of Mr. Adams");
        }
    }
    static int getInt(String question, int min){
        //use the scanner to get an integer that is at least as big as 'min'
        return getInt(question + " (Min: " + min + ")");

    }
    static int getInt(String question){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(question + " ");
            if (scanner.hasNextInt()){
                int n = scanner.nextInt();
                scanner.close();
                return n;
            }
            else{
                System.out.println("That is not a number. Please try again.");
                scanner.next();

            }
            
        }


    }
}

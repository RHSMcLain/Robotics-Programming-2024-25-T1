import java.util.Scanner;

public class IntGetter2 {

    static Scanner scanner = new Scanner(System.in);    
    public static void main(String[] args){
        int n = getInt("What is the answer?", 10);
        System.out.println("The answer is " + n);
        if (n == 42){
            System.out.println("Welcome, fan of Mr. Adams");
        }
        scanner.close();
    }
    static int getInt(String question, int min){
        //use the scanner to get an integer that is at least as big as 'min'
        while(true){
            int n = getInt(question + " (Min: " + min + ")");
            if (n >= min){
                return n;
            }
            else{
                System.out.println("That's too small.");
            }
        }

    }
    static int getInt(String question){

        while (true){
            System.out.print(question + " ");
            if (scanner.hasNextInt()){
                int n = scanner.nextInt();
                return n;
            }
            else{
                System.out.println("That is not a number. Please try again.");
                scanner.next();

            }
            
        }


    }
}

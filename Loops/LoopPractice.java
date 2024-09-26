import java.util.Scanner;

class LoopPractice{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Loop Practice");
        System.out.print("How far would you like to count? ");
        int countTo = 1000;
        if (scanner.hasNextInt()){
            countTo = scanner.nextInt();
        }
        else{
            System.out.println("Defaulting to 1000");
            scanner.next();
        }
        //-- get my count by
        int countBy = 7;
        System.out.print("How much would you like to count by? ");
        if (scanner.hasNextInt()){
            countBy = scanner.nextInt();
        }
        else{
            System.out.println("Defaulting to 7");
            scanner.next();
        }//--

        int counter = 50;
        while(counter < 1000){            
           if (counter == 72){
            counter = counter + 1;
            continue;
           }
            System.out.println(counter);
            if (counter == 568){
                break;
            }
            counter = counter + 1;
            
        }
        scanner.close();
    }
}
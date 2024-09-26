import java.util.Scanner;

class helloworld{
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println("Isn't it a lovely day.");
        int markerCount = 2;
        System.out.println(markerCount);
        markerCount = markerCount + 87;
        System.out.println(markerCount);
        //Now we will create a Scanner object to take user input

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many markers did you buy? ");
        if(scanner.hasNextDouble()){        
            double newMarkers = scanner.nextDouble();
            // Demonstration of decimals
            double result = newMarkers / 7;
            String resOut = String.format("the result is %.2f -- and that's it.", result);
            System.out.println(resOut);
            if (newMarkers <= 0){
                System.out.println("No.");
            }
            else{ //this means 'in all other cases'
                //83markerCount = markerCount + newMarkers;
                System.out.println("You have " + markerCount + " markers");
            }
        }
        else{
            scanner.next();
            System.out.println("That's not a number.  Goodbye");
        }
        scanner.close();
        int n = 8;
        if (n < 3 || n > 12){
            System.out.println("ummmm.");
        }

    }
}

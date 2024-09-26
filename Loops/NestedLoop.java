public class NestedLoop {
    public static void main(String args[]){
        int y = 0; // create the outer loop counter variable 
        while(y < 5){
        
            int x = 0; //create the inner loop counter variable
            while (x < 10){
                System.out.print(x + "," + y + "  "); //the actual printout
                x++; //increment the inner loop counter variable
            }
            System.out.println();
            y++; //increment the outer loop variable
        }
    }
}

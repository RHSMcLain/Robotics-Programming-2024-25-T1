public class DiamondDrawer2 {
    //TODO: bottomahalf printing wrong on even numbers
    public static void main(String[] args) {
        drawDiamond(23);
    }
    static void drawDiamond(int height){        
        topHalf(height);
        bottomHalf(height);
    }
    static void topHalf(int totalRows){
        //loop the right number of rows
        boolean isOdd = totalRows % 2 == 1;
        int thisHalfRows = totalRows / 2;
        int row = 0;
        if (isOdd){
            thisHalfRows++;
        }
        while(row < thisHalfRows){
            drawSpaces(thisHalfRows - (row + 1));
            drawStars(2 * row + 1);
            System.out.println();
            row++;
        }
            //call drawspaces with the right number
            //call drawstars with the right number
            //print line
            //increment our loop counter
        
    }
    static void bottomHalf(int totalRows){
        boolean isOdd = totalRows % 2 == 1;

        int target = 0;
        totalRows = totalRows / 2 - 1; //because going up, we went from 0 to less than total, so we go from less than total to 0
        int row = totalRows;
        if (isOdd){
            totalRows++;
        }
        
        while (row >= target){
    
            drawSpaces(totalRows - row);
            drawStars(2*row + 1);
            System.out.println();
            row--;
            

        }
    }
    static void drawSpaces(int count){
        int counter = 0;
        while(counter < count){
            System.out.print(".");
            counter++;
        }    
    }
    static void drawStars(int count){   
        int counter = 0;
        while(counter < count){
            System.out.print("*");
            counter++;
        }    
    }
}
//funtion topHalf
//function bottomHalf
//drawspaces function
//drawStars function

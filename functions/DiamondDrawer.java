public class DiamondDrawer {
    public static void main(String[] args) {
        int n = 5;
        while(n < 20){
            drawDiamond(n);
            n++;
        }       
    }
    static void drawDiamond(int size){
        topHalf(size);
        bottomHalf(size);
    }
    static void topHalf(int size){
        //loop the right number of rows

        int thisHalfRows = size / 2;
        int row = 0;
        if (size % 2 == 0){
            thisHalfRows--;
        }
        while(row <= thisHalfRows){
            drawCharacter(thisHalfRows - row, " ");
            drawCharacter(2 * row + 1, "*");
            System.out.println();
            row++;
        }        
    }
    static void bottomHalf(int size){
        int thisHalfRows = size / 2;
        int row = thisHalfRows - 1;
        //if size is even, thishalf's rows is half of total. otherwise, bottomhalf rows is half of total + 1
        if (size % 2 == 0){
            thisHalfRows--;
        }
        while(row >= 0){
            drawCharacter(thisHalfRows - row, " ");
            drawCharacter(2 * row + 1, "*");
            System.out.println();
            row--;
        }
    }
    static void drawCharacter(int count, String character){
        int counter = 0;
        while(counter < count){
            System.out.print(character);
            counter++;
        }    
    }
}
//funtion topHalf
//function bottomHalf
//drawspaces function
//drawStars function
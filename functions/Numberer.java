public class Numberer {
    public static void main(String[] args){
        System.out.println(countemup(100));
        if (countemup(5) == 15){
            System.out.println("Correct");

        }
        else{
            System.out.println("That didn't work");
        }
    }
    static int countemup(int top){
        int n = 0;
        int total = 0;
        while(n <= top){
            total += n;
            n++;
        }
        return total;
    }
}

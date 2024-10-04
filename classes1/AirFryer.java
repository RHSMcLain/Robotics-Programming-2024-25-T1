public class AirFryer extends Toaster {
    
    public AirFryer(String name){
        super(name);

    }
    public void fry(){
        int n = 1; 
        while (n <= 12){
            System.out.print(n + "... ");
            n++;
        }
        for(int x = 1; x <= 12; x += 2){
            System.out.println(x);
        }
        System.out.println("---slice count coming:--");
        System.out.println(slices);
        System.out.println("YUM-- It is Fried.");
    }
    @Override public void toast(){
        super.toast(); //optional -- does the parent class's version
        System.out.println("Are you sure you wanted toast?  Fry is better.");
    }

}

public class AirFryer extends Toaster {
    
    public AirFryer(String name){
        super(name);

    }
    public void fry(){

        System.out.println(slices);
        System.out.println("YUM-- It is Fried.");
    }
    @Override public void toast(){
        super.toast(); //optional -- does the parent class's version
        System.out.println("Are you sure you wanted toast?  Fry is better.");
    }

}

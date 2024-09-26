public class functions1{
    public static void main(String[] args){
        greet();
        System.out.println("That was fun.");
        greet();
        countDown(100);
        countDown(8762);
        countDown();

    }
    static void greet(){
        System.out.println("Hello World");
    }
    static void countDown(int from){
        System.out.println("I will be counting down from " + from);
    }
    static void countDown(){
        //this function should count down from 10 to 1 and then say kaboom
        System.out.println(10);
        System.out.println(9);
        System.out.println(8);
        System.out.println(7);
        System.out.println(6);
        System.out.println(5);
        System.out.println(4);
        System.out.println(3);
        System.out.println(2);
        System.out.println(1);
        System.out.println("Kaboom!");
                
    }
}

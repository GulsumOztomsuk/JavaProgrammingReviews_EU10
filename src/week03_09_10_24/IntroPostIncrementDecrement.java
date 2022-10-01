package week03_09_10_24;

public class IntroPostIncrementDecrement {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a); //valiable name and value at the same time
        System.out.println("a = " + a);
        System.out.println("=== increment start===");
        System.out.println("a++"); // my action printig first do you action
        System.out.println("===increment end===");
        //System.out.println(a); // a will be 6
        System.out.println("=== decrement satrt");
        System.out.println(a--); // do your action printing
        System.out.println(a);
        System.out.println("===decrement end");

        int b=10;
        System.out.println(b--); //first do action (print) we will print 10 and the second change value 9
        System.out.println(b--);// will print 9 and decrement it will be 8 for next statement
        System.out.println(b);
        b=b-1;//b-- //b-=1


    }
}

package week06_15_10_2022;

public class WhileDoWhileLoopIntro {
    public static void main(String[] args) {
        //syntax is while
        boolean flag=true;
        int i=0;
        //print the number till 100
        while (flag){//is flag is false exit the loop

            System.out.println(i++);
            if (i==100){//exist condition
                flag=false;
            }
        }
    }
}
package Week11_19_11_2022;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        //how to creat an arraylist

        ArrayList<String> cities=new ArrayList<>();
        //ArrayList<String> cities=new ArrayList<>(String);

        //how to add element
        cities.add("London");//returns boolean
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");

        //how to print it

        //for Array Arrays.toString(arrayname)
        System.out.println(cities);

        //how to add one element add the beginning
        cities.add(0,"Vienna");
        System.out.println(cities);

        //how to get element
        System.out.println(cities.get(0));//vienna

        //how to update your elemnt
        cities.set(2,"New York");
        System.out.println("---------------After Update-----------");
        System.out.println(cities);

        //how to learn positon of the element or index of element


        System.out.println(cities.indexOf("NewYork")); //2

        System.out.println(cities.indexOf("Paris")); // if it is not exist you will get -1




        System.out.println(cities.indexOf("New")); //-1

        // lastIndexOf()
        System.out.println(cities.lastIndexOf("London"));

        //indexOf and lastIndexOf will give same index if the elemnt is unique

        cities.add("London");
        System.out.println(cities);
        // 0      1         2       3      4     5
        //Vienna, London, NewYork, Angara, Rome, London
        System.out.println(cities.indexOf("London")); //it is checking the elemnt from beginnig and return the index
        // 1
        System.out.println(cities.lastIndexOf("London")); // it is checking the element from last //5

        //how to remove one element



    }
}

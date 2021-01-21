package mylist;

import java.util.ArrayList;

public class ArrayListDemo extends Object{
    public static void main (String args[]){
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Tokyo");
        cities.add("HongKong");
        cities.add("NewYork");
        cities.add("Berlin");
        System.out.println("Before removing any element from ArrayList : " + cities);
        cities.remove("London");
        System.out.println("After removing one element from ArrayList : " + cities);
        cities.remove("Tokyo");
        System.out.println("After removing two objects from ArrayList : " + cities);
    }
}


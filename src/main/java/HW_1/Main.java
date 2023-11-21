package HW_1;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringListImpl stringList1 = new StringListImpl();
        stringList1.add("string1");
        stringList1.add("string2");
        stringList1.add("string3");
        System.out.println();
        System.out.println("Метод add " + stringList1.toString());


        stringList1.toArray();
        System.out.println();
        System.out.println("Метод toArray " + stringList1.toString());

        stringList1.set(1,"string");
        System.out.println();
        System.out.println("Метод set " +stringList1.toString());

        stringList1.remove("string");
        System.out.println();
        System.out.println("Метод remov String " +stringList1.toString());

        stringList1.remove(0);
        System.out.println();
        System.out.println("Метод remov index " + stringList1.toString());


        stringList1.clear();
        System.out.println();
        System.out.println("Метод clear " + stringList1.toString());



    }
}

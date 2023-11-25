package HW_2;


public class Main {
    public static void main(String[] args) {
        IntegerListImpl IntegerList1 = new IntegerListImpl();
        IntegerList1.add(111);
        IntegerList1.add(222);
        IntegerList1.add(333);
        System.out.println();
        System.out.println("Метод add " + IntegerList1.toString());


        IntegerList1.toArray();
        System.out.println();
        System.out.println("Метод toArray " + IntegerList1.toString());

        IntegerList1.set(1,555);
        System.out.println();
        System.out.println("Метод set " +IntegerList1.toString());

        IntegerList1.removeValue(111);
        System.out.println();
        System.out.println("Метод remov значение " +IntegerList1.toString());

        IntegerList1.removeIndex(0);
        System.out.println();
        System.out.println("Метод remov index " + IntegerList1.toString());


        IntegerList1.clear();
        System.out.println();
        System.out.println("Метод clear " + IntegerList1.toString());

    }
}

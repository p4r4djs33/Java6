package demo1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();

        listInteger.add(0, 1);
        listInteger.add(1, 2);
        listInteger.add(2, 3);
        listInteger.add(3, 3);
        listInteger.add(4, 4);
        System.out.println("Element 4: " + listInteger.get(4));
        System.out.println("Element 1: " + listInteger.get(1));
        System.out.println("Element 2: " + listInteger.get(2));
    }
}

package TH10;

public class ListSimpleTest {
    public static void main(String[] args) {
        ListSimple<Integer> e = new ListSimple<>();
        e.add(1);
        e.add(2);
        e.add(3);
        e.add(3);
        e.add(4);
        e.add(6);
        System.out.println("element 4: "+e.get(4));
        System.out.println("element 1: "+e.get(1));
        System.out.println("element 2: "+e.get(2));
        e.get(6);
        System.out.println("element 6: "+e.get(6));
    }
}
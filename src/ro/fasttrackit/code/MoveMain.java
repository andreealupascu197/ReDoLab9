package ro.fasttrackit.code;

public class MoveMain {
    public static void main(String[] args) {
        Vechicle v = new Vechicle();
        v.moves();
        v = new Car();
        v.moves();
        Car c = new Car();
        c.toString();
        c.hashCode();
        c.equals(c);
        System.out.println(c.toString());
        System.out.println(v.toString());

    }
}

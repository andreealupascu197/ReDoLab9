package ro.fasttrackit.code;

public class Vechicle {
    private int id;
    public void moves() {
        System.out.println("Vechicle mvoes");

    }
    @Override
    public String toString() {
        return "Vechicle ith id =" + id;

    }
}

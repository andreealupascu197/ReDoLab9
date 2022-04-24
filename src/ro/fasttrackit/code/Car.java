package ro.fasttrackit.code;

public class Car extends Vechicle {
    private int buget;

    @Override
    public void moves() {
        System.out.println("Car moves");
        if (buget > 100) {
            System.out.println("sss");
        } else {
            super.moves();
        }
    }
}

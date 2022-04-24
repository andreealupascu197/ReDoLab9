package ro.fasttrackit.code;

public abstract class Abstract {
    public abstract void a1();
    public abstract int a2();
    public abstract double a3();

    public static void main(String[] args) {
        Abstract ac =new Child();
        }
    }
    abstract class Child2 extends Abstract {

        @Override
        public void a1() {

        }

        @Override
        public int a2() {
            return 0;
        }
    }

    class  Child extends Child2{

        @Override
        public void a1() {

        }

        @Override
        public int a2() {
            super.a2();
            return 0;
        }

        @Override
        public double a3() {
            return 0;
        }
    }

package ro.fasttrackit;
import java.util.Scanner;

public class Converter {
        static String toBinary(int x) {
            String binary="";
          int num = x;
            while(num > 0) {
                binary = (num%2)+binary;
                num /= 2;
            }
            return binary;
        }
    }


    class Program {
        public static void main(String[ ] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.print(Converter.toBinary(x));
        }
    }


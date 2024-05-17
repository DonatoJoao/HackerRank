package Introduction.IntToString;



public class Main {
    public static void main(String[] args) {
        Integer n = 100;
        String ns = Integer.toString(n);

        if (n.toString().equals(ns)){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

    }
}

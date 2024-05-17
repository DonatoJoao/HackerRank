package OOP.InheritanceII;

public class Main {

    public static void main(String[] args) {
        Adder a= new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        int entrada1 = a.add(20,22);
        int entrada2 = a.add(10,3);
        int entrada3 = a.add(15,5);
        System.out.println(entrada1 + " " + entrada2 + " " + entrada3 );
    }
}

class Arithmatic{
    public int add (int a, int b){
        return a+b;
    }
}
class Adder extends Arithmatic{

}
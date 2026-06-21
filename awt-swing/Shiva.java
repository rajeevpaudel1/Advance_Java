public class Shiva {
    int x = 5;

    public static void main(String[] args) {
        Shiva myObj1 = new Shiva();  // Object 1
        Shiva myObj2 = new Shiva();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25
    }
}
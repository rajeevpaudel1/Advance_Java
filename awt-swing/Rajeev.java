//creating a constructor and passing the value
public class Rajeev {
    int roll;
    String name;

    public Rajeev(String name, int roll){
        this.name=name;
        this.roll=roll;

    }

    public static void main(String[] args) {
        Rajeev rajeev =new Rajeev("Ramesh",24);
        System.out.println("My name is "+rajeev.name+"."+"My Roll number is "+rajeev.roll);
    }

}
class Student {
    private String name;
    private int roll;
    public void setData(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}
public class OOPDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData("Ram", 101);
        s1.display();
    }
}
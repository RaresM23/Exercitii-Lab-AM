public class EncapsulationExample {
    public static void main(String[] args) {

        Lab1MOBEx4 person1 = new Lab1MOBEx4("Alice", 30, "Female");

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());

        person1.setName("Alex");
        person1.setAge(25);
        person1.setGender("Male");

        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());
    }
}

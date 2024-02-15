public class EncapsulationExample {
    public static void main(String[] args) {
        // Create a Person object
        Lab1MOBEx4 person1 = new Lab1MOBEx4("Alice", 30, "Female");

        // Accessing data using getter methods
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());

        // Updating data using setter methods
        person1.setName("Bob");
        person1.setAge(25);
        person1.setGender("Male");

        // Accessing updated data using getter methods
        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());
    }
}
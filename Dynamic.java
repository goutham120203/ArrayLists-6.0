import java.util.ArrayList;
import java.util.Iterator;

class Person {
    private int id;
    private String name;
    private int salary;

    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class Dynamic {
    public static void main(String[] args) {
        // Create an Object for ArrayList
        ArrayList<Person> p = new ArrayList<>();

        // Load person class Objects in it
        p.add(new Person(1, "gou", 5000));
        p.add(new Person(2, "faz", 5000));
        p.add(new Person(3, "kar", 5000)); // Changed id from 1 to 3 for clarity

        // Iterate it by using Iterator
        Iterator<Person> i = p.iterator();

        // Print the values by using while loop
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}


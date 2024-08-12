import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  ArrayList<String> list = new ArrayList<>();

  // Load String instead of Integers 
  list.add("goutham");
  list.add("fazay");
  list.add("karthik");

  // Iterate them using for each loop
  for (String name : list) {
    System.out.println(name);
  }
}
}

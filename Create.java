import java.util.ArrayList;
import java.util.Iterator;

public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  ArrayList<Integer> l = new ArrayList<>();
  // Load Values in ArrayList
  l.add(10);
  l.add(20);
  l.add(35);
  // Iterate it by usig Iterator and While Loops
  Iterator i = l.iterator();
  while (i.hasNext()) {
    System.out.println(i.next());
  }
}
}

// Extracted Java code snippet 20 from the supplied notes.
public class Demo {
public static class Person implements Serializable {
public String name = null;
public int age = 0;
}
public static void main(String[] args) throws IOException,
ClassNotFoundException {
ObjectOutputStream objectOutputStream =
new ObjectOutputStream(new FileOutputStream
("customer.dat"));
Person person = new Person();
person.name = "Michael Smith";
person.age = 44;
objectOutputStream.writeObject(person);
objectOutputStream.close();
System.out.println("Done");
}
}

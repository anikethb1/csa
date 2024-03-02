/*
### Pet
- **Variables:**
  - Each pet stores its name and its age (in whole years)
- **Constructors:**
  - `Pet (String n, int a)` – Sets class variables to the arguments.
- **Methods:**
  - `toString()` – Returns the String representation of a pet in the following format: `[name] is [age] year(s) old.`
  - `void birthday()` – Empty parameters, increases age by 1
  - `String speak()` – Returns “”
*/

// Pet class
public class Pet {
    // variables are protected so that they can be accessed by the subclasses
    protected String name;
    protected int age;
    
    // constructor
    public Pet(String n, int a) {
        // set the class variables to the arguments
        name = n;
        age = a;
    }
    
    // toString method
    public String toString() {
        // return the String representation of a pet in the following format
        return name + " is " + age + " year(s) old.";
    }
    
    // birthday method
    public void birthday() {
        // increase age by 1
        age++;
    }
    
    // speak method
    public String speak() {
        // return an empty string
        return "";
    }
}

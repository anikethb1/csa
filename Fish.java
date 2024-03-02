/*
### Fish
- **Variable:**
  - A fish stores all the information of a Pet AND store a String to represent the color of the fish.
- **Constructor:**
  - Fish are built using the Pet constructor
- **Methods:**
  - `toString()` – Empty parameters, returns the String representation of a shape in the following format: `[name] is a [color] fish that is [age] year(s) old.`
  - Override the speak method to return *bloop*
*/

// Fish class which is a subclass of Pet
public class Fish extends Pet {
    // private variable to store the color of the fish
    private String color;
    
    // constructor
    public Fish(String n, int a, String c) {
        // call the Pet constructor (it is super because Pet is the superclass of Fish)
        super(n, a);
        // set the color of the fish
        color = c;
    }
    
    // toString method
    public String toString() {
        // return the String representation of a fish in the following format
        return name + " is a " + color + " fish that is " + age + " year(s) old.";
    }
    
    // speak method (overriden because it is a subclass of Pet)
    public String speak() {
        // return "*bloop*"
        return "*bloop*";
    }
}

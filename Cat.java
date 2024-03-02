/*
### Cat
- **Variable:**
  - A cat stores the information of a pet AND some cats are friendly and other cats are not. Create a variable to store this information.
- **Constructor:**
  - Cats are built using all the information for a pet AND whether the cat is friendly or not.
- **Method:**
  - `toString()` – Empty parameters, returns the String representation of a shape in the following format: `[name] is a [friendly/not friendly] [age] year old cat.`
  - Override the speak method to return “meow”
*/

// Cat class which is a subclass of Pet
public class Cat extends Pet {
    // private variable to store whether the cat is friendly or not
    private boolean friendly;
    
    // constructor
    public Cat(String n, int a, boolean f) {
        // call the Pet constructor (it is super because Pet is the superclass of Cat)
        super(n, a);
        // set the friendly variable
        friendly = f;
    }
    
    // toString method
    public String toString() {
        // return the String representation of a cat in the following format
        return name + " is a " + (friendly ? "friendly" : "not friendly") + " " + age + " year old cat.";
    }
    
    // speak method (overriden because it is a subclass of Pet)
    public String speak() {
        // return "meow"
        return "meow";
    }
}
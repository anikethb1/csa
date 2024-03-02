/*
### Dog
- **Variable:**
  - A dog stores the information of a pet AND its breed as a String.
- **Method:**
  - `toString()` – Empty parameters, returns the String representation of a dog in the following format: `[name] is a dog who is a [age] year old [breed]`
  - Override the speak method to return “bark”
*/

// Dog class which is a subclass of Pet
public class Dog extends Pet {
    // private variable to store the breed of the dog
    private String breed;
    // constructor
    public Dog(String n, int a, String b) {
        // call the Pet constructor (it is super because Pet is the superclass of Dog)
        super(n, a);
        // set the breed of the dog
        breed = b;
    }
    
    // toString method
    public String toString() {
        // return the String representation of a dog in the following format
        return name + " is a dog who is a " + age + " year old " + breed;
    }
    
    // speak method (overriden because it is a subclass of Pet)
    public String speak() {
        // return "bark"
        return "bark";
    }

}
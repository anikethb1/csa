/*
### Owner
- **Variable:**
  - name
  - ArrayList of Pets
  - numPets
- **Constructor:**
  - Accepts the name of the owner
- **Method:**
  - `adopt(Pet p)`
    - Adds the pet to the ArrayList of pets
    - Updates numPets
  - `toString()`
    - `[ownerName] owns [numPets] pets : [toString each pet owned].`
  - `alertSounds()`
    - When the front door is opened or a package is delivered, all the pets make their speak sounds.
    - Return a String that represents the result when each pet ‘speaks’.
*/
import java.util.*;

// Owner class
public class Owner {
    // private variables to store the name of the owner, an ArrayList of pets, and the number of pets
    private String name;
    // ArrayList of pets
    private ArrayList<Pet> pets;
    // number of pets
    private int numPets;
    
    // constructor
    public Owner(String n) {
        // set the name of the owner
        name = n;
        // create a new ArrayList of pets
        pets = new ArrayList<Pet>();
        // set the number of pets to 0
        numPets = 0;
    }
    
    // adopt method
    public void adopt(Pet p) {
        // add the pet to the ArrayList of pets
        pets.add(p);
        // update the number of pets
        numPets++;
    }
    
    // toString method
    public String toString() {
        // return the String representation of an owner in the following format
        String result = name + " owns " + numPets + " pets : ";
        // loop through the ArrayList of pets
        for (Pet p : pets) {
            // add the String representation of each pet to the result
            result += p.toString() + ", ";
        }
        // return the result
        return result;
    }
    
    // alertSounds method
    public String alertSounds() {
        // return a String that represents the result when each pet ‘speaks’
        String result = "";
        // loop through the ArrayList of pets
        for (Pet p : pets) {
            // add the result of each pet speaking to the result
            result += p.speak() + ", ";
        }
        // return the result
        return result;
    }
}

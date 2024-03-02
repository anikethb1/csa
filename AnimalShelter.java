/*
### AnimalShelter
- **Variable:**
  - Name of Shelter
  - Number of pets
- **Method:**
  - `giveToOwner(Owner o, Pet p)`
    - Checks if the pet p is in the ArrayList and if so,
      - Calls adopt on the Owner object with parameter Pet
      - Removes the Pet p from the ArrayList because its been adopted.
      - Reduces number of pets by 1.
    - If the pet is not found, print “no pet found” and end the method with return;
*/

// imports ArrayList
import java.util.ArrayList;

// AnimalShelter class
public class AnimalShelter extends Owner{
  // private variables to store the name of the shelter and an ArrayList of pets
  private String name;
  private ArrayList<Pet> pets;
  public int numberOfPets;

  public AnimalShelter(String shelterName, int numberOfPets) {
    super(shelterName);
    this.name = shelterName;
    this.numberOfPets = numberOfPets;
    this.pets = new ArrayList<Pet>();
  }

  // giveToOwner method
  public void giveToOwner(Owner o, Pet p) {
    // iterate over the pets ArrayList
    for (int i = 0; i < pets.size(); i++) {
      // check if the current pet equals the given pet p
      if (pets.get(i).equals(p)) {
        // call adopt on the Owner object with parameter Pet
        o.adopt(p);
        // Removes the Pet p from the ArrayList because its been adopted.
        pets.remove(i);
        // Reduces number of pets by 1.
        this.numberOfPets = this.pets.size();
        // end the method with return after the pet is found and adopted
        return;
      }
    }
    // If the pet is not found after iterating over the entire ArrayList, print “no pet found”
    System.out.println("no pet found");
  }
}
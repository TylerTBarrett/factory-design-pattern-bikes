/**
 * A virtual representation of a Tricycle
 * @author Tyler Barrett 2021
 * 
 */

public class Tricycle extends Bike {
    
    /**
     * Constructs an instance of Tricycle, setting the name to 'Tricycle', the price to 54.95, 
     * the number of wheels to 3, hasPedals to true, and hasTrainingWheels to false. Then calls 
     * createBike to display the process of this construction
     */
    public Tricycle() {
        this.name = "Tricycle";
        this.price = 54.95;
        this.numWheels = 3;
        this.hasPedals = true;
        this.hasTrainingWheels = false;
        this.createBike();
    }
}

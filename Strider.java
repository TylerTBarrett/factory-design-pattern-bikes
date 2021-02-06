/**
 * A virtual representation of a Strider which inherits Bike
 * @author Tyler Barrett 2021
 * 
 */

public class Strider extends Bike {
    
    /**
     * Constructs a strider, setting the name to 'Strider' the price to 65.99, the number of wheels to 
     * 2, hasPedals to false, and hasTrainingWheels to false, then calls createBike to display the process 
     * of this construction
     */
    public Strider() {
        this.name = "Strider";
        this.price = 65.99;
        this.numWheels = 2;
        this.hasPedals = false;
        this.hasTrainingWheels = false;
        this.createBike();
    }
}

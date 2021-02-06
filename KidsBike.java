/**
 * A virtual representation of a Kids Bike, inherits Bike
 * @author Tyler Barrett 2021
 * 
 */

public class KidsBike extends Bike {
    
    /**
     * Constructs a KidsBike, sets name to 'Kids Bike', price to 80.99, number of wheels to 2, hasPedals
     * to true, and hasTrainingWheels to true. Call createBike to show the process of the construction
     */
    public KidsBike() {
        this.name = "Kids Bike";
        this.price = 80.99;
        this.numWheels = 2;
        this.hasPedals = true;
        this.hasTrainingWheels = true;
        this.createBike();
    }
    
}

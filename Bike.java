/**
 * A virtual representation of a generic bike and it's attributes, cannot be constructed by itself
 * @author Tyler Barrett 2021
 * 
 */

public abstract class Bike {
    protected String name;
    protected Double price;
    protected Integer numWheels;
    protected Boolean hasPedals;
    protected Boolean hasTrainingWheels;

    /**
     * Shows the process of creating a bike by calling createFrame, addWheels, 
     * addPedals, and displaying the price of the bike being created.
     */
    public void createBike() {
        this.createFrame();
        this.addWheels();
        this.addPedals();
        System.out.println("Price: $" + this.getPrice());
    }

    /**
     * Displays the frame of the bike being created
     */
    private void createFrame() {
        System.out.println("Assembling " + name + " frame");
    }

    /**
     * Displays the addition of wheels, if they are being added
     */
    private void addWheels() {
        if(numWheels > 0) {
            System.out.println("Adding " + numWheels + " wheel" + ((numWheels > 1) ? "s" : ""));
        }
        if(hasTrainingWheels) {
            System.out.println("Adding training wheels");
        }
    }

    /**
     * Displays the addition of pedals, if they are being added
     */
    private void addPedals() {
        if(hasPedals) {
            System.out.println("Adding pedals");
        }
    }

    /**
     * Will return the price of the current instance of bike
     * @return Double denoting the price of the bike
     */
    public double getPrice() {
        return this.price;
    }

}

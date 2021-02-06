/**
 * A virtual representation of a BikeStore, allows ordering and creation of bikes
 * @author Tyler Barrett 2021
 * 
 */

public class BikeStore {

    /**
     * Publically allows the ordering of bikes, will call on the createBike method 
     * to construct the specified bike and return it
     * @param type String called type that will determine what bike is ordered
     * @return A bike of the type stated in the String inputted is returned
     */
    public Bike orderBike(String type) {
        if(type != null) {
            return createBike(type);
        } else {
            return null;
        }
    }

    /**
     * Checks what string is inputted into the method and determines if that kind of bike
     * exists. If that bike exists it is created and returned, if not, null is returned.
     * @param type String that will determine what bike is made
     * @return Bike that was constructed
     */
    private Bike createBike(String type) {
            if(type.equalsIgnoreCase("Tricycle")) {
                return new Tricycle();
            } else if(type.equalsIgnoreCase("Strider")) {
                return new Strider();
            } else if(type.equalsIgnoreCase("Kids Bike")) {
                return new KidsBike();
            } else {
                return null;
            }
    }
}
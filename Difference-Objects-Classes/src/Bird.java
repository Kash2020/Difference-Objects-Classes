
/** The Bird class provides a blueprint for every object of type Bird. This
 * blueprint doesn't actually store any information. Rather, it provides a
 * structure for each Bird object to save, access, and modify its data. */
public class Bird {

    /** These are the instance variables of Bird which store the conditions
     * or states that a Bird object can have. */
    private final double wingSpan;
    private final double flightSpeed;
    BirdSpecies birdSpecies;
    BirdBehavior birdBehavior;

    /** This is a parameterized constructor that is called every time a new
     * Bird object is created.  */
    public Bird(double wingSpan, double flightSpeed, BirdSpecies birdSpecies, BirdBehavior birdBehavior) {
        this.wingSpan = wingSpan;
        this.flightSpeed = flightSpeed;
        this.birdSpecies = birdSpecies;
        this.birdBehavior = birdBehavior;
    }

    /** This "setter" or mutator method allows the user to change the behavior of
     * their Bird object. */
    public void setBirdBehavior(BirdBehavior newBirdBehavior) {
        birdBehavior = newBirdBehavior;
    }

    /** This "getter" or accessor method allows the user to print all the
     * values associated with their Bird object. */
    public void getBirdInfo() {

        System.out.println("Your " + this.birdSpecies + " has a wingspan of " +
                this.wingSpan + " inches, can fly " + this.flightSpeed +
                " mph, and is " + this.birdBehavior + "!");
    }

} /* End of Bird */

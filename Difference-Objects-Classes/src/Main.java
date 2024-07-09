public class Main {

    public static void main(String[] args) {

        /* The "new" keyword is used to create an instance of the Bird class. It is at this
          point that the Bird class blueprint takes the values passed by the new instance and
          saves them as a specific Bird object.*/
        Bird myFirstBird = new Bird(42, 21.34, BirdSpecies.PARROT, BirdBehavior.SINGING);
        Bird mySecondBird = new Bird(4.25, 28, BirdSpecies.HUMMINGBIRD, BirdBehavior.FLYING);

        /* The next two lines use the accessor methods described in the Bird class definition
          to print the values associated with each specific Bird object. */
        myFirstBird.getBirdInfo();
        mySecondBird.getBirdInfo();

        /* The following line uses the mutator method in the Bird class to change the
          value of the BirdBehavior variable of the object mySecondBird. */
        mySecondBird.setBirdBehavior(BirdBehavior.EATING);

        /* Finally, the accessor method is used again to verify that the value of
          BirdBehavior has been saved to the object mySecondBird. */
        mySecondBird.getBirdInfo();

    } /* End of main function */

} /* End of main class */

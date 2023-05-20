public class Cockroach extends WalkingInsect{

    public Cockroach(String type, String name, int legCount, int AvgAge, boolean venomous, String funFact) {
        super(type, name, legCount, AvgAge, venomous, funFact);
    }
    public String moveType() {
        return super.moveType() + "stepping in a 'tripod gait', a way in which the front and hind legs on one side of " +
                "the body move synchronously with the middle leg on the other side";
    }

    public String diet() {
        return super.diet() + " both plants and animals, since they are omnivores.";
    }
}

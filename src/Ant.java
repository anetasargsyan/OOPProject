public class Ant extends WalkingInsect{
    public Ant(String type, String name, int legCount, int AvgAge, boolean venomous, String funFact) {
        super(type, name, legCount, AvgAge, venomous, funFact);
    }

    public String moveType() {
        // Ants move similarly to cockroaches, we were surprised as well while researching this.
        return super.moveType() + "stepping in a 'tripod gait', a way in which the front and hind legs on one side of " +
                "the body move synchronously with the middle leg on the other side";
    }

    public String diet() {
        return super.diet() + "  the milk of aphids and other small Hemiptera, insects and small living or dead " +
                "invertebrates, as well as the sap of plants and various fruits. They also eat insect eggs.";
    }
}

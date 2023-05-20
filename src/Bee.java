public class Bee extends FlyingInsect{

    public Bee(String type, String name, int legCount, int maxAgeInMonth, boolean venomous, String funFact) {
        super(type, name, legCount, maxAgeInMonth, venomous, funFact);
    }

    @Override
    public String flyingStyle() {
        return  super.flyingStyle() + super.getType() + " flies by make short, quick sweeping motions with their wings.";
    }
}

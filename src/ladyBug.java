public class ladyBug extends FlyingInsect{
    public ladyBug(String type, String name, int legCount, int maxAgeInMonth, boolean venomous, String funFact) {
        super(type, name, legCount, maxAgeInMonth, venomous, funFact);
    }

    @Override
    public String flyingStyle() {
        return super.flyingStyle() + super.getType() + " flies by flapping its back wings beat when it flies. Its front wings, or elytra, are " +
                "thick and curved, acting as a covering and protecting the ladybug's delicate hind wings and soft body";
    }

    public String moveType() {
        return flyingStyle();
    }
}

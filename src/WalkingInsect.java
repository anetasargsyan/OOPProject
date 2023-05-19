public abstract class WalkingInsect extends Insect{

    public WalkingInsect(String type, String name, int legCount, int maxAgeInMonth, boolean venomous, String funFact) {
        super(type, name, maxAgeInMonth, legCount, venomous, funFact);
    }
    @Override
    public String moveType() {
        return type + " moves by ";

    }
    @Override
    public String diet() {
        return type + " typically eats ";
    }

}

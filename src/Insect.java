public abstract class Insect {
    private String type;
    private String name;
    private int legCount;
    private  int AvgAge;
    private boolean venomous;
    private  String funFact;

    public String diet() {
        System.out.println("To be determined ");
        return null;
    }

    public String moveType() {
        //to be determined
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(!type.isEmpty()) {
            this.type = type;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAvgAge() {
        return AvgAge;
    }

    public void setMaxAge(int AvgAge) {
        if(AvgAge < 0) {
            this.AvgAge = AvgAge;
        }
    }

    public boolean isVenomous() {
        return venomous;
    }

    public void setVenomous(boolean venomous) {
        this.venomous = venomous;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setFunFact(String funFact) {
        if(!funFact.isEmpty()) {
            this.funFact = funFact;
        }
    }
    public Insect(String type, String name,int legCount, int AvgAge, boolean venomous, String funFact) {
        this.type = type;
        this.legCount = legCount;
        this.name = name;
        this.AvgAge = AvgAge;
        this.venomous = venomous;
        this.funFact = funFact;
    }
}

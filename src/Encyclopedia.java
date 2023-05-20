import CSV_Parser.CSVReader;
import CSV_Parser.IvalidCSVFileException;

import java.io.IOException;
import java.util.Arrays;

public class Encyclopedia {
    // Make sure to use your own filepath for the CSVReader below
    CSVReader reader = new CSVReader("C:\\Users\\kevom\\Documents\\GitHub\\OOPProject\\src\\Data.csv");

    Insect[] insects = new Insect[]{};

    Encyclopedia(Insect[] insects) throws IvalidCSVFileException, IOException {
        CSVReader reader = new CSVReader("C:\\Users\\kevom\\Documents\\GitHub\\OOPProject\\src\\Data.csv");
        while (reader.hasNextRow()){
            String[] row = reader.nextRow();
            switch (row[1]) {
                case "Bullet Ant":
                    Ant bulletAnt = new Ant("Ant", "Bullet Ant", 6, 3, true,
                            "The bullet ant gets its name from the resemblance of its sting to be similar" +
                                    " to being hit by a bullet");
                case "Fire Ant":
                    Ant fireAnt = new Ant("Ant", "Fire Ant", 6, 1, true,
                            "The bullet ant gets its name from the burning sensation you feel when you are " +
                                    "stung by it.");
                case "Honey Bee":
                    Bee HoneyBee = new Bee("Bee", "Honey Bee", 6, 2, true,
                            "Honey bees are pollinators, which makes them a major factor of growth in fields and farms");
                case "Killer Bee":
                    Bee KillerBee = new Bee("Bee", "Killer Bee", 6, 2, true,
                            "Although killer bees are feared, their honey is said to be sweeter and healthier than " +
                                    "honey bee honey. ");
                case "Hissing Cockroach":
                    Cockroach hissingCockroach = new Cockroach("Cockroach", "Madagascar Hissing Cockroach",
                            6, 60, false, "The Madagascar hissing cockroach gets " +
                            "its name from the hissing noises it makes while threatened.");
                case "Oriental Cockroach":
                    Cockroach orientalCockroach = new Cockroach("Cockroach", "Oriental Cockroach",
                            6, 10, false, "Oriental cockroaches are slower and " +
                            "smaller than ordinary cockroaches and are unable to fly.");
                case "Two-spot ladybug":
                    ladyBug twoSpotLadybug = new ladyBug("Ladybug", "Two-spot ladybug", 6, 20,
                            false, "The two spotted ladybug gets its name from the two distinct spots it" +
                            " has on its body, one on each wing.");
                case "Fourteen-spotted ladybug":
                    ladyBug fourteenSpotLadybug = new ladyBug("Ladybug", "Fourteen-Spotted Ladybug", 6, 20,
                            false, "Just like all other ladybug species, these ladybugs come in " +
                            "various colors and patterns.");
            }
        }
        this.insects = insects;
    }

    public static void main(String[] args) throws IvalidCSVFileException, IOException {
        CSVReader reader = new CSVReader("C:\\Users\\kevom\\Documents\\GitHub\\OOPProject\\src\\Data.csv");
        System.out.println(Arrays.toString(reader.getColumnNames()));
        while (reader.hasNextRow()) {
            String[] row = reader.nextRow();
            System.out.println(Arrays.toString(row));
        }
    }
}

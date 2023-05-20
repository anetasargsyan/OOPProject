import CSV_Parser.CSVReader;
import CSV_Parser.IvalidCSVFileException;

import java.io.IOException;
import java.util.Arrays;

public class Encyclopedia {
    // Make sure to use your own filepath for the CSVReader below
   // CSVReader reader = new CSVReader("C:\\Users\\kevom\\Documents\\GitHub\\OOPProject\\src\\Data.csv");

    Insect[] insects = new Insect[]{};

    Encyclopedia(Insect[] insects) throws IvalidCSVFileException, IOException {
        this.insects = insects;
    }

    Encyclopedia() throws IvalidCSVFileException, IOException {

        //CSVReader reader = new CSVReader("Data.csv");

        //System.out.println(Arrays.toString(reader.getColumnNames()));
        //while (reader.hasNextRow()) {
        //    String[] row = reader.nextRow();
        //    System.out.println(Arrays.toString(row));

        Ant a1 = new Ant("Fire", "L", 4, 4, true, "Something");
        Ant a2 = new Ant("F2", "L3", 421, 4, false, "Something else");
        Ant a3 = new Ant("non fire", "L5", 4, 4, true, "Something interesting");
        insects = new Insect[]{
                a1,a2,a3
        };
    }
}

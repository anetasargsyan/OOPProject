import CSV_Parser.CSVReader;
import CSV_Parser.IvalidCSVFileException;

import java.io.IOException;
import java.util.Arrays;

public class Encyclopedia {
    // Make sure to use your own filepath for the CSVReader below
    CSVReader reader = new CSVReader("C:\\Users\\kevom\\Documents\\GitHub\\OOPProject\\src\\Data.csv");

    Insect[] insects = new Insect[]{};

    Encyclopedia(Insect[] insects) throws IvalidCSVFileException, IOException {
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

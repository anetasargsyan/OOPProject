import CSV_Parser.IvalidCSVFileException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IvalidCSVFileException, IOException {
        Encyclopedia enc = new Encyclopedia();
        MainForm form = new MainForm(enc);
    }
}
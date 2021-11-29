package task4;

import java.io.IOException;

/**
 * @author Nikita Nesterov
 */

public class Main {

    public static void main(String[] args) throws IOException {

        CSVFileWriter.writeToCSV(CSVFileReader.getRecordList());
    }
}

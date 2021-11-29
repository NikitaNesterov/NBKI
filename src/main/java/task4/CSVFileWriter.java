package task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static task4.CSVFileReader.*;

/**
 * @author Nikita Nesterov
 */
public class CSVFileWriter {

    /**
     * Method writes in CSV file
     * @param recordList  - List of Reciords
     * @throws IOException
     */
    public static void writeToCSV(List<Record> recordList) throws IOException {
        FileWriter csvWriter = new FileWriter("src/main/resources/newFile.csv");
        csvWriter.append(header);
        csvWriter.append("\n");

        recordList.forEach(rec -> {
                    try {
                        csvWriter.write(rec.getKey().toString());
                        csvWriter.append(";");
                        csvWriter.write(rec.getValue());
                        csvWriter.append("\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );
        csvWriter.flush();
        csvWriter.close();
    }
}

package task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * class for reader CSV file
 * @author Nikita Nesterov
 */
public class CSVFileReader {

    public static String header = "";

    /**
     * method get List of all lines from CSV file sorted by 1st element
     * @return List oа Кусщкв
     * @throws IOException
     */
    public static List<Record> getRecordList() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(
                "src/main/resources/baseFile.csv"));

        String line = null;
        header = reader.readLine();
        Scanner scanner = null;
        int index = 0;
        List<Record> recordList = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            Record record = new Record();
            String[] data = line.split(";");
            record.setKey(Integer.parseInt(data[0]));
            StringBuilder builder = new StringBuilder();
            for(int i = 1; i < data.length;) {
                builder.append(data[i]);
                if(i != data.length - 1) {
                    builder.append(";");
                    i++;
                }
                else break;
            }
            record.setValue(new String(builder));
            recordList.add(record);
        }
        reader.close();
        recordList.sort(new SortByFirstElement());
        return recordList;
    }
}




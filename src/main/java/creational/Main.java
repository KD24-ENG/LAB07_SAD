package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException {

        /* Current usage
        BookMetadataFormatter formatter = null;
        try {
            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
            formatter.append(TestData.dragonBook);
            formatter.append(TestData.dinosaurBook);
            System.out.print(formatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }*/

        /*json usage*/
        BookMetadataExporter JSONexporter = new JSONBookMetadataExporter();
        JSONexporter.add(TestData.sailboatBook);
        JSONexporter.add(TestData.GoFBook);
        JSONexporter.export(System.out);

        /*xml usage*/
        BookMetadataExporter XMLexporter = new XMLBookMetadataExporter();
        XMLexporter.add(TestData.sailboatBook);
        XMLexporter.add(TestData.GoFBook);
        XMLexporter.export(System.out);

        /*csv usage*/
        BookMetadataExporter CSVexporter = new CSVBookMetadataExporter();
        CSVexporter.add(TestData.sailboatBook);
        CSVexporter.add(TestData.GoFBook);
        CSVexporter.export(System.out);
    }
}

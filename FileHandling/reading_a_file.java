package FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class reading_a_file {
    public static void main (String args[]) {

        //BufferedReader + Filereader : for reading text files line-by-line
        //FileInputStream : for binary files (images etc...)
        //RandomAccessFile: Best for read/write specific portions of a large file
        String toBePrinted = "";

        String filePath = "FileHandling/text_output.txt";
        try {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while((line = reader.readLine()) != null) {
            toBePrinted = toBePrinted.concat(line);
        }
        System.out.println(toBePrinted);

        reader.close();
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
    }
}

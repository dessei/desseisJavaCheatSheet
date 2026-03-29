package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writing_to_a_file {
    public static void main(String args[]) {

        //FileWriter = small / medium sized text files;
        //BufferedWriter = better for large amounts of text
        //PrintWriter = best for structured data
        //FileOutputStream = for binary files (images, etc...)
        FileWriter fw;
        try {
            fw = new FileWriter("FileHandling/text_output.txt");
            fw.write("123456\ntestest");
            fw.write("test");

        } catch (IOException e) {
            System.out.println("file couldnt be written to");
            return;
        }

        try {
            fw.close();
        } catch(IOException e) {
            System.out.println("I dont even know what went wrong here");
        }
    }
}

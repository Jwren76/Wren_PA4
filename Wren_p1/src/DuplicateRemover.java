
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {
    ArrayList<String> uniqueWords = new ArrayList<String>();
    public void remove(String dataFile) throws IOException {
        ArrayList<String> inputString = new ArrayList<String>();
        FileReader fileWordStream = new FileReader(dataFile);
        Scanner inSS = new Scanner(fileWordStream);
        while (inSS.hasNext()) {
            inputString.add(inSS.nextLine());
        }
        for (String words:inputString){
            if (!uniqueWords.contains(words)) uniqueWords.add(words);
        }
        inSS.close();
    }
    public void write(String outputFile) throws IOException {
        PrintWriter newPrint = new PrintWriter(outputFile);
        for(String words:uniqueWords) {
            newPrint.println(words);
        }
        newPrint.close();

    }

}















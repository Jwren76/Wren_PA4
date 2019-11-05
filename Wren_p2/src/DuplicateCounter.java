import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
    Map<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void count(String dataFile) throws IOException {
        ArrayList<String> inputString = new ArrayList<String>();
        FileReader fileWordStream = new FileReader(dataFile);
        Scanner inSS = new Scanner(fileWordStream);
        while (inSS.hasNext()) {
            inputString.add(inSS.nextLine());
        }
        for (String words : inputString) {
            if (!wordCounter.containsKey(words)) {
                wordCounter.put(words, 1);
            } else {
                int counter = wordCounter.get(words);
                wordCounter.put(words, counter + 1);
            }
            inSS.close();
        }
    }

    public void write(String outputFile) throws IOException {
        PrintWriter newPrint = new PrintWriter(outputFile);
        for (String words : wordCounter.keySet()) {
            newPrint.println(words + ": " + wordCounter.get(words));
        }
        newPrint.close();
    }
}

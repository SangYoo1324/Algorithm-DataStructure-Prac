import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\samue\\OneDrive\\Documents\\image\\aaa.txt"); //Absolute Route
        File file2 = new File("ExtraPrac/src/dummyText.txt");  //Repository Route
        File file3 = new File("src/dummyText.txt"); // Source Route(not working)
        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

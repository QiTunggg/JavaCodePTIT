import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HELLOFILE {
    public static void main(String[] args) {
        String fileName = "Hello.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}

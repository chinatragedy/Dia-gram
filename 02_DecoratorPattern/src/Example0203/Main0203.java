package Example0203;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main0203 {

    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println("- Decorator Pattern Begin-");
        int c;
        try {
            InputStream in = new LowCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileRead {
    public BufferedReader testUser() throws FileNotFoundException {
        FileReader fw=new FileReader("C:\\Users\\Nikhil Tripathi\\Desktop\\User.txt");
        return new BufferedReader(fw);
    }
    public void login() throws IOException {
        String s1 = testUser().readLine();
        System.out.println(s1);
    }

    public static void main(String[] args) throws IOException {
        FileRead f=new FileRead();
        f.login();
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\Desktop\\INFO5100\\l12\\my_test_file.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\LENOVO\\Desktop\\INFO5100\\l12\\my_test_file.txt"));
            writer.append(phrase);
            writer.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
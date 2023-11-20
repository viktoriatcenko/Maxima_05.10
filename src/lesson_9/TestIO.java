package lesson_9;

import java.io.*;

public class TestIO {
    public static void main(String[] args) throws IOException {
//        System.out.println();
//
//        Scanner scanner = new Scanner(System.in);
//
//        String s = scanner.nextLine();
//
//        System.out.println(" From scanner " + s);
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String line = reader.readLine();
//
//        System.out.println(" From reader " + line);

        File myFile = new File("file.txt");

        BufferedReader reader = new BufferedReader(new FileReader(myFile.getAbsolutePath()));

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println("Line from file : " + line + "\n");
        }


        String [] array = {"additional line 1", "additional line 2", "additional line 3"};

        File myFileToWrite = new File("fileToWrite.txt");

        BufferedWriter writer = new BufferedWriter(new FileWriter(myFileToWrite.getAbsolutePath()));

        for (String s: array) {
            writer.write(s + "\n");
        }

    }
}

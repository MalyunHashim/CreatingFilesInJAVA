package CreatingFilesInJAVA;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFiles {
    public static void main(String[] args) {




        try{
            File f = new File("testFile.txt");

            boolean value = f.createNewFile();

            if (value){
                System.out.println("File was created successfully");
            }else{
                System.out.println("File already exists");
            }

            FileWriter fileWriter= new FileWriter("testFile.txt");
            fileWriter.write("Java is a programming language made by oracle to achieve java development" +
                    "\n We recommend reading this tutorial, in the sequence listed in the left menu." +
                    "\nJava is an object oriented language and some concepts may be new." +
                    "\nTake breaks when needed, and go over the examples as many times as needed.");
            fileWriter.close();

            System.out.println("File has been  written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred");
            throw new RuntimeException(e);
        }
    }
}

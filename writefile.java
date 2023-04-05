package CreatingFilesInJAVA;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class writefile {

    public static void main(String[] args) {
        try{
            FileWriter mywriter=new FileWriter("filename.txt");
            mywriter.write(" file in java might be tricky but it is fun enough" +
                    "\n We recommend reading this tutorial, in the sequence listed in the left menu." +
                    "\nJava is an object oriented language and some concepts may be new. " +
                    "\nTake breaks when needed, and go over the examples as many times as needed.");
            mywriter.close();
            System.out.println("successfully wrote to the file ");


        }catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();

        }
    }
}

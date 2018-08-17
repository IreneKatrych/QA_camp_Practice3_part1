package Task1;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        //Creating file
        DataOutputStream newFileOut = new DataOutputStream(new FileOutputStream("src/practice3.txt"));
        //writing data into the file
        newFileOut.writeUTF("ELEKS QA Camp");

        //reading info from the file
        DataInputStream newFileIn = new DataInputStream(new FileInputStream("src/practice3.txt"));
        while (newFileIn.available() > 0) {
            String dataFromFile = newFileIn.readUTF();
            System.out.println(dataFromFile);
        }


    }
}

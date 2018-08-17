package task2;

import java.io.*;

public class Human implements java.io.Serializable {

    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]) throws IOException, ClassNotFoundException {

        //writing object into file
        Human human = new Human("Alice", 8);
        FileOutputStream writeFile = new FileOutputStream("human.ser");
        ObjectOutputStream newOutput = new ObjectOutputStream(writeFile);
        newOutput.writeObject(human);

        //reading object from file
        Human newHuman = null;
        FileInputStream readFile = new FileInputStream("human.ser");
        ObjectInputStream newInput = new ObjectInputStream(readFile);
        newHuman = (Human) newInput.readObject();

    }
}

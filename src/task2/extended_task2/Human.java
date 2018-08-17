package task2.extended_task2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

//NOT WORKING CODE

public class Human {

    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]) throws IOException {

        //writing object into file using jackson
        ObjectMapper mapper = new ObjectMapper();
        Human oneMoreHuman = new Human("Mr Hatter", 36);
        mapper.writeValue(new File("human_out.json"), oneMoreHuman);

       /* //reading object from file using jackson
        ObjectMapper objectMapper = new ObjectMapper();
        Human human = objectMapper.readValue(new File ("human_out.json"), Human.class);*/
    }
}

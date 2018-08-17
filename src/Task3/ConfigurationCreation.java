package Task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationCreation {

    public static void main(String args[]) throws IOException {

        //creating properties file
        Properties properties = new Properties();
        properties.setProperty("Opera", "54.0.2952.71");
        properties.setProperty("Google Chrome", "68.0.3440.106");
        FileOutputStream fileOutputStream = new FileOutputStream("config.properties");
        properties.store(fileOutputStream, "Browser configuration");

        //reading properties file
        Properties newProperties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("config.properties");
        newProperties.load(fileInputStream);

    }
}



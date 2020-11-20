package io.symmetrix.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    /**
     * 1. We create Properties Object
     *  - Inside Static Block
     * 2. Create FileInputStream object
     * 3. Get the path of Configuration.properties and pass into FileInputStream object parameter and open the file
     * 4. Load the file into properties object
     * 5. close the file
     *  -
     * 6. Create public static getProperty() method that returns String and accepts String parameter
     */

        private static Properties configFile=new Properties();

        static {

            try {
                FileInputStream file=new FileInputStream("Configuration.properties");
                configFile.load(file);
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Properties file not found.");
            }

        }

    /**
     * This method returns property value from configuration.properties file
     * @param keyName property name
     * @return property value
     */
        public static String getProperty(String keyName) {
            return configFile.getProperty(keyName);
        }
}

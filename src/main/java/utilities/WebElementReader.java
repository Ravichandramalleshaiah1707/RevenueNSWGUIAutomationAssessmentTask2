package utilities;

import java.io.InputStream;
import java.util.Properties;

public class WebElementReader {
    private Properties properties;

    public WebElementReader(String fileName) {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                System.out.println("File not found in classpath" + fileName);
                throw new RuntimeException("Locator file not found: " + fileName);
            }
            else {
                System.out.println("Successfully loaded file" + fileName);
                properties.load(input);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load locator file: " + fileName);
        }
    }

    public String get(String key) {
        return properties.getProperty(key);
    }
}

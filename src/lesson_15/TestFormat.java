package lesson_15;


import org.apache.log4j.Logger;

public class TestFormat {
    private static final Logger LOGGER = Logger.getLogger(TestFormat.class);
    public static void main(String[] args) {
        int age = 21;
        String name = "Damir";
        LOGGER.debug("Hello! My name is Damir. My age is 21");
        LOGGER.fatal("Hello! My name is Damir. My age is 21");
    }
}

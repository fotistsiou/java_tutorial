package fotistsiou.javatutorial.e_logging.a_introduction_to_logging.examples;

import java.util.logging.Logger;

public class IntroductionToLogging {
    private static final Logger logger = Logger.getLogger(IntroductionToLogging.class.getName());

    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            logger.warning("A NullPointerException was caught: " + e.getMessage());
        }
    }
}

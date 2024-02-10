package week05;

public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Testing AsteriskLogger
        asteriskLogger.log("Hi");
        asteriskLogger.error("Hi");

        // Testing SpacedLogger
        spacedLogger.log("Hi");
        spacedLogger.error("Hi");
    }
}

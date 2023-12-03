package LabSingletonPattern;

public class HelpDesk {
    public static void main(String[] args) {
        // Access the centralized queuing system
        QueuingSystem queuingSystem = QueuingSystem.getInstance();
        queuingSystem.getCurrentQueueNumber("Station 3");
        queuingSystem.getCurrentQueueNumber("Station 1");
        queuingSystem.getCurrentQueueNumber("Station 2");

        queuingSystem.resetQueueNumber("Station 1", 50);

        queuingSystem.getCurrentQueueNumber("Station 3");
        queuingSystem.getCurrentQueueNumber("Station 1");
        queuingSystem.getCurrentQueueNumber("Station 2");
    }
}

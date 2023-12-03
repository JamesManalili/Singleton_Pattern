package LabSingletonPattern;
public class QueuingSystem {
    private static QueuingSystem instance;
    private int currentQueueNumber;

    // Private constructor to prevent instantiation from outside
    private QueuingSystem() {

    }

    public static QueuingSystem getInstance() {
        if (instance == null)
            instance = new QueuingSystem();
        return instance;
    }

    // get the current queue number
    public void getCurrentQueueNumber(String station) {
        System.out.println("The current queue number " + currentQueueNumber
        + " is taken in " + station + ".");
        incrementQueueNumber();
    }

    // increment the queue number
    public void incrementQueueNumber()   {
        currentQueueNumber++;
    }

    // Method to reset the queue number based on an inputted number
    public void resetQueueNumber(String station, int resetQueue) {
        System.out.println(station + " reset the queuing number to " + resetQueue);
        this.currentQueueNumber = resetQueue;
    }
}


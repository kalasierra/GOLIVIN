package com.Group11.TugasBesar;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    // Scheduled method that runs every 1 minute
    @Scheduled(fixedRate = 60000)
    public void checkTime() {
        // Get the current time
        Date currentTime = new Date();
        System.out.println("Checking time at " + dateFormat.format(currentTime));

        // Replace this with your logic to retrieve the record time from the database or another source
        Date recordTime = getRecordTimeFromDatabase(); // Replace with your logic

        // Compare the current time with the record time
        if (currentTime.after(recordTime)) {
            // The current time has passed the record time, initiate your method here
            initiateMethod();
        }
    }

    private Date getRecordTimeFromDatabase() {
        // Replace this with your logic to retrieve the record time from the database or another source
        // For example, you can use JPA repositories to fetch data from the database
        // Dummy implementation here, replace with your actual code
        return new Date(); // Replace with your logic
    }

    private void initiateMethod() {
        // Replace this with the method you want to initiate when the condition is met
        System.out.println("Initiating the method...");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodBankManagement;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

public class AppLogger {
    private static Logger logger = Logger.getLogger(AppLogger.class.getName());
    private static FileHandler fileHandler;

    static {
        try {
            // Generate a log file with today's date
            String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            String logFileName = "log_" + date + ".log";

            // Set up file handler
            fileHandler = new FileHandler(logFileName, true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            System.err.println("Failed to initialize logger: " + e.getMessage());
        }
    }

    public static void logInfo(String message) {
        logger.info(message);
    }

    public static void logWarning(String message) {
        logger.warning(message);
    }

    public static void logError(String message) {
        logger.severe(message);
    }

    // Optional: Close the file handler (e.g., on application exit)
    public static void closeLogger() {
        if (fileHandler != null) {
            fileHandler.close();
        }
    }
}
package com.gianco.javatraining;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by gianco on 20-Feb-16.
 */
public class Chapter01page10 {
    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("logs"));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
        LocalDateTime now = LocalDateTime.now();
        String date = now.format(dateTimeFormatter);
        String logFileName = "logs\\testlog-" + date + ".txt";

        FileHandler fileHandler = new FileHandler(logFileName);
        fileHandler.setFormatter(new SimpleFormatter());

        Logger logger = Logger.getLogger("LUIS LOGGER");
        logger.addHandler(fileHandler);
        logger.setLevel(Level.ALL);

        logger.info("PRIMO ESERCIZIO LOG ");

        fileHandler.close();
    }
}

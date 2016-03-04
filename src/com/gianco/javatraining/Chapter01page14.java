package com.gianco.javatraining;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by gianco on 27-Feb-16.
 */
public class Chapter01page14 {
    public static void main(String[] args) {
        int count = 0; // non posso usare contatore dentro LAMBDA expression!!! :O
        try {
            Files.walk(Paths.get("D:\\DOCUMENTS_REMAP\\Documents")).forEach(p -> {
                if (p.getFileName().toString().endsWith(".pdf")) {
                    System.out.println("PDF : " + p.getFileName());
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

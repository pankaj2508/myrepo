package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class File_copy {
    public static void main(String[] args) {
        Path sourceDirectory = Paths.get("C:/Users/singh/OneDrive/Documents/Pankaj/Learn/Java_project");
        Path inputFile = sourceDirectory.resolve("Input.txt");
        Path outputFile = sourceDirectory.resolve("output.txt");

        try {
            if (!Files.exists(inputFile)) {
                System.out.println("Input file not found: " + inputFile);
                return;
            }

            Files.copy(inputFile, outputFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully from " + inputFile + " to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

package com.pb.nechaev.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {

    public void createNumbersFile()
    {
        Path path = Paths.get("src\\com\\pb\\nechaev\\hw9\\numbers.txt");
        try {
            Files.createFile(path);
        } catch (IOException ex)
        {
            System.out.println("Файл уже создан");
        }

        try (BufferedWriter writer = Files.newBufferedWriter(path))
        {
            Random rand = new Random();
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    int r = 1 +  rand.nextInt(99);
                    writer.write(r + " ");
                }
                writer.newLine();
            }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка файла - " +ex.getMessage());
        }

    }

    public void createOddNumbersFile()
    {
        Path path = Paths.get("src\\com\\pb\\nechaev\\hw9\\numbers.txt");
        Path path2 = Paths.get("src\\com\\pb\\nechaev\\hw9\\odd-numbers.txt");
        try {
            Files.createFile(path2);
        } catch (IOException ex)
        {
            System.out.println("Файл уже создан");
        }

        try (BufferedReader reader = Files.newBufferedReader(path); BufferedWriter writer = Files.newBufferedWriter(path2))
        {
            String line;
            while((line = reader.readLine()) != null) {
                String[] bufPart = line.split(" ");
                for (int i = 0; i < bufPart.length; i++)
                {
                    int tempInt = Integer.parseInt(bufPart[i]);
                    if (tempInt % 2 == 0 )
                    {
                        writer.write(0 + " ");
                    } else
                    {
                        writer.write(tempInt + " ");
                    }

                }
                writer.newLine();
            }

        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
    }
}

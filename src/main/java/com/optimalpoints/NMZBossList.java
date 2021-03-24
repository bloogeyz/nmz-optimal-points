package com.optimalpoints;

import lombok.Getter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class NMZBossList {
    @Getter
    private ArrayList<NMZBoss> nmzBossList;

    NMZBossList(InputStream bossCSV) {
        this.nmzBossList = new ArrayList<>();
        Reader reader = new InputStreamReader(bossCSV, StandardCharsets.US_ASCII);
        try (BufferedReader br = new BufferedReader(reader)) {
            String currentLine = br.readLine(); // Skip the headers
            currentLine = br.readLine();
            while (currentLine != null) {
                String[] attributes = currentLine.split(",");
                this.nmzBossList.add(new NMZBoss(attributes[0],
                        Integer.parseInt(attributes[1]),
                        Integer.parseInt(attributes[2]),
                        Integer.parseInt(attributes[3]),
                        Integer.parseInt(attributes[4])
                        ));
                currentLine = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

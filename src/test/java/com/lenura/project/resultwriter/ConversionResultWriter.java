package com.lenura.project.resultwriter;

import com.lenura.project.model.Conversion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ConversionResultWriter {

    public void writeResult(ArrayList<Conversion> conversions) {
        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter(new File("C:\\Users\\Lena\\IdeaProjects\\JavaProject1\\result\\result.txt")));
            for (Conversion conversion: conversions) {
                bf.write(conversion.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(bf != null){
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

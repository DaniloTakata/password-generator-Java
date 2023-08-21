package br.com.code.controller;

import br.com.code.model.Password;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileManipulator {

    public FileManipulator() {}

    public static void writeLog(String path, Password password) {

        try {

            Date fullDate = new Date();
            String date = new SimpleDateFormat("dd/MM/yyyy").format(fullDate);
            String hour = new SimpleDateFormat("HH:mm:ss").format(fullDate);

            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
            String line = password.getPasswordGenerate() + " - " + date + " " + hour + "\n";
            buffWrite.append(line);
            buffWrite.close();

        } catch (Exception e) {
            System.out.println("Arquivo não encontrado.");
        }

    }

}

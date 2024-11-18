package edu.hospital;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Base {

    public void createDate(){
        String dirPath = "C:\\Users\\bernardo\\OneDrive\\Documents\\AppsJava\\src\\edu\\hospital"; // Caminho do arquivo aonde irei por o arqivo txt

        File dir = new File(dirPath);
        File file = new File(dir,"arqivo.txt");


        try {
            if (!file.exists()) {
                file.createNewFile();
                FileWriter writer = new FileWriter(file, true); 
                writer.write("Número,Peso,Altura\n"); // Cabeçalho para estrutura dos dados
                writer.close();
                System.out.println("Arquivo criado e escrito com sucesso!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


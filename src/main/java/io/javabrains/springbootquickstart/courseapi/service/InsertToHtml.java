package io.javabrains.springbootquickstart.courseapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class InsertToHtml {
    static int counter = 0;
    String headFilePath;
    String header;
    String body;
    String result;
    String bdp = "";

    public InsertToHtml() {
        headFilePath = "src\\main\\resources\\Templates\\Bloks\\header.html";
        System.out.println("InsertHeader constructor filePath =" + headFilePath);
        try {
            header = new String(Files.readAllBytes(Paths.get(headFilePath)));
        }catch (IOException e) {
            System.out.println("Header file error exeption");
            e.printStackTrace();
        }
        System.out.println(header);
        counter++;
        System.out.println("Counter = " + counter);
        //body = doInsert(bdp);
    }

    public void InsertToHtml_o(String hdp){
        headFilePath = hdp;
       // headFilePath = "src\\main\\resources\\Templates\\Bloks\\header.html";
        System.out.println("InsertHeader constructor filePath =" + headFilePath);
        try {
            header = new String(Files.readAllBytes(Paths.get(headFilePath)));
        }catch (IOException e) {
            System.out.println("Header file error exeption");
            e.printStackTrace();
        }
        System.out.println(header);
        //body = doInsert(bdp);
    }
   // @Autowired
    public void tick(){
        System.out.println("tick in InsertToHtml");
        System.out.println("tick.Counter = " + counter);
        System.out.println("tick.headFilePath = " + headFilePath);

    }


    //Read file content into string with - Files.readAllBytes(Path path)

    private String doInsert(String body_pass) {

        try {
            body = new String(Files.readAllBytes(Paths.get(body_pass)));
        } catch (IOException e) {
            System.out.println("body file error exeption");
            e.printStackTrace();
        }

        return result;
    }
}

package part5.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class q2 {
    public static void main(String[] args) {
        File fin = new File("./part5/task1/name.txt");
        List<String> names=new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fin), "UTF-8"))){
            String line;
            while((line = br.readLine()) != null){
                line = line.trim();
                if(line.length() > 0)
                names.add(line);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./part5/task1/name_sorted.txt"), "UTF-8"))){
            names.stream().sorted()
                .forEach((name)->{
                    try{
                        bw.write(name);
                        bw.newLine();
                    } 
                    catch(IOException e){
                        System.out.println(e.getMessage());
                    }
                    });
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}

package part5.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class q1 {
    public static void main(String[] args) throws Exception {
        File fin=new File("./part5/task1/image/Java09-1.jpg");
        byte[] bytes=new byte[(int)fin.length()];

        try(FileInputStream fis=new FileInputStream(fin)){
            fis.read(bytes);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        File fout=new File("./part5/task1/doro_copy.jpg");

        try(FileOutputStream fos=new FileOutputStream(fout)){
        fos.write(bytes);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

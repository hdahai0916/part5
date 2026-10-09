package part5.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class task2 {
    public static void main(String[] args) {
        Student student = new Student(1, "doro", 2, "114514");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./part5/task2/student.dat"))){
            oos.writeObject(student);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        Student doro = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./part5/task2/student.dat"))){
            doro = (Student) ois.readObject();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(doro);
    }
}

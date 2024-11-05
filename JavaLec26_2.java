import java.io.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class JavaLec26_2 {
    public static void main(String[] args) {
        Employee Emp = null;
        try{
            FileInputStream File_In = new FileInputStream("Employee.ser");
            ObjectInputStream Obj_Out = new ObjectInputStream(File_In);
            ObjectInputStream Obj_In = new ObjectInputStream(File_In);
            //Emp = (Employee)in.readObject();


        }
        catch (IOException Exp){
    
        }
    }
   
}

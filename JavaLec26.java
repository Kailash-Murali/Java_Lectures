import java.io.*;

public class JavaLec26 {

    public static void main(String[] args) throws IOException, ClassNotFoundException{

        // Character Char = 'A';
        // FileOutputStream F_Out = new FileOutputStream("File.txt");
        // ObjectOutputStream Obj_Out = new ObjectOutputStream(F_Out);
        // Obj_Out.write(Char);
        // Obj_Out.flush();
        // Obj_Out.close();

        // FileInputStream F_In = new FileInputStream("File.txt");
        // ObjectInputStream Obj_In = new ObjectInputStream(F_In);
        // System.out.println((char)Obj_In.read());
        // Obj_In.close();
        // class Demo implements Serializable{
        //     String Str = "Suffer.";
        //     private void WriteObj(ObjectOutputStream Out) throws IOException, ClassNotFoundException{
        //         Out.defaultWriteObject();
        //     }
        // }
        
    }
}

class Employee implements Serializable{
    public String Name;
    public String Address;
    public transient int SSN;
    public int Number;
    public void mailCheck(){
        System.err.printf("Mailing a check to %s@%s", Name, Address);
    }
}
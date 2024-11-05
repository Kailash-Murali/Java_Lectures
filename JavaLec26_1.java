import java.io.*;

public class JavaLec26_1 {

    public static void main(String[] args) {
        Employee Emp = new Employee();
        Emp.Name = "Payne";
        Emp.Address = "Shuffering";
        Emp.Number = 16010914;
        Emp.SSN = 71504;
        try{
            FileOutputStream File_Out = new FileOutputStream("Employee.ser");
            ObjectOutputStream Obj_Out = new ObjectOutputStream(File_Out);
            Obj_Out.writeObject(Emp);
            Obj_Out.close();
            File_Out.close();
            System.out.println("Serialized.");
        }
        catch (IOException Exp){
            Exp.printStackTrace();
        }
        
    }
}
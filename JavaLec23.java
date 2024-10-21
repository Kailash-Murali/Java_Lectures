import java.io.*;

public class JavaLec23{
    public static void main(String[] args) throws IOException{
        FileReader In = null;
        FileWriter Out = null;
        try{
            In = new FileReader("Input.txt");
            Out = new FileWriter("Output.txt");
            int Int;
            while ((Int = In.read()) != -1)
                Out.write(Int);
        }
        finally{
            if (In != null)
                In.close();
            if (Out != null)
                Out.close();
        }
    }
}

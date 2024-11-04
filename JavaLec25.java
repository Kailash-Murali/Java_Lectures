// Scanner Package
import java.io.*;

// Main Class
public class JavaLec25{

    // Main Method
    public static void main(String[] args) throws IOException{
        
        FileOutputStream Out = new FileOutputStream("Output.txt");
        ObjectOutputStream Out_Stream = new ObjectOutputStream(Out);
        ObjectInputStream In_Stream = new ObjectInputStream(new FileInputStream("Output.txt")); // Simplfied Syntax
        
        Out_Stream.writeBoolean(false);
        Out_Stream.writeUTF("Java is FUNNN");
        Out_Stream.flush();
        
        System.out.printf("Read Boolean syntax:\n%b", In_Stream.readBoolean());
        System.out.printf("\nRead method: \n");
        for (int Index = 0; Index < In_Stream.available();)
            System.out.print((char)In_Stream.read());

    }
}

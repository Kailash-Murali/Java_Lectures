// File Handling 

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

// Main Class
public class JavaLec24{
    
    // Main Method
    public static void main(String[] args) throws IOException{
        
        DataOutputStream File = new DataOutputStream(new FileOutputStream("Output.txt"));
        File.writeUTF("Hello, there!");
        DataInputStream File1 = new DataInputStream(new FileInputStream("Output.txt"));
        while(File1.available() > 0)
            System.out.print(File1.readUTF());
        
        File.close();
        File1.close();
        
    }

}
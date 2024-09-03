// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// Main class
public class JavaLec {

    // Main function
    String Msg = "\'Hello, ";

    public static void main(String[] args) {
        
        // Output
        JavaLec1 Obj1 = new JavaLec1();
        JavaLec2 Obj2 = new JavaLec2();
        System.out.print(Obj1.Msg);
        System.out.print(Obj1.Msg1);
        System.out.print(Obj2.Msg2);

    }

}
    
    // public static void main(String[] args) {
        
        // Date Time initialisation
        // LocalDateTime DateTime = LocalDateTime.now();
        // DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm");
        // String Date = Format.format(DateTime);
        
        // Output
        // System.out.println(Date);

        // Inheritance

    // }


class JavaLec1 extends JavaLec{
    String Msg1 = "there!\'";
}

class JavaLec2 extends JavaLec{
    String Msg2 = " said, Obi Wan Kenobi.";
}
    



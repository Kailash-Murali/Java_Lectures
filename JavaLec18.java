//Java Lecture

// Scanner Package
// import java.util.Scanner;

// Main Class
public class JavaLec17{

    // // Fee Caluclator Method
    // void FeeCalculator(){
    //     // Variable Declaration
    //     int Week, Fee, TestCase;

    //     // Input
    //     Scanner Scn = new Scanner(System.in);
    //     System.out.print("Test Case count: ");
    //     TestCase = Scn.nextInt();

    //     // Fee Calculation
    //     while (TestCase-- != 0){
    //         System.out.print("\nEnter number of weeks: ");
    //         Week = Scn.nextInt();
    //         System.err.print("\nEnter fee: ");
    //         Fee = Scn.nextInt();
    //         System.out.print("\nAmount is: ");
    //         System.out.println(Week*Fee);
    //     }
    //     // System.out.println("\nThank You!");

    //     Scn.close();

    // }
    
    // Variable 
    String Info = "Hello, there!";
    

    public void main(String[] args) {
        JavaLec17_1 Obj = new JavaLec17_1();
        Obj.Print();
    }

}

// Subclass
class JavaLec17_1 extends JavaLec17{

    // Variable 
    String Info = "Obi Wan Kenobi";
    // Method
    void Print(){
        System.out.println(super.Info);
        System.out.println(Info);
    }

}
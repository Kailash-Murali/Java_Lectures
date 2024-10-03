// Exception class

// Main Class
public class JavaLec22{
    
    // Main Method
    public static void main(String[] args){
        
        // Exception Block
        try{
            int[] Error = new int[5];
            Error[5] = 30/0;
        }
        // Multiple Catch
        catch(ArithmeticException E){
            System.out.println(E);
        }
        catch(ArrayIndexOutOfBoundsException E1){
            System.out.println(E1);
        }
        catch(Exception E2){
            System.out.println(E2);
        }

        // Custom Exception 
        // catch(ArithmeticException E){
            // System.out.println("Handled the Exception!");
            // System.out.println(E);
        // }

        return;
        
    }

}
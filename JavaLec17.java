// Polymorphism

// Main class
public class JavaLec17 {

    // Main function
    public static void main(String[] args) {
          
        // Polymorphism
        System.out.println("Polymorphism: Run Time"); 
        
        // Obj Instantiation
        Parent Obj;
        Obj = new Child1();
        Obj.Print();
        Obj = new Child2();
        Obj.Print();

    }

}

// Parent & Child Class
class Parent{
   void Print(){
        System.out.println("Parent Class");
   }
}

class Child1 extends Parent{
    void Print(){
        System.out.println("Child Class1");
    }
}

class Child2 extends Parent{
    void Print(){
        System.out.println("Child Class2");
    }
}
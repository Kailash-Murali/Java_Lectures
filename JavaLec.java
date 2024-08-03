//import java.util.StringTokenizer
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays

// public class JavaLec {

    // static void ThirdLargestNo(){

    //     //Var decl & input
    //     int size, i;
    //     Scanner Scn = new Scanner(System.in);

    //     System.out.println("Welcome User!\nEnter the size of array: ");
    //     size = Scn.nextInt();
    //     System.out.println("Enter the elements of the array: ");
    //     int array[] = new int[size]; 
    //     for (i = 0; i < size; i++)
    //         array[i] = Scn.nextInt();

    //     //Sorting & output
    //     Arrays.sort(array);
    //     System.out.printf("The third largest element is: %d", array[size-3]);        
    // } 

    // static int GCD(int No1, int No2){
        
    //     if(No2 == 0)
    //         return No1;
    //     else
    //         return GCD(No2, No1 % No2);
        
    // }

    // static void LCM(){

    //     //Var Decl
    //     int No1, No2, Gcd, Lcm;
    //     Scanner Scn = new Scanner(System.in);

    //     //Input
    //     System.out.println("Welcome User! Enter nos, successively: ");
    //     No1 = Scn.nextInt();
    //     No2 = Scn.nextInt();

    //     //Condition and Output
    //     Gcd = GCD(No1, No2);
    //     Lcm = (No1 * No2)/Gcd;
    //     System.out.printf("The LCM is %d", Lcm);                

    // }

    // static void PatternPrinting(){
        
    //     //Var Decl
    //     int LenSq, i;
    //     Scanner Scn = new Scanner(System.in);

    //     //Input
    //     System.out.println("Welcome User!\nEnter length of Square: ");
    //     LenSq = Scn.nextInt();

    //     //Pattern printing
    //     for(i = 0; i < (LenSq+2)/3; i++){
    //         if (i == 0 || i == ((LenSq+2)/3)-1)
    //             System.out.println("*".repeat(LenSq));
    //         else{
    //             System.out.printf("*");
    //             System.out.printf(" ".repeat(LenSq-2));
    //             System.out.printf("*\n");
    //         }
    //     }

    // }

    // static void ArmstrongNo(){

    //     //Scanner Obj & Var decl
    //     Scanner Scn = new Scanner(System.in);
    //     int No1, No2, ArmSum = 0, i, j, LenNo;
    //     ArrayList<Integer> ArmList = new ArrayList<Integer>();
    //     String ArmString;

    //     //Input
    //     System.out.println("Enter the nos, successively: ");
    //     No1 = Scn.nextInt();
    //     No2 = Scn.nextInt();

    //     //Checking for Armstrong nos
    //     for (i = No1; i <= No2; i++){
    //         ArmString = String.valueOf(i); 
    //         LenNo = ArmString.length();
    //         for (j = 0; j < LenNo; j++)
    //             ArmSum += Math.pow(Character.getNumericValue(ArmString.charAt(j)), LenNo);
    //         if (ArmSum == i)
    //             ArmList.add(i); 
    //         ArmSum = 0;           
    //     }

    //     //Printing the nos
    //     if (ArmList.size() != 0){
    //         System.out.println("The Armstrong nos are: ");
    //         for (i = 0; i < ArmList.size(); i++)
    //             System.out.println(ArmList.get(i));
    //     }
    //     else
    //         System.out.println("There exists no Armstrong in the given range!");
            
    // }

    // static void Strings(){
    //     String FName = "skks";
    //     int LName = 20;
    //     int sum = FName + LName //Error!
    //     System.out.println(FName+LName);
    //     String msg = "And then Ronaldo went \"Siuu!!\. What a bloke.";
    //     System.out.println(msg);
    // }   

    // static void Calculator() {

    //     int Choice = 1;

    //     System.out.println("\nBasic Calculator.\n\nWelcome User!! Given calculator performs basic arithmetic operations for two operands.");
    //     System.out.println("Choose operation by giving the serial no. assigned, \n 1. Add\n 2. Sub\n 3. Mul\n 4. Div\n 5. Power");

    //     while (Choice == 1) {

    //         float Op1, Op2;
    //         int Op;
    //         Scanner Scn = new Scanner(System.in);

    //         try {

    //             System.out.println("\nEnter operation no: ");
    //             Op = Scn.nextInt();

    //             System.out.println("\nEnter operands, successively: ");
    //             Op1 = Scn.nextFloat();
    //             Op2 = Scn.nextFloat();

    //             if (Op == 1)
    //                 System.out.printf("\nThe output is: %f\n", Op1 + Op2);
    //             else if (Op == 2)
    //                 System.out.printf("\nThe output is: %f\n", Op1 - Op2);
    //             else if (Op == 3)
    //                 System.out.printf("\nThe output is: %f\n", Op1 * Op2);
    //             else if (Op == 4) {
    //                 if (Op2 != 0)
    //                     System.out.printf("\nThe output is: %f\n", Op1 / Op2);
    //                 else {
    //                     System.out.println("\nDivision by zero not possible! Try again with valid inputs!");
    //                     continue;
    //                 }
    //             } else if (Op == 5)
    //                 System.out.printf("\nThe output is: %f\n", Math.pow(Op1, Op2));
    //             else {
    //                 System.out.println("\nInvalid input! Try again with valid inputs! ");
    //                 continue;
    //             }

    //         } 
    //         catch (Exception e) {

    //             System.out.println("\nError encountered! Try again!");
    //             System.out.println(e);
    //             continue;

    //         }

    //         System.out.println("\nDo you wish to continue? [1/else]: ");
    //         Choice = Scn.nextInt();

    //         if (Choice == 1)
    //             continue;
    //         else {
    //             System.out.println("\nThank You!");
    //             Scn.close();
    //             break;
    //         }

    //     }
    // } 
    // static void Math(){
	// 	int x = 10;
	// 	int y = 20;
	// 	System.out.println(Math.random());
	// }

    // public static void main(String[] args) {

	// Foundational syntaxes and semantics

        // System.out.println("Hello World!");
        // int x = 10;
        // int y = 1;
        // System.out.println(x > y);
        // int x = 10;
        // int y = 1;
        // if (x>y) System.out.printf("%d > %d" , x, y);
        // else System.out.printf("%d > %d",  y, x);
        // int x =10;
        // int y = 10;
        // if  (x>y) System.out.printf("%d > %d" , x, y);
        // else if (y>x) System.out.print(" %d >%d" , y, x);
        // else System.out.print("%d = %d , x, y");
        // String y = "yes";
        // String n ="no";
        // String val = y;
        // switch (val){
        //     case "yes";
        //         System.out.println("Success!");
        //         break;
        //     case "no";
        //         System.out.println("Failure!");
        //         break;
        //     default;
        //         System.out.println("Invalid");
        //     }
        //     int i = 65;
        //     do {
        //         System.out.print((char)i);
        //         i++;
        //     }
        //     while (i>70);

	//     String
        //     String[] Commentary = {"GOALLLLLLL", "BAFFANA BAFFANA ! ! ! ",  "GOAL FOR SOUTH AFRICA ", "GOAL FOR ALL AFRICA ! ! !"};
        //     for (String i : Commentary)
        //         System.out.print(i);
        //     String[] arr = {"HELLO", "continue","there!", "break", "I will not get executed!"};
        //     for (String i : arr){ 
        //         if (i == "continue") continue;
        //         else if (i == "break");
        //         System.out.print(i);
        //         System.out.print("");
        //     }
        //     Scanner Scn = new Scanner(System.in);
        //     String Name; int Age;

        //     System.out.println("Enter name: ");
        //     Name = Scn.nextLine();
        //     System.out.println("Enter age: ");
        //     Age = Scn.nextInt();

        //     System.out.printf("Hello, I'm %s, aged %d!", Name, Age);

	// String Buffer & Builder

	// StringBuffer str = new StringBuffer("Hello, ");

        // str.append("there!");
        // System.out.println(str);
        
        // str.insert(2, "llooo");
        // System.out.println(str);
        
        // str.replace(0, 6, "Welcome!");
        // System.out.println(str);
        
        // str.delete(2, 10);
        // System.out.println(str);
        
        // str.reverse();
        // System.out.println(str);
        
        // str = new StringBuilder();
        // str.ensureCapacity(10);
        // System.out.println(str.capacity());
        
        // str.append("Hellololol there!");
        // str.ensureCapacity(50);
        // System.out.println(str.capacity());
        
        // StringBuilder str = new StringBuilder("Hello, ");

        // str.append("there!");
        // System.out.println(str);
        
        // str.insert(2, "llooo");
        // System.out.println(str);
        
        // str.replace(0, 6, "Welcome!");
        // System.out.println(str);
        
        // str.delete(2, 10);
        // System.out.println(str);
        
        // str.reverse();
        // System.out.println(str);
        
        // str = new StringBuilder();
        // str.ensureCapacity(10);
        // System.out.println(str.capacity());
        
        // str.append("Hellololol there!");
        // str.ensureCapacity(50);
        // System.out.println(str.capacity());
	
	 // StringTokenizer str = new StringTokenizer("Cristiano Ronaldoo said SIUUUUUUUUUU!!", " ");
        // while (str.hasMoreTokens())
        //     System.out.println(str.nextToken());

        // StringTokenizer str = new StringTokenizer("IT'S TSABAHALAAAA GOALLL BAFANAA BAFANNA! GOAL FOR SOUTH AFRICA GOAL FOR ALL AFRICA!!! JAMBULILA REJOICEE! BAFANa BAFANA HAVE POPPED THE FIRST CORK OF THEIR DAYS OF DAYS", " ");
        // System.out.printf("Total number of Tokens: %d\n", str.countTokens());
        // while (str.hasMoreElements())
        //     System.out.println(str.nextToken());
        
        // Array

        // int[] Arr = new int[10];
        // Scanner Scn = new Scanner(System.in);
        
        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < Arr.length; i++)
        //     Arr[i] = Scn.nextInt();
        // System.out.println("The elements are stored!"); 
        // System.out.println("The elements in reverse: ");
        // for (int i = Arr.length - 1
        // ; i > -1; i--)
        //     System.out.println(Arr[i]);
        
        // Scn.close();
        
        // Car[] objCarArray;
        // objCarArray = new int[2];

        // objCarArray("Creta", 1970);
        // objCarArray("Mustang", 88);

        // System.out.printf("Car Name: %s\nCar Model: %d\n", objCarArray[0].CarName, objCarArray[0].CarModel);
        // System.out.printf("Car Name: %s\nCar Model: %d\n", objCarArray[1].CarName, objCarArray[1].CarModel);

	// Function call for qs

	//ThirdLargestNo();
	//LCM();
        //PatternPrinting();
        //ArmstrongNo();
        // Math();
        // Calculator();

    }
}

// public class Car{
//     String CarName;
//     int CarModel;
//     Car(String CarName, int CarModel){
//         this.CarName = CarName;
//         this.CarModel = CarModel;
//     }
// }

import java.util.*;
public class CreateArray {
    public static void main(String[] args) {
        
        int marks [] = new int [5];
        Scanner scan = new Scanner (System.in); 
        
            System.out.println("Enter marks :");
            marks[0] = scan.nextInt();  // phy
            marks[1] = scan.nextInt();  // chem
            marks[2] = scan.nextInt();  // maths
        
        
        System.out.println("phy:"+ marks);
        System.out.println("chem:"+ marks);
        System.out.println("math:"+ marks);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage:"+ percentage +"%");

        // calculate length of array ......
        System.out.println("lenth of array ="+ marks.length);

    }
}


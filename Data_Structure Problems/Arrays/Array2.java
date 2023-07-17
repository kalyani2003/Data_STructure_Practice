import java.util.*;
public class Array2 {

    public static void updateArray(int marks[]){
        for (int i = 0; i < marks.length; i ++){
            marks[i] = marks[i] + 5;
        }
    }
    public static void main(String[] args) {
        int marks[] = {45,35,25};
        updateArray(marks);

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i]+"  ");
        }
        System.out.println();
    }
}

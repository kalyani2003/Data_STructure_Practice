import java.util.*;
public class Array3{
    public static int linearSearch(int menu[], int key){
    for(int i =0; i < menu.length; i++){
        if( menu[i] == key){
            return i;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
    int menu[] = { 1,2,3,4,5,6,7,8 };
    int key = 5;
    
    int index = linearSearch(menu,key);
    if (index == -1){
        System.out.println(" not found");
    }
    else{
    System.out.print(" key is at index :"+ index);
        }
    }
}
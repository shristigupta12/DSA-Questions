package LinearSearch9;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = inp.nextLine();
        System.out.println(str);
        System.out.print("Enter the character you want to search in the string : ");
        char target = inp.next().charAt(0);
        if (SearchString(str,target)){
            System.out.println("Character present in the string");
        }
        else{
            System.out.println("Character is not present in the string");
        }
    }

    static boolean SearchString(String s, char target){
        if (s.length()==0){
            return false;
        }
        for (char c : s.toCharArray()){
            if (c==target){
                return true;
            }
        }
        return false;
    }

}

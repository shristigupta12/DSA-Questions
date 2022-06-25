package assignments.ArrayArraylist3;
import java.util.Scanner;
import java.util.Arrays;

public class Q11MatchingRule {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //      11. Count items matching a rule     ------------------- error coming up
        System.out.print("Enter the number of items : ");
        int size = inp.nextInt();
        String[][] items = new String[size][3];
        for (int i=0; i<size; i++){
            System.out.println("Enter the type of item "+(i+1));
            items[i][0] = inp.nextLine();
            System.out.println("Enter the color of item "+(i+1));
            items[i][1] = inp.nextLine();
            System.out.println("Enter the name of item "+(i+1));
            items[i][2] = inp.nextLine();
        }
        System.out.println(Arrays.toString(items));
        System.out.print("Enter the rule key : ");
        String rulekey = inp.nextLine();
        System.out.print("Enter the rule value : ");
        String ruleValue = inp.nextLine();
        int j=0;
        switch (rulekey){
            case "type" -> j=0;
            case "color" -> j=1;
            case "name" -> j=2;
            default -> System.out.println("Enter a valid rule key");
        }
        int count = 0;
        for (int i=0; i<size; i++){
            if (items[i][j]==ruleValue){
                count++;
            }
        }
        System.out.println("The number of items matching the rule are "+count);
    }
}

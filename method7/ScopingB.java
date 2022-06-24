package method7;

import java.util.Arrays;
public class ScopingB {
    public static void main(String[] args) {
        /* 1. primitive data types like int and stuff donot get changed in the main block when the value is changed
        in the function or different block */
        /* 2. But non primitive like arrays do change their original values when changed in functions or different
         blocks */

//        VarArgs (Short for variable arguments)
        array(1, 2, 3, 4);

    }
    // different way to give argument in functions
    static void array(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

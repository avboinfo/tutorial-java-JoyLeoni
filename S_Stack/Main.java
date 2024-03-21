
package S_Stack;
import java.util.*;

public class Main {

    public static void main( String[] args ) {
        Stack<String> s = new Stack<>();
        Scanner sc = new Scanner("PrimoFile.txt");

        try{
            
        sc.close();
    }catch(Exception e){
        System.out.println("Errore");
    }
        s.push("Juve");
        s.push("Inter");
        System.out.println(s.pop());
        System.out.println(s);
    }

}

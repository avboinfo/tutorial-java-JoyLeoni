
package S_Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main( String[] args ) {
        Stack<String> s = new Stack<>();
        Scanner sc = new Scanner("PrimoFile.txt");

        try{
            
        for(int i = 0; i < sc.hasNextLine(); i++){

        }
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

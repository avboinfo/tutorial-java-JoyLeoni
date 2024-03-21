import java.util.*;
import java.io.*;

public class RaccoltaVideogames {
    ArrayList<Videogames> lista;
    public RaccoltaVideogames(String file){
        lista = new ArrayList <Videogames>();
        File f = new File(file);
        try{
                Scanner fileInput = new Scanner(f);            
                while(fileInput.hasNextLine()){
                String line = fileInput.nextLine();
                String[] field = line.split(";");
                lista.add(new Videogames(field[0], field[1], Float.parseFloat(field[2]), Integer.parseInt(field[3])));
            }
            fileInput.close();
        }catch(Exception e){
            System.out.println("Errore");
        }
    }

    public String toString (){
        String s = "Contenuto della pila:\n";
        for (int i=0; i<lista.size(); i++) {
            s += lista.get(i) + "\n";
        }
        return s;
    }


}

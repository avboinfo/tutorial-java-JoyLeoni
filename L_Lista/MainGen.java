package L_Lista;

public class MainGen{

    public static void main(String[] args) {
    ListaGen<String> ls = new ListaGen<>();
    
    ls.addTail("Bologna");
    ls.addTail("Bochum");
    ls.addTail("Bayern Monaco");
    ls.addTail("Carpi");


    System.out.println(ls);

    }
}
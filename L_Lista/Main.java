package L_Lista;

public class Main {
    
    public static void main (String[] args) {
        System.out.println("Partiti!");
        
        Lista l = new Lista();
        System.out.println( l );

/* 
        for (int i=0; i<10; i++) {
            l.addTail( new Nodo( i, null ));
        }
*/
    l.addSorted(new Nodo(300,null));
    l.addSorted(new Nodo(200,null));
    l.addSorted(new Nodo(160,null));
    l.addSorted(new Nodo(450,null));
    l.addSorted(new Nodo(250,null));
    
    l.addAfter(new Nodo(337,null), 2);
    
   

        System.out.println( l );

/* Lista.Iteratore iter = l.getIterator();     //ci danno un iteratore

        while(iter.hasNext()){
        System.out.println(iter.next());        //loop iteratore
        }*/
        

    } 

}
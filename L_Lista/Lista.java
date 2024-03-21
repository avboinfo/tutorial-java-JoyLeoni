package L_Lista;

public class Lista {

    class Iteratore{
        private Nodo nodo;

        private Iteratore(Nodo nodo){
            this.nodo = nodo;
        }

        public boolean hasNext(){
            return nodo != null;    //ha un successivo == true
        }                           //non ha un successivo == false

        public Nodo next(){
            if(nodo == null) return null;
            //Nodo result = new Nodo(nodo.getValore(), nodo.getSuccessivo());
            Nodo result = nodo;
            nodo = nodo.getSuccessivo();
            return result;
        }
    }

    public Iteratore getIterator(){
        Iteratore i = new Iteratore(radice);
        return i;
    }

    Nodo radice;
    
    public Lista() {
        radice = null;
    }

    public boolean isEmpty() {
        return radice==null;
    }

    public void addTail( Nodo n ) {
        if (isEmpty()) {
            radice = n;
        } else {
            Nodo p = radice;
            while (p.getSuccessivo()!=null) p = p.getSuccessivo();
            p.setSuccessivo( n );
        }
    }

    public void addHead(Nodo n){
        if(isEmpty()){
            radice = n;
        }else{
            n.setSuccessivo(radice);
            radice = n;
        }
    }

    public void addSorted(Nodo n){
        if(isEmpty()){
            radice = n;
            n.setSuccessivo(null);
            return;
        }
        int vn = n.getValore();
        if(vn < radice.getValore()){
            n.setSuccessivo(radice);
            radice = n;
            return;
        }
        Nodo p1 = radice;
        Nodo p2 = radice.getSuccessivo();

        while((vn > p1.getValore()) && (p2 != null) && (vn > p2.getValore())){
            p1 = p2;
            p2 = p1.getSuccessivo();
        }
        n.setSuccessivo(p2);
        p1.setSuccessivo(n);
        
        
    }

    public boolean addAfter(Nodo n, int pos){       //aggiungi n dopo un x(pos) valore
    /* if (isEmpty()) {
            return false;
        }

        Nodo p = radice;
        
        for(int i = 0; i <= pos && p != null; i++){
            if(i == pos-1){
                n.setSuccessivo(p.getSuccessivo());     //senza usare l'iteratore
                p.setSuccessivo(n);
                return true;
            }else{
                p = p.getSuccessivo();
            }
        }
        return false;
    */
    //Lista.Iteratore iter = l.getIterator();    
    Iteratore iter = getIterator(); 
        //aggiunge il nodo n solo dopo il primo nodo
        int i; Nodo npos = null;
        for( i = 0; i < pos; i++){
            if(iter.hasNext()){
                npos = iter.next();
            }else{
                return false; //se non esiste il successivo 
            }
        } 
        n.setSuccessivo(npos.getSuccessivo());
        npos.setSuccessivo(n);
        return true;
    }
/* 
    public boolean removePos(int pos){      //rimuovi valore in una posizione precisa

    }


    public boolean removeValue(int value){        //rimuovi valore preciso
        


    }
*/

    public String toString() {
        String s = "Elementi della lista: ";
        Nodo p = radice;
        while (p!=null) {
            s += p + " ";
            p = p.getSuccessivo();
        }
        s += "End!\n";
        return s;
    }
}
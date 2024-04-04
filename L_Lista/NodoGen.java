package L_Lista;

public class NodoGen<T> {
    private T valore;
    private NodoGen<T> successivo;
        
    public NodoGen(T valore){
        this.valore = valore;
        successivo = null;
    }

    public void setValore(T nuovoValore){
        this.valore = nuovoValore;
    }

    public void setSuccessivo(NodoGen<T> nuovoSuccessivo){
        this.successivo = nuovoSuccessivo;
    }

    public T getValore(){
        return valore;
    }

    public NodoGen<T> getSuccessivo(){
        return successivo;
    }
    
    public String toString(){
       return "Il mio valore è: " + valore ;
    }
}

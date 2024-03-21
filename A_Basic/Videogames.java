/*
 * 
 * 
 * 
 */
public class Videogames {
   String nome, marca;
   int anno;
   float costo;
   
   public Videogames(String nome, String marca, float costo, int anno){

    this.nome = nome;
    this.marca = marca;
    this.costo = costo;
    this.anno = anno;
   } 

    public String toString (){
        return "Nome " + nome +" ,Marca " + marca + " ,Costo " + costo + ",Anno di uscita " + anno;
    }


}

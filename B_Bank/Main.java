package B_Bank;
public class Main {
    public static void main(String[] args) {
        ContoBancario contoDiGiulietta = new ContoBancario("Giulietta", 2000);
        contoDiGiulietta.versamento(2000);
        contoDiGiulietta.log("Versamento", 2000);
        
        contoDiGiulietta.prelievo(500);
        contoDiGiulietta.log("Prelievo", 500);
        
        contoDiGiulietta.prelievo(400);
        contoDiGiulietta.log("Prelievo", 400);
        
        System.out.println("Saldo rimanente sul conto di Giulietta: " + contoDiGiulietta.getSaldo());
        
        ContoBancario contoDiRomeo = new ContoBancario("Romeo", 0);
        
        contoDiGiulietta.prelievo(200);
        contoDiGiulietta.log("Bonifico a Romeo", 200);
        
        double interesse = contoDiRomeo.getSaldo() * 0.1;
        contoDiRomeo.versamento(interesse);
        contoDiRomeo.log("Applicato interesse", interesse);
        
        System.out.println("Saldo sul conto di Romeo: " + contoDiRomeo.getSaldo());
    }
}
package B_Bank;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class ContoBancario {
    private String nomeTitolare;
    private double saldo;

    public ContoBancario(String nomeTitolare, double saldoIniziale){
        this.nomeTitolare = nomeTitolare;
        this.saldo = saldoIniziale;
    }

    public void versamento(double importo){
        saldo += importo;
    }

    public void prelievo(double importo){
        saldo -= importo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void log(String operazione, double importo) {
        try {
            FileWriter file = new FileWriter("log.txt", true);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(operazione + ": " + importo + " - Saldo rimanente: " + saldo);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
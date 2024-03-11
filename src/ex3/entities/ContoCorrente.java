package ex3.entities;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) {
         if (nMovimenti < maxMovimenti) saldo -= x;
         else saldo -= x - 0.50;
         nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }
}

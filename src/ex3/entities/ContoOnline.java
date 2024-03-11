package ex3.entities;

import ex3.exceptions.BancaException;

public class ContoOnline extends ContoCorrente {
    private final double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + "; Saldo: " + saldo + "; Num movimenti: " + nMovimenti + "; Massimo movimenti: " + maxMovimenti + "; Massimo prelievo disponibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if(x <= maxPrelievo) super.preleva(x);
        else throw new BancaException("Il prelievo non è disponibile.");
    }
}

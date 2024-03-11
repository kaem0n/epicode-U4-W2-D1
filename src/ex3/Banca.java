package ex3;

import ex3.entities.ContoCorrente;
import ex3.entities.ContoOnline;
import ex3.exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banca {
    private static final Logger logger = LoggerFactory.getLogger(Banca.class);
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(1750);
            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException ex) {
            logger.error("Errore durante il prelievo: " + ex);
            ex.printStackTrace();
        }

        ContoOnline conto2 = new ContoOnline("Rossi Luigi", 50350, 1500);

        conto2.stampaSaldo();

        try {
            conto2.preleva(2000);
            conto2.stampaSaldo();
        } catch (BancaException ex) {
            logger.error("Errore durante il prelievo: " + ex);
            ex.printStackTrace();
        }
    }
}
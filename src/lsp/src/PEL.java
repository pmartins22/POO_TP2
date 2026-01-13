package lsp.src;

import java.time.LocalDate;

public class PEL extends CompteBancaire {
    private final double tauxInteret = 0.03;
    private final LocalDate dateEcheance;

    public PEL() {
        this.dateEcheance = LocalDate.now().plusDays(30);
    }

    @Override
    protected boolean canWithdraw(double montant) {
        return LocalDate.now().isAfter(dateEcheance) && montant <= solde;
    }

    @Override
    public void retirer(double montant) {
        if (!LocalDate.now().isAfter(dateEcheance)) {
            System.out.println("Impossible de retirer d'un PEL avant la date d'échéance ("
                    + dateEcheance + ").");
        } else if (montant > solde) {
            System.out.println("Fonds insuffisants pour le retrait de " + montant);
        } else {
            solde -= montant;
            System.out.println("Retrait effectué. Nouveau solde : " + solde);
        }
    }
}
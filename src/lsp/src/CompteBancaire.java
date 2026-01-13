package lsp.src;

public class CompteBancaire {

    protected double solde = 100;

    public void retirer(double montant) {
        if (canWithdraw(montant)) {
            solde -= montant;
            System.out.println("Retrait effectué. Nouveau solde : " + solde);
        } else {
            System.out.println("Fonds insuffisants pour le retrait de " + montant);
        }
    }

    protected boolean canWithdraw(double montant) {
        return montant <= solde;
    }
}

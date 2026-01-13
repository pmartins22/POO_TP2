package srp.src;

public class FacturationService {
    private TaxCalculator calculator;
    private DocumentPrinter printer;
    private DocumentRepository repository;

    public FacturationService() {
        this.calculator = new TaxCalculator(0.2);
        this.printer = new DocumentPrinter();
        this.repository = new DocumentRepository();
    }

    public void creerFacture(double montantHT, String clientName) {
        double tva = calculator.calculateTVA(montantHT);
        double total = calculator.calculateTotal(montantHT);

        Facture facture = new Facture(clientName, montantHT, tva, total);

        printer.printFacture(facture);
        repository.saveFacture(facture);
    }

    public void creerDevis(double montantHT) {
        double tva = calculator.calculateTVA(montantHT);
        double total = calculator.calculateTotal(montantHT);

        Devis devis = new Devis(montantHT, tva, total);

        printer.printDevis(devis);
        repository.saveDevis(devis);
    }
}
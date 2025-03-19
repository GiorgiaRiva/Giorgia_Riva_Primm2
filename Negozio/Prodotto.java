class Prodotto {
    private String nome;
    private double prezzo;
    private int quantita;

    public Prodotto(String nome, double prezzo, int quantita) {
        this.nome = nome;
        this.prezzo = prezzo >= 0 ? prezzo : 0;
        this.quantita = quantita >= 0 ? quantita : 0;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo >= 0) {
            this.prezzo = prezzo;
        }
    }

    public void acquista(int pezzi) {
        if (pezzi > 0 && pezzi <= quantita) {
            quantita -= pezzi;
        } 
        else {
            System.out.println("quantità insufficiente");
        }
    }

    public void rifornisci(int pezzi) {
        if (pezzi > 0) {
            quantita += pezzi;
        }
    }


    public void mostraDettagli() {
        System.out.println("Prodotto: " + nome + ", Prezzo: " + prezzo + "€, Quantità: " + quantita);
    }
}

public class Auto {
    private int marca;
    private int modello;
    private int anno;
    public int colore;

    public Auto(int marca, int modello, int anno, int colore) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.colore = colore;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

 public int getModello() {
        return modello;
    }


    public void setModello(int modello) {
        this.modello = modello;
    }

 public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
    public void cambiaColore(int colore1) {
            this.colore = colore1;
    }

    public void mostraInfo() {
        System.out.println("marca: " + marca + ", modello: " + modello + ", anno: " + anno + "colore:" + colore);
    }



}
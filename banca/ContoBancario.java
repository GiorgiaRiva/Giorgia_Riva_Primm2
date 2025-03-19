class ContoBancario {
    private String numeroConto;
    private double saldo;
    public String titolare;
    public ContoBancario(String numeroConto, String titolare, double saldo) {
        this.numeroConto = numeroConto;
        this.titolare = titolare;
        this.saldo = saldo >= 0 ? saldo : 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
        }
    }

    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
        } else {
            System.out.println("errore!");
        }
    }
}

public class Bicicleta extends Veiculo {
    private boolean eEletrica;
    private boolean temBagageiro;

    public Bicicleta(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas,
                     int qtdRodas, boolean eDeCarga, double capacidadeCarga,
                     Combustivel combustivel, boolean eEletrica, boolean temBagageiro) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, eDeCarga, capacidadeCarga, combustivel);
        this.eEletrica = eEletrica;
        this.temBagageiro = temBagageiro;
    }

    public Bicicleta() {}

    public String info() {
        String information = "\nBicicleta "
                + this.constructInfo()
                + ",\n\teh eletrica: " + verificador(iseEletrica())
                + ",\n\ttem bagageiro: " + verificador(isTemBagageiro())
                + "\n}";
        return information;
    }

    public String som() {
        return "\nSom da bicicleta: Nhec nhec nhec";
    }

    public boolean iseEletrica() {
        return eEletrica;
    }

    public void seteEletrica(boolean eEletrica) {
        this.eEletrica = eEletrica;
    }

    public boolean isTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }
}

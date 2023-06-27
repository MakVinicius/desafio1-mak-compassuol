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

    public String info() {
        String information = "\nBicicleta { \n\tmotor: " + isMotor() + ",\n\tvolante: " + isVolante()
                + ",\n\tquantidade passageiros: " + getQtdPassageiros() + ",\n\tquantidade portas: "
                + getQtdPortas() + ",\n\tquantidade rodas: " + getQtdRodas() + ",\n\teh de carga: " +
                iseDeCarga() + ",\n\tcapacidade carga: " + getCapacidadeCarga() + ",\n\tcombustivel: "
                + getCombustivel().info() + ",\n\teh eletrica: " + iseEletrica()
                + ",\n\ttem bagageiro: " + isTemBagageiro() + "\n}";
        return information;
    }

    public String som() {
        return "\nNhec nhec nhec";
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
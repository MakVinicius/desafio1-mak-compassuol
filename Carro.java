public class Carro extends Veiculo {
    private boolean temArCondicionado;
    private boolean temRadio;

    public Carro(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas,
                 int qtdRodas, boolean eDeCarga, double capacidadeCarga, Combustivel combustivel,
                 boolean temArCondicionado, boolean temRadio) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, eDeCarga, capacidadeCarga, combustivel);
        this.temArCondicionado = temArCondicionado;
        this.temRadio = temRadio;
    }

    public Carro() {}

    public String info() {
        String information = "\nCarro { \n\tmotor: " + isMotor() + ",\n\tvolante: " + isVolante()
                + ",\n\tquantidade passageiros: " + getQtdPassageiros() + ",\n\tquantidade portas: "
                + getQtdPortas() + ",\n\tquantidade rodas: " + getQtdRodas() + ",\n\teh de carga: " +
                iseDeCarga() + ",\n\tcapacidade carga: " + getCapacidadeCarga() + ",\n\tcombustivel: "
                + getCombustivel().info() + ",\n\ttem ar condicionado: " + isTemArCondicionado()
                + ",\n\ttem radio: " + isTemRadio() + "\n}";
        return information;
    }

    public String som() {
        return "\nSom do carro: Ggrrooo ggrrooo ggrrooo";
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    public boolean isTemRadio() {
        return temRadio;
    }

    public void setTemRadio(boolean temRadio) {
        this.temRadio = temRadio;
    }
}

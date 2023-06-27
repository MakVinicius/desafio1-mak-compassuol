public class Veiculo {
    private boolean motor;
    private boolean volante;
    private int qtdPassageiros;
    private int qtdPortas;
    private int qtdRodas;
    private boolean eDeCarga;
    private double capacidadeCarga;
    private Combustivel combustivel;

    public Veiculo(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean eDeCarga, double capacidadeCarga, Combustivel combustivel) {
        this.motor = motor;
        this.volante = volante;
        this.qtdPassageiros = qtdPassageiros;
        this.qtdPortas = qtdPortas;
        this.qtdRodas = qtdRodas;
        this.eDeCarga = eDeCarga;
        this.capacidadeCarga = capacidadeCarga;
        this.combustivel = combustivel;
    }

    public String info() {
        String information = "\nVeiculo { \n\tmotor: " + isMotor() + ",\n\tvolante: " + isVolante()
                + ",\n\tquantidade passageiros: " + getQtdPassageiros() + ",\n\tquantidade portas: "
                + getQtdPortas() + ",\n\tquantidade rodas: " + getQtdRodas() + ",\n\teh de carga: " +
                iseDeCarga() + ",\n\tcapacidade carga: " + getCapacidadeCarga() + ",\n\tcombustivel: "
                + getCombustivel().info() + "\n}";
        return information;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isVolante() {
        return volante;
    }

    public void setVolante(boolean volante) {
        this.volante = volante;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public boolean iseDeCarga() {
        return eDeCarga;
    }

    public void seteDeCarga(boolean eDeCarga) {
        this.eDeCarga = eDeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
}
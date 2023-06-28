import java.util.Objects;

public class Veiculo {
    private boolean motor;
    private boolean volante;
    private int qtdPassageiros;
    private int qtdPortas;
    private int qtdRodas;
    private boolean eDeCarga;
    private double capacidadeCarga;
    private Combustivel combustivel = new Combustivel();

    public Veiculo(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas,
                   boolean eDeCarga, double capacidadeCarga, Combustivel combustivel) {
        this.motor = motor;
        this.volante = volante;
        this.qtdPassageiros = qtdPassageiros;
        this.qtdPortas = qtdPortas;
        this.qtdRodas = qtdRodas;
        this.eDeCarga = eDeCarga;
        this.capacidadeCarga = capacidadeCarga;
        this.combustivel = combustivel;
    }

    public Veiculo() {}

    public String info() {
        String information = "\nVeiculo "
                + this.constructInfo()
                + "\n}";
        return information;
    }

    public String constructInfo() {
        String formatado = "{"
                + "\n\tmotor: " + verificador(isMotor())
                + ",\n\tvolante: " + verificador(isVolante())
                + ",\n\tquantidade passageiros: " + verificador(getQtdPassageiros())
                + ",\n\tquantidade portas: " + verificador(getQtdPortas())
                + ",\n\tquantidade rodas: " + verificador(getQtdRodas())
                + ",\n\teh de carga: " + verificador(iseDeCarga())
                + ",\n\tcapacidade carga: " + verificador(getCapacidadeCarga())
                + ",\n\tcombustivel: " + getCombustivel().info();
        return formatado;
    }

    public String verificador(boolean variavel) {
        // a primeira parte do algoritmo verifica se a variavel é nula ou não
        // a função String.valueOf() transforma a variavel em string, pois o método precisa retornar uma string
        return (!Objects.isNull(variavel) ? String.valueOf(variavel) : "");
    }

    public String verificador(int variavel) {
        return (!Objects.isNull(variavel) ? String.valueOf(variavel) : "");
    }

    public String verificador(double variavel) {
        return (!Objects.isNull(variavel) ? String.valueOf(variavel) : "");
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
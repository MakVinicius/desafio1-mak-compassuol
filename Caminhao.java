public class Caminhao extends Veiculo{
    int qtdEixos;

    public Caminhao(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas,
                    int qtdRodas, boolean eDeCarga, double capacidadeCarga,
                    Combustivel combustivel, int qtdEixos) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, eDeCarga, capacidadeCarga, combustivel);
        this.qtdEixos = qtdEixos;
    }

    public String info() {
        String information = "\nCaminhao { \n\tmotor: " + isMotor() + ",\n\tvolante: " + isVolante()
                + ",\n\tquantidade passageiros: " + getQtdPassageiros() + ",\n\tquantidade portas: "
                + getQtdPortas() + ",\n\tquantidade rodas: " + getQtdRodas() + ",\n\teh de carga: " +
                iseDeCarga() + ",\n\tcapacidade carga: " + getCapacidadeCarga() + ",\n\tcombustivel: "
                + getCombustivel().info() + ",\n\tquantidade eixos: " + getQtdEixos()
                + "\n}";
        return information;
    }

    public String som() {
        return "\nVrom vrom vrom";
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }
}

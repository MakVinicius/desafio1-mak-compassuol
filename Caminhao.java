public class Caminhao extends Veiculo{
    int qtdEixos;

    public Caminhao(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas,
                    int qtdRodas, boolean eDeCarga, double capacidadeCarga,
                    Combustivel combustivel, int qtdEixos) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, eDeCarga, capacidadeCarga, combustivel);
        this.qtdEixos = qtdEixos;
    }

    public Caminhao() {}

    public String info() {
        String information = "\nCaminhao {"
                + "\n\tmotor: " + verificador(isMotor())
                + ",\n\tvolante: " + verificador(isVolante())
                + ",\n\tquantidade passageiros: " + verificador(getQtdPassageiros())
                + ",\n\tquantidade portas: " + verificador(getQtdPortas())
                + ",\n\tquantidade rodas: " + verificador(getQtdRodas())
                + ",\n\teh de carga: " + verificador(iseDeCarga())
                + ",\n\tcapacidade carga: " + verificador(getCapacidadeCarga())
                + ",\n\tcombustivel: " + getCombustivel().info()
                + ",\n\tquantidade eixos: " + verificador(getQtdEixos())
                + "\n}";
        return information;
    }

    public String som() {
        return "\nSom do caminhao: Vrom vrom vrom";
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }
}

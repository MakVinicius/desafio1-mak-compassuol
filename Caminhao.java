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
        String information = "\nCaminhao "
                + this.constructInfo()
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

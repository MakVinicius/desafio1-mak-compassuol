public class Charrete extends Veiculo {
    private int qtdCavalos;

    public Charrete(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas,
                    int qtdRodas, boolean eDeCarga, double capacidadeCarga,
                    Combustivel combustivel, int qtdCavalos) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, eDeCarga, capacidadeCarga, combustivel);
        this.qtdCavalos = qtdCavalos;
    }

    public Charrete() {}

    public String info() {
        String information = "\nCharrete "
                + this.constructInfo()
                + ",\n\tquantidade cavalos: " + verificador(getQtdCavalos())
                + "\n}";
        return information;
    }

    public String som() {
        return "\nSom da charrete: Toc toc toc";
    }

    public int getQtdCavalos() {
        return qtdCavalos;
    }

    public void setQtdCavalos(int qtdCavalos) {
        this.qtdCavalos = qtdCavalos;
    }
}

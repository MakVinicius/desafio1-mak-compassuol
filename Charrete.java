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
        String information = "\nCharrete { \n\tmotor: " + isMotor() + ",\n\tvolante: " + isVolante()
                + ",\n\tquantidade passageiros: " + getQtdPassageiros() + ",\n\tquantidade portas: "
                + getQtdPortas() + ",\n\tquantidade rodas: " + getQtdRodas() + ",\n\teh de carga: " +
                iseDeCarga() + ",\n\tcapacidade carga: " + getCapacidadeCarga() + ",\n\tcombustivel: "
                + getCombustivel().info() + ",\n\tquantidade cavalos: " + getQtdCavalos()
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

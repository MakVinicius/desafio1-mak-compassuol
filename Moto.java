public class Moto extends Veiculo{
    private boolean partidaEletrica;

    public Moto(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas,
                boolean eDeCarga, double capacidadeCarga, Combustivel combustivel,
                boolean partidaEletrica) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, eDeCarga, capacidadeCarga, combustivel);
        this.partidaEletrica = partidaEletrica;
    }

    public String info() {
        String information = "\nMoto { \n\tmotor: " + isMotor() + ",\n\tvolante: " + isVolante()
                + ",\n\tquantidade passageiros: " + getQtdPassageiros() + ",\n\tquantidade portas: "
                + getQtdPortas() + ",\n\tquantidade rodas: " + getQtdRodas() + ",\n\teh de carga: " +
                iseDeCarga() + ",\n\tcapacidade carga: " + getCapacidadeCarga() + ",\n\tcombustivel: "
                + getCombustivel().info() + ",\n\tpartida eletrica: " + isPartidaEletrica()
                + "\n}";
        return information;
    }

    public String som() {
        return "\nVruuuuummmmm";
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
}

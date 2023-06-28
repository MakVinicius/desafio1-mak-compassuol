public class Moto extends Veiculo{
    private boolean partidaEletrica;

    public Moto(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas,
                boolean eDeCarga, double capacidadeCarga, Combustivel combustivel,
                boolean partidaEletrica) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, eDeCarga, capacidadeCarga, combustivel);
        this.partidaEletrica = partidaEletrica;
    }

    public Moto() {}

    public String info() {
        String information = "\nMoto "
                + this.constructInfo()
                + ",\n\tpartida eletrica: " + verificador(isPartidaEletrica())
                + "\n}";
        return information;
    }

    public String som() {
        return "\nSom da moto: Vruuuuummmmm";
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
}

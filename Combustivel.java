public class Combustivel {
    private boolean gasolina;
    private boolean alcool;
    private boolean diesel;
    private boolean eletricidade;
    private boolean humano;
    private boolean animal;
    private double quantidade;

    public Combustivel(boolean gasolina, boolean alcool, boolean diesel, boolean eletricidade,
                       boolean humano, boolean animal, double quantidade) {
        this.gasolina = gasolina;
        this.alcool = alcool;
        this.diesel = diesel;
        this.eletricidade = eletricidade;
        this.humano = humano;
        this.animal = animal;
        this.quantidade = quantidade;
    }

    public Combustivel() {}

    public String info() {
        String information = "{\n\t\tgasolina: " + isGasolina() + ",\n\t\talcool: " + isAlcool()
                + ",\n\t\tdiesel: " + isDiesel() + ",\n\t\teletricidade: "
                + isEletricidade() + ",\n\t\thumano: " + isHumano() + ",\n\t\tanimal: " +
                isAnimal() + ",\n\t\tquantidade: " + getQuantidade() + "\n\t}";
        return information;
    }

    public boolean isGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }

    public boolean isAlcool() {
        return alcool;
    }

    public void setAlcool(boolean alcool) {
        this.alcool = alcool;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public boolean isEletricidade() {
        return eletricidade;
    }

    public void setEletricidade(boolean eletricidade) {
        this.eletricidade = eletricidade;
    }

    public boolean isHumano() {
        return humano;
    }

    public void setHumano(boolean humano) {
        this.humano = humano;
    }

    public boolean isAnimal() {
        return animal;
    }

    public void setAnimal(boolean animal) {
        this.animal = animal;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}

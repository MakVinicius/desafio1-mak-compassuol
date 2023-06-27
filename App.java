import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Criando e imprimindo o conteúdo da variável tipo Carro
        // Nessa variável eu utilizei o construtor para criar o objeto
        Combustivel combustivelCarro = new Combustivel(
                true,
                false,
                false,
                false,
                false,
                false,
                15
        );
        Carro veiculoCarro = new Carro(
                true,
                true,
                4,
                2,
                4,
                false,
                0,
                combustivelCarro,
                true,
                false
        );
        System.out.println(veiculoCarro.info());
        System.out.println(veiculoCarro.som());


        // Criando e imprimindo o conteúdo da variável tipo Moto
        Combustivel combustivelMoto = new Combustivel();
        combustivelMoto.setGasolina(true);
        combustivelMoto.setAlcool(false);
        combustivelMoto.setDiesel(false);
        combustivelMoto.setEletricidade(false);
        combustivelMoto.setHumano(false);
        combustivelMoto.setAnimal(false);
        combustivelMoto.setQuantidade(7);

        Moto veiculoMoto = new Moto();
        veiculoMoto.setMotor(true);
        veiculoMoto.setVolante(false);
        veiculoMoto.setQtdPassageiros(2);
        veiculoMoto.setQtdPortas(0);
        veiculoMoto.setQtdRodas(2);
        veiculoMoto.seteDeCarga(false);
        veiculoMoto.setCapacidadeCarga(0);
        veiculoMoto.setCombustivel(combustivelMoto);
        veiculoMoto.setPartidaEletrica(true);
        System.out.println(veiculoMoto.info());
        System.out.println(veiculoMoto.som());


        // Criando e imprimindo o conteúdo da variável tipo Bicicleta
        Combustivel combustivelBike = new Combustivel();
        combustivelBike.setGasolina(false);
        combustivelBike.setAlcool(false);
        combustivelBike.setDiesel(false);
        combustivelBike.setEletricidade(false);
        combustivelBike.setHumano(true);
        combustivelBike.setAnimal(false);
        combustivelBike.setQuantidade(1.5);

        Bicicleta veiculoBike = new Bicicleta();
        veiculoBike.setMotor(false);
        veiculoBike.setVolante(false);
        veiculoBike.setQtdPassageiros(1);
        veiculoBike.setQtdPortas(0);
        veiculoBike.setQtdRodas(2);
        veiculoBike.seteDeCarga(false);
        veiculoBike.setCapacidadeCarga(0);
        veiculoBike.setCombustivel(combustivelBike);
        veiculoBike.seteEletrica(false);
        veiculoBike.setTemBagageiro(false);
        System.out.println(veiculoBike.info());
        System.out.println(veiculoBike.som());


        // Criando e imprimindo o conteúdo da variável tipo Charrete
        Combustivel combustivelCharrete = new Combustivel();
        combustivelCharrete.setGasolina(false);
        combustivelCharrete.setAlcool(false);
        combustivelCharrete.setDiesel(false);
        combustivelCharrete.setEletricidade(false);
        combustivelCharrete.setHumano(false);
        combustivelCharrete.setAnimal(true);
        combustivelCharrete.setQuantidade(3.5);

        Charrete veiculoCharrete = new Charrete();
        veiculoCharrete.setMotor(false);
        veiculoCharrete.setVolante(false);
        veiculoCharrete.setQtdPassageiros(4);
        veiculoCharrete.setQtdPortas(0);
        veiculoCharrete.setQtdRodas(4);
        veiculoCharrete.seteDeCarga(false);
        veiculoCharrete.setCapacidadeCarga(0);
        veiculoCharrete.setCombustivel(combustivelCharrete);
        veiculoCharrete.setQtdCavalos(2);
        System.out.println(veiculoCharrete.info());
        System.out.println(veiculoCharrete.som());


        // Criando e imprimindo o conteúdo da variável tipo Caminhao
        Combustivel combustivelCaminhao = new Combustivel();
        combustivelCaminhao.setGasolina(false);
        combustivelCaminhao.setAlcool(false);
        combustivelCaminhao.setDiesel(true);
        combustivelCaminhao.setEletricidade(false);
        combustivelCaminhao.setHumano(false);
        combustivelCaminhao.setAnimal(false);
        combustivelCaminhao.setQuantidade(250);

        Caminhao veiculoCaminhao = new Caminhao();
        veiculoCaminhao.setMotor(true);
        veiculoCaminhao.setVolante(true);
        veiculoCaminhao.setQtdPassageiros(2);
        veiculoCaminhao.setQtdPortas(2);
        veiculoCaminhao.setQtdRodas(6);
        veiculoCaminhao.seteDeCarga(true);
        veiculoCaminhao.setCapacidadeCarga(12000);
        veiculoCaminhao.setCombustivel(combustivelCaminhao);
        veiculoCaminhao.setQtdEixos(2);
        System.out.println(veiculoCaminhao.info());
        System.out.println(veiculoCaminhao.som());

        System.out.println("\n============== Testando objetos vazios (sem informacao definida) ==============");

        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(new Carro());
        listaVeiculos.add(new Moto());
        listaVeiculos.add(new Caminhao());
        listaVeiculos.add(new Charrete());
        listaVeiculos.add(new Bicicleta());
        listaVeiculos.add(new Veiculo());

        for (Veiculo listaVeiculo : listaVeiculos) {
            System.out.println(listaVeiculo.info());
        }

    }


}

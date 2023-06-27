public class App {
    public static void main(String[] args) {
        Combustivel combustivelCarro = new Combustivel(
                true,
                false,
                false,
                false,
                false,
                false,
                15
        );
        Veiculo veiculoCarro = new Carro(
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
        /*
        Se criarmos a variável veiculoCarro do tipo Veiculo instanciando Carro, o Java não me dá acesso
        às variáveis temArCondicionado e temRadio.
        Esses códigos não funcionam:
            veiculoCarro.setTemArCondicionado();
            veiculoCarro.setTemRadio();
        Ai pra funcionar eu tenho que adicionar o (Carro) na frente da variável para conseguir acessar
        essas propriedades.
        */


        // Criando e imprimindo o conteúdo da variável tipo Carro
        Combustivel combustivelCarroApenas = new Combustivel();
        combustivelCarroApenas.setGasolina(true);
        combustivelCarroApenas.setAlcool(false);
        combustivelCarroApenas.setDiesel(false);
        combustivelCarroApenas.setEletricidade(false);
        combustivelCarroApenas.setHumano(false);
        combustivelCarroApenas.setAnimal(false);
        combustivelCarroApenas.setQuantidade(35);

        Veiculo veiculoCarroApenas = new Carro();
        veiculoCarroApenas.setMotor(true);
        veiculoCarroApenas.setVolante(true);
        veiculoCarroApenas.setQtdPassageiros(4);
        veiculoCarroApenas.setQtdPortas(4);
        veiculoCarroApenas.setQtdRodas(4);
        veiculoCarroApenas.seteDeCarga(false);
        veiculoCarroApenas.setCapacidadeCarga(0);
        veiculoCarroApenas.setCombustivel(combustivelCarroApenas);
        ((Carro) veiculoCarroApenas).setTemArCondicionado(false);
        ((Carro) veiculoCarroApenas).setTemRadio(true);
        System.out.println(veiculoCarroApenas.info());
        System.out.println(((Carro) veiculoCarroApenas).som());


        // Criando e imprimindo o conteúdo da variável tipo Moto
        Combustivel combustivelMoto = new Combustivel();
        combustivelMoto.setGasolina(true);
        combustivelMoto.setAlcool(false);
        combustivelMoto.setDiesel(false);
        combustivelMoto.setEletricidade(false);
        combustivelMoto.setHumano(false);
        combustivelMoto.setAnimal(false);
        combustivelMoto.setQuantidade(7);

        Veiculo veiculoMoto = new Moto();
        veiculoMoto.setMotor(true);
        veiculoMoto.setVolante(false);
        veiculoMoto.setQtdPassageiros(2);
        veiculoMoto.setQtdPortas(0);
        veiculoMoto.setQtdRodas(2);
        veiculoMoto.seteDeCarga(false);
        veiculoMoto.setCapacidadeCarga(0);
        veiculoMoto.setCombustivel(combustivelMoto);
        ((Moto) veiculoMoto).setPartidaEletrica(true);
        System.out.println(veiculoMoto.info());
        System.out.println(((Moto) veiculoMoto).som());


        // Criando e imprimindo o conteúdo da variável tipo Bicicleta
        Combustivel combustivelBike = new Combustivel();
        combustivelBike.setGasolina(false);
        combustivelBike.setAlcool(false);
        combustivelBike.setDiesel(false);
        combustivelBike.setEletricidade(false);
        combustivelBike.setHumano(true);
        combustivelBike.setAnimal(false);
        combustivelBike.setQuantidade(1.5);

        Veiculo veiculoBike = new Bicicleta();
        veiculoBike.setMotor(false);
        veiculoBike.setVolante(false);
        veiculoBike.setQtdPassageiros(1);
        veiculoBike.setQtdPortas(0);
        veiculoBike.setQtdRodas(2);
        veiculoBike.seteDeCarga(false);
        veiculoBike.setCapacidadeCarga(0);
        veiculoBike.setCombustivel(combustivelBike);
        ((Bicicleta) veiculoBike).seteEletrica(false);
        ((Bicicleta) veiculoBike).setTemBagageiro(false);
        System.out.println(veiculoBike.info());
        System.out.println(((Bicicleta) veiculoBike).som());


        // Criando e imprimindo o conteúdo da variável tipo Charrete
        Combustivel combustivelCharrete = new Combustivel();
        combustivelCharrete.setGasolina(false);
        combustivelCharrete.setAlcool(false);
        combustivelCharrete.setDiesel(false);
        combustivelCharrete.setEletricidade(false);
        combustivelCharrete.setHumano(false);
        combustivelCharrete.setAnimal(true);
        combustivelCharrete.setQuantidade(3.5);

        Veiculo veiculoCharrete = new Charrete();
        veiculoCharrete.setMotor(false);
        veiculoCharrete.setVolante(false);
        veiculoCharrete.setQtdPassageiros(4);
        veiculoCharrete.setQtdPortas(0);
        veiculoCharrete.setQtdRodas(4);
        veiculoCharrete.seteDeCarga(false);
        veiculoCharrete.setCapacidadeCarga(0);
        veiculoCharrete.setCombustivel(combustivelCharrete);
        ((Charrete) veiculoCharrete).setQtdCavalos(2);
        System.out.println(veiculoCharrete.info());
        System.out.println(((Charrete) veiculoCharrete).som());


        // Criando e imprimindo o conteúdo da variável tipo Caminhao
        Combustivel combustivelCaminhao = new Combustivel();
        combustivelCaminhao.setGasolina(false);
        combustivelCaminhao.setAlcool(false);
        combustivelCaminhao.setDiesel(true);
        combustivelCaminhao.setEletricidade(false);
        combustivelCaminhao.setHumano(false);
        combustivelCaminhao.setAnimal(false);
        combustivelCaminhao.setQuantidade(250);

        Veiculo veiculoCaminhao = new Caminhao();
        veiculoCaminhao.setMotor(true);
        veiculoCaminhao.setVolante(true);
        veiculoCaminhao.setQtdPassageiros(2);
        veiculoCaminhao.setQtdPortas(2);
        veiculoCaminhao.setQtdRodas(6);
        veiculoCaminhao.seteDeCarga(true);
        veiculoCaminhao.setCapacidadeCarga(12000);
        veiculoCaminhao.setCombustivel(combustivelCaminhao);
        ((Caminhao) veiculoCaminhao).setQtdEixos(2);
        System.out.println(veiculoCaminhao.info());
        System.out.println(((Caminhao) veiculoCaminhao).som());
        
    }


}

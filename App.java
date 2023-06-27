public class App {
    public static void main(String[] args) {
        Combustivel combustivelCarro = new Combustivel(true, false, false,
                false, false, false, 15);
        Veiculo veiculoCarro = new Carro(true, true, 4, 2,
                4, false, 0, combustivelCarro, true,
                false);
        System.out.println(veiculoCarro.info());
        /*
        Se criarmos a variável veiculoCarro do tipo Veiculo instanciando Carro, o Java não me dá acesso
        às variáveis temArCondicionado e temRadio.
        Esse código não funciona veiculoCarro.setTemArCondicionado(); e veiculoCarro.setTemRadio();
        O método info() funciona corretamente pois estou fazendo o override da classe pai.
        */


        // Criando e imprimindo o conteúdo da variável tipo Carro
        Combustivel combustivelCarroApenas = new Combustivel(true, false, false,
                false, false, false, 35);
        Carro veiculoCarroApenas = new Carro(true, true, 4, 4,
                4, false, 0, combustivelCarroApenas, true,
                false);
        veiculoCarroApenas.setTemArCondicionado(false);
        veiculoCarroApenas.setTemRadio(true);
        System.out.println(veiculoCarroApenas.info());
        System.out.println(veiculoCarroApenas.som());


        // Criando e imprimindo o conteúdo da variável tipo Moto
        Combustivel combustivelMoto = new Combustivel(true, false, false,
                false, false, false, 7);
        Moto veiculoMoto = new Moto(true, false, 2, 0,
                2, false, 0, combustivelMoto, true);
        System.out.println(veiculoMoto.info());
        System.out.println(veiculoMoto.som());


        // Criando e imprimindo o conteúdo da variável tipo Bicicleta
        Combustivel combustivelBike = new Combustivel(false, false, false,
                false, true, false, 1.5);
        Bicicleta veiculoBike = new Bicicleta(false, false, 1,
                0, 2, false, 0, combustivelBike,
                false, false);
        System.out.println(veiculoBike.info());
        System.out.println(veiculoBike.som());


        // Criando e imprimindo o conteúdo da variável tipo Charrete
        Combustivel combustivelCharrete = new Combustivel(false, false, false,
                false, false, true, 3.5);
        Charrete veiculoCharrete = new Charrete(false, false, 4, 0,
                4, false, 0, combustivelCharrete, 2);
        System.out.println(veiculoCharrete.info());
        System.out.println(veiculoCharrete.som());


        // Criando e imprimindo o conteúdo da variável tipo Caminhao
        Combustivel combustivelCaminhao = new Combustivel(false, false, true,
                false, false, false, 250);
        Caminhao veiculoCaminhao = new Caminhao(true, true, 2, 2,
                6, true, 12000, combustivelCaminhao, 2);
        System.out.println(veiculoCaminhao.info());
        System.out.println(veiculoCaminhao.som());

    }


}

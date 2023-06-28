# Nome do estagiário
Mak Vinícius

# desafio1-mak-compassuol
Desafio da semana 4 do programa de bolsas da Compass.UOL

# Resultados da reunião com o Roger
- Alterei a criação de variáveis, coloquei todas com a mesma classe:
- Antes estava assim: Veiculo veiculoCarro = new Carro();
- Agora ficou assim: Carro veiculoCarro = new Carro();
- Com isso, eu consegui retirar todos os castings do código;
- Adicionei uma função verificador() que verifica se a variável é nula, caso seja, retorna uma string vazia;
- Adicionei essa função para lidar com instâncias vazias das classes;
- Adicionei uma função constructorInfo() na classe pai para construir a informação base e diminuir o tamanho de código nas classes filhas;

# Conteúdo adicional, além do que foi solicitado
- Dentro da classe Combustivel eu adicionei uma variável chamada quantidade, que representa a quantidade de litros (gasolina, álcool, diesel) que um tanque tem, ou a quantidade de horas (eletricidade, humano, animal) que um veículo consegue se movimentar;
- Dentro da classe Charrete existe a variável qtdCavalos, que representa a quantidade de cavalos que a charrete suporta;
- Dentro de cada uma das classes existe o método info() que retornar uma String mostrando todas as informações da variável;
- Por fim coloquei um método som() que retorna uma String mostrando o som do carro, moto, bicicleta, etc;

# Executar
Para executar o programa, tem que compilar e executar o App.java

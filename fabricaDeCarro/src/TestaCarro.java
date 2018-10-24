class TestaCarro {

    public static void main(String[] args){

        Carro meucarro;
        meucarro = new Carro();

        meucarro.cor = "AZUL";
        meucarro.modelo = "VOYAGE";
        meucarro.velocidadeAtual = 0;
        meucarro.VelocidadeMaxima = 80;

        meucarro.liga();

        meucarro.acelera(20);

        System.out.println(meucarro.velocidadeAtual);

    }

}

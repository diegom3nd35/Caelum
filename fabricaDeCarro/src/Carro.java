public class Carro {

    String cor;
    String modelo;
    double velocidadeAtual;
    double VelocidadeMaxima;
    Motor motor;

    // LIGA O CARRO
    void liga(){
        System.out.println("CARRO LIGADO!");
    }

    // ACELERA UMA QUANTIDADE
    void acelera(double quantidade){
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
    }

    // DEVOLVE A MARCHA DO CARRO
    int pegaMarcha() {
        if(this.velocidadeAtual < 0){
            return -1;
        }
        if(this.velocidadeAtual <= 0 && this.velocidadeAtual < 40){
            return 1;
        }
        if(this.velocidadeAtual >= 40 && this.velocidadeAtual <80){
            return 2;
        }
        return 3;
    }
}

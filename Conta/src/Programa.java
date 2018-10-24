public class Programa {

    public static void main(String[] args){

        new Conta();
        Conta minhaConta = new Conta();
        Conta minhaConta2 = new Conta();

        minhaConta.titular.nome = "Diego";
        minhaConta.titular.sobrenome ="Mendes";
        minhaConta.titular.cpf = "056.604.903-10";
        minhaConta.saldo = 1500.00;

        minhaConta2.titular.nome = "Marcos Ferreira";
        minhaConta2.saldo = 2000.00;


        System.out.println("Saldo atual: " + minhaConta.saldo+" de "+minhaConta.titular.sobrenome);
        System.out.println("Saldo atual: " + minhaConta2.saldo+" de "+minhaConta2.titular.nome);

    }

}

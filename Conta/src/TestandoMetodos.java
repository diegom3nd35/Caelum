public class TestandoMetodos {

    public static void main (String[] args){
        // criando conta
        Conta minhaconta3;
        minhaconta3 = new Conta();

        // Criando conta com a classe - Cliente();

        Conta minhaconta = new Conta();
        Cliente diego = new Cliente();
        minhaconta.titular = diego;

        //alterando os valores de minha conta
        minhaconta3.titular.nome = "Pedro";
        minhaconta3.saldo = 1000;
        boolean consegui = minhaconta3.saca(500);

        if (consegui){
           System.out.println("Consegui Sacar");
        }else{
           System.out.println("Não Consegui sacar");
        }

        System.out.println(minhaconta3.saldo);
    }
}

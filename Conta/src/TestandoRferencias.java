public class TestandoRferencias {

    public static void main (String[] args){

        Conta c1 = new Conta();
        c1.deposita(100);

        //Conta c2 = c1; //LINHA IMPORTANTE -  O OPERADOR '=' COPIA O VALOR DE UMA VARIAVEL MAS
                       //C1 & C2 SSAO DIFERENTES, POREM AMBOS APONTAM PARA O MESMO ENDERCO

        Conta c2 = new Conta();
        c2.deposita(200);
        c2.deposita(300);

        c2.transferePara(c1,300);

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);


    }
}

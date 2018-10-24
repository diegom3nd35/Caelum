public class Conta {

    int numero;
    double saldo;
    double limite;
    Cliente titular = new Cliente();

    boolean saca(double quantidade){
        if (this.saldo < quantidade){
            return false; }
        else {
            this.saldo -= quantidade;
            return true; }
    }

    void deposita(double quantidade){
        this.saldo += quantidade;
    }

    boolean transferePara (Conta destino, double quantidade){
        boolean retirou = this.saca(quantidade);
        if (retirou == false){
            return false;
        }
        else{
            destino.deposita(quantidade);
            return true;
        }

    }
}

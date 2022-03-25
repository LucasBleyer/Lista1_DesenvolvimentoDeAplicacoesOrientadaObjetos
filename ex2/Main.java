
package ex2;

public class Main {
    
    public static void main(String[] args) {
        Conta contaLucas = new Conta();
        contaLucas.numero = 1234;
        contaLucas.titular = "Lucas Bleyer";
        contaLucas.saldo = 1000;
        
        contaLucas.sacar(100);
        contaLucas.depositar(500);
        
        contaLucas.extrato();
    }
}

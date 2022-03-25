
package ex2;

public class Conta {
    public int numero;
    public String titular;
    public float saldo;
    
    public void sacar(float valor){
        this.saldo -= valor;
    }
    
    public void depositar(float valor){
        this.saldo += valor;
    }
    
    public void extrato(){
        System.out.println("Número da Conta: "+this.numero);
        System.out.println("Titular da Conta: "+this.titular);
        System.out.println("Saldo da Conta: "+this.saldo);
    }
}

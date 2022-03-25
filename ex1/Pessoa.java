package ex1;

public class Pessoa {
    
    public String nome;
    public int peso;
    public int idade;
    
    public void caminha(){
        this.peso--;
    }
    
    public void come(){
        this.peso++;
    }
    
    public void fazAniversario(){
        this.idade--;
    }
    
    public void imprime(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Peso: " +this.peso);
        System.out.println("Idade: " +this.idade);
    }
}

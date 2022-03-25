package ex1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Lucas";
        p1.peso = 65;
        p1.idade = 18;
        
        p1.caminha();
        p1.come();
        p1.come();
        p1.fazAniversario();
        
        p1.imprime();
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Tales";
        p2.peso = 60;
        p2.idade = 20;
        
        p2.caminha();
        p2.come();
        p2.fazAniversario();
        
        p2.imprime();
    }
}


package ex4;

public class Main {
    
    public static void main(String[] args) {
            Empregado e1 = new Empregado("Lucas","Bleyer", 600);
            e1.salarioAnual();
            System.out.println(e1.getNome()+""+e1.getSobrenome()+" tem um salário anual de "+e1.getSalario());
            
    }
}

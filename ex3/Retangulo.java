
package ex3;

public class Retangulo {
    public float altura;
    public float largura;
    public float area;
    public float perimetro;

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    public float calcularArea(float altura, float largura){
        return this.area = this.largura * this.altura;
    }
    
    public float calcularPerimetro(float altura, float largura){
        return this.perimetro = (this.largura * 2) + (this.altura * 2);
    }
    
    public void imprimir(){
        System.out.println("Área: " +this.area);
        System.out.println("Perímetro: "+this.perimetro);
    }
}

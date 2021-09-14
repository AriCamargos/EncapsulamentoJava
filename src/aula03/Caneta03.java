package aula03;
/**
*@author AriCamargos
*@version 8.0 (July 10, 2021)
* Aulas sobre VISIBILIDADE: privado, publico e protegido
**/
public class Caneta03 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    //MÉTODO
    public void status(){ // mosta o estado atual do objeto
        System.out.println("Modelo é " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?" + this.tampada);
        
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    
    protected void tampada(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
    
    
      
}

package aula03;
/**
*@author AriCamargos
*@version 8.0 (July 10, 2021)
* Aulas sobre VISIBILIDADE: privado, publico e protegido
**/
public class Aula03 {
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta ();
        
        //aqui mexo nos atributos
        c1.modelo = "Faber Castell";
        /**c1.cor = "Azul";
        *c1.ponta = 0.5f; // não posso mexer na ponta porq está como privated no atributo
        *c1. ponta = 0.5f; 
        
        -- aqui mexo nos atributos
        c1.rabiscar();
        c1.ponta(0.5f);
        */
        
        c1.status();
        
    }
    
}

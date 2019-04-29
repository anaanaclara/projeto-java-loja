
import java.util.Scanner;


public class ClassePrincipal {
    
        public static void main (String[] args) {
        Carro carro1 = new Carro (); {   
            
             Scanner scan = new Scanner (System.in);
              
        System.out.print("Nome do Carro: ");
        carro1.nome = scan.next();    
        System.out.println ("marca do Carro: ");
        carro1.marca = scan.next();
        System.out.println ("cor  do Carro: ");
        carro1.cor = scan.next();
        System.out.println ("largura  do Carro: ");
        carro1.largura = scan.next();
        System.out.println ("peso  do Carro: ");
        carro1.peso = scan.next();
    
    System.out.println ("nome    1   = "  +  carro1.nome);
    System.out.println ("marca   1   = "  +  carro1.marca);
    System.out.println ("cor     1   = "  +  carro1.cor);
    System.out.println ("largura 1   = "  +  carro1.largura);
    System.out.println ("peso    1   = "  +  carro1.peso);
    
    
        Carro carro2 = new Carro (); {         
    
        System.out.print("Nome do segundo Carro: ");
        carro2.nome = scan.next();    
        System.out.println ("marca do Carro: ");
        carro2.marca = scan.next();
        System.out.println ("cor  do Carro: ");
        carro2.cor = scan.next();
        System.out.println ("largura  do Carro: ");
        carro2.largura = scan.next();
        System.out.println ("peso  do Carro: ");
        carro2.peso = scan.next();
    
    
    System.out.println ("nome    2   = "  +  carro2.nome);
    System.out.println ("marca   2   = "  +  carro2.marca);
    System.out.println ("cor     2   = "  +  carro2.cor);
    System.out.println ("largura 2   = "  +  carro2.largura);
    System.out.println ("peso    2   = "  +  carro2.peso);
    
    }}}}
        

        


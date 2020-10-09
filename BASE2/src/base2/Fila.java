package base2;

import static base2.BASE2.ConsoleClear;
import java.util.*;

class Elemento{
    
    public int Num;
    public Elemento Prox;
    
    public Elemento() {
        Num=0;
        Prox=null;
    }
}

public class Fila {
    private Elemento Inicio;
    private Elemento Fim;
    private Elemento Aux;
    
    public Fila(){
        Inicio=null;
        Fim=null;
    }
    
    public void Inserir(int Valor){
        Elemento Novo=new Elemento();
        
        Novo.Num= Valor;
        
        Novo.Prox=null;
        
        if(Inicio==null){
            Inicio=Novo;
            Fim=Novo;
        }
        else{
            Fim.Prox=Novo;
            Fim=Novo;
        }
    }
    
    public void Mostrar(){
        Scanner S = new Scanner(System.in);
        
        if(Inicio==null){
            System.out.println("\nNao existe ninguem na fila...");
            System.out.println("\n\nEnter para retornar ao menu.");
            S.nextLine();
            ConsoleClear();
        }
        else{
            Aux=Inicio;
            
            System.out.print("Fila:");
            
            while(Aux!=null){
                System.out.printf("\n%1$d", Aux.Num);
                
                Aux=Aux.Prox;
            }
            System.out.println("\n\nEnter para retornar ao menu.");
            S.nextLine();
            ConsoleClear();
        }
    }
    
    public void Remover(){
        Scanner S=new Scanner(System.in);
        
        int x;
        
        if(Inicio==null){
            System.out.println("Nao existe ninguem na fila...");
            System.out.println("\n\nEnter para retornar ao menu.");
            S.nextLine();
            ConsoleClear();
        }
        else{
            x=Inicio.Num;
            Inicio=Inicio.Prox;
            
            
            System.out.printf("\nChamando o numero %1$d para atendimento...",x);
            System.out.println("\n\nEnter para retornar ao menu.");
            S.nextLine();
            ConsoleClear();
        }
    }
}

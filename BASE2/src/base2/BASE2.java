package base2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.Scanner;

public class BASE2 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        
        int z=0;
        Fila MinhaFila=new Fila();
    
        int opcao;

        do{
            menu();
            opcao = S.nextInt();
            
            switch(opcao){
            case 1:
                z++;
                RetSenha(MinhaFila, z);
                ConsoleClear();
                System.out.println();
                break;
                
            case 2:
                MinhaFila.Remover();
                break;
            
            case 3:
                ConsoleClear();
                System.out.println();
                MinhaFila.Mostrar();
                break;
                
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
    
        static void RetSenha(Fila MinhaFila, int z){
            Scanner S = new Scanner(System.in);
            MinhaFila.Inserir(z);
            ConsoleClear();
            System.out.println("Adicionado o numero "+z+" na fila.");
            System.out.println("\n\nEnter para retornar ao menu.");
            S.nextLine();
            ConsoleClear();
        }
    
        public static void menu(){
        System.out.println("\tBEM VINDO AO GESTOR, QUAL OPERAÇÃO VOCÊ DESEJA REALIZAR:");
        System.out.println("0. Encerrar");
        System.out.println("1. Retirar o seu acesso");
        System.out.println("2. Chamar para ser atendido");
        System.out.println("3. Listar todos presentes na fila");
        System.out.println("Opcao desejada:");
    }
        
        static void ConsoleClear() {
        
        try {
            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.setAutoDelay(2);
 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
            robot.setAutoDelay(2);

        } catch (AWTException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
        
        
        
}
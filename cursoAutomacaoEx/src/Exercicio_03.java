import javax.print.event.PrintEvent;
import javax.swing.JOptionPane;

public class Exercicio_03 {

    public static void main(String[] args) {
        String nome;// declarei uma variavel 
        String idade;// declarei outra variavel 
        String nome2 = "";
        
        nome = JOptionPane.showInputDialog("nome"); //variavel será pedido na tela 
        idade = JOptionPane.showInputDialog("idade");//variavel será pedido na tela 

        nome2 = idade;
        idade = nome;
        nome = nome2;
        System.out.println("nome digitado é " + nome);
        System.out.println("idade digitado " + idade);

    }
}
import javax.print.event.PrintEvent;
import javax.swing.JOptionPane;

public class Exercicio_05 {

    public static void main(String[] args) {
        String nome;// declarei uma variavel 
        String sobrenome;// declarei outra variavel 
        String idade;
        
        nome = JOptionPane.showInputDialog("nome"); //variavel será pedido na tela 
        sobrenome = JOptionPane.showInputDialog("Sobrenome");//variavel será pedido na tela 
        idade = JOptionPane.showInputDialog("Idade");//variavel será pedido na tela

        
        System.out.println("Nome: " +nome+ "\nSobrenome: " +sobrenome+
        "\nIdade " +idade);

    }
}
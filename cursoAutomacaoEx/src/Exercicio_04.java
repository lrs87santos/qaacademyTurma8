import javax.swing.JOptionPane;

public class Exercicio_04 {

    public static void main(String[] args) throws Exception {

        int num = 2;
        int i = 1;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        while (i <= 10) {
            System.out.println(" Processado " + num*i); 
            i++;
        }
    }
    
}

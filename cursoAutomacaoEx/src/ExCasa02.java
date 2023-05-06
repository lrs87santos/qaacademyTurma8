public class ExCasa02 {
    public static int[] trocarValores( int valor1, int valor2){
        int aux = valor1; 
        valor1 = valor2; 
        valor2 = aux; 

        int[] valores = new int[2];
        valores[0] = valor1;
        valores[1] = valor2;

        return valores;

    }

    public static void main (String[] args){
        int primeirValor = 10;
        int segundoValor = 30;

        System.out.println("O primeiro valor é: "+trocarValores(primeirValor, segundoValor)[0]
         +"\n O segundo valor é: "+trocarValores(primeirValor, segundoValor)[1]);
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        
        // instanciar um objeto e chamar os metodos que sao obrigatorios a todas as classes 
        Conta cp = new Poupanca(); 
        cp.depositar (732); 
        cp.sacar(8);
        cp.getSaldo();
        
       


    }
}

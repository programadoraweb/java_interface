public class Poupanca implements Conta{
    // implements eh a palavra reserevada
    // VAMOS IMPLEMENTAR os metodos que foram declarados na classe conta

// criar a variavel saldo
private double saldo;

// implementar os metodos 
public void depositar(double valor){
    this.saldo += valor; 
    // Em depositar, o saldo vai ser o valor + quantas vezes somar
      System.out.println("Deposito de: " + valor);
        System.out.println("Saldo depois do deposito de: " + saldo);
}
public double getSaldo(){
    System.out.println("Saldo da funcao getSaldo eh de: " + saldo);
    return this.saldo;
}
public void sacar(double valor){
    this.saldo -= valor; 
    // Em sacar, o saldo vai ser valor - o que se saque de valor 
    System.out.println("Saque de: " + valor);
    System.out.println("Saldo depois do saque de: " + saldo);
}
}

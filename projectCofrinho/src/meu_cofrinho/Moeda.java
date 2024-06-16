package meu_cofrinho;

// Classe abstrata Moeda para definir métodos comuns a todas as moedas
public abstract class Moeda {

  protected double valor;
  protected double valorConversao;

  // Método para exibir informações
  public void info() {
    System.out.println("Moeda - " + valor);
  }

  // Método para converdão dos valores
  public double converter() {
    double total = 0;
    return total;
  }

  // Método para verificar se dois objetos são iguais
  @Override
  public abstract boolean equals(Object obj);

  // Método para calcular o código de hash do objeto
  @Override
  public abstract int hashCode();
}

package meu_cofrinho;

// Extensão da classe abstrata Moeda para a moeda Libra
public class Libra extends Moeda {

  // Construtor padrão que define o valor de conversão do Libra
  public Libra() {
    this.valorConversao = 6.7;
  }

  // Construtor que permite inicializar o valor do Dólar com um valor específico
  public Libra(double valorInicial) {
    this.valor = valorInicial;
  }

  // Método para exibir informações sobre a moeda Libra
  @Override
  public void info() {
    System.out.println("Libra - " + valor);
  }

  // Método para converter o valor do Libra para Real
  @Override
  public double converter() {
    double total = this.valor * this.valorConversao;
    return total;
  }

  // Método para verificar se dois objetos Libra são iguais
  @Override
  public boolean equals(Object obj) {
    // Verifica se o objeto atual é o mesmo que o objeto passado como parâmetro
    if (this == obj) return true;

    // Verifica se o objeto passado como parâmetro é nulo ou não pertence à mesma classe
    if (obj == null || getClass() != obj.getClass()) return false;

    // Converte o objeto passado como parâmetro para a classe Libra
    Libra libra = (Libra) obj;

    // Compara os valores dos atributos das duas instâncias da classe Libra
    return Double.compare(libra.valor, valor) == 0;
  }

  // Método para calcular o código de hash do objeto Libra
  @Override
  public int hashCode() {
    // Retorna o código de hash do valor da moeda Libra
    return Double.hashCode(valor);
  }
}

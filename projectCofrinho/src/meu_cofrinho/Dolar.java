package meu_cofrinho;

// Extensão da classe abstrata Moeda para a moeda Dólar
public class Dolar extends Moeda {

  // Construtor padrão que define o valor de conversão do Dólar
  public Dolar() {
    this.valorConversao = 5.2;
  }

  // Construtor que permite inicializar o valor do Dólar com um valor específico
  public Dolar(double valorInicial) {
    this.valor = valorInicial;
  }

  // Método para exibir informações sobre a moeda Dólar
  @Override
  public void info() {
    System.out.println("Dólar - " + valor);
  }

  // Método para converter o valor do Dólar para Real
  @Override
  public double converter() {
    double total = this.valor * this.valorConversao;
    return total;
  }

  // Método para verificar se dois objetos Dólar são iguais
  @Override
  public boolean equals(Object obj) {
    // Verifica se o objeto atual é o mesmo que o objeto passado como parâmetro
    if (this == obj) return true;
    // Verifica se o objeto passado como parâmetro é nulo ou não pertence à mesma classe
    if (obj == null || getClass() != obj.getClass()) return false;
    // Converte o objeto passado como parâmetro para a classe Dolar
    Dolar dolar = (Dolar) obj;
    // Compara os valores dos atributos das duas instâncias da classe Dolar
    return Double.compare(dolar.valor, valor) == 0;
  }

  // Método para calcular o código de hash do objeto Dólar
  @Override
  public int hashCode() {
    // Retorna o código de hash do valor da moeda Dólar
    return Double.hashCode(valor);
  }
}

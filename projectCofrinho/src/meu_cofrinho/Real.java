package meu_cofrinho;

// Extensão da classe abstrata Moeda para a moeda Real
public class Real extends Moeda {

  // Construtor padrão que define o valor de conversão
  public Real() {
    this.valorConversao = 1;
  }

  // Construtor que permite inicializar o valor do Real com um valor específico
  public Real(double valorInicial) {
    this.valor = valorInicial;
  }

  // Método para exibir informações sobre a moeda Real
  @Override
  public void info() {
    System.out.println("Real - " + valor);
  }

  // Método para converter o valor
  @Override
  public double converter() {
    double total = this.valor * this.valorConversao;
    return total;
  }

  // Método para verificar se dois objetos Real são iguais
  @Override
  public boolean equals(Object obj) {
    // Verifica se o objeto atual é o mesmo que o objeto passado como parâmetro
    if (this == obj) return true;

    // Verifica se o objeto passado como parâmetro é nulo ou não pertence à mesma classe
    if (obj == null || getClass() != obj.getClass()) return false;

    // Converte o objeto passado como parâmetro para a classe Real
    Real real = (Real) obj;

    // Compara os valores dos atributos das duas instâncias da classe Real
    return Double.compare(real.valor, valor) == 0;
  }

  // Método para calcular o código de hash do objeto Real
  @Override
  public int hashCode() {
    // Retorna o código de hash do valor da moeda Real
    return Double.hashCode(valor);
  }
}

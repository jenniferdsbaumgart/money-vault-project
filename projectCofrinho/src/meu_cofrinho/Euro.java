package meu_cofrinho;

// Extensão da classe abstrata Moeda para a moeda Euro
public class Euro extends Moeda {

  // Construtor padrão que define o valor de conversão do Euro
  public Euro() {
    this.valorConversao = 5.7;
  }

  // Construtor que permite inicializar o valor do Real com um valor específico
  public Euro(double valorInicial) {
    this.valor = valorInicial;
  }

  // Método para exibir informações sobre a moeda Euro
  @Override
  public void info() {
    System.out.println("Euro - " + valor);
  }

  // Método para converter o valor do Euro para Real
  @Override
  public double converter() {
    double total = this.valor * this.valorConversao;
    return total;
  }

  // Método para verificar se dois objetos Euro são iguais
  @Override
  public boolean equals(Object obj) {
    // Verifica se o objeto atual é o mesmo que o objeto passado como parâmetro
    if (this == obj) return true;

    // Verifica se o objeto passado como parâmetro é nulo ou não pertence à mesma classe
    if (obj == null || getClass() != obj.getClass()) return false;

    // Converte o objeto passado como parâmetro para a classe Euro
    Euro euro = (Euro) obj;

    // Compara os valores dos atributos das duas instâncias da classe Euro
    return Double.compare(euro.valor, valor) == 0;
  }

  // Método para calcular o código de hash do objeto Euro
  @Override
  public int hashCode() {
    // Retorna o código de hash do valor da moeda Euro
    return Double.hashCode(valor);
  }
}

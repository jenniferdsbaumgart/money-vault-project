package meu_cofrinho;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Cofrinho {

  // Moeda atualmente selecionada no cofrinho
  Moeda moeda;

  // Lista de moedas no cofrinho
  private ArrayList<Moeda> listaValores;

  // Construtor da classe Cofrinho
  public Cofrinho() {
    // Inicializa a lista de valores
    this.listaValores = new ArrayList<>();
  }

  // Método getter para obter a lista de moedas
  public ArrayList<Moeda> getListaValores() {
    return listaValores;
  }

  // Método setter para obter a lista de moedas
  public void setListaValores(ArrayList<Moeda> listaValores) {
    this.listaValores = listaValores;
  }

  // Método para listar os valores armazenados em cada moeda no cofrinho
  public void listarValores() {
    if (this.listaValores.isEmpty()) {
      System.out.println("O cofrinho está vazio.");
      return;
    }

    System.out.println("------------------------");
    System.out.println("Valores armazenados:");
    for (Moeda moeda : this.listaValores) {
      moeda.info();
    }
    System.out.println("------------------------");
  }

  // Método para calcular o valor total convertido para Real
  public double totalConvertido(Moeda moeda) {
    double total = 0;
    total = moeda.converter();

    // Formata o total para exibir apenas dois dígitos após a vírgula
    DecimalFormat df = new DecimalFormat("#.##");
    return Double.parseDouble(df.format(total));
  }

  // Método para verificar se dois objetos Cofrinho são iguais
  @Override
  public boolean equals(Object obj) {
    // Verifica se o objeto atual é o mesmo que o objeto passado como parâmetro
    if (this == obj) return true;
    // Verifica se o objeto passado como parâmetro é nulo
    if (obj == null) return false;
    // Verifica se o objeto passado não pertence à mesma classe
    if (getClass() != obj.getClass()) return false;
    // Converte o objeto passado como parâmetro para a classe Cofrinho
    Cofrinho other = (Cofrinho) obj;
    // Compara as listas de valores e a moeda atual das duas instâncias
    return (
      Objects.equals(listaValores, other.listaValores) &&
      Objects.equals(moeda, other.moeda)
    );
  }

  // Método para calcular o código de hash do objeto Cofrinho
  @Override
  public int hashCode() {
    // Gera o código hash baseado nas listas de valores e na moeda atual
    return Objects.hash(listaValores, moeda);
  }
}

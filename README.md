
# Meu Cofrinho

Este é um projeto **Java** simples que simula um cofrinho onde você pode adicionar, remover e converter valores em diferentes moedas. Cada moeda é representada por uma classe específica que estende a classe abstrata `Moeda`. Esta é uma versão aprimorada do projeto realizado para a disciplina de **POO - Programação Orientada a Objetos** do curso de **Análise e Desenvolvimento de Sistemas** da UNINTER. Foram utilizados também os conhecimentos adquiridos sobre Java no curso **Jovem Programador** do Senac.

## Funcionalidades

- Adicionar valor em dinheiro nas moedas suportadas (Dólar, Euro, Libra, Real).
- Remover valor em dinheiro das moedas suportadas.
- Listar os valores armazenados em cada moeda no cofrinho.
- Converter valores das moedas para Real.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **`src/`**: Contém o código-fonte Java do projeto.
  - **`meu_cofrinho/`**: Pacote principal do projeto.
    - **`Main.java`**: Ponto de entrada do programa.
    - **`Menu.java`**: Implementação do menu principal e operações do cofrinho.
    - **`Cofrinho.java`**: Classe que gerencia as moedas no cofrinho.
    - **`Moeda.java`**: Classe abstrata base para as diferentes moedas.
    - **`Dolar.java`, `Euro.java`, `Libra.java`, `Real.java`**: Classes específicas para cada moeda.
- **`README.md`**: Este arquivo, contendo informações sobre o projeto e instruções de uso.
- **`.gitignore`**: Arquivo de configuração do Git para ignorar arquivos e diretórios específicos.

## Pré-requisitos

Para executar este projeto, você precisará de:
- Java Development Kit (JDK) instalado
- Um ambiente de desenvolvimento Java (como IntelliJ IDEA, Eclipse, NetBeans) ou o uso de linha de comando.


## Contribuições 
Contribuições são bem-vindas! Sinta-se à vontade para abrir um Pull Request com melhorias, correções de bugs ou novas funcionalidades.

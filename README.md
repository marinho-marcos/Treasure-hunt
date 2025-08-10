# 🗺️ Caça ao Tesouro

> Um jogo de exploração de tabuleiro em console, onde o jogador deve encontrar tesouros escondidos enquanto desvia de armadilhas. O projeto é construído em Java puro com foco em lógica e Polimorfismo.

![Demonstração do Jogo Caça ao Tesouro](https://i.imgur.com/GQuFPHP.gif)
---

## 📝 Sobre o Projeto

**Caça ao Tesouro** é um jogo single-player onde o objetivo é explorar um tabuleiro 6x6 para encontrar 3 tesouros escondidos. O jogador tem um número limitado de movimentos e deve gerenciar sua pontuação, que aumenta ao encontrar tesouros e diminui ao cair em armadilhas.

O projeto foi desenvolvido inteiramente em **Java** e demonstra de forma clara a aplicação de conceitos de **Programação Orientada a Objetos (OOP)**. A principal característica da arquitetura é o uso de **Polimorfismo**: cada elemento no tabuleiro (Tesouro, Armadilha, Vazio) sabe como "interagir" com o jogador de uma maneira única, simplificando a lógica principal do jogo.

---

## ✨ Regras e Funcionalidades

* **Objetivo Principal:** Encontrar todos os 3 tesouros (💰) escondidos no tabuleiro.
* **Movimentação Limitada:** O jogador começa com **10 movimentos**. O jogo termina se os movimentos acabarem.
* **Tabuleiro Oculto:** O tabuleiro começa oculto (representado por 🟥), e as casas são reveladas à medida que o jogador se move.
* **Geração Aleatória:** A posição dos 3 tesouros e das 3 armadilhas é gerada aleatoriamente a cada nova partida.
* **Sistema de Pontuação:**
    * Encontrar um **Tesouro (💰)**: +3 pontos.
    * Cair em uma **Armadilha (💣)**: -2 pontos.
* **Condição de Vitória/Derrota:**
    * **Vitória:** Encontrar os 3 tesouros.
    * **Derrota:** Ficar sem movimentos antes de encontrar todos os tesouros.

---

## 🚀 Tecnologias Utilizadas

* **Linguagem:** [Java](https://www.java.com/pt-BR/)
* **Paradigmas:** Programação Orientada a Objetos (OOP), Polimorfismo
* **Ferramentas:** Estruturas de Dados (Matrizes, `HashSet`), Manipulação de Console
* **Versionamento:** [Git](https://git-scm.com/)

---

## ▶️ Como Executar o Projeto

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina o **[Java JDK 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)** ou superior.

### Rodando o Jogo

O projeto é executado diretamente via terminal, sem a necessidade de ferramentas de build adicionais.

```bash
# 1. Clone este repositório
$ git clone [https://github.com/marinho-marcos/caca-ao-tesouro](https://github.com/marinho-marcos/caca-ao-tesouro)

# 2. Acesse a pasta do projeto no terminal/cmd
$ cd caca-ao-tesouro

# 3. Compile todos os arquivos .java
# (Este comando compila todos os arquivos Java na pasta)
$ javac *.java

# 4. Execute a classe principal para iniciar o jogo
$ java Main

# 🎮 Sistema de Criação de Personagens em Java

Este projeto é um programa em **Java (console)** que simula a criação de personagens para um jogo, permitindo cadastrar jogadores e escolher classes com atributos específicos.

O objetivo é **praticar conceitos fundamentais de Java**, como:
- Orientação a Objetos (POO)
- Classes e métodos
- Construtores
- Vetores (arrays)
- Estruturas de decisão (`if`, `switch`)
- Validação de entrada com `Scanner`

---

## 📌 Funcionalidades

- Definição da quantidade de jogadores
- Cadastro de cada jogador (nome e idade)
- Validação de entradas numéricas
- Escolha de classe de personagem:
  - Assassino
  - Tanque
  - Suporte
- Exibição dos atributos da classe escolhida

---

## ⚙️ Funcionamento do Código

1. O programa inicia exibindo uma mensagem de boas-vindas.
2. O usuário informa a quantidade de jogadores.
3. O sistema valida se a entrada é numérica e maior que zero.
4. Para cada jogador:
   - É solicitado o nome.
   - É solicitada a idade, com validação de entrada.
   - O menu de classes é exibido.
   - O jogador escolhe uma classe.
5. A escolha é validada por meio de um `switch`.
6. Caso a opção seja válida, a classe é criada com seus atributos.
7. Os atributos do personagem escolhido são exibidos no console.
8. Caso a entrada seja inválida, uma mensagem de erro é apresentada.

---

## 🧙 Classes Disponíveis

| Classe     | Vida | Ataque | Defesa | Velocidade |
|-----------|------|--------|--------|------------|
| Assassino | 1800 | 600    | 20%    | 34 km/h    |
| Tanque    | 3800 | 100    | 80%    | 12 km/h    |
| Suporte   | 2400 | 300    | 50%    | 24 km/h    |

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- `java.util.Scanner`
- Programação Orientada a Objetos (POO)

---

## 📂 Estrutura do Projeto
📁 src
├── Main.java
├── Personagem.java

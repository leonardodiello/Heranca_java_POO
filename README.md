# Carro POO em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![POO](https://img.shields.io/badge/POO-Programação%20Orientada%20a%20Objetos-6A1B9A?style=for-the-badge)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=for-the-badge\&logo=intellijidea\&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge\&logo=git\&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge\&logo=github\&logoColor=white)

## Sobre o projeto

Este projeto foi desenvolvido em **Java** com o objetivo de praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

A aplicação utiliza uma classe para representar um carro, trabalhando com **atributos, métodos, encapsulamento e criação de objetos**.

O projeto faz parte dos meus estudos de Java e POO durante a graduação em Engenharia de Software.

---

## Conceitos praticados

Durante o desenvolvimento, foram trabalhados conceitos como:

* Classes e objetos.
* Atributos.
* Métodos.
* Encapsulamento.
* Modificadores de acesso.
* Construtores.
* Instanciação de objetos.
* Organização básica de um projeto Java.

---

## Estrutura do projeto

```text
Carro_POO_java/
│
├── src/
│   └── Main.java
│
├── .gitignore
└── README.md
```

---

## Tecnologias

| Tecnologia    | Utilização                          |
| ------------- | ----------------------------------- |
| Java          | Linguagem utilizada no projeto      |
| POO           | Organização e modelagem dos objetos |
| IntelliJ IDEA | Ambiente de desenvolvimento         |
| Git           | Controle de versão                  |
| GitHub        | Hospedagem do código                |

---

## Exemplo de conceito utilizado

A ideia principal do projeto é representar um carro através de uma classe:

```java
public class Carro {

    private String modelo;
    private String marca;

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}
```

Nesse exemplo, os atributos `modelo` e `marca` são privados, demonstrando o uso de **encapsulamento**.

Um objeto da classe pode então ser criado:

```java
Carro carro = new Carro("Civic", "Honda");

carro.acelerar();
```

---

## Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/leonardodiello/Carro_POO_java.git
```

### 2. Acesse a pasta

```bash
cd Carro_POO_java
```

### 3. Abra o projeto no IntelliJ IDEA

Abra a pasta do projeto no **IntelliJ IDEA** e execute a classe `Main`.

Também é possível executar o projeto utilizando o terminal, caso o ambiente Java esteja configurado corretamente.

---

## Objetivo

O principal objetivo deste projeto é consolidar os fundamentos de **Programação Orientada a Objetos em Java** por meio de um exemplo simples e prático.

Este projeto também serve como base para estudos posteriores envolvendo estruturas mais completas, como sistemas utilizando múltiplas classes, herança, interfaces e outras abstrações da linguagem Java.

---

## Autor

**Leonardo Diello**

Estudante de Engenharia de Software no IFAM.

[![GitHub](https://img.shields.io/badge/GitHub-leonardodiello-181717?style=for-the-badge\&logo=github\&logoColor=white)](https://github.com/leonardodiello)

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Leonardo%20Diello-0A66C2?style=for-the-badge\&logo=linkedin\&logoColor=white)](https://www.linkedin.com/in/leonardo-diello/)

# 🏭 Exercício Prático: Interfaces em Java Aplicadas à Indústria 4.0

Este repositório contém a resolução do exercício prático da disciplina de **Programação Orientada a Objetos em Java**, do curso **Técnico em Desenvolvimento de Software do SENAI**. O projeto simula o sistema de monitoramento do chão de fábrica da empresa **MetalTech 4.0**, integrando conceitos de Herança, Classes Abstratas, Interfaces e Polimorfismo no contexto da Indústria 4.0.

---

## 📌 Índice do Projeto

Abaixo estão os módulos, códigos e a documentação do exercício, com caminhos diretos para as respectivas pastas e arquivos.

### 📐 1. Diagrama de Classes UML
* **O que faz:** Mapeia a arquitetura do sistema, diferenciando as relações de herança de classes abstratas (o que o equipamento *é*) e a implementação de contratos de interface (o que o equipamento *é capaz de fazer*).
* **Especificação das conexões:**
  * **Herança (linha contínua):** `Robo` e `EsteiraTransportadora` estendem `MaquinaProducao`; `SensorTemperatura` e `CLP` estendem `DispositivoIoT`.
  * **Implementação de Interfaces (linha tracejada):** Mapeamento das capacidades `Manutenivel`, `ConectavelIoT` e `Programavel` conforme as regras da fábrica.

📂 [Acessar a imagem do Diagrama UML](Atividade-Interface-Diagrama-Classes-Uml.png)

---

### 💻 2. Código Fonte do Sistema (MetalTech 4.0)
* **O que faz:** Sistema orientado a objetos que gerencia equipamentos industriais em memória. Instancia equipamentos concretos, processa relatórios de status e agrupa os dispositivos por suas capacidades comportamentais.
* **Módulos desenvolvidos:**
  * **Classes Abstratas:** `Equipamento`, `MaquinaProducao` e `DispositivoIoT`.
  * **Classes Concretas:** `Robo`, `EsteiraTransportadora`, `SensorTemperatura` e `CLP`.
  * **Interfaces:** `Manutenivel`, `ConectavelIoT` e `Programavel` *(Desafio Bônus)*.
  * **Executável (`Main.java`):** Monta as listas genéricas e especializadas (`List<Equipamento>`, `List<Manutenivel>`, `List<ConectavelIoT>` e `List<Programavel>`), utilizando polimorfismo para acionar os métodos específicos de cada contrato.

📂 [Acessar arquivos desta atividade)](./ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0)  
📄 [Ver classe principal (Main.java)](./ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0/aplication/Main.java)

---

### ❓ 3. Perguntas de Fixação Respondidas
* **O que faz:** Documentação técnica com a fundamentação teórica dos conceitos de Orientação a Objetos aplicados durante a solução do exercício.
* **Tópicos abordados:**
  1. *Por que métodos de interface não foram colocados na classe base `Equipamento`.*
  2. *Diferença prática entre herança (`extends`) e implementação de interface (`implements`).*
  3. *Uso de múltiplas interfaces para contornar a limitação de herança simples.*
  4. *Exemplo de equipamento real da indústria aplicar às interfaces.*
  5. *A questão da herança múltipla de classes em Java.*

📂 [Acessar arquivo com as Respostas de Fixação](./Atividade_Interface_Perguntas_De_Fixacao.txt)

---

## 📊 Matriz de Implementação dos Equipamentos

| Equipamento Concreto | Tipo Base (Herança) | `Manutenivel` 🛠️ | `ConectavelIoT` 🌐 | `Programavel` 💻 *(Bônus)* |
| :--- | :--- | :---: | :---: | :---: |
| **Robo** | `MaquinaProducao` | ✅ | ✅ | ✅ |
| **EsteiraTransportadora** | `MaquinaProducao` | ✅ | ❌ | ❌ |
| **SensorTemperatura** | `DispositivoIoT` | ❌ | ✅ | ❌ |
| **CLP** | `DispositivoIoT` | ✅ | ✅ | ✅ |

---

## 🧠 Conceitos de POO Aplicados

| Conceito | Aplicação no Projeto |
| :--- | :--- |
| **Herança** | Usada para modelar a natureza estática dos equipamentos (`Robo` **é uma** `MaquinaProducao`). |
| **Classes Abstratas** | `Equipamento`, `MaquinaProducao` e `DispositivoIoT` fornecem atributos base (`codigo`, `nome`) e forçam a implementação de métodos como `status()`, `produzir()` e `coletarDado()`. |
| **Interfaces** | Definem capacidades transversais que ultrapassam a árvore de herança. Exemplo: tanto o `Robo` quanto o `CLP` são `Programavel`, embora pertençam a ramos totalmente diferentes. |
| **Polimorfismo** | Manipulação dos objetos na `Main` através de listas de interfaces (`List<Manutenivel>`, `List<ConectavelIoT>`), permitindo chamar métodos específicos sem conhecer a classe concreta do objeto em tempo de compilação. |

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Função no Projeto |
| :--- | :--- |
| **Java** | Linguagem de programação principal do projeto. |
| **Orientação a Objetos** | Paradigma utilizado para a modelagem do sistema da fábrica MetalTech 4.0. |
| **Git & GitHub** | Versionamento do código-fonte e centralização da entrega acadêmica. |

---

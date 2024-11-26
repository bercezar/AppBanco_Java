# Sistema de Gerenciamento de Funcionários

## Objetivo

Desenvolver um sistema de gerenciamento de funcionários que permita cadastro, consulta, atualização e exclusão de dados. O sistema será implementado utilizando os conceitos de herança, interfaces, abstração, e persistência de dados com arquivos. A arquitetura adotada será o padrão MVC (Model-View-Controller), visando a organização e manutenção do código, com práticas de Clean Code.

## Descrição

A TechCorp precisa de um sistema para gerenciar seus funcionários, que incluem Desenvolvedores, Gerentes, Treinadores e Gerentes Desenvolvedores. Cada tipo de funcionário possui responsabilidades específicas, como:

- **Desenvolvedores**: Codificação e resolução de problemas técnicos.
- **Gerentes**: Organizam a equipe e conduzem reuniões.
- **Treinadores**: Ensinam novas tecnologias e motivam a equipe.
- **Gerentes Desenvolvedores**: Combinam responsabilidades de Gerente e Desenvolvedor.

## Estrutura do Projeto

O projeto segue o padrão MVC:

- **Model**: Define as entidades principais, como `Funcionario`, `Desenvolvedor`, `Gerente`, `Treinador` e `GerenteDesenvolvedor`.
- **View**: Interface com o usuário, para captura de dados e exibição das informações.
- **Controller**: Controla a interação entre o Model e a View, gerenciando operações como adicionar, listar, atualizar e remover funcionários.

## Requisitos

1. **Cadastro de Funcionários**: Possibilidade de cadastrar diferentes tipos de funcionários com atributos específicos.
2. **Armazenamento Temporário**: Utilização de `ArrayList` para armazenar dados durante a execução.
3. **Persistência em Arquivo**: Salvamento dos dados em um arquivo de texto, garantindo que os dados sejam recuperados ao reiniciar o sistema.
4. **Interfaces e Herança**: Uso de interfaces para responsabilidades específicas e uma classe abstrata para atributos comuns.
5. **Princípios de Clean Code**: Nomes significativos, métodos curtos, e código bem organizado, com tratamento de exceções e validação de entradas.

## Estrutura de Classes

### Classes e Interfaces

- **Funcionario (Abstrata)**: Representa os dados comuns de todos os funcionários (nome, salário), com métodos para manipulação desses dados.
- **Interfaces**: `Desenvolve`, `Gerencia`, `Treina`, para responsabilidades específicas.
- **Classes Concretas**:
  - `Desenvolvedor`: Implementa `Funcionario` e `Desenvolve`.
  - `Gerente`: Implementa `Funcionario` e `Gerencia`.
  - `Treinador`: Implementa `Funcionario` e `Treina`.
  - `GerenteDesenvolvedor`: Implementa `Funcionario`, `Gerencia`, e `Desenvolve`.

## Funcionalidades

- **Cadastrar Funcionários**: O sistema permite a inserção de dados específicos para cada tipo de funcionário.
- **Listar Funcionários**: Exibe a lista de funcionários com seus detalhes.
- **Atualizar Funcionário**: Modifica dados como nome e salário de um funcionário existente.
- **Excluir Funcionário**: Remove um funcionário da lista, tanto no `ArrayList` quanto no arquivo de persistência.
- **Recuperar Dados**: Ao iniciar o sistema, o arquivo de persistência é carregado para restaurar os dados.

## Estrutura de Dados no Arquivo

O arquivo de persistência armazena os dados de forma simples e estruturada:

- **Formato**: Cada linha representa um funcionário, com dados separados por ponto e vírgula.

## Operações com Arquivo

- **Escrita**: Ao adicionar, atualizar ou excluir funcionários, o arquivo de texto é modificado para refletir as mudanças.
- **Leitura**: Ao iniciar o sistema, os dados são lidos do arquivo e convertidos para objetos de funcionários.

## Instruções para Implementação

- **Pacotes**:
- `model`: Contém as classes do domínio (Funcionario, Desenvolvedor, Gerente, etc.).
- `view`: Lida com a interface do usuário.
- `controller`: Gerencia a lógica de negócio e a interação entre Model e View.

- **Exceções e Validação**: Tratar erros de entrada e falhas na leitura/escrita de arquivos.
- **Arquitetura MVC**: Organizar o código em pacotes que separem claramente a lógica de negócios, a interface e o controle de fluxo.

---

Este sistema de gerenciamento de funcionários foi desenvolvido para garantir a organização e persistência de dados, utilizando boas práticas de programação e padrões de arquitetura modernos.

# Teste Prático - Java Orientação a Objetos

Este projeto foi desenvolvido como parte de um teste prático para avaliar conhecimentos em Java e Orientação a Objetos. O objetivo era criar uma aplicação que gerenciasse funcionários de uma empresa, com diferentes cargos, salários e benefícios.

## Requisitos

Os requisitos do teste foram os seguintes:

- Implementar um método que receba uma lista de funcionários, mês e ano, e retorne o valor total pago (salário e benefício) a esses funcionários no mês.
- Implementar um método que receba uma lista de funcionários, mês e ano, e retorne o total pago somente em salários no mês.
- Implementar um método que receba uma lista somente com os funcionários que recebem benefícios, mês e ano, e retorne o total pago em benefícios no mês.
- Implementar um método que receba uma lista de funcionários, mês e ano, e retorne o funcionário que recebeu o valor mais alto no mês.
- Implementar um método que receba uma lista somente com os funcionários que recebem benefícios, mês e ano, e retorne o nome do funcionário que recebeu o valor mais alto em benefícios no mês.
- Implementar um método que receba uma lista de vendedores, mês e ano, e retorne o vendedor que mais vendeu no mês.

## Implementação

O projeto foi desenvolvido em Java, seguindo os princípios da Orientação a Objetos. Foram criadas as seguintes classes:

- **Usuario**: Classe abstrata que representa um funcionário genérico, com atributos como nome, mês e ano de admissão, e métodos abstratos para calcular salário e benefício.
- **Gerente**, **Secretario** e **Vendedor**: Classes concretas que estendem a classe Usuario, implementando os cálculos de salário e benefício de acordo com as regras específicas de cada cargo.
- **EmpresaService**: Classe que contém os métodos solicitados nos requisitos, responsável por realizar os cálculos sobre os funcionários.
- **EmpresaController**: Classe que serve como intermediária entre a camada de serviço e a camada de visualização, encapsulando a lógica de negócio.
- **EmpresaView**: Classe responsável por exibir o menu de opções e interagir com o usuário.
- **Main**: Classe principal que instancia os objetos necessários e inicia a aplicação.

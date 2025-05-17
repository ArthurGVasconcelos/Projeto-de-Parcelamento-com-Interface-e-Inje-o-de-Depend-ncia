# 📄 Contract Installment Generator

Este projeto Java implementa um sistema de geração de parcelas para contratos, aplicando regras de juros e taxa de serviço com base em um modelo orientado a objetos. O projeto foi desenvolvido como exercício prático de **Programação Orientada a Objetos (POO)**, com foco em **interfaces, injeção de dependência** e **boas práticas de design**.

## 🚀 Funcionalidades

- Leitura dos dados de um contrato: número, data e valor total.
- Geração de parcelas mensais com:
  - Cálculo de juros (1% ao mês)
  - Cálculo de taxa de pagamento (2% sobre o valor com juros)
  - Vencimento a cada mês, a partir da data do contrato
- Exibição das parcelas com data formatada e valor final.

## 💡 Conceitos Aplicados

- **Programação orientada a interfaces** (`OnlinePaymentService`)
- **Injeção de dependência** (`ContractService`)
- **Encapsulamento e boas práticas de modelagem de domínio**
- **Formatação de datas e valores monetários**
- **Polimorfismo** (uso da interface com implementação concreta `PayPalService`)

## 🛠️ Tecnologias Utilizadas

- Java 17+
- API `java.time` para manipulação de datas
- `ArrayList`, `Scanner`, `Locale`, `String.format`

## 📚 Aprendizados

Este projeto reforça os fundamentos da orientação a objetos em Java, além de mostrar a importância de:
- Separar responsabilidades por classe
- Programar com foco em extensibilidade e manutenção
- Simular regras reais de negócio com flexibilidade

## 🤝 Contribuição

Este projeto faz parte do meu processo de aprendizado e domínio de Java. Feedbacks são bem-vindos!

---

> Desenvolvido por Arthur Vasconcelos ☕🚗💻

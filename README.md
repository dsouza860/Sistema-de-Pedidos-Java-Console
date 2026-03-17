# 🛒 Sistema de Pedidos - Java Console

![Java](https://img.shields.io/badge/Java-8+-blue)
![Status](https://img.shields.io/badge/status-concluído-brightgreen)
![POO](https://img.shields.io/badge/POO-aplicado-orange)

Sistema de pedidos desenvolvido em Java com foco em boas práticas de Programação Orientada a Objetos (POO), incluindo encapsulamento, polimorfismo e separação de responsabilidades.

---

## 🚀 Status do Projeto

✅ Concluído
🔧 Em evolução

---

## 📌 Funcionalidades

* Criar pedido
* Adicionar produtos ao pedido
* Visualizar pedido
* Calcular total automaticamente
* Finalizar pedido com múltiplas formas de pagamento:

  * PIX
  * Cartão
  * Boleto

---

## 🧠 Conceitos aplicados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Polimorfismo (Strategy Pattern)
* Collections (`ArrayList`)
* Separação em camadas (Model, Service, Main)

---

## 🛠 Tecnologias

* Java 8+
* IntelliJ IDEA / Eclipse
* Aplicação via terminal (console)

---

## ▶️ Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/dsouza860/Sistema-de-Pedidos-Java-Console.git
```

### 2. Acesse a pasta do projeto

```bash
cd Sistema-de-Pedidos-Java-Console
```

### 3. Compile o projeto

```bash
javac br/com/sistemapedidos/main/Principal.java
```

### 4. Execute a aplicação

```bash
java br.com.sistemapedidos.main.Principal
```

---

## 💻 Exemplo de uso

```
Sistema de Pedidos

1 - Criar Pedido
2 - Adicionar Produto ao Pedido
3 - Ver Pedido
4 - Finalizar Pedido
5 - Sair

=>: 1
Informe o nome do Cliente: Diego

=>: 2
Produto: Mouse
Preço: 50.00

=>: 3
Cliente: Diego
Mouse - R$ 50.00
Total: R$ 50.00
```

---

## 📁 Estrutura do Projeto

```
br.com.sistemapedidos
│
├── model
│   ├── Pedido.java
│   └── Produto.java
│
├── service
│   └── PedidoService.java
│
├── pagamento
│   ├── Pagamento.java
│   ├── PIX.java
│   ├── Cartao.java
│   └── Boleto.java
│
└── main
    └── Principal.java
```

---

## 💡 Diferenciais do projeto

* Aplicação prática de **polimorfismo com Strategy Pattern**
* Separação clara de responsabilidades
* Código organizado e de fácil manutenção
* Simulação de fluxo real de pedidos e pagamentos

---

## 📈 Melhorias futuras

* Implementar múltiplos pedidos simultâneos
* Adicionar identificação por ID
* Criar histórico de pedidos
* Persistência de dados (arquivo ou banco de dados)
* Transformar em API REST com Spring Boot
* Criar interface gráfica (JavaFX ou Web)

---

## 👨‍💻 Autor

Desenvolvido por **Diego Souza** 🚀

🔗 LinkedIn: https://linkedin.com/in/diego-bu-souza

---

## 📄 Licença

Este projeto está sob a licença MIT.
Sinta-se livre para estudar, modificar e utilizar como base para outros projetos.

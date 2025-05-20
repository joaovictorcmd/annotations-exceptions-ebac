# Annotations e Reflections — EBAC Full Stack Java

## Descrição

Este projeto foi desenvolvido como parte da avaliação dos capítulos sobre **Annotations e Reflections** do curso Formação Desenvolvedor Full Stack Java da EBAC. O objetivo é demonstrar a criação e uso de uma annotation customizada `@Table`, que mapeia uma classe Java a uma tabela fictícia de banco de dados, e a utilização de reflection para acessar essa informação em tempo de execução.

## Funcionalidades

- Definição da annotation `@Table` com o atributo `name`.
- Aplicação da annotation em uma classe modelo (`User`).
- Uso de reflection para verificar se a classe possui a annotation e recuperar o nome da tabela.
- Exibição do nome da tabela associada a cada instância da classe.

## Como executar

1. Compile o projeto usando seu IDE favorito ou via linha de comando.
2. Execute a classe `Main`.
3. Observe a saída no console mostrando o nome da tabela associada a cada usuário.

## Exemplo de saída
```
Tabela onde MARIAH está: tb_user
Tabela onde ALEX está: tb_user
```

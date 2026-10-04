# Resolução exercício Beecrowd1071

## Descrição do projeto
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

## Como Funciona
1. O usuário insere dois números inteiros, armazenados em `numero1` e `numero2`.
2. Uma estrutura condicional (`if/else`) compara os dois números para determinar e separar qual é o `numeromaior` e qual é o `numeromenor`.
3. Uma estrutura de repetição `for` percorre o intervalo estrito entre os números, começando em `numeromenor + 1` até o limite inferior a `numeromaior`.
4. Dentro do laço, uma condicional `if (i % 2 != 0)` verifica se o número atual é ímpar. Caso seja, o valor é acumulado na variável `soma`.
5. O programa imprime o total acumulado da soma no console.
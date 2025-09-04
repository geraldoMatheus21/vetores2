# 📌 Exercício de Vetores em Java

Este projeto implementa várias operações com **vetores (`int[]`) em Java**, incluindo criação, preenchimento com números aleatórios, cálculo de somatório, média, obtenção de elementos e substituição de valores.

---

## 🚀 Funcionalidades

O programa executa as seguintes operações:

1. **Criação de vetor** com tamanho informado pelo usuário.  
2. **Preenchimento automático** do vetor com números aleatórios de `0 a 9`.  
3. **Impressão do vetor** na tela.  
4. **Cálculo do somatório** de todos os elementos.  
5. **Cálculo da média** dos elementos.  
6. **Obtenção de um elemento específico** informando sua posição.  
7. **Inserção de um número** em uma posição (nesse caso, posição `0` do vetor).  
8. **Substituição de todos os números ímpares por `0`**.  
9. **Identificação do maior e menor elemento** do vetor.  
10. **Impressão final do vetor** após as alterações.

---

## 📂 Estrutura do Código

### Métodos principais:

- `criaVetor(int tam)` → Cria um vetor vazio com o tamanho desejado.  
- `addNum()` → Preenche o vetor com números aleatórios de 0 a 9.  
- `somatorio()` → Retorna a soma de todos os elementos.  
- `media()` → Calcula a média dos elementos.  
- `obtemElementoVetor(int pos)` → Retorna o elemento da posição informada.  
- `insereElementoVetor(int num)` → Insere um número na **posição 0** do vetor.  
- `substituirImpares()` → Substitui todos os números ímpares por 0.  
- `maiorElementoVetor()` → Retorna o maior número do vetor.  
- `menorElementoVetor()` → Retorna o menor número do vetor.  
- `imprime()` → Retorna o vetor para exibição.  

---

## 🖥️ Exemplo de Execução

```
Digite o tamanho do vetor: 
5
Vetor: [7, 3, 9, 1, 4]
Somatório: 24
Média do vetor: 4.8
Digite a posição do vetor desejado: 
2
Elemento desejado: 9
Adicione um número ao vetor (posição 0 será sobrescrita): 
99
Valor inserido: 99
Vetor sem os números ímpares: [99, 0, 0, 0, 4]
Maior número do vetor: 99
Menor número do vetor: 0
Vetor Final: [99, 0, 0, 0, 4]
```

---

## 🛠️ Tecnologias utilizadas
- **Java JDK 17+**
- **IDE**: Eclipse, IntelliJ ou VS Code
- **Bibliotecas padrão**: `java.util.Scanner`, `java.util.Random`, `java.util.Arrays`

---

## 📌 Possíveis melhorias
- Permitir que o usuário escolha **a posição onde inserir um número** (atualmente fixa em `0`).  
- Permitir definir o **intervalo de números aleatórios** (ex: de 50 até 100).  
- Implementar remoção de elementos e ordenação do vetor.  

---

📖 **Autor:** Exercício prático desenvolvido em **Java** para treinar manipulação de vetores e uso de métodos estáticos.  

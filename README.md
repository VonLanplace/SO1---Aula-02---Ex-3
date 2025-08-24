<p align="center">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="Java Icon" height="40" width="40">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/eclipse/eclipse-original.svg" alt="Eclipse Icon" height="40" width="40">
</p>

# Sistemas Operacionais 1 - Aula 2 - Ex 3

## 🗓️ Aula 2

## 💻 Exercício 3

**Exclusivo Linux**: No universo do Sistema operacional Linux existem diversas distribuições.
Os comandos Java System.getProperty(“os.name”) e System.getProperty(“os.version”) trazem dados sobre o Kernel Linux, mas não sobre a distribuição.

Criar em Eclipse, um novo Java Project com uma classe chamada DistroController.java no package controller e uma classe Main.java no package view.

### A classe DistroController.java deve ter 2 métodos:
1) O primeiro, chamado os, que identifica e retorna o nome do Sistema Operacional (Fazê-lo privado)
2) O segundo, chamado exibeDistro, que verifica o SO e, se for Linux, selecione o comando para exibir as propriedades da distribuição. Deve-se exibir o nome e a versão da distribuição.
3) Caso o SO não seja Linux, exibir uma mensagem comunicando.

A classe Main.java deve ter um chamado para a exibição das informações
### Dica:
O comando para exibir as propriedades de uma distribuição Linux é: ```cat /etc/os-release```
---

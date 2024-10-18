# Jogo de Batalha de Castelos

### Objetivo:
Destruir os castelos inimigos até que reste apenas o seu!

### Como jogar:
Chegado a sua vez, escolha um castelo inimigo para atacar e sorteie um número que pode variar de 0 a 10 onde o zero passa a vez. O número sorteado será abatido dos guerreiros inimigos. Caso o ataque deixe o castelo alvo com a quantidade de guerreiros abaixo de zero, o castelo alvo perderá 1 de defesa e retornará a ter seus guerreiros por completo (diminuindo o restante do número sorteado).

- Exemplo: quantidade padrão de gerreiros do castelo japones = 10, quantidade de guerreiros atual = 2, número sorteado = 7. O castelo japones vai perder 1 de defesa e ficará com 5 guerreiros. 

Caso o castelo perca toda sua defesa, o próximo ataque que sofrer que atingir a defesa, será reduzido 1 de sua vida, retornando sua defesa para o valor padrão e seus guerreiros. O castelo será destruido quando o ultimo ataque deixar o castelo com a quantidade de guerreiros negativa e não haja mais defesa nem vida para retirar. O castelo destruido é retirado do jogo. Quando restar apenas um castelo será consagrado vencedor.

#

### Desenvolvido por:
- Rogelio Soares Reis Filho

#### Trabalho academico da disciplina de LPOO (Linguagem de Programação Orientada a Objeto)

#

###  Informações

- Jogo desenvolvido para jogar no console

- Linguagem JAVA

- Modo aleatório (Apenas para testes)

- Modo Multiplayer Local (Em Breve)

#

#### Como rodar:

Para rodar o jogo é necessario importar para uma IDE que suporte Java (Ex: Eclipse) a pasta "jogo_castelos" que contem todas as classes necessarias para rodar o jogo. Depois disso basta rodar a classe "JogoMain". Obs: é necessario que todas as classes estejam dentro da pasta "jogo_castelos" para rodar.

Por padrão de teste deixei tudo de forma automatica onde serve apenas para vizualização dos resultados. São criados 4 castelos: 2 Europeus e 2 Japoneses com suas devidas caracteristicas.

#

# OBS: Jogo em teste! Sem função de jogar.

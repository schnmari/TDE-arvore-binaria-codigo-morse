# Árvore Binária com Código Morse

## Sobre:

O sistema implementa uma árvore binária para representar caracteres utilizando o código Morse.

Cada caractere é armazenado em um nó da árvore de acordo com sua representação em código Morse. Os pontos (`.`) direcionam para o filho esquerdo e os traços (`-`) direcionam para o filho direito.

O sistema permite inserir os caracteres na árvore, buscar caracteres a partir de códigos Morse, exibir a estrutura hierárquica da árvore e receber uma mensagem em código Morse como entrada do usuário para realizar sua tradução.

## Classes

### Node

A classe `Node` representa um nó da árvore, um nó possui:

- `conteudo`: caractere armazenado no nó;
- `filhoEsquerdo`: referência para o filho esquerdo;
- `filhoDireito`: referência para o filho direito.

Seuindo boas praticas de encapsulamento classe também possui getters e setters para acessar e modificar seus atributos.

### Arvore

A classe `Arvore` representa a árvore binária de código Morse. Possui como atributo a raiz da árvore e tambémm os seguintes métodos principais:

- `inicializar()`: cria a raiz da árvore;
- `adicionar()`: percorre a árvore de acordo com o código Morse, utilizando pontos para a esquerda e traços para a direita, e adiciona o caractere ao nó correspondente;
- `buscar()`: percorre a árvore utilizando o código Morse informado e retorna o caractere correspondente. Também permite realizar a tradução de uma mensagem contendo vários códigos Morse separados por espaços;
- `exibirArvore()`: exibe a árvore de forma hierárquica.

### Main

A classe `Main` é responsável pela execução do sistema.

O fluxo principal é:

1. Criar e inicializar a árvore;
2. Adicionar as letras do alfabeto e os números de 0 a 9;
3. Exibir a árvore;
4. Solicitar ao usuário um código ou mensagem em código Morse;
5. Buscar e exibir a tradução correspondente.

**Integrantes**
Josue Aurélio Nonalaya Vilca
Heitor Roberto Gonçalves
Mariana Schneider Sobrinho
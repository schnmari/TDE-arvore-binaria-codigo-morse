public class Arvore {

    private Node noRaiz;

    public Arvore(){
    }

    public void inicializar(){
        this.noRaiz = new Node();
    }
    public void adicionar(String morse, String conteudo){

        Node noAtual = noRaiz;

        for (char simbolo : morse.toCharArray()) {
            if (simbolo == '.') {
                if (noAtual.getFilhoEsquerdo() == null){
                    noAtual.setFilhoEsquerdo(new Node());
                }
                noAtual = noAtual.getFilhoEsquerdo();

            }
            if (simbolo == '-') {
                if (noAtual.getFilhoDireito() == null){
                    noAtual.setFilhoDireito(new Node());
                }
                noAtual = noAtual.getFilhoDireito();

            }
        }
        noAtual.setConteudo(conteudo);
    }
    public String buscar(String morse){
        Node noAtual = noRaiz;

        String palavra = "";

        for (char simbolo : morse.toCharArray()) {
            if (simbolo == '.') {
                noAtual = noAtual.getFilhoEsquerdo();

            }else if (simbolo == '-') {
                noAtual = noAtual.getFilhoDireito();

            }else if (simbolo == ' ') {
                palavra = palavra + noAtual.getConteudo();
                noAtual = noRaiz;
            }else if(noAtual == null){  // Se o nó é null vai retornar null ao invés de nullpointer
                return null;
            }
        }
        return palavra + noAtual.getConteudo();
    }

    //Obs: Não consegui fazer a árvore na horizontal
    //Utilizei a busca Pre Ordem
    public void exibirArvore() {
        System.out.println("*");   //Raiz como * porque não tem letra
        exibir(noRaiz, "");
    }

    //Deixei o exibir como private porque só o exibirArvore vai usar ele
    private void exibir(Node no, String recuo) { //Recuo espaça os níveis da árvore
        Node esquerda = no.getFilhoEsquerdo();
        Node direita = no.getFilhoDireito();

        if (esquerda != null) {
            System.out.println(recuo + "--- " + esquerda.getConteudo()); //Coloca o recuo, um "galho" e a letra

            if (direita != null) {
                exibir(esquerda, recuo + "|   ");
                // Se o esquerdo tem um irmão direito embaixo, os filhos dele recebem a | pra ligar no irmão, se não tem, recebem só espaços
            } else {
                exibir(esquerda, recuo + "    ");
            }
        }

        if (direita != null) {
            System.out.println(recuo + "--- " + direita.getConteudo());
            exibir(direita, recuo + "    ");       // é o último filho: sem barra
        }

        //os dois ifs acima são recursivos(chama o próprio metodo)
        // cada um imprime o filho e chama exibir() para os filhos dele
        // EX: Imprime esq, esq, esq ... e quando não tem mais ele volta (cada nível) e faz dir


        //necessário fazer um tratamento para aparecer "null" em letras que não existem ao invés de espaços vazios
    }

}

/*
//    // METODOS GERAIS - tentando criar toda a arvore automaticamente
//    public void criarArvoreAlfabeto(){
//        String[] lista= {"A","B","C","D","E","F","G","H","I","J",
//                "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
//                "0","1","2","3","4","5","6","7","8","9"};
//
//        for (String letra: lista){
//            //noRaiz.adicionar(letra);
//        }
//    }

 */
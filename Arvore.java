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

    //Utilizado percurso Pre Order
    public void exibirArvore() {
        System.out.println("*");   //Raiz como * porque não tem letra
        exibir(noRaiz, "");
    }

    //Utilizado private por ser utilizado apenas por exibirArvore
    private void exibir(Node no, String recuo) { //Recuo espaça os níveis da árvore
        Node esquerda = no.getFilhoEsquerdo();
        Node direita = no.getFilhoDireito();

        if (esquerda != null) {
            String letraEsq = esquerda.getConteudo();
            if (letraEsq.equals("")) {
                letraEsq = "null";
            }
            System.out.println(recuo + "--- " + letraEsq); //Coloca o recuo, um branch e a letra

            if (direita != null) {
                exibir(esquerda, recuo + "|   ");
                // Se irmão direito, usa |
            } else {
                exibir(esquerda, recuo + "    ");
                //Se não tem irmão direito, usa espaço
            }
        }

        if (direita != null) {
            String letraDir = direita.getConteudo();
            if (letraDir.equals("")) {
                letraDir = "null";
            }
            System.out.println(recuo + "--- " + letraDir);
            exibir(direita, recuo + "    ");       // é o último filho: sem barra
        }

        // Imprime o filho e chama imprimir pros filhos
        // EX: esq, esq, esq ..., quando acaba volta e faz dir

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
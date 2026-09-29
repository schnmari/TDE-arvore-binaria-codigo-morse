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
            }
        }
        return palavra + noAtual.getConteudo();
    }
}


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
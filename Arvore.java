public class Arvore {

    private Node noRaiz;

    //Metodo inicializar
    public void inicializar(){
        this.noRaiz = new Node();
    }

    //Metodo adicionar uma letra de cada vez
    public void adicionar(String morse, String conteudo){

        Node noAtual = noRaiz;

        for (char simbolo : morse.toCharArray()) {
            if (simbolo == '.') {
                if (noAtual.filhoEsquerdo == null){
                    noAtual.filhoEsquerdo = new Node();
                    noAtual = noAtual.filhoEsquerdo;
                }
            }
            if (simbolo == '-') {
                if (noAtual.filhoDireito == null){
                    noAtual.filhoDireito = new Node();
                    noAtual = noAtual.filhoDireito;
                    noAtual.conteudo = conteudo;
                }
            }
        }
    }

    //Metodo buscar
    public String buscar(String morse){
        Node noAtual = noRaiz;

        for (char simbolo : morse.toCharArray()) {
            if (simbolo == '.') {
                noAtual = noAtual.filhoEsquerdo;

            }else if (simbolo == '-') {
                noAtual = noAtual.filhoDireito;
            }
            if (noAtual == null){
                return null;
            }
        }
        return noAtual.conteudo;
    }
}



//    // METODOS GERAIS - tentando criar toda a arvore automaticamente
//    public void criarArvoreBinaria(){
//        String[] lista= {"A","B","C","D","E","F","G","H","I","J",
//                "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
//                "0","1","2","3","4","5","6","7","8","9"};
//
//        for (String letra : lista){
//            //noRaiz.adicionar(letra);
//        }
//    }
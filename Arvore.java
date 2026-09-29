public class Arvore {

    public Node noRaiz;

    //Metodo inicializar
    public void inicializar(){
        this.noRaiz = new Node();
    }

    //metodo adicionar uma letra de cada vez
    public void adicionar(String morse, String conteudo){

        Node noAtual = noRaiz;

        for (char simbolo : morse.toCharArray()) {
            if (simbolo == '.') {
                if (noAtual.filhoEsquerdo == null){
                    noAtual.filhoEsquerdo = new Node();
                }
                noAtual = noAtual.filhoEsquerdo;

            }
            if (simbolo == '-') {
                if (noAtual.filhoDireito == null){
                    noAtual.filhoDireito = new Node();
                }
                noAtual = noAtual.filhoDireito;

            }if (simbolo == ' ') {
                return;
            }
        }
        noAtual.conteudo = conteudo;
    }

    //Metodo buscar
    public String buscar(String morse){
        Node noAtual = noRaiz;

        String palavra = "";

        for (char simbolo : morse.toCharArray()) {
            if (simbolo == '.') {
                noAtual = noAtual.filhoEsquerdo;

            }else if (simbolo == '-') {
                noAtual = noAtual.filhoDireito;

            }else if (simbolo == ' ') {
                palavra = palavra + noAtual.conteudo;
                noAtual = noRaiz;
            }
        }
        return palavra + noAtual.conteudo;
    }
}



//    // METODOS GERAIS - tentando criar toda a arvore automaticamente
//    public void criarArvoreBinaria(){
//        String[] lista= {"A","B","C","D","E","F","G","H","I","J",
//                "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
//                "0","1","2","3","4","5","6","7","8","9"};
//
//        for (String letra: lista){
//            //noRaiz.adicionar(letra);
//        }
//    }
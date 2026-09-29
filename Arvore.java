public class Arvore {

    private Node noRaiz;

    //o construtor funciona como
    public Arvore(){
    }

    public void setNoRaiz(Node noRaiz) {
        this.noRaiz = noRaiz;
    }
    public Node getNoRaiz() {
        return noRaiz;
    }



    // METODOS GERAIS - tentando criar toda a arvore automatica
    public void criarArvoreBinaria(){
        String[] lista= {"A","B","C","D","E","F","G","H","I","J",
                "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "0","1","2","3","4","5","6","7","8","9"};

        for (String letra : lista){
            //adicionar(letra);
        }
    }

    //Metodo inicializar
    public void inicializar(){
        this.noRaiz = new Node();
    }

    //Metodo adicionar ua de cada vez
    public void adicionar(String lado, String conteudo){

    }


    //Metodo remover


    //Metodo buscar

}

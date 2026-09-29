public class Node {

    private String conteudo = "";
    private Node filhoEsquerdo;
    private Node filhoDireito;

    public Node(){
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Node getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(Node filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public Node getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(Node filhoDireito) {
        this.filhoDireito = filhoDireito;
    }

}

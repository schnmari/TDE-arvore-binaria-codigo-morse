public class Node {
    //ATRIBUTOS
    private String conteudo;
    private String filhoEsquerdo;
    private String filhoDireito;

    //CONSTRUTOR
    public Node(){
    }


    //Getters' and Setter's
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getPai() {
        return pai;
    }
    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getFilhoEsquerdo() {
        return filhoEsquerdo;
    }
    public void setFilhoEsquerdo(String filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public String getFilhoDireito() {
        return filhoDireito;
    }
    public void setFilhoDireito(String filhoDireito) {
        this.filhoDireito = filhoDireito;
    }



}

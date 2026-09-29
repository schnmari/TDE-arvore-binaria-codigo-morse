
class Main{
    public static void main (String[] args){

        Arvore arvoreMorse = new Arvore();
        arvoreMorse.inicializar();

        //A
        arvoreMorse.adicionar(".-", "A");
        //B
        arvoreMorse.adicionar("-..", "B");
        //C
        arvoreMorse.adicionar("-.-.", "C");
        //D
        arvoreMorse.adicionar("-..", "D");
        //E
        arvoreMorse.adicionar(".", "E");
        //F
        arvoreMorse.adicionar("..-.", "F");
        //G
        arvoreMorse.adicionar("--.", "G");
        //H
        arvoreMorse.adicionar("....", "H");
        //I
        arvoreMorse.adicionar("..", "I");
        //J
        arvoreMorse.adicionar(".---", "J");
        //K
        arvoreMorse.adicionar("-.-", "K");
        //L
        arvoreMorse.adicionar(".-..", "L");
        //M
        arvoreMorse.adicionar("--", "M");
        //N
        arvoreMorse.adicionar("-.", "N");
        //O
        arvoreMorse.adicionar("---", "O");
        //P
        arvoreMorse.adicionar(".--.", "P");
        //Q
        arvoreMorse.adicionar("--.-", "Q");
        //R
        arvoreMorse.adicionar(".-.", "R");
        //S
        arvoreMorse.adicionar("...", "S");
        //T
        arvoreMorse.adicionar("-", "T");
        //U
        arvoreMorse.adicionar("..-", "U");
        //V
        arvoreMorse.adicionar("...-", "V");
        //W
        arvoreMorse.adicionar(".--", "W");
        //X
        arvoreMorse.adicionar("-..-", "X");
        //Y
        arvoreMorse.adicionar("-.--", "Y");
        //Z
        arvoreMorse.adicionar("--..", "Z");
        //1
        arvoreMorse.adicionar(".----", "1");
        //2
        arvoreMorse.adicionar("..---", "2");
        //3
        arvoreMorse.adicionar("...--", "3");
        //4
        arvoreMorse.adicionar("....-", "4");
        //5
        arvoreMorse.adicionar(".....", "5");
        //6
        arvoreMorse.adicionar("-....", "6");
        //7
        arvoreMorse.adicionar("--...", "7");
        //8
        arvoreMorse.adicionar("---..", "8");
        //9
        arvoreMorse.adicionar("----.", "9");
        //0
        arvoreMorse.adicionar("-----", "0");


        System.out.println(arvoreMorse.buscar("..."));         // Saída: 'S';
        System.out.println(arvoreMorse.buscar("---"));         // Saída: 'O';
        System.out.println(arvoreMorse.buscar("... --- ...")); // Saída: 'SOS';

        System.out.println(arvoreMorse.buscar("-.-. --- -. ... . --. ..- ..")); // Saída: 'SOS';
    }
}
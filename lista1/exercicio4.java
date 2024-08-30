
package exercicios;


public class exercicio4 {
    String frase = "Esta é uma frase de exemplo para exercício";
    String maiuscula;
    String minuscula;
    int tamanho;
    String substring;

    public exercicio4() {
    maiuscula = frase.toUpperCase();
    minuscula = frase.toLowerCase();
    tamanho = frase.length();
    substring = frase.substring(11,27);
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getMaiuscula() {
        return maiuscula;
    }

    public void setMaiuscula(String maiuscula) {
        this.maiuscula = maiuscula;
    }

    public String getMinuscula() {
        return minuscula;
    }

    public void setMinuscula(String minuscula) {
        this.minuscula = minuscula;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getSubstring() {
        return substring;
    }

    public void setSubstring(String substring) {
        this.substring = substring;
    }
    
    
}
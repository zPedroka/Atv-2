public class Refrigerante {
    private String nome;
    private int ml;
    private float preço;
    private String tipo;

    public Refrigerante(String nome, int ml, float preço, String tipo){
        this.setNome(nome);
        this.setMl(ml);
        this.setPreço(preço);
        this.setTipo(tipo);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public float getPreço() {
        return preço;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

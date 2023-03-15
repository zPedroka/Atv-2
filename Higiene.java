public class Higiene {
    private String nome;
    private String marca;
    private String tipo;
    private float preço;

    public Higiene (String nome, String marca, String tipo, float preço){
        this.setMarca(marca);
        this.setNome(nome);
        this.setPreço(preço);
        this.setTipo(tipo);
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public float getPreço() {
        return preço;
    }

    public void setMarca(String marca) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

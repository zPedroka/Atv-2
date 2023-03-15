public class Fitness {
    private String nome;
    private String marca;
    private float preço;

    public Fitness (String nome, String marca, float preço){
        this.setMarca(marca);
        this.setNome(nome);
        this.setPreço(preço);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public float getPreço() {
        return preço;
    }
}

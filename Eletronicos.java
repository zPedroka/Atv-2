public class Eletronicos {
    private String nome;
    private String modelo;
    private String marca;
    private float preço;

        public Eletronicos (String nome,String modelo,String marca, float preço){
            this.setMarca(marca);
            this.setModelo(modelo);
            this.setNome(nome);
            this.setPreço(preço);
        }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public float getPreço() {
        return preço;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

}

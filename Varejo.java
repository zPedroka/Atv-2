public class Varejo {
    private String nome;
    private int mlNicotina;
    private String marca;
    private String sabor;
    private int puffs;

    public Varejo (String nome, int mlNicotina, String marca, String sabor, int puffs){
        this.setNome(nome);
        this.setMarca(marca);
        this.setPuffs(puffs);
        this.setMlNicotina(mlNicotina);
        this.setPuffs(puffs);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMlNicotina(int mlNicotina) {
        this.mlNicotina = mlNicotina;
    }

    public int getMlNicotina() {
        return mlNicotina;
    }

    public void setPuffs(int puffs) {
        this.puffs = puffs;
    }

    public int getPuffs() {
        return puffs;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }
}

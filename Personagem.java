public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int HPMAX;
    protected int HP;
    protected int forca;

    public Personagem(String nome, int nivel, int HP, int forca) {
        this.nome = nome;
        this.nivel = nivel;
        this.HPMAX = HP;
        this.HP = HP;
        this.forca = forca;
    }

    public abstract void atacar(Personagem p);

    public abstract void receberDano(int dano);

    public void mostrarDetalhes() {
        String classe = this.getClass().getName();
        System.out.println("Nome: " + this.nome);
        System.out.println("\t- Classe: " + classe);
        System.out.println("\t- Nível: " + this.nivel);
        System.out.println("\t- Força: " + this.forca);
        System.out.println("\t- Pontos de Vida: " + this.HP + "/" + this.HPMAX);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getHPMAX() {
        return HPMAX;
    }

    public void setHPMAX(int HPMAX) {
        this.HPMAX = HPMAX;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}

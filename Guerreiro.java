public class Guerreiro extends Personagem {

    protected int escudo;
    protected int escudoMax;
    protected int habilidadeCombate;


    public Guerreiro(String nome, int nivel, int HP, int forca, int escudo, int habilidadeCombate) {
        super(nome, nivel, HP, forca);
        this.escudoMax = escudo;
        this.escudo = escudo;
        this.habilidadeCombate = habilidadeCombate;
    }


    @Override
    public void atacar(Personagem p) {
        p.receberDano(this.forca * this.habilidadeCombate);
    }

    @Override
    public void receberDano(int dano) {
        int danoNoEscudo = Math.min(dano, this.escudo);
        if (this.escudo > 0) {
            this.escudo -= danoNoEscudo;
            dano -= danoNoEscudo;
        }
        this.HP -= dano;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("\t- Escudo: " + this.escudo + "/" + this.escudoMax);
        System.out.println("\t- Habilidade de Combate: " + this.habilidadeCombate);
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getEscudoMax() {
        return escudoMax;
    }

    public void setEscudoMax(int escudoMax) {
        this.escudoMax = escudoMax;
    }

    public int getHabilidadeCombate() {
        return habilidadeCombate;
    }

    public void setHabilidadeCombate(int habilidadeCombate) {
        this.habilidadeCombate = habilidadeCombate;
    }
}

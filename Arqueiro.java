public class Arqueiro extends Personagem {

    protected int destreza;
    protected int habilidadeDeArco;


    public Arqueiro(String nome, int nivel, int HP, int forca, int destreza, int habilidadeDeArco) {
        super(nome, nivel, HP, forca);
        this.destreza = destreza;
        this.habilidadeDeArco = habilidadeDeArco;
    }


    @Override
    public void atacar(Personagem p) {
        p.receberDano(this.forca * this.habilidadeDeArco * this.destreza);
    }

    @Override
    public void receberDano(int dano) {
        this.HP -= dano;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("\t- Destreza: " + this.destreza);
        System.out.println("\t- Habilidade de Arco: " + this.habilidadeDeArco);
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getHabilidadeDeArco() {
        return habilidadeDeArco;
    }

    public void setHabilidadeDeArco(int habilidadeDeArco) {
        this.habilidadeDeArco = habilidadeDeArco;
    }
}

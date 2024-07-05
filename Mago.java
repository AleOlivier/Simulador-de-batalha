import java.util.Random;
public class Mago extends Personagem {

    protected int esquiva;
    protected int habilidadeMagica;


    public Mago(String nome, int nivel, int HP, int forca, int esquiva, int habilidadeMagica) {
        super(nome, nivel, HP, forca);
        this.esquiva = esquiva;
        this.habilidadeMagica = habilidadeMagica;
    }


    @Override
    public void atacar(Personagem p) {
        p.receberDano(this.forca * this.habilidadeMagica);
    }

    @Override
    public void receberDano(int dano) {
        Random rand = new Random();
        int aux = rand.nextInt(100) + 1;
        if (aux > this.esquiva) {
            this.HP -= dano;
        }else{
            System.out.println("O mago " + super.nome + " desviou!");
        }
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("\t- Esquiva: " + this.esquiva + "%");
        System.out.println("\t- Habilidade Magica: " + this.habilidadeMagica);
    }

    public int getEsquiva() {
        return esquiva;
    }

    public void setEsquiva(int esquiva) {
        this.esquiva = esquiva;
    }

    public int getHabilidadeMagica() {
        return habilidadeMagica;
    }

    public void setHabilidadeMagica(int habilidadeMagica) {
        this.habilidadeMagica = habilidadeMagica;
    }
}

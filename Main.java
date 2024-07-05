import java.util.Random;

public class Main{
    public static void main(String[] args) {

        Mago m1 = new Mago("Rodrigo", 1, 100, 5, 60, 5);
        Mago m2 = new Mago("Rogerio", 1, 100, 7, 50, 5);
        Mago m3 = new Mago("Roberto", 1, 100, 8, 40, 5);
        Arqueiro a1 = new Arqueiro("Jose", 1, 80, 3, 5, 8);
        Arqueiro a2 = new Arqueiro("Jorge", 1, 80, 3, 5, 8);
        Arqueiro a3 = new Arqueiro("Josue", 1, 80, 3, 5, 8);
        Guerreiro g1 = new Guerreiro("Lucas", 1, 100, 9, 5, 5);
        Guerreiro g2 = new Guerreiro("Luis", 1, 100, 6, 8, 7);
        Guerreiro g3 = new Guerreiro("Luan", 1, 100, 8, 7, 2);

        combate(m1, g1);
        combate(m2, g1);
        combate(m3, a1);
        combate(m1, m3);
        combate(g3, a2);
        combate(g2, m1);
        combate(g1, a3);
    }

    public static void combate(Personagem p1, Personagem p2) {
        if (p1.getHP() > 0 && p2.getHP() > 0) {
            String classe = p1.getClass().getName();
            String classe2 = p2.getClass().getName();

            if (p1.getNivel() > p2.getNivel()) {
                System.out.println("o " + classe + " " + p1.getNome() + " atacou o " + classe2 + " " + p2.getNome());
                p1.atacar(p2);
                p1.setNivel(p1.getNivel() + 1);
            } else if (p1.getNivel() == p2.getNivel()) {
                Random rand = new Random();
                int atacante = rand.nextInt(2);
                if (atacante == 0) {
                    System.out.println("o " + classe + " " + p1.getNome() + " atacou o " + classe2 + " " + p2.getNome());
                    p1.atacar(p2);
                    p1.setNivel(p1.getNivel() + 1);
                } else {
                    System.out.println("o " + classe2 + " " + p2.getNome() + " atacou o " + classe + " " + p1.getNome());
                    p2.atacar(p1);
                    p2.setNivel(p2.getNivel() + 1);
                }
            } else {
                System.out.println("o " + classe2 + " " + p2.getNome() + " atacou o " + classe + " " + p1.getNome());
                p2.atacar(p1);
                p2.setNivel(p2.getNivel() + 1);
            }
            p1.mostrarDetalhes();
            p2.mostrarDetalhes();
        } else {
            System.out
                    .println("Não houve combate entre " + p1.getNome() + " e " + p2.getNome() + ", pois um deles está morto.");
        }
        System.out.println();
    }
}
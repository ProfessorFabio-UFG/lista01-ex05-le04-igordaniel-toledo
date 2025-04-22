import java.util.ArrayList;

public class Apartamento {
    private int numero;
    private int andar;
    private double metragem;
    private String situacao;
    private Morador morador;
    private ArrayList<Morador> moradores;

    public Apartamento(int numero, int andar, double metragem, String situacao) {
        this.numero = numero;
        this.andar = andar;
        this.metragem = metragem;
        this.situacao = situacao;
        this.moradores = new ArrayList<>();
    }

    // Métodos para manipular os moradores
    public void adicionarMorador(Morador morador) {
        moradores.add(morador);
        System.out.println("Morador adicionado ao apartamento " + numero);
    }
    public void listarMoradores() {
        System.out.println("\n=== Moradores do Apto " + numero + " ===");
        System.out.println(moradores);
    }


    @Override
    public String toString() {
        return "Apartamento " + numero +
                "\nAndar: " + andar +
                "\nMetragem: " + metragem +
                " m²\nSituação: " + situacao +
                "\nTotal de moradores: " + moradores.size();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Apartamento ap101 = new Apartamento(101, 1, 65.5, "Alugado");

        Morador m1 = new Morador();
        m1.setNome("Maria");
        m1.setCpf("123.456.789-00");
        m1.setCelular("99999-0000");
        m1.setDataNascimento("01/01/1990");
        m1.setSexo("F");
        m1.setBloco("1");
        m1.setApartamento("101");
        m1.setCodigoAcesso("abc123");

        Morador m2 = new Morador();
        m2.setNome("João");
        m2.setCpf("987.654.321-00");
        m2.setCelular("98888-1111");
        m2.setDataNascimento("02/02/1985");
        m2.setSexo("M");
        m2.setBloco("1");
        m2.setApartamento("101");
        m2.setCodigoAcesso("def456");



        ap101.adicionarMorador(m1);
        ap101.adicionarMorador(m2);

        System.out.println("\n" + ap101);
        ap101.listarMoradores();
        m1.exibirDados();
        m2.exibirDados();
    }
}

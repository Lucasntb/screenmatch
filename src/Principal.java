public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 175;

        System.out.println(meuFilme);

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);

    }
}

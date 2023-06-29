public class MinhaClasse {

  public static void main(String args[]) {
    String primeioNome = "Marcio";
    String segundoNome = "Carolino";

    String nomeCompleto = nomeCompleto(primeioNome, segundoNome);

    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}

public class BancaTest {
   public static void main(String[] args) {
       ContoBancario conto = new ContoBancario("12345", "Mario Rossi", 1000);
       System.out.println("Saldo iniziale: " + conto.getSaldo());

       conto.deposita(500);
       conto.preleva(200);
       conto.preleva(2000); // Dovrebbe fallire
   }
}

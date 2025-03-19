public class NegozioTest {
   public static void main(String[] args) {
       Prodotto p = new Prodotto("Laptop", 1200.50, 10);
       p.mostraDettagli();

       p.acquista(3);
       p.rifornisci(5);
       p.acquista(12);
   }
}

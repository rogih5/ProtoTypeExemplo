public class ClonagemFormas {
    public static void main(String[] args) {
        FormaCache.carregarCache();

        Forma cloneForma = (Forma) FormaCache.getForma("1");
        System.out.println("Forma : " + cloneForma.getTipo());

        Forma cloneForma2 = (Forma) FormaCache.getForma("2");
        System.out.println("Forma : " + cloneForma2.getTipo());

        Forma cloneForma3 = (Forma) FormaCache.getForma("3");
        System.out.println("Forma : " + cloneForma3.getTipo());
    }
}

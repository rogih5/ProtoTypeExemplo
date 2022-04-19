import java.util.HashMap;

public class FormaCache {

    private static HashMap<String, Forma> formaMap  = new HashMap<String, Forma>();

    public static Forma getForma(String formaId) {
        Forma cacheForma = formaMap.get(formaId);
        return (Forma) cacheForma.clone();
    }

    // para cada forma, execute a consulta de banco de dados e crie a forma
    // formaMap.put(shapeKey, forma);
    // por exemplo, estamos adicionando três formas

    public static void carregarCache() {
        Circulo circulo = new Circulo();
        circulo.setId("1");
        formaMap.put(circulo.getId(),circulo);

        Quadrado quadrado = new Quadrado();
        quadrado.setId("2");
        formaMap.put(quadrado.getId(),quadrado);

        Retangulo retangulo = new Retangulo();
        retangulo.setId("3");
        formaMap.put(retangulo.getId(), retangulo);
    }
}
public class Quadrado extends Forma {

    public Quadrado(){
        tipo = "Quadrado";
    }

    @Override
    public void FormaDesenho() {
        System.out.println("Quadrado::FormaDesenho()");
    }
}

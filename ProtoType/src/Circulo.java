public class Circulo extends Forma {
        public Circulo(){
            tipo = "Circulo";
        }
        @Override
        public void FormaDesenho() {
            System.out.println("Circulo::FormaDesenho()");
        }
}

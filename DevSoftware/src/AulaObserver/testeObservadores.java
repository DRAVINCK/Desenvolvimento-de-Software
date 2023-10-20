package AulaObserver;

public class testeObservadores {
    public static void main(String[] args) {

        Subject observado = new Subject();
        Observer observador1 = new ConcreteObserver(observado);
        Observer observador2 = new ConcreteObserver(observado);
        observado.setState(10);

    }


}

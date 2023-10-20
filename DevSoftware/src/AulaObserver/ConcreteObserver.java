package AulaObserver;

public class ConcreteObserver extends Observer {
    public ConcreteObserver(Subject subjectCO){
        this.subject = subjectCO;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("O observador foi notificado. Novo estado do objeto " + this.subject.getState());
    }
}

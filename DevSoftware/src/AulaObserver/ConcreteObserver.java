package AulaObserver;

public class ConcreteObserver extends Observer {
    void ConcreteObserver(Subject subjectCO){
        this.subject = subjectCO;
        this.subject.attach();
    }

    @Override
    public void update() {

    }
}

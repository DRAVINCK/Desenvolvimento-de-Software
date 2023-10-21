package Decorator;

public class Consumidor {
    public static void main(String[] args) {
        //componente concreto
        iBebida cafe = new Cafe();
        System.out.println("Pedido: "+ cafe.Descricao() + "| Custo: " + cafe.custo());

        cafe = new UisqueDecorator(cafe);
        System.out.println("Pedido2: "+ cafe.Descricao() + "| Custo: " + cafe.custo());

        cafe = new AcucarDecorator(cafe);
        System.out.println("Pedido3: "+ cafe.Descricao() + "| Custo: " + cafe.custo());

        cafe = new LeiteDecorator(cafe);
        System.out.println("Pedido5: "+ cafe.Descricao() + "| Custo: " + cafe.custo());


    }
}

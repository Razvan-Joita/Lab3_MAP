import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {





        Product p1=new Product("Fanta","Cola", new double[]{40.0, 20.0},new double[]{45.6,56.4},20);

        Product p2=new Product("Sprite","Cola2", new double[]{30.0, 20.0},new double[]{45.2,56.4},20);

        Product p3=new Product("Water","Cola1", new double[]{60.0, 20.0},new double[]{45.8,56.4},20);

        List<Product> produsele = new ArrayList<>();
        produsele.add(p1);
        produsele.add(p2);
        produsele.add(p3);



        Object List = null;
        Object Product = null;



        System.out.println();


        System.out.println(p1);

        System.out.println(p2);

        System.out.println(p3);

        List<Product> factories=new ArrayList<>();


       // System.out.println(p1.updateDemand());

        System.out.println(p1);

        System.out.println(p2);

        System.out.println(p3);

        System.out.println("Water is rising");

    }

}
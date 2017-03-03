import com.sun.org.apache.xpath.internal.SourceTree;

public class Runner {
    public static void main(String[] args) {
        Flover flover1 = new Flover("Romashka", 1, 0.5, true);
        Flover flover2= new Flover("Vasilek", 2, 0.7, false);
        Flover flover3= new Flover("Roza", 1, 0.3, false);

        //Копирование обекта с использованием конструктора копирования
        Flover flover4 = new Flover(flover1);

        System.out.println(flover1);
        System.out.println(flover4);

    }
}

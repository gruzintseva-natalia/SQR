
import ru.netology.SquareR.services.SQRService;

public class Main {
    public static void main(String[] args) {
        int start = 100;
        int end = 10000;

        SQRService service = new SQRService();
        System.out.println("Квадраты в диапазоне: " + service.calcCountSquaresAtRange(start, end));
    }

}

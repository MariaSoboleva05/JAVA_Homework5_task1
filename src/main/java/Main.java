import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println(service.calcSqrtInLimit(100, 9801));


    }
}

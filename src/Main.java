public class Main {
    public static void main(String[] args) {
        HelloService service = new HelloService();
        service.returnNumber(15);
        service.returnNumber(1);
        service.returnName("Вячеслав");
        service.returnName("Слава");
        int[] nums = {3, 10, 9};
        service.returnNumbersDivisibleBy3(nums);
    }
}
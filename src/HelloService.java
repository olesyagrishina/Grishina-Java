import java.util.Arrays;

public class HelloService {
    public void returnNumber(int a) {
        int x = 7;
        if (a > x) {
            System.out.println("Привет");
        }
    }

    public void returnName(String firstName) {
        String name = "Вячеслав";
        if (firstName.equals(name)) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public void returnNumbersDivisibleBy3(int[] nums) {
        for (int t : nums) {
            if (t % 3 == 0) {
                System.out.println(t);
            }
        }
    }
}


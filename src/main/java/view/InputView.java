package view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {}

    public static String carCount() {

        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.next();
    }

    public static String playCount() {

        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.next();
    }
}

package tests.test7.exception;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Second {
    public static Pattern EMAIL_REGEX = Pattern.compile("""
        # RFC 5322 Official Standard
        ^
        (?:
            [a-z0-9!\\#$%&'*+/=?^_`{|}~-]+
            (?:\\.[a-z0-9!\\#$%&'*+/=?^_`{|}~-]+)* |
            \"
                (?:
                    [\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f] | 
                    \\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f]
                )*
            \"
        )
        @
        (?:
            (?:[a-z0-9]
                (?:[a-z0-9-]*[a-z0-9])?
            \\.)+
            [a-z0-9]
            (?:[a-z0-9-]*[a-z0-9])? |
            \\[
                (?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}
                (?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:
                    (?:
                        [\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f] |
                        \\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f]
                    )+
                )
            \\]
        )
        $
        """, Pattern.COMMENTS);

    public static Pattern RFC3339_REGEX = Pattern.compile("""
        ^
        \\d{4}-\\d{2}-\\d{2}
        T\\d{2}%3A\\d{2}%3A\\d{2}
        (?:%2E\\d+)?
        [A-Z]?
        (?:[+.-]
            (?:08%3A\\d{2}|\\d{2}[A-Z])
        )?
        $
        """, Pattern.COMMENTS);

    public static void main(String[] args) {
        double [][] numbers = {
            {1.0, 0.1},
            {1.0, 0.0},  // exception
            {1.0, 1.0}
        };

        String[] emails = {
            "ex",  // exception
            "example@mail.com",
            "example@mailcom"  // exception
        };

        String[] timestamps = {
            "1996-12-19T16%3A39%3A57-08%3A00",
            "1996-12-19T15%3A39%3A27%2E20-08%3A00",
            "2013-07-08T18%3A07%3A13ZZ",  // exception
            "2013-07-08T18%3A07%3A13.49Z"
        };

        System.out.println("Check numbers");
        for (double[] nums: numbers) {
            try {
                System.out.printf("%s = %s\n", Arrays.toString(nums), divideDouble(nums));
            } catch (ArithmeticException exception) {
                System.out.printf("%s - %s\n", Arrays.toString(nums), exception.getMessage());
            }
        }
        System.out.println();

        System.out.println("Check emails");
        for (String email: emails) {
            try {
                validateEmail(email);
                System.out.println(email);
            } catch (IllegalArgumentException exception) {
                System.out.printf("%s - %s\n", email, exception.getMessage());
            }
        }
        System.out.println();

        System.out.println("Check timestamps");
        for (String timestamp: timestamps) {
            try {
                validateRFC3339(timestamp);
                System.out.println(timestamp);
            } catch (IllegalArgumentException exception) {
                System.out.printf("%s - %s\n", timestamp, exception.getMessage());
            }
        }
    }

    public static double divideDouble(double[] args) {
        if (args.length > 0) {
            double result = args[0];
            for (int i = 1; i < args.length; i++) {
                double n = args[i];
                if (n == 0) throw new ArithmeticException("divide double by zero");
                result /= n;
            }
            return result;
        } else {
            return 0;
        }
    }

    public static void validateEmail(String email) {
        if (!EMAIL_REGEX.matcher(email).find()) {
            throw new IllegalArgumentException("not valid email");
        }
    }

    public static void validateRFC3339(String timestamp) {
        if (!RFC3339_REGEX.matcher(timestamp).find()) {
            throw new IllegalArgumentException("not valid timestamp");
        }
    }
}

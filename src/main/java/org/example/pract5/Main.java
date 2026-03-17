<<<<<<< feature/nested-lambda-lab
package org.example.pract5;

public class Main {
    public static void main(String[] args) {
        // =========== Task1 ===========
        PaymentProcessor pp = new PaymentProcessor();

        CardPayment cp = new CardPayment();
        PayPalPayment paypp = new PayPalPayment();


        System.out.println("загальна сума з комісією: " + cp.payWithFee(10000, 100));

        System.out.println(paypp.name());
        paypp.pay(1000);

        pp.process(cp, 5000);
        System.out.println();

        // =========== Task2 ==============
        ReportGenerator reportGenerator = new DailyReport();
        reportGenerator.generate();
        System.out.println();

        // =========== Task3 ==============
        new MultiNotifier().send("hiiiiiiiiiiiiii");
    }
}
=======
package org.example.pract5;

public class Main {
    public static void main(String[] args) {
        // =========== Task1 ===========
        PaymentProcessor pp = new PaymentProcessor();

        CardPayment cp = new CardPayment();
        PayPalPayment paypp = new PayPalPayment();


        System.out.println("загальна сума з комісією: " + cp.payWithFee(10000, 100));

        System.out.println(paypp.name());
        paypp.pay(1000);

        pp.process(cp, 5000);
        System.out.println();

        // =========== Task2 ==============
        ReportGenerator reportGenerator = new DailyReport();
        reportGenerator.generate();
        System.out.println();

        // =========== Task3 ==============
        new MultiNotifier().send("hiiiiiiiiiiiiii");
    }
}
>>>>>>> master

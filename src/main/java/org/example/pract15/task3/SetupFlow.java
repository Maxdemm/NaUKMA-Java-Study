package org.example.pract15.task3;

public class SetupFlow {
    @Step(order = 2)
    private void stepTwo() {
        System.out.println("Step 2");
    }

    @Step(order = 1)
    public void stepOne() {
        System.out.println("Step 1");
    }

    @Step(order = 3)
    private void stepThree() {
        System.out.println("Step 3");
    }
}

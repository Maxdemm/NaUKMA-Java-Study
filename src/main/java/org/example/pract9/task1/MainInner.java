package org.example.pract9.task1;

public class MainInner {
    public static void main(String[] args) {

        Car car = new Car("some car idk");
        Car.Engine engine = car.spec();
        System.out.println(engine.getHorsepower());

        Library library = new Library();
        Library.Book book = library.new Book("empty title", "me");
        book.bookLabel();
    }
}

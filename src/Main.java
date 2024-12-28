public class Main {
    public static void main(String[] args) {
        // Utworzenie obiektu klasy NullPointerGenerator
        NullPointerGenerator generator = new NullPointerGenerator();

        try {
            // Wywołanie metody generującej wyjątek
            generator.generateNullPointerException();
        } catch (NullPointerException e) {
            // Wyświetlenie komunikatu dla użytkownika
            System.out.println("Złapano wyjątek: NullPointerException.");

            // Wyświetlenie śladu stosu (stack trace)
            e.printStackTrace();

            // Wywołanie metody toString() na obiekcie wyjątku
            System.out.println("Opis wyjątku: " + e.toString());
        }
    }
}
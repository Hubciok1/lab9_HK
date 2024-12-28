public class NullPointerGenerator {
    public void generateNullPointerException() {
        // Tworzenie zmiennej o wartości null
        String nullString = null;

        // Próba wykonania operacji na obiekcie null
        // To wywoła NullPointerException
        nullString.length();
    }
}

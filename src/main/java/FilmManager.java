public class FilmManager {
    private FilmItem[] items = new FilmItem[0];
    private int resultLength;
    public FilmManager() {
        resultLength = 10;
    }

    public FilmManager(int lastLength) {
        resultLength = lastLength;
    }
    public void save(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] getItems() {
        return items;
    }

    public FilmItem[] findAll() {
        return items;
    }

    public FilmItem[] getItemsReversed() {
        FilmItem[] reversed = new FilmItem[items.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }

    public FilmItem[] findLast() {

        if (items.length > 0) {
            if (items.length < resultLength) {
                FilmItem[] reversed = new FilmItem[items.length];
                for (int i = 0; i < reversed.length; i++) {
                    reversed[i] = items[items.length - 1 - i];
                }
                return reversed;
            } else {
                FilmItem[] reversed = new FilmItem[resultLength];
                for (int i = 0; i < reversed.length; i++) {
                    reversed[i] = items[items.length - 1 - i];
                }
                return reversed;
            }
        } else {
            return items;
        }
    }
}

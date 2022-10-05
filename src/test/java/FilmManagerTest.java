import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmManager manager = new FilmManager();
    FilmItem item1 = new FilmItem(2, "Бладшот", "http:/blad.jpg", "боевик");
    FilmItem item2 = new FilmItem(4, "Вперед", "http:/vpered.jpg", "мультфильм");
    FilmItem item3 = new FilmItem(7, "Номер один", "http:/numberone.jpg", "комедия");

    FilmItem item4 = new FilmItem(12, "Фильм4", "http:/film4.jpg", "боевик");
    FilmItem item5 = new FilmItem(22, "Фильм5", "http:/film5.jpg", "мультфильм");
    FilmItem item6 = new FilmItem(31, "Фильм6", "http:/film6.jpg", "комедия");
    FilmItem item7 = new FilmItem(32, "Фильм7", "http:/film7.jpg", "боевик");
    FilmItem item8 = new FilmItem(33, "Фильм8", "http:/film8.jpg", "мультфильм");
    FilmItem item9 = new FilmItem(34, "Фильм9", "http:/film9.jpg", "комедия");
    FilmItem item10 = new FilmItem(37, "Фильм10", "http:/film10.jpg", "мультфильм");
    FilmItem item11 = new FilmItem(38, "Фильм11", "http:/film11.jpg", "комедия");

    @Test
    public void saveFilm() {
        manager.save(item1);
        manager.save(item2);

        FilmItem[] expected = {item1, item2};
        FilmItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outFilmsHowAdded() {
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);

        FilmItem[] expected = {item1, item2, item3};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outFilmsReversed() {
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);

        FilmItem[] expected = {item3, item2, item1};
        FilmItem[] actual = manager.getItemsReversed();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outFilmsReversedDefault() {
        FilmManager manager1 = new FilmManager();
        manager1.save(item1);
        manager1.save(item2);
        manager1.save(item3);
        manager1.save(item4);
        manager1.save(item5);
        manager1.save(item6);
        manager1.save(item7);
        manager1.save(item8);
        manager1.save(item9);
        manager1.save(item10);
        manager1.save(item11);


        FilmItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2 };
        FilmItem[] actual = manager1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outFilmsReversed8() {
        FilmManager manager1 = new FilmManager(8);
        manager1.save(item1);
        manager1.save(item2);
        manager1.save(item3);
        manager1.save(item4);
        manager1.save(item5);
        manager1.save(item6);
        manager1.save(item7);
        manager1.save(item8);
        manager1.save(item9);
        manager1.save(item10);
        manager1.save(item11);


        FilmItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4 };
        FilmItem[] actual = manager1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outFilmsReversed11() {
        FilmManager manager1 = new FilmManager(11);
        manager1.save(item1);
        manager1.save(item2);
        manager1.save(item3);
        manager1.save(item4);
        manager1.save(item5);
        manager1.save(item6);
        manager1.save(item7);
        manager1.save(item8);
        manager1.save(item9);
        manager1.save(item10);
        manager1.save(item11);


        FilmItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1 };
        FilmItem[] actual = manager1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outFilmsReversedNull() {
        FilmManager manager1 = new FilmManager(0);
        manager1.save(item1);
        manager1.save(item2);
        manager1.save(item3);
        manager1.save(item4);
        manager1.save(item5);
        manager1.save(item6);
        manager1.save(item7);
        manager1.save(item8);
        manager1.save(item9);
        manager1.save(item10);
        manager1.save(item11);


        FilmItem[] expected = new FilmItem[0];
        FilmItem[] actual = manager1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTester {

    @org.junit.jupiter.api.Test
    void addBookTest() {
        Store store = new Store();
        Book book1 = new Book();
        store.addBook(book1);
        assertEquals(book1, store.getCisItems().get(0));
    }

    @org.junit.jupiter.api.Test
    void addBookAndAddPhoneTest() {
        Store store = new Store();
        Book book1 = new Book();
        Phone phone1 = new Phone();
        store.addBook(book1);
        store.addPhone(phone1);
        assertEquals(book1, store.getCisItems().get(0));
        assertEquals(phone1, store.getCisItems().get(1));
    }

    @org.junit.jupiter.api.Test
    void updatePhonesAndGetPhonesTest() {
        Store store = new Store();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        store.addPhone(phone1);
        store.addPhone(phone2);
        phone1.setLocation("Rm 512");
        phone2.setLocation("Rm 512");
        //After update, location should be "Rm 514" and not "Rm 512"
        store.updatePhonesLocation("Rm 514");

        //test for getAllPhones() method
        ArrayList<Phone> phones = store.getAllPhones();
        for (Phone phone : phones){
            assertEquals("Rm 514", phone.getLocation());
        }
        //test for updatePhonesLocation() method
        assertEquals("Rm 514", phone1.getLocation());
        assertEquals("Rm 514", phone2.getLocation());
    }

    @org.junit.jupiter.api.Test
    void getItemsTest() {
        Store store = new Store();
        Arduino arduino1 = new Arduino();
        Arduino arduino2 = new Arduino();
        Magazine magazine1 = new Magazine();
        Magazine magazine2 = new Magazine();
        ElectronicItem electronicItem1 = new ElectronicItem();
        ElectronicItem electronicItem2 = new ElectronicItem();

        store.addItems(arduino1);
        store.addItems(arduino2);
        store.addItems(magazine1);
        store.addItems(magazine2);
        store.addItems(electronicItem1);
        store.addItems(electronicItem2);
        //test for getItems() method, test arduino list
        ArrayList<CISItem> arduinos = store.getItems("Arduino");
        for (CISItem arduino : arduinos){
            assertEquals(Arduino.class, arduino.getClass());
        }
        //test for getItems() method, test magazine list
        ArrayList<CISItem> magazines = store.getItems("Magazine");
        for (CISItem magazine : magazines){
            assertEquals(Magazine.class, magazine.getClass());
        }
        //test for getItems() method, test electronic items list
        ArrayList<CISItem> electronicItems = store.getItems("ElectronicItem");
        for (CISItem electronicItem : electronicItems){
            assertEquals(ElectronicItem.class, electronicItem.getClass());
        }
    }

    @org.junit.jupiter.api.Test
    void updateItemsTest() {
        Store store = new Store();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Magazine magazine1 = new Magazine();
        Magazine magazine2 = new Magazine();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        ReadingItem readingItem1 = new ReadingItem();
        ReadingItem readingItem2 = new ReadingItem();
        store.addItems(book1);
        store.addItems(book2);
        store.addItems(book3);
        store.addItems(magazine1);
        store.addItems(magazine2);
        store.addItems(phone1);
        store.addItems(phone2);
        store.addItems(readingItem1);
        store.addItems(readingItem2);

        //test for updateItems() method, updating Book title and author
        store.updateItems("Book", "title", "Murder on the Orient Express");
        store.updateItems("Book", "author", "Agatha Christie");
        ArrayList<CISItem> books = store.getItems("Book");
        for (CISItem cisItem : books){
            Book book = (Book) cisItem;
            assertEquals("Murder on the Orient Express", book.getTitle());
            assertEquals("Agatha Christie", book.getAuthor());
            assertNotNull(book.getTitle());
            assertNotNull(book.getAuthor());
        }
        //test for updateItems() method, updating Phone networkType, screenSize, storageCapacity
        store.updateItems("Phone", "networkType", "5G");
        store.updateItems("Phone", "screenSize", "1440");
        store.updateItems("Phone", "storageCapacity", "256");
        ArrayList<CISItem> phones = store.getItems("Phone");
        for (CISItem cisItem : phones){
            Phone phone = (Phone) cisItem;
            assertEquals("5G", phone.getNetworkType());
            assertEquals(1440, phone.getScreenSize());
            assertEquals(256, phone.getStorageCapacity());
            assertNotNull(phone.getNetworkType());
        }
        //test for updateItems() method, updating Magazine name, coverStoryTitle
        store.updateItems("Magazine", "name", "Vogue");
        store.updateItems("Magazine", "coverStoryTitle", "Bringing Back the '80s!");
        ArrayList<CISItem> magazines = store.getItems("Magazine");
        for (CISItem cisItem : magazines){
            Magazine magazine = (Magazine) cisItem;
            assertEquals("Vogue", magazine.getName());
            assertEquals("Bringing Back the '80s!", magazine.getCoverStoryTitle());
            assertNotNull(magazine.getName());
            assertNotNull(magazine.getCoverStoryTitle());
        }
        //test for updateItems() method, updating Magazine name, coverStoryTitle
        store.updateItems("ReadingItem", "wordCount", "10000");
        ArrayList<CISItem> readingItems = store.getItems("ReadingItem");
        for (CISItem cisItem : readingItems){
            ReadingItem readingItem = (ReadingItem) cisItem;
            assertEquals(10000, readingItem.getWordCount());
        }
    }
}
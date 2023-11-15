import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    private ArrayList<CISItem> cisItems = new ArrayList<>();

    public void addBook(Book book){
        cisItems.add(book);
    }

    public void addPhone(Phone phone){
        cisItems.add(phone);
    }

    public void addMagazine(Magazine magazine){
        cisItems.add(magazine);
    }

    public void addArduino(Arduino arduino){
        cisItems.add(arduino);
    }

    public void addItems(CISItem cisItem){
        cisItems.add(cisItem);
    }

    public ArrayList<CISItem> getCisItems() {
        return cisItems;
    }

    public ArrayList<Phone> getAllPhones() {
        ArrayList<Phone> allPhones = new ArrayList<>();
        for (CISItem cisItem : this.cisItems){
            //loop through all CIS items, if the class is Phone class, add phone items to the array
            if (cisItem.getClass().equals(Phone.class)){
                allPhones.add((Phone) cisItem);
            }
        }

        return allPhones;
    }

    public ArrayList<CISItem> getItems(String itemType) {
        ArrayList<String> allClasses = new ArrayList<>(Arrays.asList("Book", "Magazine", "Phone", "Arduino", "ReadingItem", "ElectronicItem", "CISItem"));
        //itemType does NOT belong in one of the available Classes
        if (!allClasses.contains(itemType)){
            throw new IllegalArgumentException("Item type does not exist in the store!");
        }

        String className = "class " + itemType;
        ArrayList<CISItem> allItems = new ArrayList<>();
        for (int i = 0; i < cisItems.size(); i++){
            //getClass().toString() for Book class == "class Book"
            if (cisItems.get(i).getClass().toString().equals(className)){
                allItems.add(cisItems.get(i));
            }
        }
        return allItems;
    }

    public void updatePhonesLocation(String location) {
        //for each phone in all phones, set location to new location
        for (Phone phone : getAllPhones()){
            phone.setLocation(location);
        }
    }

    public void updateItems(String itemType, String property, String value) {
        if(itemType.equals("Book")){
            //if getItems(itemType) is empty, it means that the store does not have any Book type items
            if (!getItems(itemType).isEmpty()) {
                //for each Book in ArrayList of all the Book items in the store
                for (CISItem cisItem : getItems(itemType)) {
                    //cast the item from CISItem to Book, so program can access the Book private properties
                    Book book = (Book) cisItem;

                    switch (property) {
                        case "name":
                            book.setName(value);
                            break;
                        case "location":
                            book.setLocation(value);
                            break;
                        case "price":
                            book.setPrice(Integer.parseInt(value));
                            break;
                        case "description":
                            book.setDescription(value);
                            break;
                        case "wordCount":
                            book.setWordCount(Integer.parseInt(value));
                            break;
                        case "datePublished":
                            book.setDatePublished(value);
                            break;
                        case "author":
                            book.setAuthor(value);
                            break;
                        case "isbn":
                            book.setIsbn(value);
                            break;
                        case "edition":
                            book.setEdition(value);
                            break;
                        case "title":
                            book.setTitle(value);
                            break;
                        default:
                            throw new IllegalArgumentException(itemType + " Class does not have the property \"" + property + "\"!");
                    }
                }
            }
        }
        else if (itemType.equals("Magazine")){
            //check if there are any items of Magazine type in the store
            if (!getItems(itemType).isEmpty()) {
                //for each Magazine in ArrayList of all the Magazine items in the store
                for (CISItem cisItem : getItems(itemType)) {
                    //cast the item from CISItem to Magazine, to access the Magazine private properties
                    Magazine magazine = (Magazine) cisItem;
                    switch (property) {
                        case "name":
                            magazine.setName(value);
                            break;
                        case "location":
                            magazine.setLocation(value);
                            break;
                        case "price":
                            magazine.setPrice(Integer.parseInt(value));
                            break;
                        case "description":
                            magazine.setDescription(value);
                            break;
                        case "wordCount":
                            magazine.setWordCount(Integer.parseInt(value));
                            break;
                        case "datePublished":
                            magazine.setDatePublished(value);
                            break;
                        case "author":
                            magazine.setAuthor(value);
                            break;
                        case "coverStoryTitle":
                            magazine.setCoverStoryTitle(value);
                            break;
                        case "printDate":
                            magazine.setPrintDate(value);
                            break;
                        default:
                            throw new IllegalArgumentException(itemType + " Class does not have the property \"" + property + "\"!");
                    }
                }
            }
        }
        else if (itemType.equals("Phone")){
            if (!getItems(itemType).isEmpty()) {
                for (CISItem cisItem : getItems(itemType)) {
                    Phone phone = (Phone) cisItem;
                    switch (property) {
                        case "name":
                            phone.setName(value);
                            break;
                        case "location":
                            phone.setLocation(value);
                            break;
                        case "price":
                            phone.setPrice(Integer.parseInt(value));
                            break;
                        case "description":
                            phone.setDescription(value);
                            break;
                        case "storageCapacity":
                            phone.setStorageCapacity(Integer.parseInt(value));
                            break;
                        case "model":
                            phone.setModel(value);
                            break;
                        case "maker":
                            phone.setMaker(value);
                            break;
                        case "operatingSystem":
                            phone.setOperatingSystem(value);
                            break;
                        case "networkType":
                            phone.setNetworkType(value);
                            break;
                        case "screenSize":
                            phone.setScreenSize(Integer.parseInt(value));
                            break;
                        default:
                            throw new IllegalArgumentException(itemType + " Class does not have the property \"" + property + "\"!");
                    }
                }
            }
        }
        else if (itemType.equals("Arduino")){
            if (!getItems(itemType).isEmpty()) {
                for (CISItem cisItem : getItems(itemType)) {
                    Arduino arduino = (Arduino) cisItem;
                    switch (property) {
                        case "name":
                            arduino.setName(value);
                            break;
                        case "location":
                            arduino.setLocation(value);
                            break;
                        case "price":
                            arduino.setPrice(Integer.parseInt(value));
                            break;
                        case "description":
                            arduino.setDescription(value);
                            break;
                        case "storageCapacity":
                            arduino.setStorageCapacity(Integer.parseInt(value));
                            break;
                        case "model":
                            arduino.setModel(value);
                            break;
                        case "maker":
                            arduino.setMaker(value);
                            break;
                        case "operatingSystem":
                            arduino.setOperatingSystem(value);
                            break;
                        case "version":
                            arduino.setVersion(value);
                            break;
                        default:
                            throw new IllegalArgumentException(itemType + " Class does not have the property \"" + property + "\"!");
                    }
                }
            }
        }
        else if (itemType.equals("ReadingItem")){
            if (!getItems(itemType).isEmpty()) {
                for (CISItem cisItem : getItems(itemType)) {
                    ReadingItem readingItem = (ReadingItem) cisItem;
                    switch (property) {
                        case "name":
                            readingItem.setName(value);
                            break;
                        case "location":
                            readingItem.setLocation(value);
                            break;
                        case "price":
                            readingItem.setPrice(Integer.parseInt(value));
                            break;
                        case "description":
                            readingItem.setDescription(value);
                            break;
                        case "wordCount":
                            readingItem.setWordCount(Integer.parseInt(value));
                            break;
                        case "datePublished":
                            readingItem.setDatePublished(value);
                            break;
                        case "author":
                            readingItem.setAuthor(value);
                            break;
                        default:
                            throw new IllegalArgumentException(itemType + " Class does not have the property \"" + property + "\"!");
                    }
                }
            }
        }
        else if (itemType.equals("ElectronicItem")){
            if (!getItems(itemType).isEmpty()) {
                for (CISItem cisItem : getItems(itemType)) {
                    ElectronicItem electronicItem = (ElectronicItem) cisItem;
                    switch (property) {
                        case "name":
                            electronicItem.setName(value);
                            break;
                        case "location":
                            electronicItem.setLocation(value);
                            break;
                        case "price":
                            electronicItem.setPrice(Integer.parseInt(value));
                            break;
                        case "description":
                            electronicItem.setDescription(value);
                            break;
                        case "storageCapacity":
                            electronicItem.setStorageCapacity(Integer.parseInt(value));
                            break;
                        case "model":
                            electronicItem.setModel(value);
                            break;
                        case "maker":
                            electronicItem.setMaker(value);
                            break;
                        case "operatingSystem":
                            electronicItem.setOperatingSystem(value);
                            break;
                        default:
                            throw new IllegalArgumentException(itemType + " Class does not have the property \"" + property + "\"!");
                    }
                }
            }
        }
        else if (itemType.equals("CISItem")){
            if (!getItems(itemType).isEmpty()) {
                for (CISItem cisItem : getItems(itemType)) {
                    switch (property) {
                        case "name":
                            cisItem.setName(value);
                            break;
                        case "location":
                            cisItem.setLocation(value);
                            break;
                        case "price":
                            cisItem.setPrice(Integer.parseInt(value));
                            break;
                        case "description":
                            cisItem.setDescription(value);
                            break;
                        default:
                            throw new IllegalArgumentException(itemType + " Class does not have the property \"" + property + "\"!");
                    }
                }
            }
        }
        else{
            throw new IllegalArgumentException("Store does not contain item type \"" + itemType + "\"!");
        }
    }

    public void showAllInfo() {
        for(CISItem cisItem : this.cisItems){
            System.out.println("Name of item: " + cisItem.getName());
            System.out.println("Location of item: " + cisItem.getLocation());
            System.out.println("Price of item: " + cisItem.getPrice());
            System.out.println("Description of item: " + cisItem.getDescription());
            if (cisItem.getClass().toString().equals("class ReadingItem")){
                //cast the item from CISItem to Book, so program can access the Book private properties
                System.out.println("Word Count of item: " + ((ReadingItem) cisItem).getWordCount());
                System.out.println("Date published of item: " + ((ReadingItem) cisItem).getDatePublished());
                System.out.println("Author of item: " + ((ReadingItem) cisItem).getAuthor());
            }
            else if (cisItem.getClass().toString().equals("class Book")){
                System.out.println("Word Count of item: " + ((Book) cisItem).getWordCount());
                System.out.println("Date published of item: " + ((Book) cisItem).getDatePublished());
                System.out.println("Author of item: " + ((Book) cisItem).getAuthor());
                System.out.println("ISBN of item: " + ((Book) cisItem).getIsbn());
                System.out.println("Edition of item: " + ((Book) cisItem).getEdition());
                System.out.println("Title of item: " + ((Book) cisItem).getTitle());
            }
            else if (cisItem.getClass().toString().equals("class Magazine")){
                System.out.println("Word Count of item: " + ((Magazine) cisItem).getWordCount());
                System.out.println("Date published of item: " + ((Magazine) cisItem).getDatePublished());
                System.out.println("Author of item: " + ((Magazine) cisItem).getAuthor());
                System.out.println("Cover Story Title of item: " + ((Magazine) cisItem).getCoverStoryTitle());
                System.out.println("Print Date of item: " + ((Magazine) cisItem).getPrintDate());
            }
            else if(cisItem.getClass().toString().equals("class ElectronicItem")){
                //cast the item from CISItem to Book, so program can access the Book private properties
                System.out.println("Storage Capacity of item: " + ((ElectronicItem) cisItem).getStorageCapacity());
                System.out.println("Model of item: " + ((ElectronicItem) cisItem).getModel());
                System.out.println("Maker of item: " + ((ElectronicItem) cisItem).getMaker());
                System.out.println("Operating System of item: " + ((ElectronicItem) cisItem).getOperatingSystem());
            }
            else if (cisItem.getClass().toString().equals("class Phone")){
                System.out.println("Storage Capacity of item: " + ((Phone) cisItem).getStorageCapacity());
                System.out.println("Model of item: " + ((Phone) cisItem).getModel());
                System.out.println("Maker of item: " + ((Phone) cisItem).getMaker());
                System.out.println("Operating System of item: " + ((Phone) cisItem).getOperatingSystem());
                System.out.println("Network Type of item: " + ((Phone) cisItem).getNetworkType());
                System.out.println("Screen Size of item: " + ((Phone) cisItem).getScreenSize());
            }
            else if (cisItem.getClass().toString().equals("class Arduino")){
                System.out.println("Storage Capacity of item: " + ((Arduino) cisItem).getStorageCapacity());
                System.out.println("Model of item: " + ((Arduino) cisItem).getModel());
                System.out.println("Maker of item: " + ((Arduino) cisItem).getMaker());
                System.out.println("Operating System of item: " + ((Arduino) cisItem).getOperatingSystem());
                System.out.println("Version of item: " + ((Arduino) cisItem).getVersion());
            }
            System.out.println();
        }
    }
}

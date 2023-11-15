# Lab-2.1-Store
TODO 1: Create the classes as outlined in the UML Diagram above.

TODO 2: Create a class called Store.

TODO 3: Create a class called StoreTester

TODO 4: Create an ArrayList of CISItem in the Store class that will hold all of the items in this store. Call this ArrayList "cisItems"

TODO 5: Create a method addBook, that takes in a Book as an argument and adds it to the arrayList items.
    
TODO 6: Create a test for addBook in the StoreTester class. The test is called addBookTest.
0. Create an instance of Store.
1. Create a Book object.
2. Add the book with .addBook(). Your program should not crash when you do this.
3. You can use assertTrue(true) at the end of the method.
    
TODO 7: Create a method addPhone, which takes in a Phone as an argument and adds it to the ArrayList items.
    
TODO 8: Create a test that calls addBook AND addPhone in the StoreTester class.
0. Create an instance of Store
1. Create a Book object
2. Create a Phone object
3. Add the objects with their appropriate method. Your program should not crash.
4. You can use assertTrue(true) at the end of the method
     
TODO 9: We want to be able to move all Phones to a new location. Create a method called updatePhonesLocation(), which takes in a location as an argument and changes the location of all Phones in the Store.

TODO 10: Create a method called getAllPhones() that returns an ArrayList with all the phones in the store.
    
TODO 11: Create a test for updatePhonesLocation() and getAllPhones(). This test will update all phones to be in "Room 514".
0. Create an instance of Store
1. Create some Phones and add them to the store.
2. Update all phones to be at location "Room 514"
3. Call getAllPhones()
4. Check each phone and make sure that their location equals "Room 514"
5. Use assertEquals(somePhone.getLocation(), "Room 514") on each phone

TODO 12: You can see how creating a method for each specific thing that you can do with each device will get incredibly tedious. Let's make a method called getItems(String itemType) where itemType is the type of object the user wants as a String. getItems("phone") will return all phones in the store. getItems("book") will return all books in the store.
    
TODO 13: Write a test to ensure that getItems() works correctly. Test it with more than one type of CISItem.
    
TODO 14: Create a method updateItems(String itemType, String property, String value) where itemType is the type of item the user wants to update. updateItem("phone", "location", "Room 513") will update all phones' location to "Room 513".

TODO 15: Make a test for updateItems that ensures it works correctly. Try a variety of combinations.

TODO 16: Create a method showAllInfo() that prints the information for all items in the store. You don't need to write a test for this; just verify it manually. Take a look at the console and make sure things are working correctly.  

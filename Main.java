class Main {

  //Main Method
    public static void main(String[] args)
    {
        LibraryBook b1 = new LibraryBook(1001, "The Hobbit", "Fantasy");
        LibraryBook b2 = new LibraryBook(1002, "Java Programming", "Nonfiction");

        // test print and toString
        b1.print();
        b2.print();
        System.out.println(b1.toString());
        System.out.println(b2.toString());

        // test checkout and return
        b1.checkout("Jason", "2025-12-20");
        b1.print();
        b1.returnBook();
        b1.print();

        // test some getters and setters
        b2.setGenre("Computer Science");
        System.out.println("New genre for b2: " + b2.getGenre());
    }
}

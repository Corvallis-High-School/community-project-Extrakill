public class Main
{
    public static void main(String[] args)
    {
        LibraryBook b1 = new LibraryBook(1001, "The Hobbit", "Fantasy");
        EBook e1 = new EBook(2001, "Digital Java", "Education", 15.7, "www.libraryebooks.com/java");
        ReferenceBook r1 = new ReferenceBook(3001, "Encyclopedia of Science", "Reference", "Science", true);

        b1.print();
        System.out.println(b1);
        System.out.println();

        e1.print();
        e1.downloadBook();
        System.out.println(e1);
        System.out.println();

        r1.print();
        r1.useInLibrary();
        r1.checkout("Jason", "2026-03-20");
        System.out.println(r1);
        System.out.println();

        b1.checkout("Jason", "2026-03-20");
        System.out.println(b1);
    }
}
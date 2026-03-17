public class LibraryBook
{
    private int bookID;
    private String title;
    private String genre;
    private boolean isCheckedOut;
    private String borrowerName;
    private String dueDate;

    public LibraryBook()
    {
        bookID = 0;
        title = "unknown";
        genre = "unknown";
        isCheckedOut = false;
        borrowerName = "none";
        dueDate = "none";
    }

    public LibraryBook(int id, String title, String genre)
    {
        this.bookID = id;
        this.title = title;
        this.genre = genre;
        this.isCheckedOut = false;
        this.borrowerName = "none";
        this.dueDate = "none";
    }

    public int getBookID()
    {
        return bookID;
    }

    public String getTitle()
    {
        return title;
    }

    public String getGenre()
    {
        return genre;
    }

    public boolean getCheckedOut()
    {
        return isCheckedOut;
    }

    public String getBorrowerName()
    {
        return borrowerName;
    }

    public String getDueDate()
    {
        return dueDate;
    }

    public void setBookID(int id)
    {
        bookID = id;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public void setGenre(String g)
    {
        genre = g;
    }

    public void setCheckedOut(boolean value)
    {
        isCheckedOut = value;
    }

    public void setBorrowerName(String name)
    {
        borrowerName = name;
    }

    public void setDueDate(String date)
    {
        dueDate = date;
    }

    public void print()
    {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Checked out: " + isCheckedOut);
        System.out.println("Borrower: " + borrowerName);
        System.out.println("Due date: " + dueDate);
        System.out.println();
    }

    public void checkout(String borrower, String date)
    {
        if (!isCheckedOut)
        {
            isCheckedOut = true;
            borrowerName = borrower;
            dueDate = date;
        }
        else
        {
            System.out.println("This book is already checked out.");
        }
    }

    public void returnBook()
    {
        isCheckedOut = false;
        borrowerName = "none";
        dueDate = "none";
    }

    public String toString()
    {
        return "LibraryBook[ID=" + bookID
                + ", title=" + title
                + ", genre=" + genre
                + ", checkedOut=" + isCheckedOut
                + ", borrower=" + borrowerName
                + ", dueDate=" + dueDate + "]";
    }
}
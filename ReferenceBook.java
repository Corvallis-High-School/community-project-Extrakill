public class ReferenceBook extends LibraryBook
{
    private String subjectArea;
    private boolean inLibraryOnly;

    public ReferenceBook()
    {
        super();
        subjectArea = "General";
        inLibraryOnly = true;
    }

    public ReferenceBook(int id, String title, String genre, String subjectArea, boolean inLibraryOnly)
    {
        super(id, title, genre);
        this.subjectArea = subjectArea;
        this.inLibraryOnly = inLibraryOnly;
    }

    public String getSubjectArea()
    {
        return subjectArea;
    }

    public boolean getInLibraryOnly()
    {
        return inLibraryOnly;
    }

    public void setSubjectArea(String subject)
    {
        subjectArea = subject;
    }

    public void setInLibraryOnly(boolean value)
    {
        inLibraryOnly = value;
    }

    public void useInLibrary()
    {
        System.out.println("This reference book is being used in the library.");
    }

    public void checkout(String borrower, String date)
    {
        if (inLibraryOnly)
        {
            System.out.println("This reference book cannot be checked out.");
        }
        else
        {
            super.checkout(borrower, date);
        }
    }

    public String toString()
    {
        return "ReferenceBook[ID=" + getBookID()
                + ", title=" + getTitle()
                + ", genre=" + getGenre()
                + ", checkedOut=" + getCheckedOut()
                + ", borrower=" + getBorrowerName()
                + ", dueDate=" + getDueDate()
                + ", subjectArea=" + subjectArea
                + ", inLibraryOnly=" + inLibraryOnly + "]";
    }
}
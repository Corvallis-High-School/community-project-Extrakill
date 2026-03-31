public class EBook extends LibraryBook
{
    private double fileSizeMB;
    private String downloadLink;

    public EBook()
    {
        super();
        fileSizeMB = 0.0;
        downloadLink = "none";
    }

    public EBook(int id, String title, String genre, double fileSizeMB, String downloadLink)
    {
        super(id, title, genre);
        this.fileSizeMB = fileSizeMB;
        this.downloadLink = downloadLink;
    }

    public double getFileSizeMB()
    {
        return fileSizeMB;
    }

    public String getDownloadLink()
    {
        return downloadLink;
    }

    public void setFileSizeMB(double size)
    {
        fileSizeMB = size;
    }

    public void setDownloadLink(String link)
    {
        downloadLink = link;
    }

    public void downloadBook()
    {
        System.out.println("Downloading ebook from: " + downloadLink);
    }

    public void print()
    {
        super.print();
        System.out.println("File Size (MB): " + fileSizeMB);
        System.out.println("Download Link: " + downloadLink);
        System.out.println();
    }

    public String toString()
    {
        return "EBook[ID=" + getBookID()
                + ", title=" + getTitle()
                + ", genre=" + getGenre()
                + ", checkedOut=" + getCheckedOut()
                + ", borrower=" + getBorrowerName()
                + ", dueDate=" + getDueDate()
                + ", fileSizeMB=" + fileSizeMB
                + ", downloadLink=" + downloadLink + "]";
    }
}
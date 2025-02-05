package oops.problem.libarary.management;

import java.util.Date;

public abstract class LibraryItem
{
    private  String title;
    private  String author;
    private  String publicationYear;


    public LibraryItem(String title, String author, String publicationYear)
    {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString()
    {
        return "\n{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                ',';
    }

    //abstract method
    public abstract void displayInfo();
}

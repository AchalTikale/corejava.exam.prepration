package oops.problem.libarary.management;

public class Book extends LibraryItem implements Borrowable
{
    private String genre;//genre==types of books
    public Book(String title, String author, String publicationYear, String genre)
    {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                "genre='" + genre + '\''+
                '}';
    }

    @Override
    public void displayInfo()
    {
        System.out.println(this.toString());
    }

    @Override
    public void borrowItem(Member member)
    {
        System.out.println("The Book [ "+getTitle()+"] of type "+getGenre()+"is borrowed successfully by "+member.getMemberName()+"!!");

    }

    @Override
    public void returnItem(Member member)
    {
        System.out.println("The Book [ "+getTitle()+"] of type "+getGenre()+"is returned successfully by "+member.getMemberName()+"!!");
    }
}

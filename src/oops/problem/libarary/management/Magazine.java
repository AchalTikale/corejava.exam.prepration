package oops.problem.libarary.management;

public class Magazine extends LibraryItem implements Borrowable
{
    private int issueNumber;

    public Magazine(String title, String author, String publicationYear, int issueNumber)
    {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString()
    {
        return super.toString()+" "+
                "issueNumber='" + issueNumber + '\''+
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
        System.out.println("The Magazine "+getTitle()+"with issueNumber of "+getIssueNumber()+"is borrowed successfully by "+member.getMemberName()+"!!");

    }

    @Override
    public void returnItem(Member member)
    {
        System.out.println("The Magazine "+getTitle()+"with issueNumber of "+getIssueNumber()+"is returned successfully  by "+member.getMemberName()+"!!");
    }
}

package oops.problem.libarary.management;

public class LibrarySystem
{
    public static void main(String[] args)
    {
        Library library=new Library();

        Book book1=new Book("Yayati","V. Khandelkar","1870","Marathi_Literature");
        Book book2=new Book("WingsOfFire","APJ Kalam Sir","2000","Biography");
        Magazine magazine=new Magazine("TimesOfIndia","xyx","1995",102);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(magazine);


        System.out.println("Total Number of Items in Library:"+Library.numberOfItems);

        Librarian librarian=new Librarian("Purvesh",11161,library);
        System.out.println(librarian);

        Member member1 = new Member("Achal", 101);
        Member member2 = new Member("Shoheb", 102);

        library.addMember(member1);

        book1.borrowItem(member1);
        library.addMember(member2);




    }
}

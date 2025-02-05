package oops.problem.libarary.management;

import java.util.ArrayList;
import java.util.List;

public class Library
{
    List<LibraryItem> listOfLibraryItem;
    public static int numberOfItems;
    private List<Member> members;

    public Library()
    {
        listOfLibraryItem =new ArrayList<>();
        members=new ArrayList<>();
    }



    public void addMember(Member member) {
        members.add(member);
    }


    public void addItem(LibraryItem item)
    {
        listOfLibraryItem.add(item);
        numberOfItems++;
    }

    public void removeItem(LibraryItem item)
    {
        listOfLibraryItem.remove(item);
        numberOfItems--;
    }

    public void displayAllLibraryItems()
    {
        for (LibraryItem item : listOfLibraryItem)
        {
            item.displayInfo();
        }
    }

    @Override
    public String toString() {
        return
                "\nlistOfLibraryItem=" + listOfLibraryItem +"\n";
    }
}

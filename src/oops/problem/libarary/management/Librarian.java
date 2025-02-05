package oops.problem.libarary.management;

public class Librarian
{
    private String employeeName;
    private int employeeId;
    private Library library;

    public Librarian(String employeeName, int employeeId, Library library) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.library = library;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                "}\n"+
                "library=" + library ;
    }
}

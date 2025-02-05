package oops.problem.libarary.management;

public class Member
{
    private String memberName;
    private int memberId;

    public Member(String memberName, int memberId)
    {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString()
    {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", memberId=" + memberId +
                '}';
    }
}

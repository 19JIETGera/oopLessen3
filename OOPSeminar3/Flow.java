import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroupList;

    public Flow(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }
    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }
    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }
    @Override
    public FlowIterator iterator() {
        return new FlowIterator((List<StudentGroup>) this);
    }


    @Override
    public String toString() {
        return "Flow{" +
                "Groups=" + studentGroupList +
                '}';
    }


}

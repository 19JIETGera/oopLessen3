import java.util.Iterator;
import java.util.List;

public class FlowIterator implements Iterator<StudentGroup> {

    private final List<StudentGroup> studentGroupList;
    private int counter;

    public FlowIterator(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size() -1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return studentGroupList.get(--counter);
    }
}

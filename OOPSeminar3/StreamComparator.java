import java.util.Comparator;
import java.util.List;


public class StreamComparator implements Comparator<Flow> {
//    private final List<Flow> flowList;
//
//    public StreamComparator( List<Flow> flowList) {
//        this.flowList = flowList;
//    }

//    @Override
//    public int compareTo(Flow o, Flow flowList) {
//        if (o.getStudentGroupList().size()<flowList.getStudentGroupList().size()){
//            return 1;
//        } else if (o.getStudentGroupList().size()>flowList.getStudentGroupList().size()){
//            return -1;
//        }else return 0;
//    }

    @Override
    public int compare(Flow o1, Flow o2) {
        if (o1.getStudentGroupList().size()<o2.getStudentGroupList().size()){
            return -1;
        } else if (o1.getStudentGroupList().size()>o2.getStudentGroupList().size()){
            return 1;
        }else return 0;
    }
}

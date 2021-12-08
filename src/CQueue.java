import java.util.Deque;
import java.util.LinkedList;

class CQueue {
    private Deque<Integer> dq1 ;
    private Deque<Integer> dq2 ;
    public CQueue() {
        dq1 = new LinkedList<>();
        dq2 = new LinkedList<>();
    }

    public void appendTail(int value) {
      dq1.push(value);
    }

    public int deleteHead() {
        if(dq2.isEmpty()){
           reverse();
        }else{
            return dq2.pop();
        }
        if(dq2.isEmpty()){
            return -1;
        }else{
            return dq2.pop();
        }
    }
public void reverse() {
        while (!dq1.isEmpty()) {
            dq2.push(dq1.pop());
        }
}

    public static void main(String[] args) {
        CQueue obj = new CQueue();
        obj.appendTail(1);
        obj.appendTail(2);
        obj.appendTail(3);
        obj.appendTail(4);
        int param_2 = obj.deleteHead();int param_3 = obj.deleteHead();
        System.out.println("param_2 = " + param_3);
    }
}
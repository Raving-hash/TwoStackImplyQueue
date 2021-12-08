import java.util.ArrayDeque;
import java.util.Deque;

class CQueue {
    private Deque<Integer> dq1 = new ArrayDeque<>();
    private Deque<Integer> dq2 = new ArrayDeque<>();
    public CQueue() {

    }

    public void appendTail(int value) {
        if (dq1.isEmpty()) {
            dq2.push(value);
        } else {
            dq1.push(value);
        }
    }
    public int deleteHead() {
        int  res;
        if(dq1.isEmpty() && dq2.isEmpty()){
            return -1;
        }
        if(dq1.isEmpty()){
            reverse();
            res = dq1.pop();
        }else{
            reverse();
            res = dq2.pop();
        }
        reverse();
        return res;
    }
public void reverse() {
    if (dq1.isEmpty()) {
        while (!dq2.isEmpty()) {
            dq1.push(dq2.pop());
        }
    } else {
        while (!dq1.isEmpty()) {
            dq2.push(dq1.pop());
        }
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
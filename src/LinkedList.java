public class LinkedList {
    LLNode head;

    public void add(EmployeeRecord record){
        LLNode node = new LLNode(record);
        node.setNext(head);
        head = node;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeRecord find(String ssn){
        LLNode node = head;
        while(node != null){
            if(node.getData().getSSN().equals(ssn))
                return node.getData();
            else
                node = node.getNext();
        }

        return null;
    }

    public void remove(String ssn){
        LLNode node = head;
        LLNode previous = head;
        while(node != null){
            if(node.getData().getSSN().equals(ssn)){
                previous.setNext(node.getNext());
            }else{
                previous = node;
                node = node.getNext();
            }
        }
    }
}

class LLNode{
    private EmployeeRecord data;
    private LLNode next;

    LLNode(EmployeeRecord record) {
        this.data = record;
    }

    void setNext(LLNode next){
        this.next = next;
    }
    EmployeeRecord getData(){
        return data;
    }
    LLNode getNext(){
        return next;
    }
}

class EmployeeRecord{
    private String name;
    private String ssn;
    private int salary;

    public EmployeeRecord(String name, String ssn, int salary){
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    String getSSN() {
        return ssn;
    }
}

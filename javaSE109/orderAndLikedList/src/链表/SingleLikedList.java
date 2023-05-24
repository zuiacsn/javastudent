package 链表;

class Test{
    public static void main(String[] args) {
        SingleLikedList.Node head = new SingleLikedList.Node(0);
        SingleLikedList list = new SingleLikedList();

        try{
            list.setHead(head);
            list.addFirst(1);
            list.addFirst(2);
            list.addFirst(3);
            list.addFirst(4);
            list.addFirst(5);
            System.out.println(list.getSize());
            System.out.println(list.contains(2));
            System.out.println(list.contains(9));
            System.out.println(list.getval(4));
        }catch (Exception e){
            throw new RuntimeException("头结点为空");
        }
        list.show();
    }
}

public class SingleLikedList {
    public Node head;


    public SingleLikedList() {
    }

    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void setHead(Node head){
        this.head = head;
    }


    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void addTail(int val){
        if(head == null){
            head = new Node(val);
        }
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(val);
    }

    public int getval(int index){
        if(index < 0 || index > getSize() -1 ){
            throw new RuntimeException("索引不合法");
        }
        Node cur = head;
        int size = 0;
        while(cur != null){
            if(size == index){
                return cur.val;
            }
            size++;
            cur = cur.next;
        }
        return -1;
    }

    public boolean contains(int val){
        Node cur = head;
       while(cur != null){
           if(cur.val == val){
               return true;
           }
           cur = cur.next;
       }
       return false;
    }

    public int getSize(){
        if(head == null){
            return -1;
        }
        int size = 0;
        Node cur = head;
        while(cur != null){
            size++;
            cur = cur.next;
        }
        return size;
    }

    public void show(){
        Node cur = head;
        while(cur.next != null){
            System.out.print(cur.val+" -> ");
            cur = cur.next;
        }
        System.out.println(cur.val);
    }

}


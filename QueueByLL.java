public class QueueByLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class QueueLL{
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int x){
            Node temp=new Node(x);
            if(size==0) head= tail=temp;
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                return -1;
            }
            int x=head.val;
            head=head.next;

            return x;
        }
        public int peek(){
            if(size==0){
                return -1;
            }
            return head.val;
        }
        public void display(){
            if(size==0){
                System.out.println("Linkedlist is empty!");
            }
            Node temp=head;

            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            return (size==0);
        }
    }
    public static void main(String[] args) {
        QueueLL q=new QueueLL();
        q.display();
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.remove();
        q.peek();
        System.out.println(q.isEmpty());
        q.display(); 
    }
}

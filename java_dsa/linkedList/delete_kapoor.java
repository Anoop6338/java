package linkedList;

public class delete_kapoor {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        printing(ll.start);        
        remove(ll.start,6);
        printing(ll.start);
    }

    static void remove(Node start, int k){
        int index = size3(start)-k;
    
        if(index ==0)
        {
            start=start.next;
            // printing(start);
            return;
        }
    
        else{
            removeNthFromEnd(start, k);
        }
    }

   static void removeNthFromEnd(Node start, int k)    
   {
       Node start2=null;
       if(start.next==null)
       {
        // printing(start2);
           return;
       }
    //    if(k==size3(start))
    //    {
    //        start2=start.next;
    //        printing(start2);
    //        return;
    //    }
       int l=size3(start);
       int i=0;
       int index=l-k;
       Node t=start;
       while(t!=null)
       {
           if(index-1==i)
           {
                t.next=t.next.next;
               break;
           }
           t=t.next;
           i++;
       }
      
       start2=start;
    //    printing(start2);
       
   }
   static int size3(Node start)
   {       
           int count=0;
           Node t=start;
           while(t!=null)
           {
               count++;
               t=t.next;
           }
           return count;        
   }

   static void printing(Node startNode){
    Node t = startNode;
    System.out.print("start --> ");
    while(t!=null){
        System.out.print(t.val+" --> ");
        t= t.next;
    }
    System.out.println("X");
}
}


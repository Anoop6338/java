package linkedList;
// leetcode 2
//add the 2 list and return the 3rd list
public class AddTwoNumbers {

    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        ll1.add(5);
        ll1.add(6);

        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(5);
        ll2.add(4);
        ll2.add(9);

        printing(ll1.start);
        printing(ll2.start);

        printing(addTwoNumbers(ll1.start, ll2.start));
        

    }
    static Node addTwoNumbers(Node start1, Node start2) {
        Node start3 = null;

        Node t1 = start1;
        Node t2 = start2;
        Node t3 = start3;
        int carry =0;

        if(start1==null && start2 == null){     // returns if both list are empty
            return null;
        }
        else if(start1 == null && start2 != null){      // returns list 2 as list1 is empty
            return start2;
        }
        else if(start1!=null && start2 == null){        // returns list1 as list2 is empty
            return start1;
        }

        else{
            while(true){            
                int sum;
                
                if(t1==null){               // list 1 finished
                    sum = t2.val;
                }
                else if(t2==null){          // list 2 is finished
                   sum = t1.val;

                }
                else{                       // both list have nodes
                   sum = t1.val+t2.val;
                }
                


                if(start3 == null){         // adding first element in the linked list
                    
                    if(sum>=10){
                        sum = sum % 10;
                        carry = 1;
                    }
                    Node nd = new Node(sum);
                    start3 = nd;
                    t3=start3;
    
                }
                
                else{
                    if(carry==1){           // add 1 if carry is one
                        sum = sum + 1;
                        carry=0;
                    }
                    if(sum>=10){            // finding the number is one's place
                        sum = sum%10;
                        carry=1;
                    }
                    Node nd = new Node(sum);    
                    t3.next=nd;
                    t3=t3.next;
                }
                
                if(t1==null){
                    t2=t2.next;
                }
                else if(t2==null){
                    t1=t1.next;
                }
                else{
                    t1=t1.next;
                    t2=t2.next;
                }

                if(t1==null && t2==null){
                    if(carry==1){
                        Node nd = new Node(1);
                        t3.next=nd;
                        t3=t3.next;

                    }
                    break;
                }
                
            }
            return start3;
        }

       
    }


    static void printing(Node start){
        Node t = start;
        System.out.print("start --> ");
        while(t != null){
            System.out.print(t.val+" --> ");
            t=t.next;
        }
        System.out.println("X");
    }
}

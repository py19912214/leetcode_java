package demo2;

/**
 * TODO
 *
 * @author: yuepan
 * @date: 2018/12/18
 */
public class Main {
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(5);
        ListNode listNode4=new ListNode(5);
        addTwoNumbers(listNode4,listNode1);
//        ListNode listNode1=new ListNode(2);
//        ListNode listNode2=new ListNode(4);
//        ListNode listNode3=new ListNode(3);
//        listNode1.next=listNode2;
//        listNode2.next=listNode3;
//        ListNode listNode4=new ListNode(5);
//        ListNode listNode5=new ListNode(6);
//        ListNode listNode6=new ListNode(4);
//        ListNode listNode7=new ListNode(9);
//        listNode4.next=listNode5;
//        listNode5.next=listNode6;
//        listNode6.next=listNode7;
//        addTwoNumbers(listNode1,listNode4);
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void addTwoNumbers(ListNode l1, ListNode l2) {
        int temp=0;
        ListNode result = null;
        ListNode startNode = null;
        ListNode curNode = null;
        while(l1!=null||l2!=null){
            curNode=new ListNode(l1!=null?l1.val+(l2!=null?l2.val:0):0+(l2!=null?l2.val:0));
            if(temp==1){
                curNode.val++;
                temp=0;
            }
            if(curNode.val>=10){
                curNode.val=curNode.val-10;
                temp=1;
            }
            if(result==null){
                startNode=curNode;
                result=curNode;
            }else{
                result.next=curNode;
                result=curNode;
            }
            l1=(l1==null||l1.next==null?null:l1.next);
            l2=(l2==null||l2.next==null?null:l2.next);
        }
        if(temp==1){
            curNode.next=new ListNode(1);
        }

        System.out.println(startNode);
    }
}

Public class MergeSort{
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) throws IOException {
        SinglyLinkedListNode mergePointer = head1;
        SinglyLinkedListNode temp = null;
        
        if(head2.data < head1.data){
              mergePointer = head2;
              head2 = head1;
              head1 = mergePointer;
        }
        
        while(mergePointer.next!=null && head2 != null){
          if(head2.data <= mergePointer.next.data && mergePointer.next !=null){
              temp = mergePointer.next;
              mergePointer.next = head2;
              head2 = temp;
          }
            mergePointer=mergePointer.next;
        }
        mergePointer.next = head2;
    return head1;
    }
}
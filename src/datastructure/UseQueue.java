package datastructure;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<String> useQueue = new LinkedList<String>();

        useQueue.add("A");
        useQueue.add("B");
        useQueue.add("C");

        for (String letters : useQueue){
            System.out.println(letters);
        }


        Iterator<String> itr = useQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Element removed from the queue : " + useQueue.remove());
        System.out.println("Queue's head : " + useQueue.peek());
        System.out.println(" "+ useQueue.poll() );




        // System.out.println(useQueue);
        // System.out.println(useQueue.poll());
        // System.out.println(useQueue.peek());
        // System.out.println(useQueue.toArray()[0]);




    }

}

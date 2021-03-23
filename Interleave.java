import java.util.*;

public class Interleave {
    static void interLeaveQueue(Queue<Integer> q)
    {
        //to check the even number of elements
        if(q.size()%2==0)
            System.out.println("Input even number of integers");
        
        Stack<Integer> s = new Stack<>();
        int halfsize = q.size()/2;
        
        for(int i=0;i<halfsize;i++)
        {
            s.push(q.peek());
            q.poll();
        }
        while(!s.isEmpty())
        {
            q.add(s.peek());
            s.pop();
        }
    }
   
    
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);
        interLeaveQueue(q);
        int length = q.size();
        for(int i=0;i<length;i++)
        {
            System.out.println(q.peek() +"");
            q.poll();
                    
        }
        
    }
    
}

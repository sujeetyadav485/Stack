// ----------------------------------------------------------------------------------
// -----------Stack Using ArrayList---------------------
import java.util.ArrayList;
public class Main{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty()
        {
            return list.size()==0;
        }
        // Push Function
        public static void push(int data)
        {
            list.add(data);
        }
        //Pop Function

        public static int pop()
        {
            if(isEmpty()){
                return -1 ;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top ;
        }
        // Peek Function
        public static int peek()
        {
            if(isEmpty()){
                return -1 ;
            }
            int top = list.get(list.size()-1);

            return top ;
        }
    }
    public  void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
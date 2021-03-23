class GfG{
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
      Queue<Integer> qwe = new LinkedList<>();
      Stack<Integer> st = new Stack<>();
      
      for(Integer as : q)
      {
          st.push(as);
      }
       
        
      while(st.isEmpty()==false)
      {
          qwe.add(st.pop());
      }
        
        return qwe;
        
    }
}

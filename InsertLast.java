public class InsertLast {
    public static void main(String[] args){
        Stack<Integer> ss=new Stack<>();
        ss.push(10);
        ss.push(20);
        ss.push(30);
        ss.push(40);
        ss.push(50);
        System.out.println(ss);
        InsertLast(ss,10);
        System.out.println(ss);
    }
    public static void InsertLast(Stack<Integer> ss,int item){
        if(ss.isEmpty()){
            ss.push(item);
            return;
        }
        ss.pop();
        InsertLast(ss,item);
    }
}

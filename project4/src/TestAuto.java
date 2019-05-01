public class TestAuto {
    public static void main(String[] args){
        ParaStack<Integer> stack = new ParaStack<>();
        for(int i = 0; i < 10; i++) {
            stack.push(new Integer(i));
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

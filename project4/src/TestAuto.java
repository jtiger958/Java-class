public class TestAuto {
    public static void main(String[] args){
        GenericStack stack = new GenericStack();
        for(int i = 0; i < 10; i++) {
            stack.push(new Integer(i));
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
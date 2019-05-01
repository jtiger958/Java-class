public class TestAuto {
    public static void main(String[] args){
        GenericStack genericStack = new GenericStack();
        ParaStack<Integer> paraStack = new ParaStack<>();
        ParaStackNoLimit<Integer> paraStackNoLimit = new ParaStackNoLimit<>();

        for(int i = 0; i < 11; i++) {
            genericStack.push(new Integer(i));
        }

        for(int i = 0; i < 11; i++) {
            paraStack.push(new Integer(i));
        }

        for(int i = 0; i < 100; i++) {
            paraStackNoLimit.push(new Integer(i));
        }

        while(!genericStack.isEmpty()){
            System.out.print(genericStack.pop() + " ");
        }
        System.out.println("");
        while(!paraStack.isEmpty()){
            System.out.print(paraStack.pop() + " ");
        }
        System.out.println("");
        while(!paraStackNoLimit.isEmpty()){
            System.out.print(paraStackNoLimit.pop() + " ");
        }
        System.out.println("");

    }
}

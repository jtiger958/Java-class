public class TestAuto {
    public static void main(String[] args) throws StackFullException {
        GenericStack genericStack = new GenericStack();
        ParaStack<Integer> paraStack = new ParaStack<>();
        ParaStackNoLimit<Integer> paraStackNoLimit = new ParaStackNoLimit<>();
        ParaStackNoLimit<String> paraStackNoLimit_string = new ParaStackNoLimit<>();

        try {
            for(int i = 0; i < 20; i++) {
                genericStack.push(new Integer(i));
            }
        } catch (StackFullException e){
            System.out.println("genericStack is full");
        }

        try {
            for(int i = 0; i < 20; i++) {
                paraStack.push(new Integer(i));
            }
        } catch (StackFullException e){
            System.out.println("paraStack is full");
        }

        try {
            for(int i = 0; i < 100; i++) {
                paraStackNoLimit.push(new Integer(i));
            }
        } catch (StackFullException e){
            System.out.println("paraStackNoLimit is full");
        }

        for(int i=0; i < 5; i++){
            paraStackNoLimit_string.push(String.valueOf(i) + " line");
        }

        System.out.print("genericStack.pop(): ");
        while(!genericStack.isEmpty()){
            System.out.print(genericStack.pop() + " ");
        }
        System.out.println("");
        System.out.print("paraStack.pop(): ");
        while(!paraStack.isEmpty()){
            System.out.print(paraStack.pop() + " ");
        }
        System.out.println("");
        System.out.print("paraStack.pop(): ");
        while(!paraStackNoLimit.isEmpty()){
            System.out.print(paraStackNoLimit.pop() + " ");
        }
        System.out.println("");
        while(!paraStackNoLimit_string.isEmpty()){
            System.out.println(paraStackNoLimit_string.pop());
        }

    }
}

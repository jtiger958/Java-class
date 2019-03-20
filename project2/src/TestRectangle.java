class TestRectangle {
    public static void main(String[] args){

        Rectangle r1 = new Rectangle(1.0, 1.0);
        Rectangle r2 = new Rectangle(1.0, 2.0);
        Rectangle r3 = new Rectangle(2.0, 1.0);

        if (r2.equal(r3))
            System.out.println("two rectangles are equal.");
        else
            System.out.println("two rectangles are different.");

        if(r2.compare(r3) > 0)
            System.out.println("the first is larger than the second.");
        else if(r2.compare(r3) < 0)
            System.out.println("the first is smaller than the second.");
        else
            System.out.println("two are the same in area.");

        System.out.println(r1);
        r1.resize(2.0);
        System.out.println(r1);
    }
}


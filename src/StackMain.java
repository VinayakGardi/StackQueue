public class StackMain {
    public static void main(String[] args) throws CustomException {
//        CustomSTack cs = new CustomSTack();
//        cs.add(23);
//        cs.add(35);
//        cs.add(568);
//        cs.add(48);
//        cs.add(65);
//        System.out.println(cs.peek());
//        System.out.println(cs.remove());;
//        System.out.println(cs.peek());
//        System.out.println(cs.ptr);
//        System.out.println(cs);
//        System.out.println(cs.remove());;
//        System.out.println(cs.remove());;
//        System.out.println(cs.remove());;
//        System.out.println(cs.remove());;



        DynamicStack ds = new DynamicStack(5);
        ds.add(233);
        ds.add(842);
        ds.add(35);
        ds.add(26);
        ds.add(2313);

        System.out.println(ds.peek());
        System.out.println(ds.data.length);
        ds.add(4123);
        System.out.println(ds.peek());
        System.out.println(ds.data.length);






    }
}

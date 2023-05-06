public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super(); // default constructor is called from the super class
    }

    public DynamicStack(int size){
        super(size);  // parameterized constructor is called from the super class
    }

    @Override
    public boolean add(int item) throws StackException{
        if(this.isFull()){
            int[] temp = new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.add(item);
    }


}

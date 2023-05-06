public class CustomStack  {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
   public CustomStack(int size){
         this.data = new int[size];
    }

    public boolean add(int item) throws CustomException {
        if(isFull()){
            throw new CustomException("Stack is full cannot be added");

        }
         ptr++;
         data[ptr] = item;
         return true;
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public int remove() throws CustomException {
        if(isEmpty()){
            throw new CustomException("Cannot delete from the empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws CustomException {
        if(isEmpty()){
            throw new CustomException("Cannot peek from an empty stack ");
        }
        return data[ptr];
    }


}

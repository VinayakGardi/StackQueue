public abstract class CustomQueue {
    public int[] data;
    public static final int DEFAULT_SIZE =10;
    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item) throws CustomException {
         if(isFull()){
             throw new CustomException("Cannot insert in a full queue");
         }
         data[end++] = item;
         return true;
    }

    public boolean isFull() {
        if(end == data.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(end == 0){
            return true;
        }
        return false;
    }

    public int remove() throws CustomException {
        if(isEmpty()){
            throw  new CustomException("Queue is empty cannot delete");
        }
        int removed = data[0];
        for(int i=1;i<end;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int back(){
        return data[end-1];
    }

    public int front(){
        return data[0];
    }

    public void display(){
        for(int i=end-1;i>=0;i--){
            System.out.print(data[i]+" -> ");
        }
        System.out.println();
    }


    public abstract boolean add(int item) throws CustomException;
}

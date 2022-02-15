
public class StackOfIntegers {
    private int size;
    private int[] elements;
    int counter = -1;
    
    public StackOfIntegers(){
        this.size = 16;
        this.elements = new int[16];
    }
    public StackOfIntegers(int capacity){
        this.size = capacity;
        this.elements = new int[capacity];
    }
    public boolean empty(){
        if (counter>=0){
        return false;
        }
        else 
        return true;
    }
    public int peek(){
        return this.elements[counter];

    }
    public void push(int value){
        ++counter;
        this.elements[counter]= value;
        
        
    }
    
    public int pop(){
        --counter;
        return this.elements[counter+1];
        
    }

    public int getSize() {
        return size;
    }


}



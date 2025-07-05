public class MyQueue {
    private int count = 0;
    private int popCount = 0;
    private String[] word;

    public MyQueue(int arraySize){
        this.word =  new String [arraySize];
    }

    public boolean isEmpty() {
        return count==0;
    }

    public void push(String input) {
        word[count] = input;
        ++count;
    }

    public String pop() {
        if(count==0){throw new QueueEmptyException();}
        --count;
        String output = word[popCount];
        ++popCount;
        return output;
    }
}

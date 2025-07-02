public class MyStark {
    private boolean empty = true;
    private int count;
    private String[] word;

    public MyStark(int starkSize) {
        word = new String[starkSize];
    }

    public boolean isEmpty() {
         return count == 0;
    }

    public void push(String l) {
        count++;
        word[count]  = l;
    }

    public String pop() {
        if (count == 0) {throw new StackUnderFlowException();}
        return word[count--];
    }
}

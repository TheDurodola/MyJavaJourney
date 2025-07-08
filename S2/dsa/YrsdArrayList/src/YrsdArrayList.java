public class YrsdArrayList {
    private boolean status = true;
    private String[] content = new String[0];
    private int listSize;


    public boolean isEmpty() {
        return listSize == 0;
    }

    public void add(String input) {
        String [] tempHolder = content;
        int newSize = content.length + 1;
        content = new String[newSize];
        for (int i = 0; i < tempHolder.length; i++) {
            content[i] = tempHolder[i];
        }
        listSize++;
        content[newSize-1] = input;
    }

    public int size(){
        return content.length;
    }

    public String check(int index) {
        return content[index];
    }

    public void remove(int index) {
        content[index] = null;
        String[] tempHolder = new String[content.length-1];
        for (int counter = 0; counter < tempHolder.length; counter++) {
            for (int count =0; count < content.length; count++) {
                if (content[count] != null) {
                tempHolder[counter] = content[count];
                }
            }
        }
        listSize--;
        content = tempHolder;
    }
}

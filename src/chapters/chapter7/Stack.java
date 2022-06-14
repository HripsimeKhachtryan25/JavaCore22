package chapters.chapter7;

public class Stack {
    public int stck[] = new int[10];
    public int tos;

    public Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9) {
            System.out.println("stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("stack no download.");
            return 0;
        } else {
            return stck[tos--];
        }
    }

    public boolean isEmpty() {
        return tos == -1;
    }
}

package homework.bracechecker;

import chapters.chapter7.Stack;
import chapters.chapter7.Stack1;

import java.nio.charset.StandardCharsets;

public class BraceChechker {
    public String text;
    private Stack stack = new Stack();

    public BraceChechker(String text) {
        this.text = text;
    }

    public void check() {

        System.out.println(text);
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int last;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error: closed " + c + "but closed at " + i);
                    } else if (last != '(') {
                        System.err.println("Error: closed " + c + "but opened " + (char) last + "at " + i);
                    }
                    break;
                case '}':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error: closed " + c + "but closed at " + i);
                    } else if (last != '{') {
                        System.err.println("Error: closed " + c + "but opened " + (char) last + "at " + i);
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error: closed " + c + "but closed at " + i);
                    } else if (last != '[') {
                        System.err.println("Error: closed " + c + "but opened " + (char) last + "at " + i);
                    }
                    break;
            }


        }
//        int last;
//        while( (last = stack.pop()) != 0 ){
//            System.err.println("Error: opened " + (char)stack.pop() + "but not closed");
//        }
        while (!stack.isEmpty()) {
            System.err.println("Error: opened " + (char) stack.pop() + "but not closed ");
        }
    }
}




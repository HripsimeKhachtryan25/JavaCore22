package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] SpaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startIndex = 0;
        int endIndex = SpaceArray.length - 1;
        for (int i = 0; i < SpaceArray.length; i++) {
            if (SpaceArray[startIndex] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }

        for (int i = endIndex; i < 0; i--) {
            if (SpaceArray[endIndex] == ' ') {
                endIndex++;
            } else {
                break;
            }
        }
        int length = endIndex - startIndex + 1;
        char result[] = new char[length];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = SpaceArray[i];
        }
        for (char c : result) {
            System.out.print(c);

        }

    }
}
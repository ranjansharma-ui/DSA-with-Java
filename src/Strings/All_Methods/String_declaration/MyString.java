package Strings.All_Methods.String_declaration;

public class MyString {
    private char[] data;
    private int length;

    public MyString() {
        this.data = new char[0];
        this.length = 0;
    }
    public MyString(String str) {
        this.length = str.length();
        this.data = new char[this.length];
        for (int i = 0; i < this.length; i++) {
            this.data[i] = str.charAt(i);
        }
    }

    public MyString(char[] chars) {
        this.length = chars.length;
        this.data = new char[length];
        System.arraycopy(chars, 0, this.data, 0, length);
    }

    public int length() {
        return this.length;
    }

    public char charAt(int index) {
        if (index < 0 || index >= length) {
            throw new StringIndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }
        return data[index];
    }

    public MyString concat(MyString str) {
        char[] newData = new char[this.length + str.length];
        System.arraycopy(this.data, 0, newData, 0, this.length);
        System.arraycopy(str.data, 0, newData, this.length, str.length);
        return new MyString(newData);
    }

    @Override
    public String toString() {
        return new String(data);
    }

    public static void main(String[] args) {
        MyString str1 = new MyString("Hello");
        MyString str2 = new MyString(" World");
        MyString str3 = str1.concat(str2);
        System.out.println(str3); // Output: Hello World
        System.out.println("Length of str3: " + str3.length()); // Output: Length of str3: 11
        System.out.println("Character at index 4: " + str3.charAt(4)); // Output: Character at index 4: o

    }
}
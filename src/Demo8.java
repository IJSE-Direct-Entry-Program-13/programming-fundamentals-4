class Demo8 {
    void main() {
        int a = 5;
        int b = 3;
        myMethod(a, b);
    }

    void myMethod(/*Demo8 this,*/ int x, int y) {
        int result = x + y;
    }
}
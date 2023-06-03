public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
    }

    int calculate(int x) {
       return x*2;
    }

    void hello() {
        System.out.println("hello");
    }

    void sorry() {
        System.out.println("sorry");
    }

    int happy;
    int sad;

    public int getHappy() {
        return happy;
    }

    public int getSad() {
        return sad;
    }

    public void setHappy(int happy) {
        this.happy = happy;
    }

    public void setSad(int sad) {
        this.sad = sad;
    }
}

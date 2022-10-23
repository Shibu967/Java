class MethodOverriding {
    void Show() {
        System.out.println("Shibu Kumari");
    }

}

class Xyz extends MethodOverriding {
    void Show() {
        System.out.println("Abhay Kumar");
    }

    public static void main(String[] args) {
        MethodOverriding ov = new MethodOverriding();
        ov.Show();
    }
}

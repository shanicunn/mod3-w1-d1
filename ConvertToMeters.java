class Main {
    public static void main (String[] args) {
        ConvertToMeters(1000);
    }
    static void ConvertToMeters (double inches) {
        double meters = inches * 0.0254;
        System.out.println(inches + " inches * " + " 0.0254 = " + meters + " meters");
    }
}
public class QuarterYear {
    public static int quarterOf(int month) {
        return (month-1)/3 + 1;
    }

    public static void main(String[] args) {
        System.out.println(QuarterYear.quarterOf(3));
        System.out.println(QuarterYear.quarterOf(8));
        System.out.println(QuarterYear.quarterOf(11));

    }

}
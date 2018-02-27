package clientwscalculator;

public class ClientWSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sum = " + sum(1,2));
        System.out.println("Rest = " + rest(1,1));
        System.out.println("Mult = " + mult(100,100));
        System.out.println("Div = " + div(2,4));
    }

    private static int sum(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }

    private static int rest(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.rest(n1, n2);
    }

    private static int mult(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.mult(n1, n2);
    }

    private static float div(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.div(n1, n2);
    }
}
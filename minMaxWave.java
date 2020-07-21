public class minMaxWave {

private double waveLength;
private double distanceBetweenSlitScreen;
private double orderInterference;
private double minimumObserved;
private double spacingOfSlits;

private int lowRange;
private int highRange;

private double smallestWave;
private int smallestOrder;

private double largestWave;
private int largestOrder;



public minMaxWave(double lambda, double l, double m, double y, int low, int high){
        waveLength = lambda;
        distanceBetweenSlitScreen = l;
        orderInterference = m-1;
        minimumObserved = y;

        lowRange = low;
        highRange = high;

        calculateDistance();

}

private void calculateDistance(){

        double numerator = (orderInterference+0.5)*(waveLength/1000000)*(distanceBetweenSlitScreen*1000);
        double denominator = minimumObserved;

        spacingOfSlits = ((numerator/denominator)/(100000));
        calculateMinimums();
}

private void calculateMinimums(){
        int n = 1;

        smallestWave = (2*(orderInterference+0.5)*(waveLength))/n;

        while (smallestWave >= lowRange) {
                n += 2; // n must be odd;
                smallestWave = (2*(orderInterference+0.5)*(waveLength))/n;
                //System.out.println("\nn: " + n + "\nnewWave: " + newWave);
        }
        this.smallestOrder = n-2;
        smallestWave = (2*(orderInterference+0.5)*(waveLength))/smallestOrder;
        calculateMaximums();
}

private void calculateMaximums(){
        int n = smallestOrder;

        largestWave = (2*(orderInterference+0.5)*(waveLength))/n;

        while (largestWave <= highRange) {
                n -= 2; // n must be odd;
                largestWave = (2*(orderInterference+0.5)*(waveLength))/n;
                //System.out.println("\nn: " + n + "\nnewWave: " + newWave);
        }
        this.largestOrder = n+2;
        largestWave = (2*(orderInterference+0.5)*(waveLength))/largestOrder;
}

public String toString(){
        StringBuilder b = new StringBuilder();
        b.append("\n****************************************************");
        b.append("\nCalculations:");
        b.append("\n****************************************************\n");

        b.append("\nLambda: " + waveLength + " nm");
        b.append("\nL: " + distanceBetweenSlitScreen*1000 + " mm");
        b.append("\nm: " + orderInterference);
        b.append("\ny: " + minimumObserved + " mm");
        b.append("\nd: " + spacingOfSlits + " mm");
        b.append("\n");
        b.append("\nMinimum waveLength: " + smallestWave + " nm");
        b.append("\nMinimum Order: " + smallestOrder);
        b.append("\n");
        b.append("\nLargest waveLength: " + largestWave + " nm");
        b.append("\nLargest Order: " + largestOrder);

        return b.toString();
}

public static void main(String args[]){
        minMaxWave question = new minMaxWave (Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));
        //minMaxWave question = new minMaxWave (530, 2, 10, 7.10);
        //minMaxWave question = new minMaxWave (500, 2, 10, 7.10);
        System.out.println(question);

}

}

import java.lang.Math;

public class LinearEquation
{
    private int xValue;
    private int yValue;
    private int x2Value;
    private int y2Value;

    public LinearEquation (int x, int y, int x2, int y2)
    {
        xValue = x;
        yValue = y;
        x2Value = x2;
        y2Value = y2;
    }

    public double calculateXDistance()
    {
        return (x2Value - xValue);
    }

    public double calculateYDistance()
    {
        return (y2Value-yValue);
    }

    public double calculateTotalDistanceSquared()
    {
        return ((calculateYDistance()*calculateYDistance())+(calculateXDistance()*calculateXDistance()));
    }

    public double calculateTotalDistance()
    {
        return ((int)(Math.sqrt(calculateTotalDistanceSquared())*100))/100.00;
    }

    public String slopeString()
    {
        return calculateYDistance() + "/" + calculateXDistance();
    }

    public double calculateSlope()
    {
        return (calculateYDistance()/calculateXDistance());
    }

    public double yIntercept()
    {
        return yValue - calculateSlope()*xValue;
    }

    public String slopeInterceptForm()
    {
        return "y = " + slopeString() + "x" + " + " + ((int)(yIntercept())*100)/100.00;
    }

    public double findOutputOfThirdValue(double thirdValue)
    {
        return ((int)((calculateSlope()*thirdValue + yIntercept())*100))/100.00;
    }
}

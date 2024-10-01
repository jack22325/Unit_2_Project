import java.lang.Math;

public class LinearEquation
{
    private int xValue;
    private int yValue;
    private int x2Value;
    private int y2Value;

    public LinearEquation(int x, int y, int x2, int y2)
    {
        xValue = x;
        yValue = y;
        x2Value = x2;
        y2Value = y2;
    }

    public int calculateXDistance()
    {
        return (x2Value - xValue);
    }

    public int calculateYDistance()
    {
        return (y2Value-yValue);
    }

    public double calculateTotalDistanceSquared()
    {
        return ((calculateYDistance()*calculateYDistance())*(calculateXDistance()*calculateXDistance()));
    }

    public double calculateTotalDistance()
    {
        return Math.sqrt((int) calculateTotalDistanceSquared()*100)/100.0;
    }

    public String slopeString()
    {
        return calculateYDistance() + "/" + calculateXDistance();
    }

}

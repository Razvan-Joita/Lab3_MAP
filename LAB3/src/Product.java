import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Math.abs;

enum Demand
{
    RISING,
    STAGNAT,
    FAILING
}

public class Product {

    public String name;
    public String trend;
    private double []UniSold;
    private double []UniProduced;


    public int getRecommandations() {
        return recommandations;
    }

    public void setRecommandations(int recommandations) {
        this.recommandations = recommandations;
    }

    private int recommandations;


    public Product(String name, String trend, double[] uniSold, double[] uniProduced,int recommandations)
    {
        this.name = name;
        this.trend = trend;
        UniSold = uniSold;
        UniProduced = uniProduced;
        this.recommandations=recommandations;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", trend=" + trend +
                ", UniSold=" + Arrays.toString(UniSold) +
                ", UniProduced=" + Arrays.toString(UniProduced) +
                ", recommandations=" + recommandations +
                '}';
    }

    public boolean updateDemand()
    {
        int Year1= (int) (UniSold[0]/UniProduced[0]);
        int Year2= (int) (UniSold[1]/UniProduced[1]);
        if(abs(Year1-Year2)>0.3)
        {
            this.trend= String.valueOf(Demand.STAGNAT);
        }
        else if(Year1==Year2)
        {
            this.trend= String.valueOf(Demand.FAILING);
        }
        else
        {
            this.trend= String.valueOf(Demand.RISING);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    public double[] getUniSold() {
        return UniSold;
    }

    public void setUniSold(double[] uniSold) {
        UniSold = uniSold;
    }

    public double[] getUniProduced() {
        return UniProduced;
    }

    public void setUniProduced(double[] uniProduced) {
        UniProduced = uniProduced;
    }



    public double getDemandYear2()
    {
        return UniSold[1]/UniProduced[1];
    }

    public double getDemandYear1() {
        return UniSold[0]/UniProduced[0];

    }
}




class productDemandComparator implements Comparator<Product>
{

    @Override
    public int compare(Product o1, Product o2)
    {
        return Double.compare(o1.getDemandYear1(),o2.getDemandYear2());

    }

}


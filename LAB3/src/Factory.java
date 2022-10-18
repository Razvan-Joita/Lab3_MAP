import java.util.List;




public class Factory {

    private List<Product> products;

    public Factory(List<Product> products) {
        this.products = products;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> sortbydemand()
    {
        products.sort(new productDemandComparator());
        return products;
    }


    public void updateDemand()
    {
        for(Product product:products)
        {
           product.updateDemand();
        }
    }

    public void Heuristik()
    {
        String RISING;
        for(Product product:products)
        switch(product.getTrend())
        {


            // case Demand.STAGNAT -> product.setRecommandations((int) (product.getUniSold()[0]*1.1));

            //case Demand.FAILING->product.setRecommandations((int) ((int)(product.getUniSold()[0])*2.2));

        }
    }

    @Override
    public String toString() {
        return "Factory{" +
                "products=" + products +
                '}';

    }
}

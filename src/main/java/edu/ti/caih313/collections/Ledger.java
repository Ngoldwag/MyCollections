package edu.ti.caih313.collections;
import java.util.ArrayList;
import java.util.List;

public class Ledger {
    Double totalValue=0.0;
    double averageSales;
    public List<Double> sale = new ArrayList<Double>();
    double maxSales = 100.00;

    public static void main(String[] args) {
        try{
        System.out.println("We wil now test the ledger!");
        System.out.println("The ledger will add the following 6 sales-" +
                "1.23, 2.34, 3.45, 12.34, 23.45, 123.45");
        Ledger sales = new Ledger();
        sales.addSale(1.23);
        sales.addSale(2.34);
        sales.addSale(3.45);
        sales.addSale(12.34);
        sales.addSale(234.5);
        sales.addSale(123.45);
        int numOfSales = (int) sales.getNumberOfSales();
        double totalVal = sales.getTotalSales();
        double averageSales = sales.getAverageSale(totalVal);
        int salesAboveMax = sales.getCountAbove();
        System.out.println("The total amount of sales made is " + numOfSales);
        System.out.println("The total value of sales made is " + totalVal);
        System.out.println("The average value of the sales is " + averageSales);
        System.out.println("And the total number of sales that exceeded the maximum value is " + salesAboveMax);
    }
        catch(NullPointerException e)
    {
        System.out.print("NullPointerException Caught");
    }
    }
        public List<Double> addSale(double d){
            sale.add(d);
            totalValue+=d;
            return sale; }

        public  int getNumberOfSales() { return sale.size();}
        public double getTotalSales() { return totalValue; }
        public  double getAverageSale(double total) {
                averageSales= total/getTotalSales();
            return averageSales; }

        public  int getCountAbove() {
            int count=0;
        for(int i=0;i<sale.size();i++){
        if(sale.get(i)>maxSales){
            count++;
        }}
        return count;
        }

}
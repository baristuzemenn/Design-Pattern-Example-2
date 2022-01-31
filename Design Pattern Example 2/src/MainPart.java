import java.util.ArrayList;

class MainPart implements Part{
    private String name;
    private int price;
    private ArrayList<Part> subparts;


    public MainPart(String name){
        this.name = name;
        price = 0;
        subparts = new ArrayList<>();
    }


    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public void setPrice(){
        int pr = 0;
        if(subparts.size()>0){
            for(Part p : subparts){
                pr = pr + p.getPrice();
            }
        }
        price = pr;
    }

    @Override
    public void setPrice(int price){
        this.price  = price;
    }

    @Override
    public void addPart(Part part){
        subparts.add(part);
    }

    @Override
    public void printDetails(){
        if(subparts.size() > 0){
            for(Part p : subparts){
                p.printDetails();
            }
            System.out.println("Composite Name:" + name + "\tTotal Price:" + Integer.toString(price));
        }else{
            System.out.println("Device Name:" + name + "\tPrice:" + Integer.toString(price));
        }
    }
}
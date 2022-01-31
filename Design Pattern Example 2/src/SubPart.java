class SubPart implements Part{
    private String name;
    private int price;
    public SubPart(String name, int price){
        this.name = name;
        this.price = price;
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
        ;
    }

    @Override
    public void setPrice(int price){
        ;
    }

    @Override
    public void addPart(Part part){
        ;
    }

    @Override
    public void printDetails(){
        System.out.println("Device Name:" + name + "\tPrice:" + Integer.toString(price));
    }
}
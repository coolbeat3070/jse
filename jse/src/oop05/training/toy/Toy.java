package oop05.training.toy;

public class Toy {
	String name ;
    int price;
    ToySpec spec;
    public Toy (){}
    public Toy (String name, int price, ToySpec spec){
         this.name = name;
         this.price = price;
         this.spec = spec;
    }
    public String getName() {
         return name;
    }
    public void setName(String name) {
         this.name = name;
    }
   
    public int getPrice() {
         return price;
    }
    public void setPrice(int price) {
         this.price = price;
    }
   
    public ToySpec getSpec() {
         return spec;
    }
    public void setSpec(ToySpec spec) {
         this.spec = spec;
    }
    public boolean equals(String name){
         String currentName = name;
         String targetName = this.getName();
         return currentName.equalsIgnoreCase(targetName);
    }
    @Override
    public String toString() {
        
         return "인형이름:"+getName()+"\n가격:"+getPrice()+"\n사양"+getSpec();
    }
   
}

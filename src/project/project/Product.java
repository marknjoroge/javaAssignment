

import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Product implements Item{

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  

    int serialNumber;
    String manufacturer = Item.Manufacturer;
    Date manufacturedOn;
    String name;

    public Product(String name) {
        this.name = name;
        serialNumber = currentProductionNumber++;
        manufacturedOn = new Date();

    }

    int currentProductionNumber = 1;
    // public static void main(String [] args) {
    //     Item.ItemType item = Item.ItemType.AU;
    //     System.out.println(item);
    // }

    public void setProductionNumber(int productionNumber){ currentProductionNumber = productionNumber;}

    public void setName(String name){

    }

    public String getName(){ return name; }

    public Date getManufactureDate(){ return manufacturedOn;}

    public int getSerialNumber(){ return serialNumber; }

    public String toString() {
        return "\nManufacturer  :  " + manufacturer  
             + "\nSerial Number :  " + serialNumber
             + "\nDate          :  " + formatter.format(manufacturedOn)
             + "\nName          :  " + name;

    }

}

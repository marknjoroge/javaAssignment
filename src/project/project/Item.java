

import java.util.Date;

public interface Item{

    static final String Manufacturer = "ScaiProduction";

    public void setProductionNumber(int param);
    public void setName(String name);
    public String getName();
    public Date getManufactureDate();
    public int getSerialNumber();
    

    // enum ItemType {
    //     VN,
    //     AU
    // };
}

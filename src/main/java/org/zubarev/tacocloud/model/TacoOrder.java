package org.zubarev.tacocloud.model;

import java.util.ArrayList;
import java.util.List;

public class TacoOrder {
    private String deliveryName;
    private String DeliveryStreet;
    private String DeliveryCity;
    private String DeliveryState;
    private String DeliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private List<Taco> tacos=new ArrayList<>();
    public void addTaco(Taco taco){
        this.tacos.add(taco);
    }
}

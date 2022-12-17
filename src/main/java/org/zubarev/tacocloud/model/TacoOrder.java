package org.zubarev.tacocloud.model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class TacoOrder implements Serializable {
    private static final long serialVersionUID=1l;
    private long id;
    private Date placedAt;
    @NotBlank(message="Delivery name is required")
    private String deliveryName;
    @NotBlank(message="Street is required")
    private String DeliveryStreet;
    @NotBlank(message="Street is required")
    private String DeliveryCity;
    @NotBlank(message="State is required")
    private String DeliveryState;
    @NotBlank(message="Zip code is required")
    private String DeliveryZip;
    @CreditCardNumber(message="Not a valid credit card number")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
            message="Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;
    private List<Taco> tacos=new ArrayList<>();
    public void addTaco(Taco taco){
        this.tacos.add(taco);
    }
}

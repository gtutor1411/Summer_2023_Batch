package com.api.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NewBookingData {
	
    public String firstname;
    public String lastname;
    public int totalprice;
    public boolean depositpaid;
    public String bookingdates;

}

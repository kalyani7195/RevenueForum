package com.ideas.RevenueManagementForum;

import com.ideas.RevenueManagementForum.Address;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * Created by idnklm on 3/7/2018.
 */
public class AddressTest {
    Address address;

    private static final String SHERATON_GRAND= "Sheranton Grand";
    private static final String PUNE="Pune";
    private static final String MAHARASHTRA="Maharashtra";
    private static final String INDIA="India";
    private static final Integer SANGAMVADI_PIN_CODE = 411001;
    private static final String LINKTOGOOGLEMAP="LINKTOSHERATONGRAND";

    @Before
    public void setUp(){
        address=new Address();
    }

    @Test
    public void constructorShouldSetDetailsPincodeCityStateCountry(){
        address=new Address(SHERATON_GRAND,PUNE,SANGAMVADI_PIN_CODE,MAHARASHTRA,INDIA,LINKTOGOOGLEMAP);
        assertTrue(address.getDetails().equals(SHERATON_GRAND));
        assertTrue(address.getCity().equals(PUNE));
        assertTrue(address.getState().equals(MAHARASHTRA));
        assertTrue(address.getPinCode().equals(SANGAMVADI_PIN_CODE));
        assertTrue(address.getCountry().equals(INDIA));


    }


    @Test
    public void shouldSetDetails(){
        setUp();
        address.setDetails(SHERATON_GRAND);
        assertTrue(address.getDetails().equals(SHERATON_GRAND));
    }

    @Test
    public void shouldSetCity(){
        setUp();
        address.setCity(PUNE);
        assertTrue(address.getCity().equals(PUNE));
    }

    @Test
    public void shouldSetState(){
        setUp();
        address.setState(MAHARASHTRA);
        assertTrue(address.getState().equals(MAHARASHTRA));
    }


    @Test
    public void shouldSetPinCode(){
        setUp();
        address.setPinCode(SANGAMVADI_PIN_CODE);
        assertTrue(address.getPinCode().equals(SANGAMVADI_PIN_CODE));
    }

    @Test
    public void shouldSetCountry(){
        setUp();
        address.setCountry(INDIA);
        assertTrue(address.getCountry().equals(INDIA));
    }

    @Test
    public void shouldSetLinkToGoogleMap(){
        setUp();
        address.setLinkToGoogleMap(LINKTOGOOGLEMAP);
        assertTrue(address.getLinkToGoogleMap().equals(LINKTOGOOGLEMAP));
    }




}

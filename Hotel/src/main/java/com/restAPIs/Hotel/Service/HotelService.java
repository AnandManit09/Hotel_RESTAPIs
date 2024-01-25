package com.restAPIs.Hotel.Service;

import java.util.*;
//import java.util.List;

import org.springframework.stereotype.Service;

import com.restAPIs.Hotel.Model.Hotel;
@Service
public class HotelService {
	
	Hotel hotel;
	List<Hotel> hotelList=new ArrayList<Hotel>();
	Map<String,Hotel> hotelMap=new HashMap<String,Hotel>();
	
	public void createHotel(Hotel hotel) {
		this.hotelList.add(hotel);
		this.hotelMap.put(hotel.getId(), hotel);
		
	}
	
	public List<Hotel> getHotelList() {
		return this.hotelList;
	}
	
	public Hotel getHotelbyId(String id) {
		return this.hotelMap.get(id);
	}
	
	
	
	
	

}

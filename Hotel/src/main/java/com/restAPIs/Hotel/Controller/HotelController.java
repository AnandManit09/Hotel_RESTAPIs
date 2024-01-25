package com.restAPIs.Hotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restAPIs.Hotel.Model.Hotel;
import com.restAPIs.Hotel.Service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	//Hotel hotel;
	@Autowired
	HotelService hotelService;
	
	
	@GetMapping("/getHotel/{id}")
	public Hotel getHotelbyId(@PathVariable String id) {
		return hotelService.getHotelbyId(id);
	}
	
	@PostMapping("/create")
	public void createHotel(@RequestBody Hotel hotel) {
		hotelService.createHotel(hotel);
		
	}
	
}

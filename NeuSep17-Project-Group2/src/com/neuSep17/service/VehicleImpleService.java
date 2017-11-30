package com.neuSep17.service;
import java.util.ArrayList;
import com.neuSep17.dao.VehicleImple;

import com.neuSep17.dto.Dealer;
import com.neuSep17.dto.Inventory;
import com.neuSep17.dto.Vehicle;


/*********************************************************
 * This class does not access gmps-**** files directly.
 * Hence, all the methods in this class must call the corresponding
 * methods provided in the VehicleImple class (located in the com.neuSep17.dao folder),
 * which reads data from the gmps-***files, and returns them to the calling methods
 *
 *********************************************************/

//provide implementations for IVehicle interface

public class VehicleImpleService {
	
	private Dealer dealer;
	private VehicleImple vehicleImple;
	
	public VehicleImpleService(Dealer d) {
		this.dealer =d;
		vehicleImple = new VehicleImple();
	}
		
	public ArrayList<Inventory> getInventoryForDealers(ArrayList<Dealer> dealers){
		return vehicleImple.getInventoryForDealers(dealers);
	}
		
	public Inventory getInventory(){	
			return vehicleImple.getInventory(dealer.getId());					
	}
	
	public Vehicle getAVehicle(String vehicleID) {
		return vehicleImple.getAVehicle(dealer.getId(), vehicleID);
	}
	
	// searched by year, color, model, etc.., not by vehicleID	
	public Inventory searchInventory(Vehicle vehicle){			
		return vehicleImple.searchInventory(dealer.getId(), vehicle);
	}
	
	public boolean addVehicle(Vehicle v) {		 
		return vehicleImple.addVehicle(dealer.getId(), v);
	}	
	
	public boolean updateVehicle(String dealerID, Vehicle v) {
		
		return vehicleImple.updateVehicle(dealer.getId(), v);
	}
	
	public boolean deleteVehicle(String vehicleID) {
		return vehicleImple.deleteVehicle(dealer.getId(), vehicleID);
	}
	
}

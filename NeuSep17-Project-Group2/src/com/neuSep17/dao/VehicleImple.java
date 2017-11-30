package com.neuSep17.dao;
        
import java.util.ArrayList;
       
import java.util.Collections;
      

import com.neuSep17.dto.Dealer;
import com.neuSep17.dto.Inventory;
import com.neuSep17.dto.Vehicle;
       


//THIS CLASS IMPLEMENTS LOGIC TO ACCESS gmps-****-*** files

public class VehicleImple implements IVehicleManager {
	
	
    public VehicleImple() {    	
    }
    
  //new method per feedback
    @Override
    public ArrayList<Inventory> getInventoryForDealers(ArrayList<Dealer> dealers){
    	ArrayList<Inventory> inventories=null;
    	/*
    	 * 
    	 * CODE HERE TO ACCESS GMPS-*** FILES
    	 */    	
    	return inventories;
    }
    
    @Override
	public Inventory getInventory(String dealerID) {
    	Inventory inventory=null;
    	/*
    	 * 
    	 * CODE HERE TO ACCESS GMPS-*** FILES
    	 */    
    	return inventory;		
	}
    
    @Override
	public Vehicle getAVehicle(String dealerId, String vehicleID) {
    	Vehicle vehicle= null;
    	/*
    	 * 
    	 * CODE HERE TO ACCESS GMPS-*** FILES
    	 */   
    	return vehicle;
	}
    
	@Override
	public Inventory searchInventory(String dealerID, Vehicle vehicle) { // searched by year, color, model, etc.., not by vehicleID 
		Inventory inventory =null;
		/*
    	 * 
    	 * CODE HERE TO ACCESS GMPS-*** FILES
    	 */  
		return inventory;
	}
	
	@Override
	public boolean addVehicle(String dealerID, Vehicle v) {
		boolean isSuccess =false;
		/*
    	 * 
    	 * CODE HERE TO ACCESS GMPS-*** FILES
    	 */  
		return isSuccess;
	}
	
	@Override
	public boolean updateVehicle(String dealerID, Vehicle v) {
		if(deleteVehicle(dealerID, v.getID()) && addVehicle(dealerID, v)) {
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteVehicle(String dealerID, String vehicleID) {
		boolean isSuccess =false;
		/*
    	 * 
    	 * CODE HERE TO ACCESS GMPS-*** FILES
    	 */  
		return isSuccess;
	}
	
	//call this to sort
    public void sortBy(ArrayList<Vehicle> v, String sortingField) {
    	for(Vehicle vehicle : v) {
    		vehicle.setSortingField(sortingField);
    	}
    	Collections.sort(v);
    }

}

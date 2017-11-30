package com.neuSep17.dao;


import java.io.IOException;
import java.util.*;

import com.neuSep17.dto.Dealer;

//provide implementations for IDealer interface
//and access dealer files

public class DealerImple implements IDealerManager {
	
	public DealerImple() throws IOException {
		
	}
	@Override
	public ArrayList<Dealer>getDealers(){
		ArrayList<Dealer> dealers =null;
		/*****************************
		 * Code to access dealer file here
		 * 
		 */
		return dealers;
	}
	@Override
	public Dealer getADealer(String dealerID) {
		Dealer dealer =null;
		/*****************************
		 * Code to access dealer file here
		 * 
		 */
		return dealer;
	}
	
	@Override
	public boolean updateDealer(Dealer dealer) {
		if(deleteDealer(dealer.getId()) && addDealer(dealer)) {
			return true;
		}
		return false;		
	}
	@Override
	public boolean addDealer(Dealer dealer){
		boolean isSucess =false;
		/*****************************
		 * Code to access dealer file here
		 * 
		 */
		return isSucess;
	}
	@Override
	public boolean deleteDealer(String dealerID) {
		boolean isSucess =false;
		/*****************************
		 * Code to access dealer file here
		 * 
		 */
		return isSucess;
	}

}

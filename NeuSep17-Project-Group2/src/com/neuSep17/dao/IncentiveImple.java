package com.neuSep17.dao;

import com.neuSep17.dto.Dealer;
import com.neuSep17.dto.Incentive;
import com.neuSep17.io.FileReading;

import java.io.File;
import java.util.ArrayList;

public class IncentiveImple implements IIncentiveManager {

    //An arrayList to store all the incentive object from data file 'data/incentives'
    ArrayList<Incentive>  allIncentives = new ArrayList<>();

    public IncentiveImple(){
        File incentfile = new File("data/incentives"); //create an instance for data/incentives file
        allIncentives = FileReading.getAllIncentives(incentfile); //retrieving all the incentives despite of dealerID
    }

    @Override
    public ArrayList<Incentive> getIncentivesForDealer(Dealer dealer) {
        //create an arrayList of Incentive for a specific dealer
        ArrayList<Incentive> dealerIncentives = new ArrayList<>();
        //for loop to filter out the incentive which is not belongs to this dealer
        for(Incentive i : allIncentives){
            if(i.getDealerID().equals(dealer.getId()))
                dealerIncentives.add(i);
        }
        return dealerIncentives;
    }

    @Override
    public boolean updateAIncentive(String dealerID, Incentive incentive) {
        
        return false;
    }

    @Override
    public boolean addAIncentive(String dealerID, Incentive incentive) {

        return false;
    }

    @Override
    public boolean deleteAIncentive(String dealerID, Incentive incentive) {

        return false;
    }

    @Override
    public Incentive getAIncentive(String incentiveID) {
        //for loop to get that unique incentive
        for(Incentive i : allIncentives){
            if(i.getID().equals(incentiveID))
                return i;
        }
        //else return null
        return null;
    }

}

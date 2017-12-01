package com.neuSep17.dto;

import java.util.ArrayList;


public class Incentive {
	private String ID;
	private String dealerID;
	private String title;
	private String startDate; //format should be "MM-DD-YYY"
	private String endDate;//format should be "MM-DD-YYY"
	private String description;
	private float cashValue;
	
	//NOTE: convert this to String using + sign as delimiter between criteria before save to the file
	private  ArrayList<String> discountCriteria = new ArrayList<>();
	
	public Incentive() {}
	public Incentive(String ID, String dealerID, String title, String startDate, String endDate, String description,
			float cashValue, ArrayList<String> discountCriteria) {
		this.ID =ID; this.dealerID = dealerID; this.title =title; this.startDate=startDate;
		this.endDate=endDate; this.description=description; this.cashValue=cashValue; 
		this.discountCriteria=discountCriteria;
	}

	public void updateIncentive(Incentive incentive) {
	    this.ID = incentive.getID();
        this.dealerID = incentive.getDealerID();
        this.title = incentive.getTitle();
        this.startDate = incentive.getStartDate();
        this.endDate = incentive.getEndDate();
        this.description = incentive.getDescription();
        this.cashValue = incentive.getCashValue();
        this.discountCriteria = incentive.getDiscountCriteria();
    }
	
	public void setID(String id) {
		ID=id;
	}
    public void setDealerID(String dealerID) { this.dealerID = dealerID; }
    public void setTitle(String t) {
		title=t;
	}
	public void setStartDate(String sD) {
		startDate =sD;
	}
	public void setEndDate(String eD) {
		endDate =eD;
	}
	public void setDescription(String d) {
		description=d;
	}
	public void setCashValue(float cV) {
		cashValue=cV;
	}
	public void setDiscountCriteria(ArrayList<String> dC) {
		discountCriteria=dC;
	}

	public String getID() {
		return ID;
	}
    public String getDealerID() { return dealerID; }
    public String getTitle() {
		return title;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public String getDescription() {
		return description;
	}
	public float getCashValue() {
		return cashValue;
	}
	public ArrayList<String> getDiscountCriteria() {
		return discountCriteria;
	}

	@Override
    public String toString(){
	    //create a string array to store criterias
	    StringBuilder sb = new StringBuilder();
        //for loop to form the stringBuilder
        for(String s : discountCriteria){
            sb.append(s);
            sb.append("+");
        }
        sb.deleteCharAt(sb.length()-1); //delete the last + sign

	    return String.format("%s~%s~%s~%s~%s~%s~%.2f~%s\n",this.ID, this.dealerID, this.title, this.startDate, this.endDate, this.description, this.getCashValue(),sb.toString());
    }
}

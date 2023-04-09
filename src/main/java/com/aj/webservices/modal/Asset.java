package com.aj.webservices.modal;

public class Asset {

	
	 private long asset_id;
	    private String asset_name;
	    private String asset_title;
	  
	    public Asset() {
	        super();
	    }
	    public Asset(long id, String name, String title) {
	        super();
	        this.asset_id = id;
	        this.asset_name = name;
	        this.asset_title = title;
	    }
	  
	    public long getId() {
	        return asset_id;
	    }
	  
	    public void setId(long id) {
	        this.asset_id = id;
	    }
	  
	    public String getName() {
	        return asset_name;
	    }
	  
	    public void setName(String name) {
	        this.asset_name = name;
	    }
	  
	    public String getTitle() {
	        return asset_title;
	    }
	  
	    public void setTitle(String title) {
	        this.asset_title = title;
	    }
	  
	
	
}

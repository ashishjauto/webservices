package com.aj.webservices.service;

import java.util.HashSet;

import com.aj.webservices.modal.Asset;

public interface AssetService {

	 
	     HashSet<Asset> findAllAsset();
	     Asset findAssetByID(long id);
	     void addAsset(Asset b);
	     void deleteAllData();
 
	
}

package com.aj.webservices.service;

import java.util.HashSet;

import com.aj.webservices.modal.Asset;

public class AssertServiceImp implements AssetService{
	
	HashSet<Asset> assetList = new HashSet<Asset>();

	@Override
	public HashSet<Asset> findAllAsset() {
		if (assetList.isEmpty())
            return null;
        else
            return assetList;
	}

	@Override
	public Asset findAssetByID(long id) {
		Asset asset = assetList.stream().filter(b -> b.getId() == id).findAny().orElse(null);
        return asset;
	}

	@Override
	public void addAsset(Asset b) {
		assetList.add(b);
		
	}

	@Override
	public void deleteAllData() {
		assetList.clear();
		
	}
	

	 
	
	
	
	

}

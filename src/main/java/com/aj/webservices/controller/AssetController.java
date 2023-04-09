package com.aj.webservices.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aj.webservices.modal.Asset;
import com.aj.webservices.service.AssertServiceImp;

@RestController
public class AssetController {
	
	
	 @Autowired
	 AssertServiceImp assetServiceImp;
	  
	    @PostMapping("/")
	    public void addAsset(@RequestBody Asset asset) {
	    	assetServiceImp.addAsset(asset);
	    }
	  
	    @GetMapping("/findall")
	    public HashSet<Asset> getAllAsset() {
	        return assetServiceImp.findAllAsset();
	    }
	  
	    @GetMapping("/findbyid/{id}")
	    public Asset getAssetById(@PathVariable long id) {
	        return assetServiceImp.findAssetByID(id);
	    }
	  
	    @DeleteMapping("/delete")
	    public void deleteBook() {
	    	assetServiceImp.deleteAllData();
	    }
	
	
	
	

}

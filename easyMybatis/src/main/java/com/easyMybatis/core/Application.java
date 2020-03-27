package com.easyMybatis.core;

import com.easyMybatis.service.BaseService;

public class Application {

	private BaseService baseService;

    public Application(){
    	baseService = new BaseService();

    	baseService.save();
    	baseService.saveBatch();
    }

    public static void main(String[] args) {
        try {
            new Application();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

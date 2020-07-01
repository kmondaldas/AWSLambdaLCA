package com.aws.codestar.projecttemplates.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.aws.codestar.projecttemplates.GatewayResponse;
import com.reltio.lifecycle.framework.IAttributes;
import com.reltio.lifecycle.framework.ILifeCycleObjectData;
import com.reltio.lifecycle.framework.IObject;
import com.reltio.lifecycle.framework.IReltioAPI;
import com.reltio.lifecycle.lambda.LifeCycleActionHandler;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Handler for requests to Lambda function.
 */
public class HCPSynchronousValidation extends LifeCycleActionHandler {

	/*
	 * public Object handleRequest(final Object input, final Context context) {
	 * Map<String, String> headers = new HashMap<>(); headers.put("Content-Type",
	 * "application/json"); return new GatewayResponse(new
	 * JSONObject().put("Output", "Hello World!").toString(), headers, 200); }
	 */
	 public ILifeCycleObjectData beforeSave(IReltioAPI reltioAPI, ILifeCycleObjectData data) {
	        IObject object = data.getObject();
	        IAttributes attributes = object.getAttributes();
	        System.out.println("LCA:::::::::::::::::::::::::");
			return data;
	        }
}

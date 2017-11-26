/**
 * ISlaughterhouseWebServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package tier2.webservice.skeleton;

import tier2.webservice.ReadIncomingMessageResponse;
import tier2.webservice.WebServiceManager;

/**
 *  ISlaughterhouseWebServiceSkeleton java skeleton for the axisService
 */
public class ISlaughterhouseWebServiceSkeleton
    implements ISlaughterhouseWebServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param readIncomingMessage0
     * @return readIncomingMessageResponse1
     */
    public tier2.webservice.ReadIncomingMessageResponse readIncomingMessage(tier2.webservice.ReadIncomingMessage readIncomingMessage0) 
    {	
    	WebServiceManager manager = WebServiceManager.getInstance();	
    	ReadIncomingMessageResponse response = new ReadIncomingMessageResponse();  	
    	response.set_return( manager.readIncomingMessage(readIncomingMessage0.getArgs0()));
        return response;
    }
}

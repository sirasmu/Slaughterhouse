/**
 * ISlaughterhouseWebServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package tier2.webservice.skeleton;

import tier2.webservice.ContactTier2Response;

/**
 *  ISlaughterhouseWebServiceSkeleton java skeleton for the axisService
 */
public class ISlaughterhouseWebServiceSkeleton
    implements ISlaughterhouseWebServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param contactTier20
     * @return contactTier2Response1
     */
    public tier2.webservice.ContactTier2Response contactTier2(
        tier2.webservice.ContactTier2 contactTier20) {
        //TODO : fill this with the necessary business logic
//        throw new java.lang.UnsupportedOperationException("Please implement " +
//            this.getClass().getName() + "#contactTier2");
       
    
        /// IMPLEMENTATION LIES HERE
      
    	
        System.out.println("Got new message");
        System.out.println(contactTier20.getArgs0());
      ContactTier2Response res = new ContactTier2Response();
      res.set_return("ok");
      
        return res;
    }
   
    
    
}

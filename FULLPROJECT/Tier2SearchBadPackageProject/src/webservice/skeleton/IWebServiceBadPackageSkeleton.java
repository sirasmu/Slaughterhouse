/**
 * IWebServiceBadPackageSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package webservice.skeleton;

import webservice.BadPackageFunctionality;
import webservice.GetBadPackagesResponse;

/**
 *  IWebServiceBadPackageSkeleton java skeleton for the axisService
 */
public class IWebServiceBadPackageSkeleton
    implements IWebServiceBadPackageSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param getBadPackages0
     * @return getBadPackagesResponse1
     */
    public webservice.GetBadPackagesResponse getBadPackages(
        webservice.GetBadPackages getBadPackages0) {
        //TODO : fill this with the necessary business logic
    	GetBadPackagesResponse res= new GetBadPackagesResponse();
    	res.set_return(BadPackageFunctionality.getBadPackages(getBadPackages0.getArgs0()));
    	return res;
    	
    }
}

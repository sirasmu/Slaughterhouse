/**
 * SlaughterhouseWebServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package tier2.skeleton;


/**
 *  SlaughterhouseWebServiceMessageReceiverInOut message receiver
 */
public class SlaughterhouseWebServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            SlaughterhouseWebServiceSkeletonInterface skel = (SlaughterhouseWebServiceSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("getTraysForPacaking".equals(methodName)) {
                    tier2.GetTraysForPacakingResponse getTraysForPacakingResponse25 =
                        null;
                    tier2.GetTraysForPacaking wrappedParam = (tier2.GetTraysForPacaking) fromOM(msgContext.getEnvelope()
                                                                                                          .getBody()
                                                                                                          .getFirstElement(),
                            tier2.GetTraysForPacaking.class);

                    getTraysForPacakingResponse25 = skel.getTraysForPacaking(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getTraysForPacakingResponse25, false,
                            new javax.xml.namespace.QName("http://tier2",
                                "getTraysForPacakingResponse"));
                } else
                 if ("getUncutAnimals".equals(methodName)) {
                    tier2.GetUncutAnimalsResponse getUncutAnimalsResponse27 = null;
                    tier2.GetUncutAnimals wrappedParam = (tier2.GetUncutAnimals) fromOM(msgContext.getEnvelope()
                                                                                                  .getBody()
                                                                                                  .getFirstElement(),
                            tier2.GetUncutAnimals.class);

                    getUncutAnimalsResponse27 = skel.getUncutAnimals(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getUncutAnimalsResponse27, false,
                            new javax.xml.namespace.QName("http://tier2",
                                "getUncutAnimalsResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(tier2.RegisterAnimal param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(tier2.RegisterAnimal.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(tier2.AddPartToTrayType param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(tier2.AddPartToTrayType.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(tier2.RegisterPackage param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(tier2.RegisterPackage.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        tier2.GetTraysForPacaking param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(tier2.GetTraysForPacaking.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        tier2.GetTraysForPacakingResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(tier2.GetTraysForPacakingResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(tier2.GetUncutAnimals param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(tier2.GetUncutAnimals.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        tier2.GetUncutAnimalsResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(tier2.GetUncutAnimalsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        tier2.GetTraysForPacakingResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    tier2.GetTraysForPacakingResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private tier2.GetTraysForPacakingResponse wrapgetTraysForPacaking() {
        tier2.GetTraysForPacakingResponse wrappedElement = new tier2.GetTraysForPacakingResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        tier2.GetUncutAnimalsResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    tier2.GetUncutAnimalsResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private tier2.GetUncutAnimalsResponse wrapgetUncutAnimals() {
        tier2.GetUncutAnimalsResponse wrappedElement = new tier2.GetUncutAnimalsResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (tier2.AddPartToTrayType.class.equals(type)) {
                return tier2.AddPartToTrayType.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (tier2.GetTraysForPacaking.class.equals(type)) {
                return tier2.GetTraysForPacaking.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (tier2.GetTraysForPacakingResponse.class.equals(type)) {
                return tier2.GetTraysForPacakingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (tier2.GetUncutAnimals.class.equals(type)) {
                return tier2.GetUncutAnimals.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (tier2.GetUncutAnimalsResponse.class.equals(type)) {
                return tier2.GetUncutAnimalsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (tier2.RegisterAnimal.class.equals(type)) {
                return tier2.RegisterAnimal.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (tier2.RegisterPackage.class.equals(type)) {
                return tier2.RegisterPackage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class

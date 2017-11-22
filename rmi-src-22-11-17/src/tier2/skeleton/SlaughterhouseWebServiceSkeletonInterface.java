/**
 * SlaughterhouseWebServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package tier2.skeleton;

/**
 *  SlaughterhouseWebServiceSkeletonInterface java skeleton interface for the axisService
 */
public interface SlaughterhouseWebServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param registerAnimal
     */
    public void registerAnimal(tier2.RegisterAnimal registerAnimal);

    /**
     * Auto generated method signature
     *
     * @param addPartToTrayType
     */
    public void addPartToTrayType(tier2.AddPartToTrayType addPartToTrayType);

    /**
     * Auto generated method signature
     *
     * @param registerPackage
     */
    public void registerPackage(tier2.RegisterPackage registerPackage);

    /**
     * Auto generated method signature
     *
     * @param getTraysForPacaking
     */
    public tier2.GetTraysForPacakingResponse getTraysForPacaking(
        tier2.GetTraysForPacaking getTraysForPacaking);

    /**
     * Auto generated method signature
     *
     * @param getUncutAnimals
     */
    public tier2.GetUncutAnimalsResponse getUncutAnimals(
        tier2.GetUncutAnimals getUncutAnimals);
}

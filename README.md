# Slaughterhouse: 3-tier architecture 
 
The three tiers in the slaughterhouse system are: 

**Tier 1** - Presentation Tier: There are 4 types of clients: Animal Client- register animals, Tray Client- register trays, Package Client- registers packages ang Recall client- finds all packages related to a bad package. Tier 1 is implemented using C# and consumes the services available in tier2. 

*Tier 1 connects with tier 2 using web services* 

**Tier 2** - Application Tier: Business logic or logic tier, this tier is pulled from the presentation tier. It controls application functionality by performing detailed processing.  
Logic of the tier handles parsing of data received from client request, builds a local model structure, builds information received from tier 1 into objects that can be manipulated in the business logic, binds relations between the objects in order to complete the required processes, triggers saving of data using a singleton counter whenever a certain amount of data has been stored on tire 2 cache solution. Alongside the mentioned functionality, the tier 2 server saves all the time into a bin file stored locally on tier 2 server. This serves for backup in case the server is shut down unexpected and is reloaded automatically when server boots up again. The cache should be cleaned by deleting files older than defined amount of time. The deletion method will be implemented as a future feature. The second tier 2 server acts as an adaptor for retrieving all the bad packages related to a bad package. Tier 2 is implemented using Java. 

*Tier2 connects with tier 3 using RMI* 

**Tier 3** - Data Tier: Database servers where information is stored and retrieved. Data in this tier is kept independent of application servers or business logic. Tier 3 is implemented using Java. The database connected to this tier is Oracle.

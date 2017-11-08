# Slaughterhouse
3-tier distributed system. 

Rich picture / Overview diagram

Class diagram

![Model](https://raw.githubusercontent.com/sirasmu/Slaughterhouse/master/Class%20Diagram%20Slaughterhouse.png?token=AQ9lL0Z55nKYRkg4cAXjdYGTbfRSedvOks5aDFI9wA%3D%3D)

## Simulation of slaughterhouse

### IN/OUT
- Living animals arrive

- Products depart

### Positions

#### 1
Weight and registration of animal

#### 2
Cut into smaller parts. 

The parts are weighted and registrered. 

A part has a reference to the animal it comes from. 

The parts are put into trays containing only that type of part.

A tray has a maximum weight of what can be put in it.

#### 3
Products are packed for distribution. 

Example of packages: 

- Package with same parts meant for repacking in supermarket

- "half an animal" (with all the expected parts, but it can be from different animals)

- The products are registrered with a reference with the tray they came from

### Troubles

If an animal was found to be sick it should be possible to withdraw the products derived from that animal. 

This function is accesible outside the slaughterhouse.

This means it should be possible to report which products that were 'bad'.

## Other notes

Middleware between Java and C#...

Client in C#

Animal

Registrer parts


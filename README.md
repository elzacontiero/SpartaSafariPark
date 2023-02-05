# Sparta Safari Park

The project contains a number of subpackages related to different aspects of Java development taught 
at Sparta Bootcamp. 

The base package is `com.sparta.ec`, where the subpackages are located.


## `collections`

Contains:

- `CollectionsApp3`: Class with a `main` method containing:
  - examples of usage of `ArrayList<>`;
  - an exercise on `HashSet<>` and `HashMap<>`, and iterations over collections.  
- `CollectionsLabHomework` : Class with the homework related to collections. 

## `enums`

- `Enum`: simple example of usage of `enum`.
- `PizzaSize`: example of `enum` with properties.
- `Planet`: exercise with enum with properties.

## `primitive_types`

- `PrimitiveAppMain`: operators on primitive types: double, int, float.

## `safaripark`

A slightly bigger project, containing various aspects of Object Orienting Programming. 

```mermaid
classDiagram

  class Animal
  Animal <|-- Cheetah 
  Animal <|-- Giraffe  
  Animal <|-- Gorilla

  class IShootable
  IShootable <|-- Camera 
  IShootable <|-- Hunter 
  IShootable <|-- Weapon
  Weapon <|-- LaserGun
  Weapon <|-- WaterPistol

  class Vehicle    
  Vehicle <|-- Airplane

  class IActivity
  class IDrinkable
  class IEdible
  class IMovable

  Participant *-- Person
  IMovable <|-- Person 
  Person <|-- Hunter 

  IActivity <|-- ShootingCheetah 
  IEdible <|-- Snack
  IMovable <|-- Vehicle
  IDrinkable <|-- WaterBottle  
```

Other classes with main methods:
 
```mermaid
classDiagram
  class VehicleMain
  class AirplaneMain
  class AppMain
  class EqualityAppMain
```

## `Shapes`

A more simplified example of inheritance with `extends`.

```mermaid
classDiagram

  Shape <|-- Circle
  Shape <|-- Rectangle
  class ShapeApp
```

## `stringmanipulation`

Lesson about StringBuilder and advantages over simple String manipulations.



# Observer Design Pattern

#### Created to demonstrate how the Observer Design pattern works

#### Created by Henrique Belotto
February 10, 2019

According to "Head First - Design Pattern" book, the definition of this pattern is:
> The Observer Pattern defines a one-to-many dependency between objects so 
that when one object changes state, all of its dependents are notified and updated automatically.

The Observer pattern is one of the most used. This design pattern works similarly when someone subscribe for a magazine.
Whenever a new subscriber ("Observer" class) subscribe for a magazine, the magazine ("Subject" class) is informed 
and whenever there is any update (for example, a new release), the magazine notify all the subscribers ("observers").

Each Observer class must implement a defined "Observer interface" and each Subject class must implement a defined 
"Subject interface".


For this example, it is considered a case of weather data (hardcoded, but it could be obtained from an external source) 
and weather displays that subscribe for weather data and receive updates whenever there is new weather data.


Classes:
* WeatherStation (main class)
* Observer interface (receiver of the information)
* CurrentConditionsDisplay (implement Observer and DisplayElement interfaces)
* DisplayElement (interface that all displays must implement)
* Subject interface (distributor of the information)
* WeatherData (implements Subject interface)


References:
Head First - Design Pattern
by Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra

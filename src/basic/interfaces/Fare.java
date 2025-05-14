package basic.interfaces;

/**
 <h1>Interface</h1>
 <p>Interface is a way to achieve 100 percent abstraction.
 <p>Interface are declared with an "interface" keyword.
 <p>All methods in an interface are public and abstract by default.
 <p>Fields in an interface are public, static, and final.
 <p>Interface cannot contain concrete methods.
 <p>We cannot instantiate object of an interface but interface object can take the reference of its implementing class and call its methods or fields.
 <p>An interface can extend another interface but cannot implement another interface.
 <p>Interface can have default and static methods. This allows interfaces to evolve by adding new methods without breaking existing classes that implement the interface.
 */

interface Fare {
    float calculateFare(float distance, float fare);

}

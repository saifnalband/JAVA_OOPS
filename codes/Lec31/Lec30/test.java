// Following is the syntax to define an interface

interface InterfaceName [extends name1,......]{
    [Varibale(s) declaration;]
    [Method(s) declaration;]
}

// Varible in an interface is declared as :

static final type varName = value;

// methods in interface is decalred as :
return type methodName(paramter list);


// Exmaple 1:
interface Template{
    static final int code = 101;
    static final String itemName = "Computer";
    void recordEntry();
}

//Exmaple 2:
interface Curves extends Circle, Ellipse{
    static final float PI = 22/7;
    float area(int a, int b);
}

// Syntax
class className [extends superClassName][implements interfaceName1, interfaceName2, ...]{
        // class body
}

// INTERFACE

interface Constants{
    double velofLight = 3.0e+10;
    String unitVelofLight = "m/s";
    ....
}
interface Physis{
    void quantamLaw(){
        .....
    }
}

interface Chemistry extends Constants{
    // body
}

interface lawofPhysics extends Constants, Physis{
    // body
}
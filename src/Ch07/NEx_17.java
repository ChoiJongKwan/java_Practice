package Ch07;

public class NEx_17 {
 Object iv = new Object() {void method(){}};
static Object cv = new Object() {void method(){}};

void myMethod() {
	Object lv = new Object() {void method(){}};
}

}
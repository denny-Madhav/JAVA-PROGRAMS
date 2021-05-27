
class Animal
{
void eat()
{
System.out.println("Animals able to eat");
}
}
class Dog extends Animal
{
void eat()
{
System.out.println("Dog able to eat");
}
void bark()
{
System.out.println("Dog able to bark");
}
void call()
{
bark();
eat();
super.eat();
}
}
class Test
{
public static void main(String arr[])
{
Dog d1 = new Dog();
d1.call();
}
}
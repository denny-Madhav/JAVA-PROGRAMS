/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4th.sem;

/**
 *
 * @author lenov
 */
class library
{
    int book_id;
    String book_name;
    String author;
    int year_published;
    library(int id, String name, String au)
    {
        this.book_id=id;
        this.book_name=name;
        this.author=au;
    }
    library(int id, String name, String au, int year)
    {
        this.book_id=id;
        this.book_name=name;
        this.author=au;
        this.year_published=year;
    }
    void show()
            {
                System.out.println(book_id+" "+book_name+" "+author+" "+year_published+" ");
            }
}
class test{
public static void main(String args[]){
    library obj1= new library(11,"Harry Potter and the order of pheonix","S.L. Richard",2001);
    library obj2= new library(12,"Spector","M.K.Gandhi",2002);
    library obj3= new library(13,"The man who sold his ferrari","Robin Sharma",2003);
    library obj4= new library(14,"the Invisble Man","H.G.Wells",2004);
    library obj5= new library(15,"Steve Jobs","R.L Robert",1999);
    obj1.show();
    obj2.show();
 }
}

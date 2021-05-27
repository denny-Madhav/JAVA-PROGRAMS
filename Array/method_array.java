//passing array to method
class Arraydemo
{
static void min(int arr[])
{
int min=arr[0];
for(int i =1;i<arr.length;i++)
if(min>arr[i])
min=arr[i];
System.out.println(min);
}
public static void main(String arg[])
{
int array[]={10,20,30,40,50};
min(array);

}
}

public class Testing 
// method for adding two numbers
{
	
int sum()
{
	int a=10;
	int b=20;
	return(a+b);
}

//methods for square method
int square(int x)
{
	return x*x;
}

//method for counting A character from a word 
int countA(String word)
{
int count=0;
for(int i=0;i<word.length();i++)
{
if(word.charAt(i)=='K' || word.charAt(i)=='a')
{
	count++;
}
}
	
return count;
}
}

package prog;

import java.io.*;
import java.util.*;

public class search {
	public static void sorting(ArrayList<String> s,int length)//static function
{
	int i,j;
	for(i=0;i<length;i++)//bubble sort
	{
		for(j=0;j<length-i-1;j++)
		{
			if(s.get(j).compareTo(s.get(j+1))>=1)//swapping if arr[j]>arr[j+1]
			{
				Collections.swap(s,j, j+1);
			}
		}
	}
}
public static void main(String[] args)throws Exception
{
	int count=0;
BufferedReader reader1=new BufferedReader(new FileReader("C:\\Users\\ridhima\\Downloads\\HW2-dictionary.txt"));//src file1
ArrayList<String>dictionary=new ArrayList<String>();
String currLine=reader1.readLine();
while(currLine!=null)//reads whole dictionary file(src file1)
{
	dictionary.add(currLine);
	currLine=reader1.readLine();
}
   sorting(dictionary, dictionary.size());//calls bubble sorting fn
BufferedWriter writer1=new BufferedWriter(new FileWriter("C:\\Users\\ridhima\\Desktop\\java lab\\output2.txt"));//dest file

reader1.close();//reading src file1 ended
BufferedReader reader2=new BufferedReader(new FileReader("C:\\Users\\ridhima\\Downloads\\HW2-keywords.txt"));
ArrayList<String>keyword=new ArrayList<String>();
String currLine2=reader2.readLine();
while(currLine2!=null)//reads whole keyword file(src file2)
{
	keyword.add(currLine2);
	currLine2=reader2.readLine();
}
sorting(keyword, keyword.size());//calls bubble sort fn

reader2.close(); //reading src file2 ended
for(int i=0;i<84;i=i+1)//linear searching in both src files
{
	for(int j=0;j<16000;j=j+1){
		boolean x=keyword.get(i).equals(dictionary.get(j));
		if(x)
		{count=count+1;i=i+1;}
	}
		writer1.write("keyword not found:"+ keyword.get(i));//prints those keywords that are not found in dict file
		writer1.newLine();
}
int x=84-count;
writer1.newLine();
writer1.write("No.of keywrds not found="+ x);//writes onto dest file output2
writer1.close();
System.out.println("File Created");}
}

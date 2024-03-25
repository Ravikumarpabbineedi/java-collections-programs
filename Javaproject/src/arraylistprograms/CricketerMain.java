package arraylistprograms;
import java.util.*;
import java.io.*;
public class CricketerMain {

	public static void main(String[] args) throws Exception {
		
		
	//	List<CricketerInfo> al=new ArrayList<>();
		
		/*CricketerInfo cl1=new CricketerInfo(1,"sachin",31200,51.04f);
		CricketerInfo cl2=new CricketerInfo(2,"dhoni",21208,48.85f);
		CricketerInfo cl3=new CricketerInfo(3,"virat",27250,52.84f);
		CricketerInfo cl4=new CricketerInfo(4,"rahul",15005,47.84f);
		CricketerInfo cl5=new CricketerInfo(5,"rohit",19200,44.25f);
		
		al.add(cl1);
		al.add(cl2);
		al.add(cl3);
		al.add(cl4);
		al.add(cl5);*/
		
	/*	al.add(new CricketerInfo(1,"sachin",31200,51.04f));
		al.add(new CricketerInfo(2,"dhoni",21208,48.85f));
		al.add(new CricketerInfo(3,"virat",27250,52.84f));
		al.add(new CricketerInfo(4,"rahul",15005,47.84f));
		al.add(new CricketerInfo(5,"rohit",19200,44.25f));*/
		
		
		/*for(CricketerInfo c:al)
		{
			System.out.println(c.id+" "+c.name+" "+c.runs+" "+c.avg);
		}*/
		
		/*for(int i=0;i<al.size();i++)
		{
			CricketerInfo c=al.get(i);
			System.out.println(c.id+" "+c.name+" "+c.runs+" "+c.avg);
		}*/
		
		/*Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			CricketerInfo c=(CricketerInfo)itr.next();
			System.out.println(c.id+" "+c.name+" "+c.runs+" "+c.avg);
		}*/
		
		/*ListIterator li=al.listIterator(al.size());
		
		while(li.hasPrevious())
		{
			CricketerInfo c=(CricketerInfo)li.previous();
			System.out.println(c.id+" "+c.name+" "+c.runs+" "+c.avg);
		}*/
		
		
		/*int id[]= {1,2,3,4,5};
		String name[]= {"sachin","dhoni","kohli","rohit","rahul"};
		int runs[]= {31254,25745,28451,24112,18452};
		float avg[]= {51.21f,48.24f,54.65f,46.23f,49.57f};
		
		List<CricketerInfo> al=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			CricketerInfo cl1=new CricketerInfo(id[i],name[i],runs[i],avg[i]);
			al.add(cl1);
			al.add(new CricketerInfo(id[i],name[i],runs[i],avg[i]));
		}*/
		
		
		//Scanner sc=new Scanner(System.in);
		
		/*List<CricketerInfo> al=new ArrayList<>();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the id");
			int id=sc.nextInt();
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the runs");
			int runs=sc.nextInt();
			System.out.println("enter the average");
			float avg=sc.nextFloat();
			CricketerInfo c=new CricketerInfo(id,name,runs,avg);
			al.add(c);
		}
		for(CricketerInfo ci:al)
		{
			System.out.println(ci.id+" "+ci.name+" "+ci.runs+" "+ci.avg);
		}*/
		
		/*List<CricketerInfo> al=new ArrayList<>();
		
		while(true)
		{
			
				System.out.println("enter the id");
				int id=sc.nextInt();
				System.out.println("enter the name");
				String name=sc.next();
				System.out.println("enter the runs");
				int runs=sc.nextInt();
				System.out.println("enter the average");
				float avg=sc.nextFloat();
				CricketerInfo c=new CricketerInfo(id,name,runs,avg);
				al.add(c);
				
				System.out.println("would you like to proceed");
				String choice=sc.next();
				if(choice.equals("no"))
					break;
		}
		for(CricketerInfo ci:al)
		{
			System.out.println(ci.id+" "+ci.name+" "+ci.runs+" "+ci.avg);
		}*/
		
		List<CricketerInfo> al=new ArrayList<>();
		
		BufferedReader br=null;

		try
		{	
			 
		    br=new BufferedReader(new InputStreamReader(System.in));
			
			while(true)
			{
				System.out.println("enter the id");
				int id=Integer.parseInt(br.readLine());
				System.out.println("enter the name");
				String name=br.readLine();
				System.out.println("enter the runs");
				int runs=Integer.parseInt(br.readLine());
				System.out.println("enter the average");
				float avg=Float.parseFloat(br.readLine());
				
				CricketerInfo c=new CricketerInfo(id,name,runs,avg);
				al.add(c);
				
				System.out.println("would you like to proceed");
				String choice=br.readLine();
				if(choice.equals("no"))
					break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if(br!=null)
				br.close();
		}
		ListIterator li=al.listIterator(al.size());
		
		while(li.hasPrevious())
		{
			CricketerInfo c=(CricketerInfo)li.previous();
			System.out.println(c.id+" "+c.name+" "+c.runs+" "+c.avg);
		}
	}

}

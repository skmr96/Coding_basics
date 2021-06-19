//$Id$
import java.util.*;
import Testprograms.*;
public class RollerCoasterNew {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);

		int size=4;
		int user_data[] = new int [size]; 
		for(int i=0;i<size;i++)
			user_data[i]=in.nextInt();
		
		int people_counts=0;
		for(int i=0;i<size;i++)
			people_counts=people_counts+user_data[i];
		
		int no_of_times=4,max_people=6,total_group_cost=0,money_made_today=0;
		boolean active_no_of_times=true;

		StackInt groups_of_people = new StackInt(size); 
		StackInt dummy_stack = new StackInt(size);
		QueueInt group_people = new QueueInt(size);
		QueueInt dummy_queue = new QueueInt(size);
		
		for(int i=size-1;i>=0;i--)
			groups_of_people.push(user_data[i]);
		
		while(active_no_of_times)
		{
			no_of_times--;
			while(total_group_cost<=max_people  && total_group_cost<people_counts)
			{
				int group_cost = groups_of_people.pop();
				if((total_group_cost+group_cost)<=max_people) 
				{
					total_group_cost=total_group_cost+group_cost;
					group_people.enqueue(group_cost);
				}		
				else
				{
					groups_of_people.push(group_cost);
					break;
				}	
			}
		
			while(!groups_of_people.isEmpty())
					dummy_queue.enqueue(groups_of_people.pop());

			while(!group_people.isEmpty())
					dummy_queue.enqueue(group_people.dequeue());
			
			while(!dummy_queue.isEmpty())
					dummy_stack.push(dummy_queue.dequeue());
			
			while(!dummy_stack.isEmpty())
					groups_of_people.push(dummy_stack.pop());
			
			money_made_today=money_made_today+total_group_cost;
			total_group_cost=0;
			
			if(no_of_times == 0)
				active_no_of_times=false;
		}
		System.out.println(money_made_today+" Euros");
		
		

	}

}

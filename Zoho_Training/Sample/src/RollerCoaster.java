//$Id$
import java.util.*;
import Testprograms.queue;
import Testprograms.QueueInt;

public class RollerCoaster {

	private int no_of_rides,max_people;
	private	int no_of_groups;
	private	int earned_money,total_group_cost;
	private	int dequeue_times;
	private int ridesCost[]; 
	private int cost;
	private	queue groups_in_queue;
	
	public RollerCoaster(int rides,int groups,int people)
	{
		no_of_rides = rides;
		no_of_groups = groups;
		max_people = people;
		ridesCost = new int[no_of_rides];
	}	
	public void  setGroupsInQueue(int groups[])
	{
		groups_in_queue = new QueueInt(no_of_groups);
		for(int group=0;group<no_of_groups;group++)
		{
			groups_in_queue.enqueue(groups[group]);
		}
	}
		
		public void findCost()
		{
			for(int ride_counts=0;ride_counts<no_of_rides;ride_counts++)
			{
				while(total_group_cost<=max_people && dequeue_times<no_of_groups) 
				{
					int single_group_cost = groups_in_queue.getFrontValue();
					
					if((total_group_cost+single_group_cost)<=max_people)
					{
						total_group_cost=total_group_cost+single_group_cost;	
						groups_in_queue.dequeue();
						dequeue_times++;
						groups_in_queue.enqueue(single_group_cost);
					}
					else
					{
						break;
					}
				}
				dequeue_times=0;
				ridesCost[cost++] = total_group_cost;
				earned_money=earned_money+total_group_cost;
				total_group_cost=0;
			}
		}
		
		public int getRideCost(int which_ride){
			return ridesCost[--which_ride];
		}
		
		public int getEarnedMoney()
		{
			return earned_money;
		}
}



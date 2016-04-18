
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Schedule{
	@Id
	@OneToMany(mappedBy = "schedule", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST})
	Set<Seance> schedule;
	
	public Schedule(){
		
	}
//	public Schedule() {
//		this.schedule = new TreeSet<>();
//	}

	public void printSchedule() {
		for (int i = 1; i < 4; i++) {
			Iterator<Seance> it = schedule.iterator();
			while (it.hasNext()) {
				Seance temp = it.next();
				if (temp.getRoomNumber() == i) {
					System.out.println(temp);
				}
			}
		}
	}

	public Set<Seance> getSchedule() {
		return schedule;
	}
	

	public void setSchedule(TreeSet<Seance> schedule) {
		this.schedule = schedule;
	}
}
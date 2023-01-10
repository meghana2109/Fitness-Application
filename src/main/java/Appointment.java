import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Appointment {
    public int id;
    public User user;
    public FitnessCoach fitnessCoach;
    public Date date;
}

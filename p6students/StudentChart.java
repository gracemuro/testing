import java.util.List;
import java.util.Arrays;
public class StudentChart
{
    private Student[][] seats;
    private int rows;
    private int cols;
    private List<Student> roster;
    
    public StudentChart(List<Student> studentList, int rows, int cols)
    {
        
        Student[][] seats = new Student[rows][cols];
        Student[] temp = new Student[rows*cols];
        for(int i =0; i <studentList.size(); i++)
        {
            temp[i]= studentList.get(i);
        }
        int count =0;
        
        
      
            for(cols =0; cols<seats[0].length;cols++)
          {
                for(rows =0; rows<seats.length; rows++)
            {
                seats[rows][cols] = temp[count];
                if(temp[count] == null)
                {
                    seats[rows][cols] = null;
                }
                count++;
            }
        
          }
    }
    
    public int removeAbsenceStudents(int allowedAbsences)
    {
        int count=0;
          for(cols =0; cols<seats[0].length;cols++)
          {
                for(rows =0; rows<seats.length; rows++)
            {
                if( seats[rows][cols].getAbsenceCount()
                > allowedAbsences)
                {
                    count++;
                    seats[rows][cols] = null;
                }
            }
            
        }
        return count;
    }
    
}
    
import java.util.ArrayList;
import java.util.List;

class StudentProject {
    private String studentName;
    private int completionTime;

    public StudentProject(String studentName, int completionTime) {
        this.studentName = studentName;
        this.completionTime = completionTime;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getCompletionTime() {
        return completionTime;
    }
}

public class ProjectCompletionTracker {
    public static void main(String[] args) {
        List<StudentProject> projects = new ArrayList<>();
        projects.add(new StudentProject("srav", 10)); 
        projects.add(new StudentProject("kav", 5));
        projects.add(new StudentProject("sravan", 15));

        int onTime = 0;
        int late = 0;
        int early = 0;
        int totalCompletionTime = 0;

        for (StudentProject project : projects) {
            int completionTime = project.getCompletionTime();
            totalCompletionTime += completionTime;

            if (completionTime == 10) { // Assuming 10 is the deadline
                onTime++;
            } else if (completionTime > 10) {
                late++;
            } else {
                early++;
            }
        }

        int totalProjects = projects.size();
        double averageCompletionTime = (double) totalCompletionTime / totalProjects;

        System.out.println("Number of projects completed on time: " + onTime);
        System.out.println("Number of projects completed late: " + late);
        System.out.println("Number of projects completed early: " + early);
        System.out.println("Average time taken for completion: " + averageCompletionTime);
    }
}

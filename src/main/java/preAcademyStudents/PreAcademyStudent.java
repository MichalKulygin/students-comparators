package preAcademyStudents;

/**
 * PreAcademyStudent model class.
 *
 * @CreatedBy MKgn
 */
final class PreAcademyStudent {
    final private String firstName;
    final private String lastName;
    final private int lecturePoints;
    final private int taskPoints;
    final private int activityPoints;

    private PreAcademyStudent(String firstName, String lastName, int lecturePoints, int taskPoints, int activityPoints) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lecturePoints = lecturePoints;
        this.taskPoints = taskPoints;
        this.activityPoints = activityPoints;
    }

    static PreAcademyStudent createStudent(String[] data) {
        String firstName = data[0];
        String lastName = data[1];
        String lecturePoints = data[2];
        String taskPoints = data[3];
        String activityPoints = data[4];

        return new PreAcademyStudent(
                firstName,
                lastName,
                Integer.parseInt(lecturePoints),
                Integer.parseInt(taskPoints),
                Integer.parseInt(activityPoints));
    }

    public int getTotalPoints() {
        return this.lecturePoints + this.taskPoints + this.activityPoints;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public int getLecturePoints() {
//        return lecturePoints;
//    }
//
//    public int getTaskPoints() {
//        return taskPoints;
//    }

    public int getActivityPoints() {
        return activityPoints;
    }

    @Override
    public String toString() {
        return "\npreAcademyStudents.PreAcademyStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lecturePoints=" + lecturePoints +
                ", tasksPoints=" + taskPoints +
                ", activityPoints=" + activityPoints +
                ", TOTAL points=" + (lecturePoints + taskPoints + activityPoints) +
                '}';
    }
}

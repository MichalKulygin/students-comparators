package preAcademyStudents;

import java.util.List;

import static preAcademyStudents.StudentComparators.*;

/**
 * preAcademyStudents - demo for sorting list using custom Comparators
 *
 * @Author MKgn
 */
class Demo {
    public static void main(String[] args) {

        String filePath = "src/main/resources/pre_students_grades.csv";

        List<PreAcademyStudent> studentsList = PreAcademyStudentsCsvParser.createListOfStudentsFromCSV_file(filePath, ";");

        System.out.println(studentsList.toString());

        System.out.println("\n---------- SORT_BY_TOTAL_POINTS ---------------");
        studentsList.sort(SORT_BY_TOTAL_POINTS);
        System.out.println(studentsList);

        System.out.println("\n---------- SORT_BY_TOTAL_POINTS_REVERSED ---------------");
        studentsList.sort(SORT_BY_TOTAL_POINTS_REVERSED);
        System.out.println(studentsList);

        System.out.println("\n---------- SORT_BY_FIRST_NAME ---------------");
        studentsList.sort(SORT_BY_FIRST_NAME);
        System.out.println(studentsList);

        System.out.println("\n---------- SORT_BY_FIRST_NAME_AND_THEN_BY_LAST_NAME ---------------");
        studentsList.sort(SORT_BY_FIRST_NAME_AND_THEN_BY_LAST_NAME);
        System.out.println(studentsList);

        System.out.println("\n---------- SORT_BY_TOTAL_POINTS_AND_THEN_BY_ACTIVITY_POINTS ---------------");
        studentsList.sort(SORT_BY_TOTAL_POINTS_AND_THEN_BY_ACTIVITY_POINTS);
        System.out.println(studentsList);
    }
}

package preAcademyStudents;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Pre-students DAO - provides list of PreAcademyStudents from CSV file
 *
 * @CreatedBy MKgn
 */
final class PreAcademyStudentsCsvReader {

    private final List<PreAcademyStudent> PRE_ACADEMY_STUDENTS_LIST;
    private final Path PATH_TOC_CSV_FILE;
    private final String DELIMITER;

    PreAcademyStudentsCsvReader(String filePath, String delimiter) {
        this.PATH_TOC_CSV_FILE = Path.of(filePath);
        this.DELIMITER = delimiter;
        this.PRE_ACADEMY_STUDENTS_LIST = createListOfStudentsFromCSV_file();
    }

    private List<PreAcademyStudent> createListOfStudentsFromCSV_file() {

        List<PreAcademyStudent> studentList = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(PATH_TOC_CSV_FILE)) {
            br.readLine();
            String line = br.readLine();

            while (line != null) {
                String[] studentData = line.split(DELIMITER);
                PreAcademyStudent student = PreAcademyStudent.createStudent(studentData);
                studentList.add(student);
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return studentList;
    }

    List<PreAcademyStudent> getStudentsList() {
        return PRE_ACADEMY_STUDENTS_LIST;
    }
}

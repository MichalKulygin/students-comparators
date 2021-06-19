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
 * @Author MKgn
 */
class PreAcademyStudentsCsvParser {

    static List<PreAcademyStudent> createListOfStudentsFromCSV_file(String pathTocCsvFile, String delimiter) {

        List<PreAcademyStudent> studentList = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Path.of(pathTocCsvFile))) {
            br.readLine();
            String line = br.readLine();

            while (line != null) {
                String[] studentData = line.split(delimiter);
                PreAcademyStudent student = PreAcademyStudent.createStudent(studentData);
                studentList.add(student);
                line = br.readLine();
            }

        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        return studentList;
    }
}

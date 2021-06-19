package preAcademyStudents;

import java.util.Comparator;

/**
 * PreAcademyStudentsComparators - custom Comparators
 *
 * @Author MKgn
 */
public final class StudentComparators {

    static Comparator<PreAcademyStudent> SORT_BY_TOTAL_POINTS = (o1, o2) -> o2.calculateTotalPoints() - o1.calculateTotalPoints();
    static Comparator<PreAcademyStudent> SORT_BY_TOTAL_POINTS_REVERSED = Comparator.comparingInt(PreAcademyStudent::calculateTotalPoints);
    static Comparator<PreAcademyStudent> SORT_BY_FIRST_NAME = new Comparator<>() {
        @Override
        public int compare(PreAcademyStudent o1, PreAcademyStudent o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    };

    static Comparator<PreAcademyStudent> SORT_BY_FIRST_NAME_AND_THEN_BY_LAST_NAME =
            Comparator.comparing(PreAcademyStudent::getFirstName)
                    .thenComparing(PreAcademyStudent::getLastName);

    static Comparator<PreAcademyStudent> SORT_BY_TOTAL_POINTS_AND_THEN_BY_ACTIVITY_POINTS =
            Comparator.comparing(PreAcademyStudent::calculateTotalPoints, Comparator.reverseOrder())
                    .thenComparing(PreAcademyStudent::getActivityPoints, Comparator.reverseOrder());
}


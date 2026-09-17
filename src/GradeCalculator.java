public class GradeCalculator {
    int assignmentPoints;
    int examPoints;
    int projectPoints;

    void addPoints (int points, String type) {
        switch (type) {
            case "assignmentPoints":
                assignmentPoints += points;
                break;
            case "examPoints":
                examPoints += points;
                break;
            case "projectPoints":
                projectPoints += points;
                break;
            default:
                System.out.println("Invalid command");
        }
    }

    int getTotal() {
        int total = assignmentPoints + examPoints + projectPoints;
        return total;
    }

    void printTotal() {
        System.out.println("Total points: " + getTotal());
    }

    int getGrade(int totalScore) {
        if (totalScore <= 100 && totalScore >= 86) {
            return 12;
        } else if (totalScore <= 85 && totalScore >= 71) {
            return 7;
        } else if (totalScore <= 70 && totalScore >= 51) {
            return 00;
        } else {
            return -3;
        }
    }

    void main() {
        addPoints(25, "assignmentPoints");
        addPoints(25, "examPoints");
        addPoints(25, "projectPoints");

        printTotal();
        System.out.println("Grade: " + getGrade(getTotal()));
    }
}

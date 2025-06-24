package ProblemTracker;

public class Problem {
        private String name;
        private ProblemType type;
        private static boolean status;

        public Problem(String name, ProblemType type) {
        this.name = name;
        this.type = type;
        status = false;
        }

        static void isSolved(){
                status = true;
        }

}

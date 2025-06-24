package ProblemTracker;

public class Problem {
        private final String name;
        private final ProblemType type;
        private static boolean status;

        public Problem(String name, ProblemType type) {
        this.name = name;
        this.type = type;
        status = false;
        }

        public Object getName() {
        return name;
        }

        public Object getType() {
                return type;
        }
        public boolean getStatus() {
        return status;
        }
        public void setStatus() {
        status = true;
        }
}

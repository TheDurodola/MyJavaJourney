package ProblemTracker;

public class Problem {
        private final String name;
        private final ProblemType type;
        private boolean status;

        public Problem(String name, ProblemType type) {
        this.name = name;
        this.type = type;
        }

        public String getName() {
                return name;
        }

        public ProblemType getType() {
                return type;
        }
        public boolean getStatus() {
                return status;
        }
        public void setStatus() {
                status = true;
        }
}

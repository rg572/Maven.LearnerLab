package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    KRIS (5), DOLIO (6), WILHEM(7), FROILAN(8);

    private final Instructor instructor;
    private Double timeWorked;

    private Educator(long id){
        instructor = new Instructor(id, toString());
        timeWorked = 0d;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public Double getTimeWorked(){
        return timeWorked;
    }

    public Instructor getInstructor(){
        return instructor;
    }

}

package io.zipcoder.interfaces;

public class Student extends Person implements Learner /* How unrealistically optimistic */ {

    private double totalStudyTime;

    public Student(long id, String name){
        super(id,name);
        totalStudyTime = 0;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;

    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}

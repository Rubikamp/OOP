package org.rubikamp.javaoop;


public class Papa extends GrandPa{

    @Override
    public void showGrandfatherBehavior() {
        String behavior = "Well-behaved";
        System.out.println(behavior);
    }
    @Override
    public void showGrandfatherCreativity() {
        String creativity = "Creative";
        System.out.println(creativity);
    }

    public void showFatherEducation() {
        String education = "BA";
        System.out.println(education);
    }
    public void showFatherStudyTime() {
        String studyTime = "Much";
        System.out.println(studyTime);
    }
}

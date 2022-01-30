package org.rubikamp.javaoop;

public class Son extends Papa{

    @Override
    public void showGrandfatherHeight() {
        String height = "Tall";
        System.out.println(height);
    }
    @Override
    public void showGrandfatherBaldness() {
        String baldness = "Not Bald";
        System.out.println(baldness);
    }
    @Override
    public void showGrandfatherBehavior() {
        String behavior = "Angry";
        System.out.println(behavior);
    }
    @Override
    public void showFatherEducation() {
        String education = "MA";
        System.out.println(education);
        super.showFatherEducation();
    }
    @Override
    public void showFatherStudyTime() {
        String studyTime = "Very Much";
        System.out.println(studyTime);
    }
}

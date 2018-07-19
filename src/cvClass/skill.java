package cvClass;

public class skill {
    String skillName;
    int skillRank;

    public skill(String skillName, int skillRank) {
        this.skillName = skillName;
        this.skillRank = skillRank;
    }


    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getSkillRank() {
        return skillRank;
    }

    public void setSkillRank(int skillRank) {
        this.skillRank = skillRank;
    }
}

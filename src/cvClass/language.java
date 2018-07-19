package cvClass;

public class language {
    String skillName;
    int skillRank;

    public language(String skillName, int skillRank) {
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

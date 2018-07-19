package cvClass;

public class personalInfo {
    String name;
    String secondName;
    String profession;
    String address;
    String phone;
    String email;
    String gitHubLink;

    public personalInfo(String name, String secondName, String profession, String address, String phone, String email, String gitHubLink) {
        this.name = name;
        this.secondName = secondName;
        this.profession = profession;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gitHubLink = gitHubLink;
    }
    public void getPersonalInfo ()
    {
        System.out.print ("My name is "+name+" "+ secondName + "\nProfession "+profession + "\nAddress " +address +"\nPhone number: "+phone+"\nEmail "+email+"\nGitHub link "+gitHubLink);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getProffesion() {
        return profession;
    }

    public void setProffesion(String proffesion) {
        this.profession = profession;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGitHubLink() {
        return gitHubLink;
    }

    public void setGitHubLink(String gitHubLink) {
        this.gitHubLink = gitHubLink;
    }
}

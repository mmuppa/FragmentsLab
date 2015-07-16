package edu.uw.tacoma.mmuppa.fragmentslab;

/**
 * Created by mmuppa on 7/9/15.
 */
public class Student {
    private int mId;
    private String name;
    private String major;

    public Student(int id, String name, String major) {
        mId = id;
        this.name = name;
        this.major = major;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mId=" + mId + "}";
    }
}

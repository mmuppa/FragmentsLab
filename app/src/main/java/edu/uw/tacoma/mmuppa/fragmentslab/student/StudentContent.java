package edu.uw.tacoma.mmuppa.fragmentslab.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.uw.tacoma.mmuppa.fragmentslab.Student;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class StudentContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<Student> ITEMS = new ArrayList<Student>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<Integer, Student> ITEM_MAP = new HashMap<Integer, Student>();

    static {
        // Add 3 sample items.
        addItem(new Student(1, "Name 1", "CSS"));
        addItem(new Student(2, "Name 2", "CES"));
        addItem(new Student(3, "Name 3", "IT"));
    }

    private static void addItem(Student item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

}

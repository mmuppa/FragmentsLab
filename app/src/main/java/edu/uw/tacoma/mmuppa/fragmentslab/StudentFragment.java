package edu.uw.tacoma.mmuppa.fragmentslab;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.uw.tacoma.mmuppa.fragmentslab.student.StudentContent;


/**
 * A simple {@link Fragment} subclass.
 */
public class StudentFragment extends Fragment {


    public static final String POS = "POSITION";
    private int mCurrentPosition = -1;

    public StudentFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();

        Bundle args = getArguments();
        if (args != null) {
// Set article based on argument passed in
            updateStudentView(args.getInt(POS));
        } else if (mCurrentPosition != -1) {
// Set article based on saved instance state defined during onCreateView
            updateStudentView(mCurrentPosition); }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student, container, false);
        /*TextView id = (TextView)view.findViewById(R.id.stu_id);
        id.setText("1000");*/
        TextView name = (TextView) view.findViewById(R.id.stu_name);
        name.setText("Some Name");
        /*TextView major = (TextView) view.findViewById(R.id.stu_major);
        major.setText("Some Major");*/
        return view;
    }


    public void updateStudentView(int id) {
        TextView tv = (TextView) getActivity()
                .findViewById(R.id.stu_name);
        tv.setText((CharSequence)
                StudentContent.ITEMS.get(id).getName());
    }
}

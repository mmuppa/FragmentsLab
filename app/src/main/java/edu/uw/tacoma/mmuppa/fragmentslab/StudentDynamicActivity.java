package edu.uw.tacoma.mmuppa.fragmentslab;

import android.app.FragmentTransaction;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class StudentDynamicActivity extends Activity
        implements StudentListFragment.OnStudentInteractionListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dynamic);

        if (savedInstanceState != null)
            return;
        if (findViewById(R.id.fragment_container) != null) {
            StudentListFragment studentFragment = new StudentListFragment();
            FragmentTransaction fragmentTransaction =
                    getFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.fragment_container, studentFragment)
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student_dynamic, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStudentInteraction(int id) {
        StudentFragment studentFragment = (StudentFragment) getFragmentManager().findFragmentById
                (R.id.student_item_fragment);
        if (studentFragment != null) {
            studentFragment.updateStudentView(id);
        } else {
            StudentFragment fragment = new StudentFragment();
            Bundle args = new Bundle();
            args.putInt(StudentFragment.POS, id);
            fragment.setArguments(args);
            FragmentTransaction transaction = getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null);

            /* Commit the transaction */
            transaction.commit();
        }

    }
}

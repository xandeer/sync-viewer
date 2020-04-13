package xandeer.android.syncviewer.actions

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import xandeer.android.syncviewer.R
import xandeer.android.syncviewer.ui.main.MainFragment

class GotoMain(private val fragmentManager: FragmentManager) : Action {
	override fun exec() {
		fragmentManager.findFragmentByTag(MainFragment.TAG) ?: fragmentManager.beginTransaction()
			.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
			.add(R.id.container, MainFragment.newInstance(), MainFragment.TAG)
			.commit()
	}
}
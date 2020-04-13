package xandeer.android.syncviewer.actions

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE
import androidx.fragment.app.FragmentTransaction
import xandeer.android.syncviewer.R
import xandeer.android.syncviewer.ui.host.HostFragment

class GotoHost(private val fragmentManager: FragmentManager) : Action {
	override fun exec() {
		fragmentManager.findFragmentByTag(HostFragment.TAG)?.let {
			val tag = fragmentManager.getBackStackEntryAt(fragmentManager.backStackEntryCount - 1).name
			if (tag == null ||
				tag != HostFragment.TAG
			) {
				fragmentManager.popBackStack(HostFragment.TAG, POP_BACK_STACK_INCLUSIVE)
			}
		} ?: fragmentManager.beginTransaction()
			.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
			.add(R.id.container, HostFragment.newInstance(), HostFragment.TAG)
			.addToBackStack(HostFragment.TAG)
			.commit()
	}
}
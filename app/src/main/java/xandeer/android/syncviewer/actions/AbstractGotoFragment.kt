package xandeer.android.syncviewer.actions

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import xandeer.android.syncviewer.R

abstract class AbstractGotoFragment(
	private val fragmentManager: FragmentManager,
	private val fragment: Fragment
) : Action {

	override fun exec() {
		fragmentManager.beginTransaction()
			.replace(R.id.container, fragment)
			.commitNow()
	}
}
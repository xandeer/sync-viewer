package xandeer.android.syncviewer

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import xandeer.android.syncviewer.actions.GotoHost
import xandeer.android.syncviewer.actions.GotoMain
import xandeer.android.syncviewer.ui.main.MainFragment
import xandeer.android.syncviewer.utils.getVm
import xandeer.android.syncviewer.utils.observe

class MainActivity : AppCompatActivity() {

	private val actionManager get() = getVm(ActionManager::class.java)

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.main_activity)
		if (savedInstanceState == null) {
			actionManager.exec(GotoMain(supportFragmentManager))
		}

		observe(actionManager.action) {
			it.exec()
		}
	}

	override fun onCreateOptionsMenu(menu: Menu): Boolean {
		menuInflater.inflate(R.menu.main, menu)
		return true
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		val action = when (item.itemId) {
			R.id.goto_host -> GotoHost(supportFragmentManager)
			else -> null
		}

		action?.let { actionManager.exec(it) }
		return super.onOptionsItemSelected(item)
	}
}

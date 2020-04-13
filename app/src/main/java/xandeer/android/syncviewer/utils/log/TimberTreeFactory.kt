package xandeer.android.syncviewer.utils.log

import timber.log.BuildConfig
import timber.log.Timber

object TimberTreeFactory {
	fun getTree(): Timber.Tree {
		return if (BuildConfig.DEBUG) DebugTree()
		else ReleaseTree()
	}
}
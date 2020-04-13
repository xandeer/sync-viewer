package xandeer.android.syncviewer.preference

import android.content.Context.MODE_PRIVATE
import xandeer.android.syncviewer.App.Companion.context

/**
 * Default shared preferences utils.
 */
object DSP {
	private val preferences
		get() = context.getSharedPreferences(context.packageName, MODE_PRIVATE)

	fun get(key: String, default: Boolean) = preferences.getBoolean(key, default)

	fun set(key: String, value: Boolean) {
		preferences.edit().putBoolean(key, value).apply()
	}

	fun get(key: String, default: Int) = preferences.getInt(key, default)

	fun set(key: String, value: Int) {
		preferences.edit().putInt(key, value).apply()
	}

	fun get(key: String, default: String) =
		preferences.getString(key, default) ?: default

	fun set(key: String, value: String) {
		preferences.edit().putString(key, value).apply()
	}
}
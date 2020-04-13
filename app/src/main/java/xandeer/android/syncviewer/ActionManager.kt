package xandeer.android.syncviewer

import androidx.lifecycle.*
import xandeer.android.syncviewer.actions.Action

class ActionManager : ViewModel() {
	private val _action = MutableLiveData<Action>()

	val action = _action as LiveData<Action>

	fun exec(action: Action) {
		_action.value = action
	}
}
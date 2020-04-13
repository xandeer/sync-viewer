package xandeer.android.syncviewer.ui.host

import androidx.lifecycle.*
import xandeer.android.syncviewer.preference.Constants.HOST
import xandeer.android.syncviewer.preference.Constants.PORT
import xandeer.android.syncviewer.preference.DSP

class HostViewModel : ViewModel() {
	private val _host = MutableLiveData<String>().apply {
		value = DSP.get(HOST, "172.10.20.2")
	}
	private val _port = MutableLiveData<Int>().apply {
		value = DSP.get(PORT, 3000)
	}

	fun update(host: String) {
		_host.value = host
		DSP.set(HOST, host)
	}

	fun update(port: Int) {
		_port.value = port
		DSP.set(PORT, port)
	}

	val host = _host as LiveData<String>
	val port = _port as LiveData<Int>
}

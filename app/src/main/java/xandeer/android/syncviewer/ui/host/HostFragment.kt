package xandeer.android.syncviewer.ui.host

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.host_fragment.*
import xandeer.android.syncviewer.R
import xandeer.android.syncviewer.utils.getVm

class HostFragment : Fragment() {

	companion object {
		const val TAG = "HOST"
		fun newInstance() = HostFragment()
	}

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		return inflater.inflate(R.layout.host_fragment, container, false)
	}

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)

		val vm = getVm(HostViewModel::class.java)

		host_input.setText(vm.host.value)
		port_input.setText(vm.port.value.toString())
	}
}

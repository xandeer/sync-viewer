package xandeer.android.syncviewer.ui.main

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import xandeer.android.syncviewer.R

class MainFragment : Fragment() {

	companion object {
		const val TAG = "MAIN"
		fun newInstance() = MainFragment()
	}

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		return inflater.inflate(R.layout.main_fragment, container, false)
	}

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
	}
}

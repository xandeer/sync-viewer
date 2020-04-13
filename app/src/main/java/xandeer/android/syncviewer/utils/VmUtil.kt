package xandeer.android.syncviewer.utils

import android.content.Context
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.*

// ViewModel {
fun <T> LifecycleOwner.observe(data: LiveData<T>, fn: (it: T) -> Unit) {
    data.observe(this, Observer { it?.let(fn) })
}

fun <T> MutableLiveData<T>.notify() {
    value = value
}

fun <T : ViewModel> Context.getVm(clazz: Class<T>) =
    ViewModelProvider(this as AppCompatActivity).get(clazz)

fun <T : ViewModel> Fragment.getVm(clazz: Class<T>) =
    ViewModelProvider(this).get(clazz)

fun <T : ViewModel> View.getVm(clazz: Class<T>) =
    context.getVm(clazz)
// ViewModel }
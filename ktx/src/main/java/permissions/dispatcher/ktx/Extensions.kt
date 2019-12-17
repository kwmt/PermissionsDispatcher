package permissions.dispatcher.ktx

import android.app.Activity
import androidx.fragment.app.Fragment

fun Fragment.withPermissionsCheck(vararg permissions: String, callback: () -> Unit) {
}

fun Activity.withPermissionsCheck(vararg permissions: String, callback: () -> Unit) {
}

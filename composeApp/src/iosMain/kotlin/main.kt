import androidx.compose.ui.window.ComposeUIViewController
import com.demo.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }

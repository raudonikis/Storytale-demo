import androidx.compose.material3.Button
import androidx.compose.material3.Text
import org.jetbrains.compose.storytale.story

val `Button default` by story {
    Button(onClick = {}) {
        Text("Testing stories")
    }
}
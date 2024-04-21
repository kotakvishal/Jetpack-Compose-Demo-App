package ktk.bugdroid.jetpackcomposedemoapp

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowColumnDemo(context = this)
        }
    }
}
@Composable
fun RowColumnDemo(context: Context){
    Column {
        // Divide the screen into two equal parts
        Row(modifier = Modifier.weight(1f)) {
            Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
                // Content for the first part
                Row(
                    modifier = Modifier.clickable {
                        Toast.makeText(context, "clicked", Toast.LENGTH_SHORT)
                            .show()
                    },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Hii ", color = Color.White)
                    Text(text = "this is row", color = Color.White)
                }
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Surface(modifier = Modifier.fillMaxSize(), color = Color.Red) {
                // Content for the second part
                Column(
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.End
                ) {
                    Text(text = "Hiii ", color = Color.Yellow)
                    Text(text = "this is column", color = Color.Yellow)
                }
            }
        }
    }

}
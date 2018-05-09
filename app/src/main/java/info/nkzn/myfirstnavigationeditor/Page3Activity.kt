package info.nkzn.myfirstnavigationeditor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Page3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        val volume = Page3ActivityArgs.fromBundle(intent.extras).volume

        Toast.makeText(this, "volume is $volume", Toast.LENGTH_LONG).show()
    }
}

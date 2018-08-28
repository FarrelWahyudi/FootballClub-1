package id.go.patikab.rsud.remun.footballclub

import android.media.Image
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import id.go.patikab.rsud.remun.footballclub.view.DetailUI
import org.jetbrains.anko.*


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailUI().setContentView(this)
        val img: ImageView = findViewById(R.id.img) as ImageView
        val txtTitle: TextView = findViewById(R.id.txtName) as TextView
        img.setImageResource(R.drawable.img_arsenal)
    }
}

package id.go.patikab.rsud.remun.footballclub

import android.media.Image
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import id.go.patikab.rsud.remun.footballclub.R.id.txtName
import id.go.patikab.rsud.remun.footballclub.view.DetailUI
import org.jetbrains.anko.*


class DetailActivity : AppCompatActivity() {
    var titlee:String? = ""
    var descripte: String? = ""
    var imagee: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailUI().setContentView(this)

        val img: ImageView = findViewById(R.id.img)
        val txtTitle: TextView = findViewById(R.id.txtName)
        val descript: TextView = findViewById(R.id.txtdks)

        val intent = intent
        titlee = intent.getStringExtra("name")
        descripte = intent.getStringExtra("descript")
        imagee = intent.getStringExtra("image").toInt()
        Glide.with(this).load(imagee).into(img)
        txtTitle.text =titlee
        descript.text = descripte



    }
}

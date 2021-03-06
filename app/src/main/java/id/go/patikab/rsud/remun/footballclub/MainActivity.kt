package id.go.patikab.rsud.remun.footballclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.go.patikab.rsud.remun.footballclub.model.Item
import id.go.patikab.rsud.remun.footballclub.view.MainActivityUI
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Item> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()
        MainActivityUI(items).setContentView(this)
    }

    private fun initData() {
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        val descrip = resources.getStringArray(R.array.club_dk)
        items.clear()
        for (i in name.indices) {
            items.add(Item(
                    name[i],
                    image.getResourceId(i, 0),
                    descrip[i]
            ))
        }
        //Recycle the typed array
        image.recycle()
    }
}

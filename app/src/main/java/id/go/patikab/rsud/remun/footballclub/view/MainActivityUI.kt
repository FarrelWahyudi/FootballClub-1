package id.go.patikab.rsud.remun.footballclub.view

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import id.go.patikab.rsud.remun.footballclub.DetailActivity
import id.go.patikab.rsud.remun.footballclub.model.Item
import id.go.patikab.rsud.remun.footballclub.adapter.MainAdapter
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivityUI(val items: MutableList<Item> = mutableListOf()) : AnkoComponent<Context> {
    override fun createView(ui: AnkoContext<Context>): View = with(ui) {
        return relativeLayout {
            padding = dip(16)
            lparams(width = matchParent, height = wrapContent)

            recyclerView {
                lparams(width = matchParent, height = wrapContent)
                layoutManager = LinearLayoutManager(ctx)
                adapter = MainAdapter(context, items) {
//                    toast("${it.name}" + "${it.descrip}" + "${it.image.toString()}")
                    startActivity<DetailActivity>(
                            "name" to "${it.name}",
                            "image" to "${it.image}",
                            "descript" to "${it.descrip}"
                            )

                }
            }
        }
    }
}
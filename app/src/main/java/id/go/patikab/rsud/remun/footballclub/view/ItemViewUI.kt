package id.go.patikab.rsud.remun.footballclub.view

import android.annotation.SuppressLint
import android.content.Context
import android.support.constraint.R.id.gone
import android.view.View
import org.jetbrains.anko.*
import id.go.patikab.rsud.remun.footballclub.R

class ItemViewUI : AnkoComponent<Context> {
    @SuppressLint("WrongConstant")
    override fun createView(ui: AnkoContext<Context>): View = with(ui) {
        return relativeLayout {
            padding = dip(16)
            imageView {
                setImageResource(R.drawable.img_acm)
                id = R.id.img
            }.lparams {
                height = dip(50)
                width = dip(50)
                setMargins(0, 0, dip(16), 0)
            }
            textView {
                text = "Ac Milan"
                textSize = sp(8).toFloat()
                id = R.id.txtName

            }.lparams {
                width = wrapContent
                height = wrapContent
                topMargin= dip(10)
                rightOf(R.id.img)
            }
        }
    }

}
package id.go.patikab.rsud.remun.footballclub.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import id.go.patikab.rsud.remun.footballclub.model.Item
import id.go.patikab.rsud.remun.footballclub.R
import id.go.patikab.rsud.remun.footballclub.view.ItemViewUI
import org.jetbrains.anko.AnkoContext


class MainAdapter (private val context: Context, private val items: List<Item>, private val listener: (Item) -> Unit)
    : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
      return  MainAdapter.ViewHolder(ItemViewUI().createView(AnkoContext.Companion.create(parent!!.context)))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val img: ImageView = itemView.findViewById(R.id.img) as ImageView
        val txtTitle: TextView = itemView.findViewById(R.id.txtName) as TextView

        fun bindItem(items: Item, listener: (Item) -> Unit) {
            txtTitle.text = items.name
            Glide.with(itemView.context).load(items.image).into(img)
            itemView.setOnClickListener {
                listener(items)
            }
        }
    }
}
package me.okmanideep.androidgarage.ui.commons

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FakeAdapter(@LayoutRes var layoutRes : Int) : RecyclerView.Adapter<FakeAdapter.ViewHolder>() {
    val DEFAULT_COUNT = 10
    var count = DEFAULT_COUNT
        set(value) {
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
        return ViewHolder(inflate(layoutRes, parent!!))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        /** nothing to do **/
    }

    override fun getItemCount() = count

    fun inflate(@LayoutRes layoutRes: Int, parent : ViewGroup) : View {
        val inflater = LayoutInflater.from(parent.context)
        return inflater.inflate(layoutRes, parent, false);
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}

package lookup.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_look_up.view.*
import lookup.LookUpData

class LookUpViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
    fun bind(data: LookUpData){
        itemView.tvLookUpProvinceName.text = data.provinceName
    }
}
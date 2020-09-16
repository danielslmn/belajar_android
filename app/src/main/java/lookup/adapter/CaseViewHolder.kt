package lookup.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_main_look_up.view.*
import lookup.CaseData

class CaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(data: CaseData) {
        itemView.tvLookUpTotalCases.text = data.totalCase
        itemView.tvLookUpStatusCases.text = data.statusCase
    }


}

package lookup.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_hotline.view.*
import lookup.viewmodel.HotlineData

class HotlineViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(data: HotlineData){
            itemView.tvLookUpProvinceName.text = data.name
            itemView.tvHotlinePhone.text = data.phone
            // kalo buat text codingannya ini ^

            if(data.imgIcon.isNotBlank()){
                Picasso.get().load(data.imgIcon).into(itemView.imageprovinsi)
                // kalo buat image codingannya ini ^
            }


        }

    }
package lookup.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework1_homepagecovidapp.R
import lookup.LookUpData

class LookUpAdapter (
    private val lookUpList: MutableList<LookUpData>
) : RecyclerView.Adapter<LookUpViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LookUpViewHolder {
        return LookUpViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_look_up,
                parent,
                false
                )
        )
    }

        override fun getItemCount(): Int {
            return lookUpList.size
        }

        override fun onBindViewHolder(holder: LookUpViewHolder, position: Int) {
            holder.bind(lookUpList[position])
        }
}
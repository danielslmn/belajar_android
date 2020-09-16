package lookup.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework1_homepagecovidapp.R
import lookup.CaseData
import lookup.viewmodel.HotlineData

class CaseAdapter (
    private val caseList: MutableList<CaseData>
) : RecyclerView.Adapter<CaseViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CaseViewHolder {
        return CaseViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_main_look_up,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return caseList.size
    }

    fun updateData(newList: List<CaseData>) {
        caseList.clear()
        caseList.addAll(newList)

        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: CaseViewHolder, position: Int) {
        holder.bind(data = caseList[position])
    }
}
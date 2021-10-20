package sn.set.exemples.databinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<RendezVous>) :RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        // sets the text to the textview from our itemHolder class
        holder.idtextView.text = "Identifiant: " + ItemsViewModel.idRv
        holder.lieutextView.text = "Lieu: " + ItemsViewModel.lieuRv
        holder.datetextView.text = "Date: " + ItemsViewModel.dateRv
        holder.descriptiontextView.text = "Description: " + ItemsViewModel.descriptionRv


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val idtextView: TextView = itemView.findViewById(R.id.id_card)
        val lieutextView: TextView = itemView.findViewById(R.id.lieu_card)
        val datetextView: TextView = itemView.findViewById(R.id.date_card)
        val descriptiontextView: TextView = itemView.findViewById(R.id.description_card)
    }


}
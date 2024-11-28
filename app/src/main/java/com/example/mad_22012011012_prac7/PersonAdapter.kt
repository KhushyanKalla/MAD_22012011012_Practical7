package com.example.mad_22012011012_prac7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mad_22012011012_prac7.PersonAdapter.PersonViewHolder

class PersonAdapter(private val persons: Array<Person>) :
    RecyclerView.Adapter<PersonViewHolder>() {

    // ViewHolder class to hold references to the views in each item
    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.name)
        val phoneTextView: TextView = itemView.findViewById(R.id.phone)
        val emailTextView: TextView = itemView.findViewById(R.id.email)
        val addressTextView: TextView = itemView.findViewById(R.id.address)
    }

    // Inflates the item layout and returns the ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.listview_component, parent, false)
        return PersonViewHolder(view)
    }

    // Returns the total number of items in the dataset
    override fun getItemCount(): Int = persons.size

    // Binds the data to the views in the ViewHolder for a given position
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = persons[position]
        holder.nameTextView.text = person.name
        holder.phoneTextView.text = person.phoneNo
        holder.emailTextView.text = person.emailId
        holder.addressTextView.text = person.address
    }
}
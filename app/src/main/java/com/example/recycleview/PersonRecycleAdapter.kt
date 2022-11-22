package com.example.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class PersonRecycleAdapter(val context : Context, val persons : List<Person>) : RecyclerView.Adapter<PersonRecycleAdapter.ViewHolder>() {

    var layoutInflater = LayoutInflater.from(context)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {  // Rätt information från datan till rätt position i vår view

        val person = persons[position]

        holder.nameTextView.text = person.name
        holder.ageTextView.text = person.age.toString()
        holder.photoImageView.setImageDrawable(holder.photoImageView.context.getDrawable(person.picture))


    }

    override fun getItemCount(): Int { // How many cells should i scroll??
        return persons.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {          //Innehåller information om varje cell som vi kan återanvända

        var nameTextView = itemView.findViewById<TextView>(R.id.nameTextView)
        var ageTextView = itemView.findViewById<TextView>(R.id.ageTextView)
        var photoImageView = itemView.findViewById<ImageView>(R.id.photoImageView)



    }


}
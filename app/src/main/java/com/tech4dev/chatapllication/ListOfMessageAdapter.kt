package com.tech4dev.chatapllication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListOfMessageAdapter(val context: Context): RecyclerView.Adapter<ListOfMessageAdapter.MsgViewHolder>() {
    private val sampleMessages = SampleMessages()
    private val listOfMessages: List<Message> = sampleMessages.LIST_OF_MESSAGES


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MsgViewHolder {
        val itemView: View = LayoutInflater.from(context).inflate(R.layout.list_of_friends_layout, parent, false)
        return MsgViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MsgViewHolder, position: Int) {
        holder.username.text = listOfMessages[position].username
        holder.message.text = listOfMessages[position].message

    }

    override fun getItemCount(): Int = listOfMessages.size


    class MsgViewHolder(itemView: View): RecyclerView. ViewHolder(itemView){
        val username: TextView = itemView.findViewById(R.id.userName)
        val message: TextView = itemView.findViewById(R.id.status)

    }
}


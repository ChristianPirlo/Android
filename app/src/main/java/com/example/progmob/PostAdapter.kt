package com.example.progmob

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter (private val list: ArrayList<PostResponse>): RecyclerView.Adapter<PostAdapter.PostViewHolder>(){
    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(postResponse: PostResponse){
            with(itemView){
                val text = "id: ${postResponse.id}\n" +
                           "nama: ${postResponse.nama}\n" +
                           "nim: ${postResponse.nim}\n" +
                           "alamat: ${postResponse.alamat}\n" +
                           "email: ${postResponse.nama}\n" +
                           "foto: ${postResponse.foto}\n"
                tvText.text = text

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_uts_progmob, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(list[position])
    }
}
package com.nyawera.mytwittercontact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class TwitterRecyclerViewAdapter (var twitterList: List<twitter>):RecyclerView.Adapter<TweetViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder{
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item,parent,false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currenttwitter = twitterList.get(position)
        holder.tvName.text = currenttwitter.Name
        holder.tvEmail.text = currenttwitter.Email
        holder.tvDate.text = currenttwitter.Date


    }

    override fun getItemCount(): Int {
        return  twitterList.size
    }
}

class TweetViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView)
{
    var tvName: TextView = itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail: TextView = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvDate: TextView = itemView.findViewById<TextView>(R.id.tvDate)
    var ivComment: ImageView = itemView.findViewById<ImageView>(R.id.ivComment)
    var tvNum1: TextView = itemView.findViewById<TextView>(R.id.tvNum1  )
    var ivLike:ImageView = itemView.findViewById<ImageView>(R.id.ivComment)
    var tvNum2:TextView= itemView.findViewById<TextView>(R.id.tvNum2)
    var ivStart: ImageView = itemView.findViewById<ImageView>(R.id.ivStart)
    var ivRetweet: ImageView = itemView.findViewById<ImageView>(R.id.ivRetweet)
    var ivShare: ImageView = itemView.findViewById<ImageView>(R.id.ivShare)

}
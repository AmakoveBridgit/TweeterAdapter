

package com.example.replicatingui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.replicatingui.databinding.ActivityMainBinding
import com.example.replicatingui.databinding.TweetListItemBinding

class TweetAdapter (var tweetList:List<TweetData>):RecyclerView.Adapter<TweetViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {

    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
val currentTweet=tweetList.get(position)
    }

    override fun getItemCount(): Int {
       return tweetList.size
    }
}

class TweetViewHolder(binding: TweetListItemBinding):ViewHolder(binding.root)
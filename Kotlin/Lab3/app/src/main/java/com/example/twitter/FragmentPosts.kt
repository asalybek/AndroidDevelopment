package com.example.twitter

import android.app.PendingIntent.getActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessController.getContext
import java.util.*

class FragmentPosts {
    private var recyclerView: RecyclerView? = null
    private var adapter: PostAdapter? = null
    private var isAllPostVersion = false
    private val dataSet: MutableList<Post> = ArrayList<Post>()
    private val postsContainer: PostsContainer = PostsContainer.get()!!

    companion object {
        fun newInstance(isAllPostVersion: Boolean): FragmentPosts? {
            val fragment = FragmentPosts()
            fragment.isAllPostVersion = isAllPostVersion
            return fragment
        }
    }

    fun onCreate(savedInstanceState: Bundle?) {
        (savedInstanceState)
    }

    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_posts, container, false)
        recyclerView = v.findViewById(R.id.recyclerView)
        if (isAllPostVersion) {
            dataSet.addAll(postsContainer.getAllPosts()!!)
        } else {
            dataSet.addAll(postsContainer.getLikedPosts()!!)
        }
        adapter = PostAdapter(dataSet, this)
        recyclerView?.setLayoutManager(LinearLayoutManager(getActivity(v.context)))
        recyclerView?.addItemDecoration(
            DividerItemDecoration(
                v.context,
                LinearLayoutManager.VERTICAL
            )
        )
        recyclerView?.setAdapter(adapter)
        return v
    }

    fun onPostLike() {
        (getActivity() as MainActivity).onPostLike()
    }

    fun updateLike() {
        dataSet.clear()
        dataSet.addAll(postsContainer.getLikedPosts()!!)
        adapter?.notifyDataSetChanged()
    }

    fun updatePage() {
        dataSet.clear()
        dataSet.addAll(postsContainer.getAllPosts()!!)
        adapter.notifyDataSetChanged()
    }
}
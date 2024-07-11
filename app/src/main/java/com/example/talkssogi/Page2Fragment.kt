package com.example.talkssogi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.talkssogi.R

class Page2Fragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var chatRoomAdapter: ChatRoomAdapter
    private lateinit var chatRoomList: List<ChatRoom>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.page2, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // 카톡방 데이터 예시
        chatRoomList = listOf(
            ChatRoom("카톡방 1", R.drawable.profile_placeholder),
            ChatRoom("카톡방 2", R.drawable.profile_placeholder),
            ChatRoom("카톡방 3", R.drawable.profile_placeholder),
            ChatRoom("카톡방 4", R.drawable.profile_placeholder),
            ChatRoom("카톡방 5", R.drawable.profile_placeholder),
            ChatRoom("카톡방 6", R.drawable.profile_placeholder),
            ChatRoom("카톡방 7", R.drawable.profile_placeholder)
        )

        chatRoomAdapter = ChatRoomAdapter(chatRoomList)
        recyclerView.adapter = chatRoomAdapter

        return view
    }
}
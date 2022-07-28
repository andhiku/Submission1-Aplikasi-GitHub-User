package com.dimas.githubuserapp1.adapter

import com.dimas.githubuserapp1.data.User

interface OnItemClickCallback {
    fun onItemClicked(user : User)
}
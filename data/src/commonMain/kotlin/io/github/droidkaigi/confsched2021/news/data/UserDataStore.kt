package io.github.droidkaigi.confsched2021.news.data

import kotlinx.coroutines.flow.Flow

interface UserDataStore {
    fun favorites(): Flow<Set<String>>
    suspend fun addFavorite(id: String)
    suspend fun removeFavorite(id: String)
}
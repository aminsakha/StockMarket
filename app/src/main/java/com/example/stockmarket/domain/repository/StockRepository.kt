package com.example.stockmarket.domain.repository

import com.example.stockmarket.domain.model.CompanyListing
import com.example.stockmarket.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}
package com.example.web_lab4.datasource

import com.example.web_lab4.datasource.mock.MockBankDataSource
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MockBankDataSourceTest {
    private val mockDataSource = MockBankDataSource()
    @Test
    fun should() {
        val banks = mockDataSource.retrieveBanks()
        assertThat(banks).isNotEmpty()
    }
}
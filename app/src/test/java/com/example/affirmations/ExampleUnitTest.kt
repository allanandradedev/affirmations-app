package com.example.affirmations

import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Affirmation
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun affirmation_list_is_not_null() {
        val datasource = Datasource()
        val itemList = datasource.loadAffirmations()

        assertNotNull("Affirmation list cannot be null", itemList)
    }
}
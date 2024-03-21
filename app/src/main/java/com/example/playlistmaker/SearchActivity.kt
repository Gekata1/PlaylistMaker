package com.example.playlistmaker

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.media3.extractor.mp4.Track
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.internal.ViewUtils.hideKeyboard
import com.google.android.material.textfield.TextInputEditText

class SearchActivity : AppCompatActivity() {
    private lateinit var inputEditText: EditText
    private lateinit var clearButton: ImageView
    private var searchQuery: String? = null
    private val audio = ArrayList<Track>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)

        val toolbar: MaterialToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.setNavigationOnClickListener() {
            finish()
        }
        clearButton = findViewById(R.id.clearButton)
        clearButton.setOnClickListener {
            inputEditText.text.clear()
            hideKeyboard()
            clearButton.visibility = View.GONE
        }

        inputEditText = findViewById(R.id.search_form)
         inputEditText.addTextChangedListener(object : android.text.TextWatcher {
             override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
             }

             override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                 clearButton.visibility = if (s.isNullOrEmpty()) View.GONE else View.VISIBLE
             }
             override fun afterTextChanged(s: Editable?) {
             searchQuery = s.toString()}
         })
             if (savedInstanceState != null){
                 searchQuery = savedInstanceState.getString("searchQuery")
                 inputEditText.setText(searchQuery)
             }

         }




    private fun hideKeyboard() {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(inputEditText.windowToken, 0)
    }
}




package io.kikiriki.app.ui.main

import android.os.Bundle
import androidx.core.view.isVisible
import dagger.hilt.android.AndroidEntryPoint
import io.kikiriki.app.R
import io.kikiriki.app.databinding.ActivityMainBinding
import io.kikiriki.app.ui.BaseActivity
import io.kikiriki.app.ui.adapter.AdapterNote
import io.kikiriki.app.utils.extension.shortToast
import io.kikiriki.app.utils.extension.toast
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private val viewBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    @Inject lateinit var viewModel: MainViewModel
    private val adapter = AdapterNote()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        setupObservers()
        setupView()

        viewModel.getNotes()
    }

    private fun setupView() {
        viewBinding.btnTryAgain.setOnClickListener { viewModel.getNotes() }
        viewBinding.recyclerView.adapter = adapter
        adapter.onItemClick = { shortToast(R.string.app_name) }
    }

    private fun setupObservers() = viewModel.uiState.observe(this) { uiState ->

        // loading
        viewBinding.loading.isVisible = uiState.isLoading
        viewBinding.recyclerView.isVisible = !uiState.isLoading

        // items
        adapter.submitList(uiState.items)

        // error
        uiState.error?.let { toast(it) }

    }


}
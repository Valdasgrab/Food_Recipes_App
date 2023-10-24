package lt.vgrabauskas.foodrecipesapp.ui.fragments.ingredients

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import lt.vgrabauskas.foodrecipesapp.adapters.IngredientsAdapter
import lt.vgrabauskas.foodrecipesapp.databinding.FragmentIngridientsBinding
import lt.vgrabauskas.foodrecipesapp.models.Result
import lt.vgrabauskas.foodrecipesapp.util.Constants.Companion.RECIPE_RESULT_KEY
import lt.vgrabauskas.foodrecipesapp.util.retrieveParcelable

class IngredientsFragment : Fragment() {

    private val mAdapter: IngredientsAdapter by lazy { IngredientsAdapter() }

    private var _binding: FragmentIngridientsBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentIngridientsBinding.inflate(inflater, container, false)

        val args = arguments
        val myBundle: Result? = args?.retrieveParcelable(RECIPE_RESULT_KEY)
        setupRecycleView()
        myBundle?.extendedIngredients?.let { mAdapter.setData(it) }

        return binding.root
    }

    private fun setupRecycleView() {
        binding.ingredientsRecyclerView.adapter = mAdapter
        binding.ingredientsRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
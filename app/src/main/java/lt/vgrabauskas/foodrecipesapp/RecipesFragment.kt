package lt.vgrabauskas.foodrecipesapp

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewStub
import android.widget.FrameLayout
import com.facebook.shimmer.ShimmerFrameLayout

class RecipesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recipes, container, false)

        val shimmerPlaceholder = view.findViewById<ShimmerFrameLayout>(R.id.shimmer_placeholder_container)
        val contentContainer = view.findViewById<ViewGroup>(R.id.content_container)

        shimmerPlaceholder.startShimmer()

        Handler(Looper.getMainLooper()).postDelayed({
            shimmerPlaceholder.stopShimmer()
            shimmerPlaceholder.visibility = View.GONE
            val recipesRowLayout = inflater.inflate(R.layout.recipes_row_layout, null)
            contentContainer.addView(recipesRowLayout)
        }, 3000)

        return view
    }
}
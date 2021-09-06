package wow.application.tbcauctionhouseviewer.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import wow.application.tbcauctionhouseviewer.MainApplication
import wow.application.tbcauctionhouseviewer.R
import wow.application.tbcauctionhouseviewer.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        val realmListView: RecyclerView = binding.realmList
        realmListView.layoutManager = LinearLayoutManager(MainApplication.applicationContext())
        realmListView.addItemDecoration(
            DividerItemDecoration(
                MainApplication.applicationContext(),
                RecyclerView.VERTICAL
            )
        )
        homeViewModel.realms.observe(viewLifecycleOwner, Observer {
            realmListView.adapter = RealmListAdapter(it)
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
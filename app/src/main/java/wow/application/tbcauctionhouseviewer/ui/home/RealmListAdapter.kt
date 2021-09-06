package wow.application.tbcauctionhouseviewer.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import wow.application.tbcauctionhouseviewer.R
import wow.application.tbcauctionhouseviewer.model.Realm
import wow.application.tbcauctionhouseviewer.model.ResultItem

class RealmListAdapter(val realms: List<ResultItem<Realm>>) : RecyclerView.Adapter<RealmListAdapter.RealmListViewHolder>() {

    class RealmListViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.text_realm_name)
        val type = view.findViewById<TextView>(R.id.text_realm_type)
    }

    override fun getItemCount(): Int {
        return realms.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RealmListViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.realm_item, parent, false)
        return RealmListViewHolder(layout)
    }

    override fun onBindViewHolder(holder: RealmListViewHolder, position: Int) {
        val realmData: Realm = realms[position].data
        holder.name.text = realmData.realms[0].name.enUS
        holder.type.text = realmData.realms[0].type.name.enUS
    }
}
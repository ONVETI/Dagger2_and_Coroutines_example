package uz.onveti.myapp120dagger2example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_item_layout.view.*
import uz.onveti.myapp120dagger2example.R
import uz.onveti.myapp120dagger2example.model.User

class UserRvAdxapter(var list: List<User>) : RecyclerView.Adapter<UserRvAdxapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(user: User) {
            itemView.text_view_id.text = "${user.name}\n${user.email}"
        }
    }
}
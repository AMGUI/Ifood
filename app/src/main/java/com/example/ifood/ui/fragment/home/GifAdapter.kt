import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ifood.R

private val imgs = intArrayOf(
    R.drawable.burger,
    R.drawable.pizza,
    R.drawable.burrito,
    R.drawable.refri,
    R.drawable.fries

)

class GifAdapter() : RecyclerView.Adapter<GifAdapter.GifViewHolder>() {

    inner class GifViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itens_page, parent, false)
        return GifViewHolder(view)
    }

    override fun onBindViewHolder(holder: GifViewHolder, position: Int) {
        val gifItem = imgs[position]
        Glide.with(holder.itemView.context)
            .asGif()
            .load(gifItem)
            .into(holder.itemView.findViewById(R.id.imageViewGif))
    }

    override fun getItemCount(): Int {
        return imgs.size
    }
}

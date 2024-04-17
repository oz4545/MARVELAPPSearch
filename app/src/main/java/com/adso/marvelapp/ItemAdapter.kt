import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adso.marvelapp.R
import com.adso.marvelapp.modelo.Superheroe
import com.bumptech.glide.Glide

class ItemAdapter(private val superheroes: List<Superheroe>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val publisherTextView: TextView = itemView.findViewById(R.id.publisherTextView)
        val realNameTextView: TextView = itemView.findViewById(R.id.realNameTextView)
        val heroImage: ImageView = itemView.findViewById(R.id.heroImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val superheroe = superheroes[position]
        holder.nameTextView.text = superheroe.nombre
        holder.publisherTextView.text = superheroe.publisher
        holder.realNameTextView.text = superheroe.nombreReal
        Glide.with(holder.itemView.context)
            .load(superheroe.foto)
            .override(800, 800)
            .into(holder.heroImage)
    }

    override fun getItemCount() = superheroes.size
}
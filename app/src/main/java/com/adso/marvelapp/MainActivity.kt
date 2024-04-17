package com.adso.marvelapp
import ItemAdapter
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import android.os.Bundle
import android.util.Log
import androidx.core.net.toUri
import androidx.recyclerview.widget.GridLayoutManager
import com.adso.marvelapp.databinding.ActivityMainBinding
import com.adso.marvelapp.modelo.Superheroe

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val batman: Superheroe = Superheroe("Batman","DC","Bruce Wayne","https://bandai.com.mx/blog/wp-content/uploads/2019/09/Historia-de-Batman-el-superhe%CC%81roe-ma%CC%81s-popular-en-la-era-digital-copia-1.jpg")
    val nombreBatman = batman.nombreReal

    var superheroes: MutableList<Superheroe> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Lista de superhéroes
        val superheroes = listOf(
            Superheroe("Spiderman", "marvel", "peter", "https://static.wikia.nocookie.net/ficcion-sin-limites/images/6/6b/Spidey.png/revision/latest?cb=20210226124716&path-prefix=es"),
            Superheroe("Thor", "marvel", "thor odinson", "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/0/0b/Thor.png/revision/latest?cb=20230122204800&path-prefix=es"),
            Superheroe("Flash", "DC", "jay garrick", "https://www.serietotaal.nl/images/nieuws/t/cwfc31mrztfy-600x338.jpg"),
            Superheroe("Green", "DC", "alan", "https://www.serietotaal.nl/images/nieuws/t/863uxf7w108x-600x338.jpg"),
            Superheroe("Daredevil", "marvel", "matthew", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Daredevil_C2E2_2016_%2825328511184%29.jpg/800px-Daredevil_C2E2_2016_%2825328511184%29.jpg"),
            Superheroe("Hulk", "marvel", "Bruce Banner", "https://elcomercio.pe/resizer/HdNSF9Y1TiKH3aFJvBaVCF7FQG4=/580x330/smart/filters:format(jpeg):quality(75)/arc-anglerfish-arc2-prod-elcomercio.s3.amazonaws.com/public/ZMA3AZW5VNDAJND3JJCEHENXVA.jpg"),
            Superheroe("Black Widow", "marvel", " Natasha Romanoff", "https://upload.wikimedia.org/wikipedia/commons/0/00/Scarlett_Johansson_-_Captain_America_2_press_conference_%28retouched%29_2.jpg"),
            Superheroe("Capitán América", "marvel", " Steven ", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Chris_Evans_SDCC_2014_%282%29.jpg/800px-Chris_Evans_SDCC_2014_%282%29.jpg"),
            Superheroe("Deadpool", "marvel", "Wade Winston Wilson", "https://e.rpp-noticias.io/xlarge/2020/05/18/345934_943539.jpg"),
            Superheroe("SuperMan", "DC", "Clark Kent", "https://i0.wp.com/therationalmale.com/wp-content/uploads/2011/09/clark_kent.jpg")
        )

        // Configurar el RecyclerView
        binding.recyclerView.layoutManager = GridLayoutManager(this, 2)
        binding.recyclerView.adapter = ItemAdapter(superheroes)
    }

}
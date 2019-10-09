package bav.anyway

import android.os.Bundle
import android.preference.PreferenceManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_map.*
import org.osmdroid.config.Configuration
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import androidx.navigation.NavController
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import android.widget.Button
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first_screen.*
import javax.inject.Inject


class MainActivity
@Inject constructor(): DaggerAppCompatActivity() {
    var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*val ctx = applicationContext
        Configuration.getInstance().load(ctx, PreferenceManager.getDefaultSharedPreferences(ctx))*/

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        /*setContentView(R.layout.activity_main)

        map.setTileSource(TileSourceFactory.MAPNIK)

        map.setMultiTouchControls(true)
        val mapController = map.controller
        mapController.setZoom(9.5)
        val startPoint = GeoPoint(48.8583, 2.2944)
        mapController.setCenter(startPoint)*/
        val button : Button = findViewById(R.id.buttonGo)
button.setOnClickListener(this::GoClick)
    }

    fun GoClick(view: View) {
        navController?.navigate(R.id.mapFragment)
    }

    override fun onResume() {
        super.onResume()
        map.onResume()
    }

    override fun onPause() {
        super.onPause()
        map.onPause()
    }
}

package app.morino.mikan.week1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_result.*
import kotlin.random.Random

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var listImage = IntArray(5)
        listImage[0] = R.drawable.sekenshirazu
        listImage[1] = R.drawable.lovutatsuro
        listImage[2] = R.drawable.rainbowikeda
        listImage[3] = R.drawable.tosakyodai
        listImage[4] = R.drawable.syakariki


        val listName = listOf("世間知らズ", "ラブたつろう", "レインボー池田", "土佐兄弟 有輝", "しゃかりき 光")
        val urlList = listOf("https://www.tiktok.com/@MS4wLjABAAAA6ruOr_oDryfuViUR4USqnVsYm8TP9lmKSK40W1vvujKE7Wf9_MMgxVoIyzlu2BLA?enter_from=h5_t","https://www.tiktok.com/@lovetatsuro?enter_from=h5_t","https://www.tiktok.com/@ikenao0919?region=JP&mid=6564458583654664962&timestamp=1528407157&utm_campaign=client_share&app=tiktok&utm_medium=ios&tt_from=twitter&iid=6563638384009676546&utm_source=twitter&enter_from=h5_t", "https://www.tiktok.com/@tosakyodaiotot_yuki103?language=ja&sec_uid=MS4wLjABAAAAXknbTjyEdMbAW8wiV1v2gXuKz8sLRb3xiTp2npnoI0e7AtT-dosfZlQG_YxCCZUb&u_code=d76j62840j2jc3&utm_source=copy&app=tiktok&iid=6714997821584770817&utm_campaign=client_share&utm_medium=ios&tt_from=copy&user_id=6712390029832799234&enter_from=h5_t", "https://www.tiktok.com/@MS4wLjABAAAALVsmQWsNfVCsr2vggB8GvbD5evJ_VluOYPQo-xSMH1mpb297tX0A8TlhUZzKe5v3?region=JP&mid=6689366714339117825&u_code=10jbi29jf&preview_pb=0&language=ja&timestamp=1560336945&utm_source=twitter&app=tiktok&iid=6701595371669341953&utm_campaign=client_share&utm_medium=ios&tt_from=twitter&user_id=81199533630&enter_from=h5_t")
        val imageView = findViewById<ImageView>(R.id.imageView)
        val button = findViewById<Button>(R.id.button)
        val random = Random.nextInt(listImage.count())

        imageView.setImageResource(listImage[random])
        textView.setText(listName[random])

        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        linkButton.setOnClickListener{
            val url = urlList[random]
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }
}

package app.com.dharmaapp.activity;

import android.app.Activity;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.ViewStructure;
import android.widget.TextView;

import app.com.dharmaapp.R;

public class AboutUsActivity extends Activity {

    private TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        txtview = findViewById(R.id.txtview);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            txtview.setText(Html.fromHtml("<div id='content'> <div class='lsize cf'> <div class='l-part'> <h1><span>About Us</span></h1>DHARMA EXTRUSIONS PVT. LTD.   an ISO 9001–2008 Company was established  in the year  2010 by Experienced two Industrialist Brothers.  It has started Production of Aluminium Extruded Sections  / Profiles  in the month of November-2010. With sophisticated extrusion plant. The DEPL success  is due to  customer oriented sense of enterprise,  ensuring very good service & good quality products.The DEPL believes in marching ahead to the principle of Building strong relationship  with its customers. <br /> <br /> <h2>PRODUCTS &amp; SPECIFICATIONS  : </h2>DEPL manufactures and supplies wide range of Aluminium Extruded Sections  & Profiles in different alloys for general  and customized  applications such as Architecturals,  Aviation, Bus Bar, Bus Body Sections, Constructions,  Electrical & Electronics etc.. <br /> <br /> <ul class='list-01'> <li>Extrusions supply with  mill finish / Anodizing / Powder Coating..</li> <li>Common Alloys are 63400 (6063), 19500 (EC), 63401 (E91), 6061, 6005 GRADE and can Supply in various alloys i.e.</li> <li>Also can supply in various special sections as per customer requirements with dimensional tolerance as per relevant IS/Bs/DIN Standards.</li> <li>Product length can supplied up to 6. mtr.</li> <li>In House tool room and well equipped die design for intricate profiles.</li> <li>Price  - competitive among others.</li> </ul> <br /> <h2>FACILITIES</h2> <p>The facilities consist of an hydraulic extrusions press capacity with 1000 MTS. <br /> <br />We have complete facilities for melting and casting of Aluminium & its alloys.  Extrusions Press with modern puller at run out with post extrusions handling systems and facilities for heat treatment of extruded sections. <br /> <br />We have on-line quality assurance system at every stage of operation to ensure quality of our product . <br /> <br />We have our well equipped tool room with sophisticated machines for manufacturing of extrusion</p> <p>tooling and also having latest testing Laboratory to ensure quality of our products rights from raw materials stage to finish products </p> </div></div>", Html.FROM_HTML_MODE_COMPACT));
        } else {
            txtview.setText(Html.fromHtml("<div id='content'> <div class='lsize cf'> <div class='l-part'> <h1><span>About Us</span></h1>DHARMA EXTRUSIONS PVT. LTD.   an ISO 9001–2008 Company was established  in the year  2010 by Experienced two Industrialist Brothers.  It has started Production of Aluminium Extruded Sections  / Profiles  in the month of November-2010. With sophisticated extrusion plant. The DEPL success  is due to  customer oriented sense of enterprise,  ensuring very good service & good quality products.The DEPL believes in marching ahead to the principle of Building strong relationship  with its customers. <br /> <br /> <h2>PRODUCTS &amp; SPECIFICATIONS  : </h2>DEPL manufactures and supplies wide range of Aluminium Extruded Sections  & Profiles in different alloys for general  and customized  applications such as Architecturals,  Aviation, Bus Bar, Bus Body Sections, Constructions,  Electrical & Electronics etc.. <br /> <br /> <ul class='list-01'> <li>Extrusions supply with  mill finish / Anodizing / Powder Coating..</li> <li>Common Alloys are 63400 (6063), 19500 (EC), 63401 (E91), 6061, 6005 GRADE and can Supply in various alloys i.e.</li> <li>Also can supply in various special sections as per customer requirements with dimensional tolerance as per relevant IS/Bs/DIN Standards.</li> <li>Product length can supplied up to 6. mtr.</li> <li>In House tool room and well equipped die design for intricate profiles.</li> <li>Price  - competitive among others.</li> </ul> <br /> <h2>FACILITIES</h2> <p>The facilities consist of an hydraulic extrusions press capacity with 1000 MTS. <br /> <br />We have complete facilities for melting and casting of Aluminium & its alloys.  Extrusions Press with modern puller at run out with post extrusions handling systems and facilities for heat treatment of extruded sections. <br /> <br />We have on-line quality assurance system at every stage of operation to ensure quality of our product . <br /> <br />We have our well equipped tool room with sophisticated machines for manufacturing of extrusion</p> <p>tooling and also having latest testing Laboratory to ensure quality of our products rights from raw materials stage to finish products</div>"));
        }
        txtview.setMovementMethod(new ScrollingMovementMethod());

    }
}

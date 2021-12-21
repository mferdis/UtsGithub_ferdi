package com.example.utsgithub_ferdi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Myitem> mItemList;

    private RecyclerView mRecylearView;
    private ItemAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDataList();
        buildRecylearView();
    }



    private void createDataList() {
        mItemList = new ArrayList<>();
        mItemList.add(new Myitem(R.drawable.bill, "Bill Gates", "Gates", "Programer", "512", "Repository", "18,7Jt", "Foolowers", "134", "Foolowing", "William Henry \"Bill\" Gates III adalah seorang tokoh bisnis, investor, filantropis, penulis asal Amerika Serikat, serta mantan CEO yang saat ini menjabat sebagai ketua Microsoft, perusahaan perangkat lunak yang ia dirikan bersama Paul Allen"));
        mItemList.add(new Myitem(R.drawable.warren, "Warren Buffet", "Buffet", "Investor", "612", "Repository", "20,7Jt", "Foolowers", "412", "Foolowing", "Warren Edward Buffett adalah seorang investor, pengusaha, dan filantropis asal Amerika Serikat. Buffett adalah komisaris, direktur utama, dan sekaligus pemegang saham terbesar di Berkshire Hathaway. Dia adalah orang terkaya ketiga di dunia tahun 2015 versi Forbes"));
        mItemList.add(new Myitem(R.drawable.agus, "Galuh Agus Ferdiyanto", "Agus", "Programer", "712", "Repository", "1,7Jt", "Foolowers", "19,8RB", "Foolowing", "Galuh Agus Ferdiyanto adalah seorang mahasiswa dari salah 1 kampus swasta di Indonesia dan dia akan menjadi programmer"));
        mItemList.add(new Myitem(R.drawable.hasan, "Nur Hasannudin", "Hasan", "Programer", "321", "Repository", "2,7Jt", "Foolowers", "678,7RB", "Foolowing", "Nur Hasanudin adalah seorang santri dan mahasiswa dari salah 1 kampus swasta di Indonesia kemudian dia akan menjadi programmer"));
        mItemList.add(new Myitem(R.drawable.ferdi, "M Ferdi Soleekhin", "Ferdi", "Programer", "452", "Repository", "18,9JT", "Foolowers", "412", "Foolowing", "M Ferdi Soleekhin adalah seorang anak muda yang akan menjadi programer"));
        mItemList.add(new Myitem(R.drawable.ritchie, "Dennis Ritchie", "Ritchie", "Programer", "654", "Repository", "12,4Jt", "Foolowers", "761", "Foolowing", "Dennis MacAlistair Ritchie adalah seorang ilmuwan komputer yang dikenal atas sumbangsihnya membuat bahasa pemrograman C dan berbagai sistem operasi seperti Multics dan Unix. Ritchie menerima penghargaan Turing Award pada tahun 1983 dan National Medal of Technology 1998 pada 21 April 1999"));
        mItemList.add(new Myitem(R.drawable.narenda, "Narenda Wicaksono", "Narenda", "Programer", "309", "Repository", "16,5JT", "Foolowers", "812", "Foolowing", "Narenda Wicaksono, sosok muda berbakat di dunia teknologi informasi. Geliatnya terlihat sejak ia duduk di bangku kuliah jurusan informatika ITB. Tak hanya pandai dalam bidang akademis, pria yang akrab disapa Naren ini juga pandai berorganisasi. Tercatat ia pernah menjabat sebagai Ketua Himpunan Informatika ITB dan Microsoft Students Partners. Di bidang akademis, ia juga beberapa kali menyumbangkan penghargaan bergengsi seperti Imagine Cup 2006, LCEN 2006, dan Lomba Riset ITB 2006. "));
        mItemList.add(new Myitem(R.drawable.najwa, "Najwa Shihab", "Najwa", "Jurnalis", "809", "Jurnalis", "10,5JT", "Floowers", "477", "Foolowing", "Najwa Shihab, S.H., LL.M. adalah pembawa acara, jurnalis, aktris, feminis, dan aktivis media sosial Indonesia yang berketurunan Bugis dan Arab. Najwa adalah putri kedua Quraish Shihab, yang merupakan Menteri Agama Republik Indonesia pada era Kabinet Pembangunan VII dan keponakan dari politikus Alwi Shihab."));
        mItemList.add(new Myitem(R.drawable.ronaldo2, "Cristiano Ronaldo", "Ronaldo", "Pemain Sepak Bola", "1002", "Repository", "12,3JT", "Floowers", "561", "Foolowing", "Cristiano Ronaldo dos Santos Aveiro GOIH ComM adalah seorang pemain sepak bola profesional asal Portugal yang bermain sebagai penyerang untuk klub Liga Utama Inggris, Manchester United dan juga kapten untuk tim nasional Portuga"));
        mItemList.add(new Myitem(R.drawable.vino, "Vino G Bastian", "Vino", "Aktor", "654", "Repositoy", "30,7JT", "Foolowers", "817", "Foolowing", "Vino Giovanni Bastian adalah seorang aktor dan model Indonesia keturunan Minangkabau, Sumatera Barat. Ia adalah putra bungsu dari penulis novel populer Indonesia, Bastian Tito serta suami dari model dan pemeran Indonesia, Marsha Timothy."));
    }

    private void buildRecylearView() {

        mRecylearView = findViewById(R.id.rvListUser);
        mRecylearView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ItemAdapter(mItemList);

        mRecylearView.setLayoutManager(mLayoutManager);
        mRecylearView.setAdapter(mAdapter);



        mAdapter.setOnItemClickListener(new ItemAdapter.onItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("Myitem", mItemList.get(position));

                startActivity(intent);


            }

        });

    }
}
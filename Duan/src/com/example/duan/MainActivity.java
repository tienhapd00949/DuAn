package com.example.duan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {
	ImageView bachduong, kimnguu, baobinh, hocap, cugiai, maket, xunu, songtu,
			songnguu, nhanma, thienbinh, sutu ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bachduong = (ImageView) findViewById(R.id.bachduong);
		kimnguu = (ImageView) findViewById(R.id.kimnguu);
		baobinh = (ImageView) findViewById(R.id.baobinh);
		hocap = (ImageView) findViewById(R.id.hocap);
		cugiai = (ImageView) findViewById(R.id.cugiai);
		maket = (ImageView) findViewById(R.id.maket);
		xunu = (ImageView) findViewById(R.id.xunu);
		songtu = (ImageView) findViewById(R.id.songtu);
		songnguu = (ImageView) findViewById(R.id.songngu);
		nhanma = (ImageView) findViewById(R.id.nhanma);
		thienbinh = (ImageView) findViewById(R.id.thienbinh);
		sutu = (ImageView) findViewById(R.id.sutu);
		

		bachduong.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,
						BachDuongActivity.class);
				startActivity(i);
			}

		});
		baobinh.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, BaoBinhActivity.class);
				startActivity(i);
			}

		});
		hocap.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, HoCapActivity.class);
				startActivity(i);
			}

		});
		cugiai.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, CugiaiActivity.class);
				startActivity(i);
			}

		});
		kimnguu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, KimNguuActivity.class);
				startActivity(i);
			}

		});
		maket.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, MaKetActivity.class);
				startActivity(i);
			}

		});
		nhanma.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, NhanMaActivity.class);
				startActivity(i);
			}

		});
		songnguu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, SongNguActivity.class);
				startActivity(i);
			}

		});
		songtu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, SongtuActivity.class);
				startActivity(i);
			}

		});
		thienbinh.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,
						ThienBinhActivity.class);
				startActivity(i);
			}

		});
		xunu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, XuNuActivity.class);
				startActivity(i);
			}

		});
		sutu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, SutuActivity.class);
				startActivity(i);
			}

		});
		
	}

}

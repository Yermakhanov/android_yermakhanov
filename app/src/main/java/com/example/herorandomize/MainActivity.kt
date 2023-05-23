package com.example.herorandomize

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.JsonReader
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TableRow
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.squareup.picasso.Picasso
import com.squareup.picasso.Request
import org.json.JSONArray
import org.json.JSONObject
import java.net.URL
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    //TableRow
    private var row1:TableRow? = null
    private var row2:TableRow? = null
    private var row3:TableRow? = null
    private var row4:TableRow? = null
    private var row5:TableRow? = null
    private var row6:TableRow? = null
    private var row7:TableRow? = null
    private var row8:TableRow? = null
    private var row9:TableRow? = null
    private var row10:TableRow? = null


    //ImageView
    private var img1:ImageView? = null
    private var img2:ImageView? = null
    private var img3:ImageView? = null
    private var img4:ImageView? = null
    private var img5:ImageView? = null
    private var img6:ImageView? = null
    private var img7:ImageView? = null
    private var img8:ImageView? = null
    private var img9:ImageView? = null
    private var img10:ImageView? = null


    //TextView
    private var text1:TextView? = null
    private var text2:TextView? = null
    private var text3:TextView? = null
    private var text4:TextView? = null
    private var text5:TextView? = null
    private var text6:TextView? = null
    private var text7:TextView? = null
    private var text8:TextView? = null
    private var text9:TextView? = null
    private var text10:TextView? = null






    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TableRowId
        row1 = findViewById(R.id.row1)
        row2 = findViewById(R.id.row2)
        row3 = findViewById(R.id.row3)
        row4 = findViewById(R.id.row4)
        row5 = findViewById(R.id.row5)
        row6 = findViewById(R.id.row6)
        row7 = findViewById(R.id.row7)
        row8 = findViewById(R.id.row8)
        row9 = findViewById(R.id.row9)
        row10 = findViewById(R.id.row10)

        //ImageViewId
        img1 = findViewById(R.id.img1)
        img2 = findViewById(R.id.img2)
        img3 = findViewById(R.id.img3)
        img4 = findViewById(R.id.img4)
        img5 = findViewById(R.id.img5)
        img6 = findViewById(R.id.img6)
        img7 = findViewById(R.id.img7)
        img8 = findViewById(R.id.img8)
        img9 = findViewById(R.id.img9)
        img10 = findViewById(R.id.img10)

        //TextViewId
        text1 = findViewById(R.id.text1)
        text2 = findViewById(R.id.text2)
        text3 = findViewById(R.id.text3)
        text4 = findViewById(R.id.text4)
        text5 = findViewById(R.id.text5)
        text6 = findViewById(R.id.text6)
        text7 = findViewById(R.id.text7)
        text8 = findViewById(R.id.text8)
        text9 = findViewById(R.id.text9)
        text10 = findViewById(R.id.text10)



request()



    }
    fun request(){
        val url1 = "https://www.googleapis.com/books/v1/users/1112223334445556677/bookshelves/0"
        val url2 = "https://www.googleapis.com/books/v1/users/1112223334445556677/bookshelves/3"
        val url3 = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/id/119.json"
        val url4 = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/id/286.json"
        val url5 = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/id/171.json"
        val url6 = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/id/222.json"
        val url7 = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/id/180.json"
        val url8 = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/id/81.json"
        val url9 = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/id/191.json"
        val url10 = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/id/586.json"


        val queue = Volley.newRequestQueue(this)
        val reques1 = StringRequest(com.android.volley.Request.Method.GET,url1,
            Response.Listener { response ->
                val data = response.toString()
                val JObject = JSONObject(data)
                val name = JObject.getString("name")
                text1?.text = name
                val imageurl = JObject.getJSONObject("images").getString("sm").toString()
                Picasso.get().load(imageurl).into(img1)
            }, Response.ErrorListener {})


        val reques2 = StringRequest(com.android.volley.Request.Method.GET,url2,
            Response.Listener { response ->
                val data = response.toString()
                val JObject = JSONObject(data)
                val name = JObject.getString("name")
                text2?.text = name
                val imageurl = JObject.getJSONObject("images").getString("sm").toString()
                Picasso.get().load(imageurl).into(img2)
            }, Response.ErrorListener {})


        val reques3 = StringRequest(com.android.volley.Request.Method.GET,url3,
            Response.Listener { response ->
                val data = response.toString()
                val JObject = JSONObject(data)
                val name = JObject.getString("name")
                text3?.text = name
                val imageurl = JObject.getJSONObject("images").getString("sm").toString()
                Picasso.get().load(imageurl).into(img3)
            }, Response.ErrorListener {})


        val reques4 = StringRequest(com.android.volley.Request.Method.GET,url4,
            Response.Listener { response ->
                val data = response.toString()
                val JObject = JSONObject(data)
                val name = JObject.getString("name")
                text4?.text = name
                val imageurl = JObject.getJSONObject("images").getString("sm").toString()
                Picasso.get().load(imageurl).into(img4)
            }, Response.ErrorListener {})


        val reques5 = StringRequest(com.android.volley.Request.Method.GET,url5,
            Response.Listener { response ->
                val data = response.toString()
                val JObject = JSONObject(data)
                val name = JObject.getString("name")
                text5?.text = name
                val imageurl = JObject.getJSONObject("images").getString("sm").toString()
                Picasso.get().load(imageurl).into(img5)
            }, Response.ErrorListener {})


        val reques6 = StringRequest(com.android.volley.Request.Method.GET,url6,
            Response.Listener { response ->
                val data = response.toString()
                val JObject = JSONObject(data)
                val name = JObject.getString("name")
                text6?.text = name
                val imageurl = JObject.getJSONObject("images").getString("sm").toString()
                Picasso.get().load(imageurl).into(img6)
            }, Response.ErrorListener {})


        val reques7 = StringRequest(com.android.volley.Request.Method.GET,url7,
            Response.Listener { response ->
                val data = response.toString()
                val JObject = JSONObject(data)
                val name = JObject.getString("name")
                text7?.text = name
                val imageurl = JObject.getJSONObject("images").getString("sm").toString()
                Picasso.get().load(imageurl).into(img7)
            }, Response.ErrorListener {})


        val reques8 = StringRequest(com.android.volley.Request.Method.GET,url8,
            Response.Listener { response ->
                val data = response.toString()
                val JObject = JSONObject(data)
                val name = JObject.getString("name")
                text8?.text = name
                val imageurl = JObject.getJSONObject("images").getString("sm").toString()
                Picasso.get().load(imageurl).into(img8)
            }, Response.ErrorListener {})


        val reques9 = StringRequest(com.android.volley.Request.Method.GET,url9,
            Response.Listener { response ->
                val data = response.toString()
                val JObject = JSONObject(data)
                val name = JObject.getString("name")
                text9?.text = name
                val imageurl = JObject.getJSONObject("images").getString("sm").toString()
                Picasso.get().load(imageurl).into(img9)
            }, Response.ErrorListener {})
        queue.add(reques9)
        val reques10 = StringRequest(com.android.volley.Request.Method.GET,url10,
            Response.Listener { response ->
                val data = response.toString()
                val JObject = JSONObject(data)
                val name = JObject.getString("name")
                text10?.text = name
                val imageurl = JObject.getJSONObject("images").getString("sm").toString()
                Picasso.get().load(imageurl).into(img10)
            }, Response.ErrorListener {})


        queue.add(reques1)
        queue.add(reques2)
        queue.add(reques3)
        queue.add(reques4)
        queue.add(reques5)
        queue.add(reques6)
        queue.add(reques7)
        queue.add(reques8) 

        queue.add(reques10)

    }





}

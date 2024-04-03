package com.e.randomageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //declaring variables
    private lateinit var searchbutton :Button
    private lateinit var Textview:TextView
    private lateinit var Age:EditText
    private lateinit var clear:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchbutton=findViewById(R.id.searchButton)
        clear=findViewById(R.id.clear)
        Age=findViewById(R.id.age)
        Textview=findViewById(R.id.Textview)

        searchbutton.setOnClickListener{
            var iage= Age.text.toString().toIntOrNull()
            if (iage !=null && iage in 20..100){
                var userName = when (iage) {
                    20 -> "XXXTentaction"
                    21 -> "Juice WRLD"
                    25 -> "Tupac Shakur"
                    28 -> "Avicii"
                    43 -> "Chadwick Boseman"
                    50 -> "Micheal Jackson"
                    60 -> "Diego Maradona"
                    68 -> "Johan Cruyff"
                    82 -> "Pele"
                    95 -> "Nelson Mandela"
                    else -> null
                }
                    var showmessage=if(userName !=null) "the userName is $userName"
                else "No icon found with the age entered"
                Textview.text=""
                } else {

                Textview.text = "Invalid input.please enter a valid age between 20 and 100"
                if (iage !=null && iage in 20..100){
                    var studentfact=when(iage) {
                        20 -> "XXXTentaction was an American rapper and singer Songwriter"
                        21 -> "Juice WRLD was an American rapper and singer.Throughout his career of four years ,he was a leading figure in the emo rap and Soundcloud rap genres which garnered mainstream attention during the mid to late 2010"
                        25 -> "Tupac Shakur was an American rapper.Considered one of the most influential and successful rappers of all time "
                        28 -> "Avicii was a Swedish record producer and DJ.He rose to prominence in 2011 with his single LEVELS"
                        43 -> "Chadwick Boseman was am American actor. He received several accolades including a Golden Globe Award"
                        50 -> "Micheal Jackson was an American singer and dancer.He is regarded as ones of the most significant cultural figures of thr 20th century"
                        60 -> "Diego Maradona was an Argentine professional football player and manager.Widely regarded as one of the greatest player in the history of the sport"
                        69 -> "Johan Cruyff was a Dutch professional football player and manger .Regarded as one of the  greatest player in history and the greatest Dutch footballer ever"
                        82 -> "Pele was a Brazilian footballer.He was  among the most successful and popular sport figures of the 20th century"
                        95 -> "Nelson Mandela was a South African anti apartheid activist,politicsn who served as the first balck president of South Africa"
                        else -> null
                    }
                    val message= if (studentfact != null)"$studentfact"
                    else ""
                    Textview.text = message

                    }
                }



            }
            clear.setOnClickListener{
                Age.text.clear()
                Textview.text=""
            }
        }

    }

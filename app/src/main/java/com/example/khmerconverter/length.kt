package com.example.khmerconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_length.*

class length : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length)
        var fix:Float=0f
        var m:Float=0f
        var get:String=""
        var getre:String=""
        var valu:String=""
        var out:Float=0f

        op.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {


            }

            override fun onItemSelected(adapterview: AdapterView<*>?, View: View?, position: Int, id: Long) {
                get=adapterview?.getItemAtPosition(position).toString();
                incap.setText(get.toString())
                when(get){
                    "សិន"->inintro.setText("១សិន =២០ព្យាម ១សិន = ៤០ ម៉ែត្រ")
                    "តឹក"->inintro.setText("១តឹក =១០ សង់ទីម៉ែត្រ")
                    "ផឹង"->inintro.setText("១ផឹង =១ សង់ទីម៉ែត្រ")
                    "គាវុត"->inintro.setText("១គាវុត =១០០​ សិន\n ១គាវុត =៤០០០ម៉េត្រ")
                    "ព្យាម"->inintro.setText("១ព្យាម =២ ម៉ែត្រ")
                    "គាវុត"->inintro.setText("១គាវុត =១ ម៉ែត្រ")
                    "យោជន៏"->inintro.setText("១យោជន៏ =១៦ គីឡូម៉ែត្រ ឬ​​ ៤០០សិន")
                    "សង់ទីម៉ែត្រ(cm)"->inintro.setText("១សង់ទីម៉េត្រ =០.០១ម៉ែត្រ")
                    "គីឡូម៉ែត្រ(km)"->inintro.setText("១គីឡូម៉ែត្រ =១០០០ម៉ែត្រ")
                    "ដេសុីម៉ែត្រ(dm)"->inintro.setText("១ដេសុីម៉ែត្រ =០.១ម៉ែត្រ")
                    "មីលីម៉ែត្រ(mm)"->inintro.setText("១មីលីម៉ែត្រ =០.០១ម៉ែត្រ")
                    "ម៉ែត្រ(m)"->inintro.setText("ម៉ែត ឬ ម៉ិត បារ. ( ន. ) (Mètre ម៉ែត្រិ៍) ឈ្មោះ\u200Bរង្វាស់\u200Bបារាំង\u200Bសែស ប្រវែង\u200Bដប់\u200Bដេស៊ីម៉ែត្រ\u200Bឬ\u200Bមួយ\u200Bរយ\u200Bសង់ទីម៉ែត្រ ឬ\u200Bក៏\u200Bមួយ\u200Bពាន់\u200Bមិល្លីម៉ែត្")
                }



            }

        }
        op1.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                getre=p0?.getItemAtPosition(p2).toString()
                outcap.setText(getre.toString())
                when(getre){
                    "សិន"->outintro.setText("១សិន =២០ព្យាម ១សិន = ៤០ ម៉ែត្រ")
                    "តឹក"->outintro.setText("១តឹក =១០ សង់ទីម៉ែត្រ")
                    "ផឹង"->outintro.setText("១ផឹង =១ សង់ទីម៉ែត្រ")
                    "គាវុត"->outintro.setText("១គាវុត =១០០​ សិន\n ១គាវុត =៤០០០ម៉េត្រ")
                    "ព្យាម"->outintro.setText("១ព្យាម =២ ម៉ែត្រ")
                    "គាវុត"->outintro.setText("១គាវុត =១ ម៉ែត្រ")
                    "យោជន៏"->outintro.setText("១យោជន៏ =១៦ គីឡូម៉ែត្រ ឬ​​ ៤០០សិន")
                    "សង់ទីម៉ែត្រ(cm)"->outintro.setText("១សង់ទីម៉េត្រ =០.០១ម៉ែត្រ")
                    "គីឡូម៉ែត្រ(km)"->outintro.setText("១គីឡូម៉ែត្រ =១០០០ម៉ែត្រ")
                    "ដេសុីម៉ែត្រ(dm)"->outintro.setText("១ដេសុីម៉ែត្រ =០.១ម៉ែត្រ")
                    "មីលីម៉ែត្រ(mm)"->outintro.setText("១មីលីម៉ែត្រ =០.០១ម៉ែត្រ")
                    "ម៉ែត្រ(m)"->outintro.setText("ម៉ែត ឬ ម៉ិត បារ. ( ន. ) (Mètre ម៉ែត្រិ៍) ឈ្មោះ\u200Bរង្វាស់\u200Bបារាំង\u200Bសែស ប្រវែង\u200Bដប់\u200Bដេស៊ីម៉ែត្រ\u200Bឬ\u200Bមួយ\u200Bរយ\u200Bសង់ទីម៉ែត្រ ឬ\u200Bក៏\u200Bមួយ\u200Bពាន់\u200Bមិល្លីម៉ែត្")






                }
            }
        }

        convert.setOnClickListener(){
            valu=input.text.toString()
            fix=valu.toFloat()
            when(get){

                "តឹក"->m=fix/10
                "ផឹង"->{m=fix/100}
                "សិន"->m=fix*40
                "ព្យាម"->m=fix*2
                "គាវុត"->m=fix*4000
                "សង់ទីម៉ែត្រ(cm)"->m=fix/100
                "ដេសុីម៉ែត្រ(dm)"->m=fix/10
                "ម៉ែត្រ(m)"->m=fix
                "គីឡូម៉ែត្រ(km)"->m=fix*1000

        }
            when(getre){
                "តឹក"->out=m*10
                "ផឹង"->out=m*100
                "សិន"->out=m/40
                "ព្យាម"->out=m/2
                "គាវុត"->out=m/4000
                "សង់ទីម៉ែត្រ(cm)"->out=m*100
                "ដេសុីម៉ែត្រ(dm)"->out=m*10
                "ម៉ែត្រ(m)"->out=m
                "គីឡូម៉ែត្រ(km)"->out=m/1000
            }
            output.setText(out.toString())

    }
}
}
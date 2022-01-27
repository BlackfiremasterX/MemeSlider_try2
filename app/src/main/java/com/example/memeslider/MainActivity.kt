package com.example.memeslider

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private var soundPool: SoundPool? = null
    private var soundId1 = 0
    private var soundId2 = 0
    private var soundId3 = 0
    private var soundId4 = 0
    private var soundId5 = 0
    private var soundId6 = 0
    private var soundId7 = 0
    private var soundId8 = 0
    private var soundId9 = 0
    private var soundId10 = 0
    private var soundId11 = 0
    private var soundId12 = 0
    private var soundId13 = 0
    private var soundId14 = 0
    private var soundId15 = 0
    private var soundId16 = 0
    private var soundId17 = 0
    private var soundId18 = 0
    private var soundId19 = 0
    private var soundId20 = 0
    private var soundId21 = 0
    private var soundId22 = 0
    private var soundId23 = 0
    private var soundId24 = 0
    private var soundId25 = 0
    private var soundId26 = 0
    private var soundId27 = 0
    private var soundId28 = 0
    private var soundId29 = 0
    private var soundId30 = 0
    private var soundId31 = 0
    private var soundId32 = 0
    private var soundId33 = 0
    private var soundId34 = 0
    private var soundId35 = 0
    private var leftVolume = 1F
    private var rightVolume = 1F
    private var soundPriorityGlobal = 1


    fun playSound(sound: Int)
    {
        var soundIdBuffer = 0

        when(sound)
        {
            1 -> soundIdBuffer = soundId1
            2 -> soundIdBuffer = soundId2
            3 -> soundIdBuffer = soundId3
            4 -> soundIdBuffer = soundId4
            5 -> soundIdBuffer = soundId5
            6 -> soundIdBuffer = soundId6
            7 -> soundIdBuffer = soundId7
            8 -> soundIdBuffer = soundId8
            9 -> soundIdBuffer = soundId9
            10 -> soundIdBuffer = soundId10
            11 -> soundIdBuffer = soundId11
            12 -> soundIdBuffer = soundId12
            13 -> soundIdBuffer = soundId13
            14 -> soundIdBuffer = soundId14
            15 -> soundIdBuffer = soundId15
            16 -> soundIdBuffer = soundId16
            17 -> soundIdBuffer = soundId17
            18 -> soundIdBuffer = soundId18
            19 -> soundIdBuffer = soundId19
            20 -> soundIdBuffer = soundId20
            21 -> soundIdBuffer = soundId21
            22 -> soundIdBuffer = soundId22
            23 -> soundIdBuffer = soundId23
            24 -> soundIdBuffer = soundId24
            25 -> soundIdBuffer = soundId25
            26 -> soundIdBuffer = soundId26
            27 -> soundIdBuffer = soundId27
            28 -> soundIdBuffer = soundId28
            29 -> soundIdBuffer = soundId29
            30 -> soundIdBuffer = soundId30
            31 -> soundIdBuffer = soundId31
            32 -> soundIdBuffer = soundId32
            33 -> soundIdBuffer = soundId33
            34 -> soundIdBuffer = soundId34
            35 -> soundIdBuffer = soundId35
        }
        soundPool?.play(soundIdBuffer,leftVolume,rightVolume,0,0,1F)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        soundPool = SoundPool(6, AudioManager.STREAM_MUSIC,100)
        soundId1 = soundPool!!.load(baseContext,  R.raw.adjara_gudju, soundPriorityGlobal)
        soundId2 = soundPool!!.load(baseContext,  R.raw.bababooey, soundPriorityGlobal)
        soundId3 = soundPool!!.load(baseContext,  R.raw.daladna, soundPriorityGlobal)
        soundId4 = soundPool!!.load(baseContext,  R.raw.davai_po_novoi_misha, soundPriorityGlobal)
        soundId5 = soundPool!!.load(baseContext,  R.raw.dich, soundPriorityGlobal)
        soundId6 = soundPool!!.load(baseContext,  R.raw.etot_paren_byil_iz_teh, soundPriorityGlobal)
        soundId7 = soundPool!!.load(baseContext,  R.raw.gonschik, soundPriorityGlobal)
        soundId8 = soundPool!!.load(baseContext,  R.raw.gta_sa, soundPriorityGlobal)
        soundId9 = soundPool!!.load(baseContext,  R.raw.kazahstan_ugrojaet, soundPriorityGlobal)
        soundId10 = soundPool!!.load(baseContext,  R.raw.lya_ty_kryisa, soundPriorityGlobal)
        soundId11 = soundPool!!.load(baseContext,  R.raw.maloletnie_debilyi, soundPriorityGlobal)
        soundId12 = soundPool!!.load(baseContext,  R.raw.muzyika_iz_shreka, soundPriorityGlobal)
        soundId13 = soundPool!!.load(baseContext,  R.raw.nani, soundPriorityGlobal)
        soundId14 = soundPool!!.load(baseContext,  R.raw.napali, soundPriorityGlobal)
        soundId15 = soundPool!!.load(baseContext,  R.raw.ne_nihya, soundPriorityGlobal)
        soundId16 = soundPool!!.load(baseContext,  R.raw.nu_che_narod_pognali, soundPriorityGlobal)
        soundId17 = soundPool!!.load(baseContext,  R.raw.puk, soundPriorityGlobal)
        soundId18 = soundPool!!.load(baseContext,  R.raw.rayonnyiy_prokuror, soundPriorityGlobal)
        soundId19 = soundPool!!.load(baseContext,  R.raw.run, soundPriorityGlobal)
        soundId20 = soundPool!!.load(baseContext,  R.raw.slezyi_sopli, soundPriorityGlobal)
        soundId21 = soundPool!!.load(baseContext,  R.raw.strashno_ochen_strashno, soundPriorityGlobal)
        soundId22 = soundPool!!.load(baseContext,  R.raw.tutututu_demotivator, soundPriorityGlobal)
        soundId23 = soundPool!!.load(baseContext,  R.raw.vot_eto_povorot, soundPriorityGlobal)
        soundId24 = soundPool!!.load(baseContext,  R.raw.vsego_horoshego, soundPriorityGlobal)
        soundId25 = soundPool!!.load(baseContext,  R.raw.vyi_kto_takie, soundPriorityGlobal)
        soundId26 = soundPool!!.load(baseContext,  R.raw.ya_maslinu_poymal, soundPriorityGlobal)
        soundId27 = soundPool!!.load(baseContext,  R.raw.ya_musulman, soundPriorityGlobal)
        soundId28 = soundPool!!.load(baseContext,  R.raw.ya_prosto_pohlopayu, soundPriorityGlobal)
        soundId29 = soundPool!!.load(baseContext,  R.raw.zdes_nashi_polnomochiya_vse, soundPriorityGlobal)
        soundId30 = soundPool!!.load(baseContext,  R.raw.ne_nihya, soundPriorityGlobal)
        soundId31 = soundPool!!.load(baseContext,  R.raw.ne_nihya, soundPriorityGlobal)
        soundId32 = soundPool!!.load(baseContext,  R.raw.ne_nihya, soundPriorityGlobal)
        soundId33 = soundPool!!.load(baseContext,  R.raw.ne_nihya, soundPriorityGlobal)
        soundId34 = soundPool!!.load(baseContext,  R.raw.ne_nihya, soundPriorityGlobal)
        soundId35 = soundPool!!.load(baseContext,  R.raw.ne_nihya, soundPriorityGlobal)


        findViewById<ImageView>(R.id.iv_cell_1_1).setOnClickListener{playSound(1)}
        findViewById<ImageView>(R.id.iv_cell_1_2).setOnClickListener{playSound(2)}
        findViewById<ImageView>(R.id.iv_cell_1_3).setOnClickListener{playSound(3)}
        findViewById<ImageView>(R.id.iv_cell_1_4).setOnClickListener{playSound(4)}
        findViewById<ImageView>(R.id.iv_cell_1_5).setOnClickListener{playSound(5)}
        findViewById<ImageView>(R.id.iv_cell_2_1).setOnClickListener{playSound(6)}
        findViewById<ImageView>(R.id.iv_cell_2_2).setOnClickListener{playSound(7)}
        findViewById<ImageView>(R.id.iv_cell_2_3).setOnClickListener{playSound(8)}
        findViewById<ImageView>(R.id.iv_cell_2_4).setOnClickListener{playSound(9)}
        findViewById<ImageView>(R.id.iv_cell_2_5).setOnClickListener{playSound(10)}
        findViewById<ImageView>(R.id.iv_cell_3_1).setOnClickListener{playSound(11)}
        findViewById<ImageView>(R.id.iv_cell_3_2).setOnClickListener{playSound(12)}
        findViewById<ImageView>(R.id.iv_cell_3_3).setOnClickListener{playSound(13)}
        findViewById<ImageView>(R.id.iv_cell_3_4).setOnClickListener{playSound(14)}
        findViewById<ImageView>(R.id.iv_cell_3_5).setOnClickListener{playSound(15)}
        findViewById<ImageView>(R.id.iv_cell_4_1).setOnClickListener{playSound(16)}
        findViewById<ImageView>(R.id.iv_cell_4_2).setOnClickListener{playSound(17)}
        findViewById<ImageView>(R.id.iv_cell_4_3).setOnClickListener{playSound(18)}
        findViewById<ImageView>(R.id.iv_cell_4_4).setOnClickListener{playSound(19)}
        findViewById<ImageView>(R.id.iv_cell_4_5).setOnClickListener{playSound(20)}
        findViewById<ImageView>(R.id.iv_cell_5_1).setOnClickListener{playSound(21)}
        findViewById<ImageView>(R.id.iv_cell_5_2).setOnClickListener{playSound(22)}
        findViewById<ImageView>(R.id.iv_cell_5_3).setOnClickListener{playSound(23)}
        findViewById<ImageView>(R.id.iv_cell_5_4).setOnClickListener{playSound(24)}
        findViewById<ImageView>(R.id.iv_cell_5_5).setOnClickListener{playSound(25)}
        findViewById<ImageView>(R.id.iv_cell_6_1).setOnClickListener{playSound(26)}
        findViewById<ImageView>(R.id.iv_cell_6_2).setOnClickListener{playSound(27)}
        findViewById<ImageView>(R.id.iv_cell_6_3).setOnClickListener{playSound(28)}
        findViewById<ImageView>(R.id.iv_cell_6_4).setOnClickListener{playSound(29)}
        findViewById<ImageView>(R.id.iv_cell_6_5).setOnClickListener{playSound(30)}
        findViewById<ImageView>(R.id.iv_cell_7_1).setOnClickListener{playSound(31)}
        findViewById<ImageView>(R.id.iv_cell_7_2).setOnClickListener{playSound(32)}
        findViewById<ImageView>(R.id.iv_cell_7_3).setOnClickListener{playSound(33)}
        findViewById<ImageView>(R.id.iv_cell_7_4).setOnClickListener{playSound(34)}
        findViewById<ImageView>(R.id.iv_cell_7_5).setOnClickListener{playSound(35)}

    }
}
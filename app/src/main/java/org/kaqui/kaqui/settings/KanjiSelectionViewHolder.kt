package org.kaqui.kaqui.settings

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import org.kaqui.kaqui.KanjiDb
import org.kaqui.kaqui.R

class KanjiSelectionViewHolder(private val db: KanjiDb, v: View) : RecyclerView.ViewHolder(v) {
    val enabled: CheckBox = v.findViewById(R.id.kanji_item_checkbox) as CheckBox
    val kanjiText: TextView = v.findViewById(R.id.kanji_item_text) as TextView
    val kanjiDescription: TextView = v.findViewById(R.id.kanji_item_description) as TextView
    var kanji: String = ""

    init {
        enabled.setOnCheckedChangeListener { _, isChecked ->
            db.setKanjiEnabled(kanji, isChecked)
        }
    }
}
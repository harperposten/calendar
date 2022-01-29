//Code adapted from Code with Cal https://www.youtube.com/watch?v=Ba0Q-cK1fJo
package com.example.calendarApp

import CalendarApplication.R
import android.view.View
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView

class CalendarViewHolder : RecyclerView.ViewHolder, View.OnClickListener {
    var dayOfMonth: TextView
    private var onItemListener: CalendarAdapter.OnItemListener

    constructor(
        @NonNull itemView: View,
        onItemListener: CalendarAdapter.OnItemListener
    ) : super(itemView) {
        this.onItemListener = onItemListener
        dayOfMonth = itemView.findViewById(R.id.cellDayText)
        itemView.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        onItemListener.onItemClick(adapterPosition, dayOfMonth.text as String)
    }
}
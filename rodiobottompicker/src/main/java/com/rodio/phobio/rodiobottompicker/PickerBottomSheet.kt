package com.rodio.phobio.rodiobottompicker
import android.app.Activity
import android.content.Context
import android.support.design.widget.BottomSheetDialog


class PickerBottomSheet(context: Context): BottomSheetDialog(context) {
    class Builder(val context: Activity) {
        val bottomSheet: PickerBottomSheet = PickerBottomSheet(this.context)
        var layoutResource: Int = R.layout.media_picker_bottom_sheet

        fun setLayout(layoutResource: Int): Builder {
            this.layoutResource = layoutResource
            return this
        }

        fun build(): PickerBottomSheet {
            val view = context.layoutInflater.inflate(layoutResource, null)
            bottomSheet.setContentView(view)
            return bottomSheet
        }
    }
}
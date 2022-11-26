package com.example.noteapp.feature_note.presentation.add_edit_note.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import java.lang.reflect.Modifier
import java.time.format.TextStyle

@Composable
fun TransparentHintTextField(
    text: String,
    hint: String,
    modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier,
    isHintVisible: Boolean = true,
    onValueChange: (String) -> Unit,
    textStyle: androidx.compose.ui.text.TextStyle = androidx.compose.ui.text.TextStyle(),
    singleLine: Boolean = false,
    onFocusChange: (FocusState) -> Unit
) {

    Box(modifier = modifier) {
        BasicTextField(
            value = text,
            onValueChange = onValueChange,
            singleLine = singleLine,
            textStyle = textStyle,
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .onFocusChanged {
                    onFocusChange(it)
                }
        )
        if (isHintVisible) {
            Text(text = hint, style = textStyle, color = Color.DarkGray)
        }

    }

}
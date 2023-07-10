package com.example.mvvmlogin.ui.theme.login.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PrincipalTitle( title : Int , size : Int){
    Text(
        text = stringResource(id = title),
        style = MaterialTheme.typography.h1,
        fontSize = size.sp ,
        fontWeight = FontWeight.Medium ,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.padding(end = 6.dp)
    )
}

@Composable
fun BlueButton(text : Int, action : ()-> Unit){
    Row {
        Button(
            onClick = action,
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .padding(top = 4.dp)
                .height(54.dp),
            shape = RoundedCornerShape(28.dp)
        ) {
            Text(
                text = stringResource(id = text),
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.Medium ,
                color = MaterialTheme.colors.onPrimary,
            )
        }
    }
}

@Composable
fun FormTextField(value : String,
                  focusManager: FocusManager,
                  trailingIcon: ImageVector,
                  onValueChange: (String) -> Unit,
                  placeHolder: String,){
    TextField(
        value = value,
        colors = TextFieldDefaults.textFieldColors(
            textColor = MaterialTheme.colors.primaryVariant,
            backgroundColor = MaterialTheme.colors.background,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            placeholderColor = MaterialTheme.colors.primaryVariant,
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next),
        keyboardActions = KeyboardActions(onNext = {focusManager.moveFocus(FocusDirection.Next)}),
        shape = RoundedCornerShape(8.dp),
        singleLine = true,
        label = null ,
        trailingIcon = {  if (value.isNotEmpty()) {
            IconButton(onClick = { onValueChange.invoke("")  }) {
                Icon(imageVector = trailingIcon,
                    contentDescription = null,
                    tint = Color.Unspecified) }
        }
        },
        placeholder = {
            Text(placeHolder,
                style = MaterialTheme.typography.subtitle2,
                color = Color.LightGray
            )
        },
        onValueChange =onValueChange,
        textStyle = TextStyle( fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 20.sp),
        modifier = Modifier
            .fillMaxWidth(1f)
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(28.dp)
            )
            .shadow(elevation = 4.dp, shape = RoundedCornerShape(28.dp))
    )
}

@Composable
fun PasswordTextField(value : String,
                  focusManager: FocusManager,
                  trailingIcon: ImageVector,
                  onValueChange: (String) -> Unit,
                  placeHolder: String,){
    TextField(
        value = value,
        colors = TextFieldDefaults.textFieldColors(
            textColor = MaterialTheme.colors.primaryVariant,
            backgroundColor = MaterialTheme.colors.background,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            placeholderColor = MaterialTheme.colors.primaryVariant,
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Next),
        keyboardActions = KeyboardActions(onNext = {focusManager.moveFocus(FocusDirection.Next)}),
        shape = RoundedCornerShape(8.dp),
        singleLine = true,
        label = null ,
        trailingIcon = {  if (value.isNotEmpty()) {
            IconButton(onClick = { onValueChange.invoke("")  }) {
                Icon(imageVector = trailingIcon,
                    contentDescription = null,
                    tint = Color.Unspecified) }
        }
        },
        placeholder = {
            Text(placeHolder,
                style = MaterialTheme.typography.subtitle2,
                color = Color.LightGray
            )
        },
        onValueChange =onValueChange,
        textStyle = TextStyle( fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 20.sp),
        modifier = Modifier
            .fillMaxWidth(1f)
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(28.dp)
            )
            .shadow(elevation = 4.dp, shape = RoundedCornerShape(28.dp))
    )
}
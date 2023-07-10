package com.example.mvvmlogin.ui.theme.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.mvvmlogin.ui.theme.login.components.BlueButton
import com.example.mvvmlogin.ui.theme.login.components.FormTextField
import com.example.mvvmlogin.ui.theme.login.components.PrincipalTitle
import com.example.mvvmlogin.R

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun LoginScreen(action : ()->Unit) {
    val focusManager = LocalFocusManager.current
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 18.dp, vertical = 8.dp)) {

        Row(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.2f)
                .padding(top = 32.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            GlideImage(
                model =R.drawable.ic_logo2,
                modifier = Modifier
                    .size(180.dp),
                contentDescription = "logo"
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4F),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {

            GlideImage(
                model =R.drawable.main_screen2,
                modifier = Modifier.size(280.dp),
                contentDescription = "logo"
            )
        }
        Row(
            Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 12.dp, bottom = 30.dp)
        ) {
            PrincipalTitle(title = R.string.welcome , 25)
        }
        Column(Modifier.fillMaxWidth(1F)) {

            Row(
                Modifier
                    .fillMaxWidth(1F)
                    .padding(bottom = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                FormTextField(
                    value = "",
                    focusManager = focusManager,
                    trailingIcon = Icons.Outlined.Email,
                    onValueChange = { println() },
                    placeHolder = stringResource(id = R.string.email) )
            }
            Row(
                Modifier
                    .fillMaxWidth(1F)
                    .padding(top = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                FormTextField(
                    value = "",
                    focusManager = focusManager,
                    trailingIcon = Icons.Outlined.MailOutline,
                    onValueChange = { println() },
                    placeHolder = stringResource(id = R.string.password) )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(1F)
                .padding(top = 24.dp)
                .background(color = MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            BlueButton(text = R.string.login ) { action() }

            Row(Modifier.padding(top = 12.dp)) {
                Text(
                    text = stringResource(id = R.string.forgotPassword),
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Medium ,
                    color = Color.LightGray,
                )
            }
        }

    }
}

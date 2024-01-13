package compose.material.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.Navigation

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserProfile(navigation:Navigation){
    Scaffold(
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),
                containerColor = Color(0xff3b4995),
                contentColor = Color.White,
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Home, contentDescription = "home",
                            modifier= Modifier.size(50.dp)
                        )
                    }
//                    IconButton(onClick = { /*TODO*/ }) {
//                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Map location")
//                    }



                    FloatingActionButton(modifier = Modifier
                        .padding(bottom = 2.dp)
                        //.border(1.dp, Color.Black)
                        .size(65.dp)
                        .clip(
                            RoundedCornerShape(
                                topStart = 35.dp,
                                topEnd = 35.dp,
                                bottomStart = 35.dp,
                                bottomEnd = 35.dp
                            )
                        )
                        ,
                        onClick = {

                        },
                        containerColor = Color(0xffed1c24),
                        //containerColor = Color.White,
                        contentColor = Color.White
                    ) {
                        Image(painter = painterResource(id = R.drawable.camera), contentDescription =null,
                            modifier= Modifier.size(49.dp))
                    }

//                    IconButton(onClick = { /*TODO*/ }) {
//                        Icon(imageVector = Icons.Default.Share, contentDescription = "share feedback")
//                    }

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Account",
                            modifier= Modifier.size(50.dp))
                    }
                }

            }
        }

    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {

            Column {
                Text(text="Name : Janak Khadka")
                Text(text="Phone Number : 9840989641")
            }
        }

    }
}
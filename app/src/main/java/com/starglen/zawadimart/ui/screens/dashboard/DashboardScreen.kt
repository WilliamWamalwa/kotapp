package com.starglen.zawadimart.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_ABOUT
import com.navigation.ROUT_HOME
import com.navigation.ROUT_INTENT
import com.navigation.ROUT_ITEMS
import com.starglen.zawadimart.R
import com.starglen.zawadimart.ui.theme.hxhred
import com.starglen.zawadimart.ui.theme.neworange
import com.starglen.zawadimart.ui.theme.newwhite
import com.starglen.zawadimart.ui.theme.opmblack


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize().background(neworange)
            .verticalScroll(rememberScrollState())
    ) {

        Box() {
            //card
            Card(
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(newwhite)

            ) {
                TopAppBar(
                    title = { Text(text = "Dashboard section") },

                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }
                    },
                )
            }
            //end of card
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp),
                colors = CardDefaults.cardColors()
            ) {
                Text(text = "Welcome to the app",
                    fontSize = 50.sp,
                    color = opmblack,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Cursive,
                    textAlign = TextAlign.Center
                )
            }
        }
        //end of box
        Spacer(modifier = Modifier.height(100.dp))

        //row
        Row(
            modifier = Modifier.padding(start = 20.dp)
        )
        {
            //card1
                Card(
                    modifier = Modifier
                        .width(150.dp)
                        .height(180.dp)
                        .clickable{navController.navigate(ROUT_HOME)}
                )
                {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,



                    ) {
                        Image(
                            painter = painterResource(R.drawable.home),
                            contentDescription = "img",
                            modifier = Modifier.size(100.dp)

                        )
                        Text(text = "Home" , fontSize = 20.sp)
                    }
                }
            //end of card1
            Spacer(modifier = Modifier.width(20.dp))

            //card2

            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_INTENT)}
            )
            {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,



                    ) {
                    Image(
                        painter = painterResource(R.drawable.contacts),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)

                    )
                    Text(text = "Contact" , fontSize = 20.sp)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))


            //end of card 2


        }
        //end of row1
        Spacer(modifier = Modifier.height(10.dp))
            //row2
        Row(
            modifier = Modifier.padding(start = 20.dp)
        ) {
            //card3

            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_ABOUT)}
            )
            {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,



                    ) {
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)

                    )
                    Text(text = "About" , fontSize = 20.sp)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))

            //end of card 3

            //card4

            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_ITEMS)}


            )
            {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,



                    ) {
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)

                    )
                    Text(text = "Product" , fontSize = 20.sp)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))

            //end of card 4


        }
        //end of row2
    }
}
// change icon for product contact about


@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}
package com.mobile.walletcompose

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobile.walletcompose.ui.theme.Purple40
import com.mobile.walletcompose.ui.theme.WalletComposeTheme
import com.mobile.walletcompose.ui.theme.appbg
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import com.mobile.walletcompose.ui.theme.appblack
import com.mobile.walletcompose.ui.theme.green
import com.mobile.walletcompose.ui.theme.grey
import com.mobile.walletcompose.ui.theme.ltgreen
import com.mobile.walletcompose.ui.theme.purpu
import com.mobile.walletcompose.ui.theme.redic

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WalletComposeTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = appbg
                ) { innerPadding ->
                    NewHome(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
@Preview(showSystemUi = true, device = Devices.PIXEL)
fun NewHome(modifier: Modifier = Modifier) {

    var hideet = remember { mutableStateOf(false) }

    Column(modifier = modifier.fillMaxSize()) {

        Box {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Image(
                    modifier = modifier.padding(top = 0.dp),
                    painter = painterResource(id = R.drawable.bgone),
                    contentDescription = ""
                )
                Image(
                    modifier = modifier.padding(top = 0.dp),
                    painter = painterResource(id = R.drawable.bgtwo),
                    contentDescription = ""
                )

            }
            Column(modifier = Modifier) {
                Row(Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
                    Image(
                        modifier = modifier.padding(start = 5.dp),
                        painter = painterResource(id = R.drawable.cashlogo),
                        contentDescription = ""
                    )

                    Box(
                        modifier = modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(androidx.compose.ui.graphics.Color.White)
                            .height(35.dp)
                            .width(145.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(
                                    horizontal = 8.dp,
                                    vertical = 4.dp
                                ), // Add padding for spacing
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.award_star),
                                contentDescription = "",
                                modifier = Modifier.size(18.dp)
                            )

                            Spacer(modifier = Modifier.width(8.dp)) // Add space between Image and Text

                            Text(
                                text = "1.992 Points",
                                color = androidx.compose.ui.graphics.Color.Black,
                                fontFamily = popmid,
                                fontWeight = FontWeight.W700,
                                fontSize = 14.sp
                            )
                        }
                    }

                }



                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 10.dp),
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(
                        text = "Your Balance",
                        color = androidx.compose.ui.graphics.Color.White,
                        fontFamily = popnormal,
                        fontWeight = FontWeight.W600,
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp
                    )

                    Row(horizontalArrangement = Arrangement.Center) {
                        if (hideet.value == false){
                            Text(
                                text = "NGN *****",
                                color = androidx.compose.ui.graphics.Color.White,
                                fontFamily = popbold,
                                fontSize = 18.sp
                            )
                        }else{
                            Text(
                                text = "NGN 24,321.00",
                                color = androidx.compose.ui.graphics.Color.White,
                                fontFamily = popbold,
                                fontSize = 18.sp
                            )
                        }


                        Image(
                            modifier = Modifier.padding(start = 10.dp, top = 4.dp).clickable {

                                hideet.value = !hideet.value
                            },

                            painter = painterResource(id = R.drawable.visibility_off),
                            contentDescription = ""
                        )


                    }
                    Box(modifier = Modifier.padding(top = 35.dp)) {


                        Box(
                            modifier = Modifier
                                .padding(top = 45.dp)
                                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .background(color = androidx.compose.ui.graphics.Color.White)


                        ) {


                        }

                        Box(
                            modifier = Modifier
                                .padding(top = 0.dp, start = 20.dp, end = 20.dp)
                                .height(90.dp)
                                .fillMaxWidth()
                                .shadow(
                                    10.dp,
                                    RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                                )
                                .clip(RoundedCornerShape(15.dp))

                                .background(color = androidx.compose.ui.graphics.Color.White)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.SpaceEvenly,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {


                                ItemBox(R.drawable.transferone, "Transfer")
                                ItemBox(R.drawable.icon_wallet, "Top up")
                                ItemBox(R.drawable.witdone, "Withdraw")
                                ItemBox(R.drawable.icon_more, "More")


                            }

                        }


                        Column(
                            Modifier
                                .padding(top = 100.dp, start = 20.dp, end = 10.dp)
                                .fillMaxSize(),
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                                    .fillMaxWidth(),


                                ) {

                                Text(text = "Send Again", fontFamily = popmid, fontSize = 15.sp)
                                Row {
                                    Text(
                                        text = "See All",
                                        fontFamily = popnormal,
                                        color = ltgreen,
                                        fontSize = 15.sp
                                    )
                                    Image(
                                        modifier = Modifier.padding(top = 3.dp),
                                        painter = painterResource(id = R.drawable.arrow_right),
                                        contentDescription = ""
                                    )
                                }

                            }

                            var allimages = listOf(
                                images("Alex Akubo", R.drawable.imgone),
                                images("Emmanuel", R.drawable.img2),
                                images("Bob", R.drawable.img3),
                                images("Daniel", R.drawable.imgone),
                                images("David", R.drawable.img2),

                                )

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 10.dp)
                            ) {
                                PeopleImage(allimg = R.drawable.btn_add)

                                LazyRow {
                                    items(allimages) { allimg ->

                                        PeopleImagePic(allimg.image, allimg.name)


                                    }


                                }
                            }

                            Spacer(modifier = Modifier.padding(top = 15.dp))

                            Text(
                                text = "Latest Transaction",
                                fontFamily = popmid,
                                fontWeight = FontWeight.W700,
                                fontSize = 14.sp
                            )
                            Spacer(modifier = Modifier.padding(top = 15.dp))

                            LazyColumn { items(10){
                                transactions()
                            }

                            }



                        }

                    }


                }

            }


        }
    }

}

@Composable
fun transactions(){

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 5.dp)
    ) {


        Row {
            Image(
                painter = painterResource(id = R.drawable.swapic),
                contentDescription = ""
            )
            Spacer(
                modifier = Modifier.padding(
                    horizontal = 5.dp,
                    vertical = 5.dp
                )
            )
            Text(
                modifier = Modifier.padding(top = 6.dp),
                text = "Transfers",
                fontFamily = popmid,
                fontWeight = FontWeight.W700,
                fontSize = 14.sp
            )

        }
        Text(
            modifier = Modifier.padding(top = 6.dp),
            text = "-NGN 5000",
            fontFamily = popmid,
            fontWeight = FontWeight.W700,
            fontSize = 14.sp,
            color = redic
        )
    }
    Spacer(modifier = Modifier.height(8.dp))


    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = grey)
        .height(0.2.dp)) {

        Spacer(modifier = Modifier.height(20.dp))
    }
    Spacer(modifier = Modifier.height(8.dp))


}

@Composable
fun PeopleImage(allimg: Int) {
    Column(
        Modifier.padding(end = 10.dp, top = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = allimg),
            contentDescription = "",
            modifier = Modifier.padding(top = 0.dp)
        )
        Text(
            text = "Add New",
            modifier = Modifier.padding(top = 5.dp),
            fontFamily = popmid,
            color = purpu,
            fontSize = 14.sp
        )
    }
}


@Composable
fun PeopleImagePic(allimg: Int, name: String) {

    Column(
        Modifier.padding(end = 10.dp, top = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = allimg), contentDescription = "")
        Text(
            text = "${name}",
            modifier = Modifier.padding(top = 5.dp),
            fontFamily = popmid,
            fontWeight = FontWeight.W500,
            fontSize = 13.sp,
            color = appblack
        )

    }
}


data class images(
    var name: String,
    var image: Int,
)

@Composable
fun ItemBox(image: Int, text: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier
                .height(27.dp)
                .width(27.dp),
            painter = painterResource(id = image),
            contentDescription = ""
        )
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "${text}",
            fontFamily = popnormal,
            fontWeight = FontWeight.W700,
            fontSize = 12.sp
        )
    }
}
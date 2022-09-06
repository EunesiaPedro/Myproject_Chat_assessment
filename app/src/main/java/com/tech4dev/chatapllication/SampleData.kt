package com.tech4dev.chatapllication

import android.os.Messenger
import com.tech4dev.chatapllication.model.User

class SampleData {
    val LIST_OF_FRIENDS: List<User> = listOf(
        User("Eunesia Pedro", "programming mood"),
        User("Laura Adul", "I love my live"),
        User("Rosa Liria", "Hi I am using this APP"),
        User("Custodia Agusto", "This is me"),
        User("Jamie Patric", "I am the one")


    )
}
class SampleMessages{
    val LIST_OF_MESSAGES:List<Message> = listOf(
        Message("Eunesia Pedro", "20:00","I am in track Mobile App"),
        Message("Laura Abdul", "7:00","I am going to bed"),
        Message("Lirio Coisa", "14:00","I am tired"),
        Message("Nisaa Mobore", "7:00"," Hi sister"),
        Message("Pretunia Vibar", "17:55","I am busy now, cannt talk"),
    )
}

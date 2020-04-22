package com.example.twitter

import java.text.SimpleDateFormat
import java.util.*
class PostsContainer {

    private var posts: MutableList<Post>? = null

    companion object {
        private var postsContainer:PostsContainer = TODO()
        fun get(): PostsContainer? {
            if (PostsContainer.postsContainer == null) {
                PostsContainer.postsContainer = PostsContainer()
            }
            return PostsContainer.postsContainer
        }
    }
    private fun PostsContainer() {
        posts = ArrayList()
        val like: Int = R.drawable.ic_heart_row
        val dateFormat = SimpleDateFormat("d MMM", Locale.ENGLISH)
        (posts as ArrayList<Post>).add(
            Post(
                "канский", "@Beisekeyev", "‧ " + dateFormat.format(Date()), "В общем, цены авиабилетов для экономики Казахстана очень необоснованны. Имхо. " + "Где средняя зп в кз - 45к, как могут билеты стоять около 70-100 000тг и больше.", R.drawable.a, "4", "13", 170, false, like
            )
        )
        (posts as ArrayList<Post>).add(
            Post("comme des fuck down", "", "‧ " + dateFormat.format(Date()), "Скрываю свои чувства,как аудиозаписи вк", R.drawable.b, "", "3", 25, false, like
            )
        )
        (posts as ArrayList<Post>).add(
            Post(
                "Aisultan", "@aisultan", "‧ " + dateFormat.format(Date()), "Нет больше оправданий! Сегодня «паразиты» доказали, что можно " +
                        "снимать на своей родной земле, на своём языке и разъебать с этим весь мир! Лучшие!", R.drawable.c, "16", "219", 2786, false, like
            )
        )
        (posts as ArrayList<Post>).add(
            Post("Ринат Балгабаев", "@Rinat_...", "‧ " + dateFormat.format(Date()), "Американцы нанимают Айсултана,чтобы клип посмотрели как минимум " + "несколько миллионов казахов",
                R.drawable.d, "4", "5", 248, false, like
            )
        )
        (posts as ArrayList<Post>).add(
            Post("Poem Heaven", "@PoemHeaven", "‧ " + dateFormat.format(Date()), "how’s your 2020 going so far?", R.drawable.e,
                "200", "153", 1122, false, like
            )
        )
        (posts as ArrayList<Post>).add(
            Post("Trevor Holmes", "@tholmesmu..", "‧ " + dateFormat.format(Date()), "Life doesn’t happen the way you want it to happen. " + "It happens the way you need it to happen",
                R.drawable.f, "4", "41", 155, false, like
            )
        )
        (posts as ArrayList<Post>).add(
            Post("Elon Musk", "@elonmusk", "‧ " + dateFormat.format(Date()), "Run a physics sim long enough & you’ll get intelligence",
                R.drawable.g, "2,751", "6,544", 108, false, like
            )
        )
        (posts as ArrayList<Post>).add(
            Post("Литература", "@literabook", "‧ " + dateFormat.format(Date()),
                "Мы никогда не узнаем почему и чем мы раздражаем людей, чем мы милы им и чем смешны; наш собственный образ остается для нас величайшей тайной.\n\n" +
                        "М.Кундера \"Бессмертие\"",
                R.drawable.h, "2", "120", 868, false, like
            )
        )
        (posts as ArrayList<Post>).add(
            Post("Литература", "@literabook", "‧ " + dateFormat.format(Date()), "Покупка книг была бы хорошей идеей,если бы можно было также купить и время для их чтения.\n\n" +
                        "А.Шопенгауэр", R.drawable.h, "4", "200", 1177, false, like
            )
        )
        (posts as ArrayList<Post>).add(
            Post("Великие слова", "@topcitat", "‧ " + dateFormat.format(Date()), "Не в возрасте дело,а в культуре общения и уровне интеллектуального развития.",
                R.drawable.i, "1", "28", 139, false, like
            )
        )
    }

    fun getAllPosts(): List<Post>? {
        return posts
    }

    fun getLikedPosts(): List<Post>? {
        val likedPosts: MutableList<Post> = ArrayList()
        for (post in posts!!) {
            if (post.isLiked) {
                likedPosts.add(post)
            }
        }
        return likedPosts
    }
}
package cn.kc.mvvmdemo.ui.main

import com.google.gson.annotations.SerializedName

data class WanResponse<T>(
    @SerializedName("errorCode") val code: Int,
    @SerializedName("errorMsg") val msg: String,
    val data: T
)

data class Banner(
    val id: Int,
    val title: String,
    val desc: String,
    val imagePath: String,
    val url: String,
    val type: Int,
    val isVisible: Int,
    val order: Int
)

data class HomeArticle(
    val curPage: Int,
    val offset: Int,
    val pageCount: Int,
    val size: Int,
    val total: Int,
    @SerializedName("over") val isOver: Boolean,
    val datas: List<Article>
)

data class Article(
    var apkLink: String,
    var audit: Int,
    var author: String,
    var chapterId: Int,
    var chapterName: String,
    @SerializedName("collect") var isCollect: Boolean,
    var courseId: Int,
    var desc: String,
    var envelopePic: String,
    var fresh: Boolean,
    var id: Int,
    var link: String,
    var niceDate: String,
    var niceShareDate: String,
    var origin: String,
    var prefix: String,
    var projectLink: String,
    var publishTime: Long,
    var shareDate: Long,
    var shareUser: String,
    val superChapterId: Int,
    val superChapterName: String,
    val title: String,
    val type: Int,
    val userId: Int,
    val visible: Int,
    val zan: Long,
    val tags: List<Tag>
)

data class Tag(val name: String, val url: String)

enum class Code {
    FIRST_LOADING, ING, EMPTY, SUCCESS, SUCCESS_LOAD_MORE, ERROR, ERROR_LOAD_MORE, END
}

data class Status<T>(val code: Code, val msg: String? = "", val data: T? = null) {

    constructor(code: Code, data: T? = null) : this(code, "", data)

}

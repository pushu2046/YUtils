package com.yechaoa.yutilskt

import android.content.Intent
import android.net.Uri
import com.yechaoa.yutilskt.ActivityUtilKt.currentActivity

/**
 * Created by yechao on 2020/1/7.
 * Describe : 调用系统分享图片和文字
 *
 * GitHub : https://github.com/yechaoa
 * CSDN : http://blog.csdn.net/yechaoa
 */
object ShareUtilKt {

    fun shareImage(title: String?, uri: Uri?) {
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.type = "image/*"
        intent.putExtra(Intent.EXTRA_STREAM, uri)
        currentActivity!!.startActivity(Intent.createChooser(intent, title))
    }

    fun shareText(title: String?, text: String?) {
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_SUBJECT, title)
        intent.putExtra(Intent.EXTRA_TEXT, text)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        currentActivity!!.startActivity(Intent.createChooser(intent, title))
    }

}
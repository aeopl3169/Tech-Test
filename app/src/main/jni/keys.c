#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_shashishiva_mvvmnewsapp_ui_fragments_BreakingNewsFragment_getKeys(JNIEnv *env,
                                                                           jobject thiz) {
    return (*env)->NewStringUTF(env, "PLACE KEY HERE");
}

JNIEXPORT jstring JNICALL
Java_com_shashishiva_mvvmnewsapp_ui_fragments_SearchNewsFragment_getKeys(JNIEnv *env,
                                                                         jobject thiz) {
    return (*env)->NewStringUTF(env, "PLACE KEY HERE");
}
#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
#include <guardianProcedure.h> // generated by javah via maven-native-plugin
#include <cextdecs.h>

JNIEXPORT jshortArray JNICALL Java_org_itug_nonstopjni_GuardianProcedure_get48BitTimestamp
  (JNIEnv *env, jobject obj) {

        jshortArray tptr;
        short ts[3];
        TIMESTAMP( (short _near *)&ts );
        tptr=(*env)->NewShortArray(env, 3);
        (*env)->SetShortArrayRegion(env,tptr, 0, 3, (jshort *)ts);
        return( tptr );
}




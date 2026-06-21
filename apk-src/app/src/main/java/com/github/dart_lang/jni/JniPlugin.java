package com.github.dart_lang.jni;

import android.app.Activity;
import android.content.Context;
import ei.b;
import m.h3;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class JniPlugin implements b, fi.a {
    static {
        System.loadLibrary("dartjni");
    }

    private void setup(Context context) {
        initializeJni(context, getClass().getClassLoader());
    }

    public native void initializeJni(Context context, ClassLoader classLoader);

    @Override // fi.a
    public void onAttachedToActivity(fi.b bVar) {
        w wVar = (w) ((h3) bVar).f28250b;
        setJniActivity(wVar, wVar.getApplicationContext());
    }

    @Override // ei.b
    public void onAttachedToEngine(ei.a aVar) {
        setup(aVar.f16381a);
    }

    @Override // fi.a
    public void onReattachedToActivityForConfigChanges(fi.b bVar) {
        w wVar = (w) ((h3) bVar).f28250b;
        setJniActivity(wVar, wVar.getApplicationContext());
    }

    public native void setJniActivity(Activity activity, Context context);

    @Override // fi.a
    public void onDetachedFromActivity() {
    }

    @Override // fi.a
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // ei.b
    public void onDetachedFromEngine(ei.a aVar) {
    }
}

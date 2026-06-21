package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r00 extends MutableContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f9647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f9648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f9649c;

    public final void a(Intent intent) {
        if (this.f9647a == null) {
            intent.setFlags(268435456);
            this.f9648b.startActivity(intent);
            return;
        }
        String strValueOf = String.valueOf(intent.getData());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 63);
        sb2.append("Starting activity for result with intent: ");
        sb2.append(strValueOf);
        sb2.append(" and requestCode: 236");
        t9.c0.m(sb2.toString());
        this.f9647a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f9649c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f9648b = applicationContext;
        this.f9647a = context instanceof Activity ? (Activity) context : null;
        this.f9649c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f9647a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f9648b.startActivity(intent);
        }
    }
}

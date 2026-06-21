package com.google.firebase.messaging;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f14880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f14883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14885h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f14886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f14887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f14888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f14889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f14890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f14891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f14892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f14893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f14894r;

    public w(fe.c cVar) {
        String[] strArr;
        String[] strArr2;
        this.f14878a = cVar.D("gcm.n.title");
        this.f14879b = cVar.A("gcm.n.title");
        Object[] objArrZ = cVar.z("gcm.n.title");
        if (objArrZ == null) {
            strArr = null;
        } else {
            strArr = new String[objArrZ.length];
            for (int i = 0; i < objArrZ.length; i++) {
                strArr[i] = String.valueOf(objArrZ[i]);
            }
        }
        this.f14880c = strArr;
        this.f14881d = cVar.D("gcm.n.body");
        this.f14882e = cVar.A("gcm.n.body");
        Object[] objArrZ2 = cVar.z("gcm.n.body");
        if (objArrZ2 == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[objArrZ2.length];
            for (int i10 = 0; i10 < objArrZ2.length; i10++) {
                strArr2[i10] = String.valueOf(objArrZ2[i10]);
            }
        }
        this.f14883f = strArr2;
        this.f14884g = cVar.D("gcm.n.icon");
        String strD = cVar.D("gcm.n.sound2");
        this.i = TextUtils.isEmpty(strD) ? cVar.D("gcm.n.sound") : strD;
        this.f14886j = cVar.D("gcm.n.tag");
        this.f14887k = cVar.D("gcm.n.color");
        this.f14888l = cVar.D("gcm.n.click_action");
        this.f14889m = cVar.D("gcm.n.android_channel_id");
        String strD2 = cVar.D("gcm.n.link_android");
        strD2 = TextUtils.isEmpty(strD2) ? cVar.D("gcm.n.link") : strD2;
        this.f14890n = TextUtils.isEmpty(strD2) ? null : Uri.parse(strD2);
        this.f14885h = cVar.D("gcm.n.image");
        this.f14891o = cVar.D("gcm.n.ticker");
        this.f14892p = cVar.w("gcm.n.notification_priority");
        this.f14893q = cVar.w("gcm.n.visibility");
        this.f14894r = cVar.w("gcm.n.notification_count");
        cVar.v("gcm.n.sticky");
        cVar.v("gcm.n.local_only");
        cVar.v("gcm.n.default_sound");
        cVar.v("gcm.n.default_vibrate_timings");
        cVar.v("gcm.n.default_light_settings");
        cVar.B();
        cVar.y();
        cVar.E();
    }
}

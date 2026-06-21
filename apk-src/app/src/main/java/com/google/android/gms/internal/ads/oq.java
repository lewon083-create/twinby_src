package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f8755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8757e;

    public /* synthetic */ oq(ob.z3 z3Var) {
        this.f8757e = z3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(long r11, com.google.android.gms.internal.measurement.d3 r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oq.a(long, com.google.android.gms.internal.measurement.d3):boolean");
    }

    public void b() {
        ob.z0 z0Var = (ob.z0) this.f8757e;
        z0Var.C();
        ((ob.l1) z0Var.f15951b).f30269l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = z0Var.G().edit();
        editorEdit.remove((String) this.f8755c);
        editorEdit.remove((String) this.f8756d);
        editorEdit.putLong((String) this.f8754b, jCurrentTimeMillis);
        editorEdit.apply();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bu0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f3904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kr0 f3905c;

    public bu0(kr0 kr0Var, float f10) {
        this.f3904b = f10;
        this.f3905c = kr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lu0 lu0Var = ((cu0) this.f3905c.f7290c).f4319g;
        float f10 = this.f3904b;
        lu0Var.f7628a = f10;
        if (lu0Var.f7630c == null) {
            lu0Var.f7630c = fu0.f5441c;
        }
        Iterator it = Collections.unmodifiableCollection(lu0Var.f7630c.f5443b).iterator();
        while (it.hasNext()) {
            ou0 ou0Var = ((ut0) it.next()).f11066d;
            c6.f4048h.A(ou0Var.c(), "setDeviceVolume", Float.valueOf(f10), ou0Var.f8802a);
        }
    }
}

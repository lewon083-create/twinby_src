package com.google.android.gms.internal.ads;

import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2880e;

    public /* synthetic */ af0(Object obj, int i, Object obj2, int i10) {
        this.f2877b = i10;
        this.f2879d = obj;
        this.f2878c = i;
        this.f2880e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2877b) {
            case 0:
                for (oe0 oe0Var : (CopyOnWriteArraySet) this.f2879d) {
                    td0 td0Var = (td0) this.f2880e;
                    if (!oe0Var.f8675d) {
                        int i = this.f2878c;
                        if (i != -1) {
                            oe0Var.f8673b.c(i);
                        }
                        oe0Var.f8674c = true;
                        td0Var.mo0a(oe0Var.f8672a);
                    }
                }
                break;
            default:
                ((u71) this.f2879d).t(this.f2878c, (ed.d) this.f2880e);
                break;
        }
    }
}

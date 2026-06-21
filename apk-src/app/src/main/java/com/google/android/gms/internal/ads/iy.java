package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iy implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6643e;

    public /* synthetic */ iy(Object obj, boolean z5, long j10, int i) {
        this.f6640b = i;
        this.f6643e = obj;
        this.f6641c = z5;
        this.f6642d = j10;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f6640b) {
            case 0:
                jy jyVar = (jy) this.f6643e;
                jyVar.f6989d.U0(this.f6642d, this.f6641c);
                break;
            default:
                ((sz) this.f6643e).U0(this.f6642d, this.f6641c);
                break;
        }
    }
}

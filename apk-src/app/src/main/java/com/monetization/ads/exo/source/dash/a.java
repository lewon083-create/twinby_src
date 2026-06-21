package com.monetization.ads.exo.source.dash;

import yads.a23;
import yads.x13;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements x13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f15022a;

    public a(i iVar) {
        this.f15022a = iVar;
    }

    public final void a() {
        long j10;
        i iVar = this.f15022a;
        synchronized (a23.f36619b) {
            try {
                j10 = a23.f36620c ? a23.f36621d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        iVar.L = j10;
        iVar.a(true);
    }
}

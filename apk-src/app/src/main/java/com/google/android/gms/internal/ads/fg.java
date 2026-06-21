package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fg extends ig {
    public final boolean i;

    public fg(qf qfVar, jd jdVar, int i) {
        super(qfVar, "bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", jdVar, i, 61);
        this.i = qfVar.f9488o.f7207a;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void a() {
        long jLongValue = ((Long) this.f6485f.invoke(null, this.f6481b.f9475a, Boolean.valueOf(this.i))).longValue();
        jd jdVar = this.f6484e;
        synchronized (jdVar) {
            jdVar.b();
            ((wd) jdVar.f9560c).a0(jLongValue);
        }
    }
}

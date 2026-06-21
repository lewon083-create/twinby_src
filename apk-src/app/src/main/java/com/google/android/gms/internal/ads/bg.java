package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bg extends ig {
    public final long i;

    public bg(qf qfVar, jd jdVar, long j10, int i) {
        super(qfVar, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", jdVar, i, 25);
        this.i = j10;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void a() {
        long jLongValue = ((Long) this.f6485f.invoke(null, null)).longValue();
        jd jdVar = this.f6484e;
        synchronized (jdVar) {
            jdVar.b();
            ((wd) jdVar.f9560c).m0(jLongValue);
            long j10 = this.i;
            if (j10 != 0) {
                jdVar.b();
                ((wd) jdVar.f9560c).N0(jLongValue - j10);
                jdVar.b();
                ((wd) jdVar.f9560c).Q0(j10);
            }
        }
    }
}

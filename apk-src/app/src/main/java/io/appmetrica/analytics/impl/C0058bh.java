package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0058bh extends Qg {
    public C0058bh(@NotNull Y4 y42) {
        super(y42);
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NotNull Q5 q5) {
        Ck ckB;
        Sk sk2;
        C0306l9 c0306l9 = this.f22888a.f23294n;
        Qk qk2 = c0306l9.f24280c;
        if (qk2.f22897g == 0) {
            ckB = qk2.f22894d.b();
            Ck ckB2 = qk2.f22895e.b();
            if ((ckB == null ? -1L : ckB.f22224d) <= (ckB2 != null ? ckB2.f22224d : -1L)) {
                ckB = ckB2;
            }
        } else {
            ckB = qk2.f22896f;
        }
        if (ckB != null) {
            sk2 = new Sk();
            sk2.f22973a = ckB.f22224d;
            long andIncrement = ckB.f22226f.getAndIncrement();
            Tk tk2 = ckB.f22222b;
            tk2.a(Tk.f23033g, Long.valueOf(ckB.f22226f.get()));
            tk2.b();
            sk2.f22974b = andIncrement;
            sk2.f22975c = TimeUnit.MILLISECONDS.toSeconds(ckB.f22229j);
            sk2.f22976d = ckB.f22223c.f22343a;
        } else {
            long j10 = q5.f22868j;
            long jA = qk2.f22892b.a();
            M6 m62 = qk2.f22891a.f23286e;
            Uk uk2 = Uk.BACKGROUND;
            m62.a(jA, uk2, j10);
            sk2 = new Sk();
            sk2.f22973a = jA;
            sk2.f22976d = uk2;
            sk2.f22974b = 0L;
            sk2.f22975c = 0L;
        }
        c0306l9.a(q5, sk2);
        return false;
    }
}

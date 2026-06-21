package f4;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import hl.l;
import j3.n;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import m3.p;
import m3.z;
import q4.a0;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.k f16636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f16637c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16639e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16642h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16638d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16640f = -1;

    public h(e4.k kVar) {
        this.f16636b = kVar;
    }

    @Override // f4.i
    public final void a(long j10) {
        this.f16638d = j10;
    }

    @Override // f4.i
    public final void b(p pVar, long j10, int i, boolean z5) {
        this.f16637c.getClass();
        if (!this.f16641g) {
            int i10 = pVar.f28590b;
            h5.g("ID Header has insufficient data", pVar.f28591c > 18);
            h5.g("ID Header missing", pVar.x(8, StandardCharsets.UTF_8).equals("OpusHead"));
            h5.g("version number must always be 1", pVar.z() == 1);
            pVar.M(i10);
            ArrayList arrayListC = q4.b.c(pVar.f28589a);
            n nVarA = this.f16636b.f16140c.a();
            nVarA.f26295p = arrayListC;
            pe.a.q(nVarA, this.f16637c);
            this.f16641g = true;
        } else if (this.f16642h) {
            int iA = e4.h.a(this.f16640f);
            if (i != iA) {
                String str = z.f28608a;
                Locale locale = Locale.US;
                m3.b.s("RtpOpusReader", om1.j("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i, "."));
            }
            int iA2 = pVar.a();
            this.f16637c.d(iA2, pVar);
            this.f16637c.f(l.t(this.f16639e, 48000, j10, this.f16638d), 1, iA2, 0, null);
        } else {
            h5.g("Comment Header has insufficient data", pVar.f28591c >= 8);
            h5.g("Comment Header should follow ID Header", pVar.x(8, StandardCharsets.UTF_8).equals("OpusTags"));
            this.f16642h = true;
        }
        this.f16640f = i;
    }

    @Override // f4.i
    public final void c(m mVar, int i) {
        a0 a0VarP = mVar.P(i, 1);
        this.f16637c = a0VarP;
        a0VarP.a(this.f16636b.f16140c);
    }

    @Override // f4.i
    public final void seek(long j10, long j11) {
        this.f16638d = j10;
        this.f16639e = j11;
    }
}

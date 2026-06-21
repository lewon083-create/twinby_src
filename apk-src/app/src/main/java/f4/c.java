package f4;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import hl.l;
import java.util.Locale;
import m3.p;
import m3.z;
import q4.a0;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements i {
    public static final int[] i = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f16592j = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.k f16593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0 f16596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16599h;

    public c(e4.k kVar) {
        this.f16593b = kVar;
        String str = kVar.f16140c.f26335n;
        str.getClass();
        this.f16594c = "audio/amr-wb".equals(str);
        this.f16595d = kVar.f16139b;
        this.f16597f = -9223372036854775807L;
        this.f16599h = -1;
        this.f16598g = 0L;
    }

    @Override // f4.i
    public final void a(long j10) {
        this.f16597f = j10;
    }

    @Override // f4.i
    public final void b(p pVar, long j10, int i10, boolean z5) {
        int iA;
        this.f16596e.getClass();
        int i11 = this.f16599h;
        if (i11 != -1 && i10 != (iA = e4.h.a(i11))) {
            String str = z.f28608a;
            Locale locale = Locale.US;
            m3.b.s("RtpAmrReader", om1.j("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i10, "."));
        }
        pVar.N(1);
        int iJ = (pVar.j() >> 3) & 15;
        boolean z10 = (iJ >= 0 && iJ <= 8) || iJ == 15;
        boolean z11 = this.f16594c;
        String str2 = z11 ? "WB" : "NB";
        if (!z10) {
            throw new IllegalArgumentException(hl.d.q("Illegal AMR %s frame type %s", str2, Integer.valueOf(iJ)));
        }
        int i12 = z11 ? f16592j[iJ] : i[iJ];
        int iA2 = pVar.a();
        h5.g("compound payload not supported currently", iA2 == i12);
        this.f16596e.d(iA2, pVar);
        this.f16596e.f(l.t(this.f16598g, this.f16595d, j10, this.f16597f), 1, iA2, 0, null);
        this.f16599h = i10;
    }

    @Override // f4.i
    public final void c(m mVar, int i10) {
        a0 a0VarP = mVar.P(i10, 1);
        this.f16596e = a0VarP;
        a0VarP.a(this.f16593b.f16140c);
    }

    @Override // f4.i
    public final void seek(long j10, long j11) {
        this.f16597f = j10;
        this.f16598g = j11;
    }
}

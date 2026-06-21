package y3;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.e2;
import j3.c0;
import j3.d0;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.w;
import m3.z;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements q4.k {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f36434j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f36436b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n5.k f36438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q4.m f36440f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36442h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.p f36437c = new m3.p();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f36441g = new byte[1024];

    public t(String str, w wVar, n5.k kVar, boolean z5) {
        this.f36435a = str;
        this.f36436b = wVar;
        this.f36438d = kVar;
        this.f36439e = z5;
    }

    @Override // q4.k
    public final int a(q4.l lVar, e2 e2Var) throws d0 {
        String strN;
        this.f36440f.getClass();
        int length = (int) lVar.getLength();
        int i10 = this.f36442h;
        byte[] bArr = this.f36441g;
        if (i10 == bArr.length) {
            this.f36441g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f36441g;
        int i11 = this.f36442h;
        int i12 = lVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f36442h + i12;
            this.f36442h = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        m3.p pVar = new m3.p(this.f36441g);
        w5.h.d(pVar);
        String strN2 = pVar.n(StandardCharsets.UTF_8);
        long jU = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strN2)) {
                while (true) {
                    String strN3 = pVar.n(StandardCharsets.UTF_8);
                    if (strN3 == null) {
                        break;
                    }
                    if (w5.h.f35161a.matcher(strN3).matches()) {
                        do {
                            strN = pVar.n(StandardCharsets.UTF_8);
                            if (strN != null) {
                            }
                        } while (!strN.isEmpty());
                    } else {
                        Matcher matcher2 = w5.g.f35157a.matcher(strN3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    e(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = w5.h.c(strGroup);
                String str = z.f28608a;
                long jB = this.f36436b.b(z.U((jU + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                a0 a0VarE = e(jB - jC2);
                byte[] bArr3 = this.f36441g;
                int i14 = this.f36442h;
                m3.p pVar2 = this.f36437c;
                pVar2.K(i14, bArr3);
                a0VarE.d(this.f36442h, pVar2);
                a0VarE.f(jB, 1, this.f36442h, 0, null);
                return -1;
            }
            if (strN2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strN2);
                if (!matcher3.find()) {
                    throw d0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strN2));
                }
                Matcher matcher4 = f36434j.matcher(strN2);
                if (!matcher4.find()) {
                    throw d0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strN2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = w5.h.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j10 = Long.parseLong(strGroup3);
                String str2 = z.f28608a;
                jU = z.U(j10, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strN2 = pVar.n(StandardCharsets.UTF_8);
        }
    }

    @Override // q4.k
    public final void b(q4.m mVar) {
        if (this.f36439e) {
            mVar = new b7(mVar, this.f36438d);
        }
        this.f36440f = mVar;
        mVar.j(new q4.o(-9223372036854775807L));
    }

    @Override // q4.k
    public final boolean d(q4.l lVar) {
        q4.h hVar = (q4.h) lVar;
        hVar.y(this.f36441g, 0, 6, false);
        byte[] bArr = this.f36441g;
        m3.p pVar = this.f36437c;
        pVar.K(6, bArr);
        if (w5.h.a(pVar)) {
            return true;
        }
        hVar.y(this.f36441g, 6, 3, false);
        pVar.K(9, this.f36441g);
        return w5.h.a(pVar);
    }

    public final a0 e(long j10) {
        a0 a0VarP = this.f36440f.P(0, 3);
        j3.n nVar = new j3.n();
        nVar.f26292m = c0.n("text/vtt");
        nVar.f26284d = this.f36435a;
        nVar.f26297r = j10;
        pe.a.q(nVar, a0VarP);
        this.f36440f.G();
        return a0VarP;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // q4.k
    public final void release() {
    }
}

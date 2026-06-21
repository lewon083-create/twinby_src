package l5;

import ad.j0;
import com.google.android.gms.internal.ads.t6;
import j3.b0;
import j3.c0;
import j3.n;
import j3.o;
import java.util.ArrayList;
import java.util.Arrays;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends t6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f27930o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f27931p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f27932n;

    public static boolean i(p pVar, byte[] bArr) {
        if (pVar.a() < bArr.length) {
            return false;
        }
        int i = pVar.f28590b;
        byte[] bArr2 = new byte[bArr.length];
        pVar.k(bArr2, 0, bArr.length);
        pVar.M(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final long b(p pVar) {
        byte[] bArr = pVar.f28589a;
        return (((long) this.f10503e) * q4.b.o(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final boolean c(p pVar, long j10, h3.e eVar) {
        if (i(pVar, f27930o)) {
            byte[] bArrCopyOf = Arrays.copyOf(pVar.f28589a, pVar.f28591c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListC = q4.b.c(bArrCopyOf);
            if (((o) eVar.f20375c) == null) {
                n nVar = new n();
                nVar.f26291l = c0.n("audio/ogg");
                nVar.f26292m = c0.n("audio/opus");
                nVar.E = i;
                nVar.F = 48000;
                nVar.f26295p = arrayListC;
                eVar.f20375c = new o(nVar);
                return true;
            }
        } else {
            if (!i(pVar, f27931p)) {
                ((o) eVar.f20375c).getClass();
                return false;
            }
            ((o) eVar.f20375c).getClass();
            if (!this.f27932n) {
                this.f27932n = true;
                pVar.N(8);
                b0 b0VarW = q4.b.w(j0.t((String[]) q4.b.z(pVar, false, false).f27180c));
                if (b0VarW != null) {
                    n nVarA = ((o) eVar.f20375c).a();
                    nVarA.f26290k = b0VarW.b(((o) eVar.f20375c).f26333l);
                    eVar.f20375c = new o(nVarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final void d(boolean z5) {
        super.d(z5);
        if (z5) {
            this.f27932n = false;
        }
    }
}

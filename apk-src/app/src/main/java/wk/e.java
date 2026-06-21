package wk;

import d8.e0;
import ij.c0;
import ij.d0;
import ij.s;
import ij.v;
import ij.w;
import ij.y;
import ij.z;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f35283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e0 writer, boolean z5) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f35283d = z5;
    }

    @Override // ac.c
    public final void j(byte b2) {
        if (this.f35283d) {
            ij.r rVar = s.f21353c;
            q(String.valueOf(b2 & 255));
        } else {
            ij.r rVar2 = s.f21353c;
            o(String.valueOf(b2 & 255));
        }
    }

    @Override // ac.c
    public final void m(int i) {
        if (this.f35283d) {
            v vVar = w.f21359c;
            q(Long.toString(((long) i) & 4294967295L, 10));
        } else {
            v vVar2 = w.f21359c;
            o(Long.toString(((long) i) & 4294967295L, 10));
        }
    }

    @Override // ac.c
    public final void n(long j10) {
        boolean z5 = this.f35283d;
        int i = 63;
        String str = CommonUrlParts.Values.FALSE_INTEGER;
        if (z5) {
            y yVar = z.f21362c;
            if (j10 != 0) {
                if (j10 > 0) {
                    str = Long.toString(j10, 10);
                } else {
                    char[] cArr = new char[64];
                    long j11 = (j10 >>> 1) / ((long) 5);
                    long j12 = 10;
                    cArr[63] = Character.forDigit((int) (j10 - (j11 * j12)), 10);
                    while (j11 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j11 % j12), 10);
                        j11 /= j12;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            q(str);
            return;
        }
        y yVar2 = z.f21362c;
        if (j10 != 0) {
            if (j10 > 0) {
                str = Long.toString(j10, 10);
            } else {
                char[] cArr2 = new char[64];
                long j13 = (j10 >>> 1) / ((long) 5);
                long j14 = 10;
                cArr2[63] = Character.forDigit((int) (j10 - (j13 * j14)), 10);
                while (j13 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j13 % j14), 10);
                    j13 /= j14;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        o(str);
    }

    @Override // ac.c
    public final void p(short s10) {
        if (this.f35283d) {
            c0 c0Var = d0.f21332c;
            q(String.valueOf(s10 & 65535));
        } else {
            c0 c0Var2 = d0.f21332c;
            o(String.valueOf(s10 & 65535));
        }
    }
}

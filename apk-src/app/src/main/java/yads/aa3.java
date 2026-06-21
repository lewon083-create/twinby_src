package yads;

import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class aa3 extends iz2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lb2 f36670m = new lb2();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f36671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f36672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f36673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f36674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f36675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f36676s;

    public aa3(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f36672o = 0;
            this.f36673p = -1;
            this.f36674q = "sans-serif";
            this.f36671n = false;
            this.f36675r = 0.85f;
            this.f36676s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f36672o = bArr[24];
        this.f36673p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f36674q = "Serif".equals(lb3.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f36676s = i;
        boolean z5 = (bArr[0] & 32) != 0;
        this.f36671n = z5;
        if (z5) {
            this.f36675r = lb3.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i);
        } else {
            this.f36675r = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            int i14 = i13 | 33;
            boolean z5 = (i & 1) != 0;
            boolean z10 = (i & 2) != 0;
            if (z5) {
                if (z10) {
                    l7.o.o(3, spannableStringBuilder, i11, i12, i14);
                } else {
                    l7.o.o(1, spannableStringBuilder, i11, i12, i14);
                }
            } else if (z10) {
                l7.o.o(2, spannableStringBuilder, i11, i12, i14);
            }
            boolean z11 = (i & 4) != 0;
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (z11 || z5 || z10) {
                return;
            }
            l7.o.o(0, spannableStringBuilder, i11, i12, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    @Override // yads.iz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.u43 a(byte[] r22, int r23, boolean r24) throws yads.w43 {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.aa3.a(byte[], int, boolean):yads.u43");
    }
}

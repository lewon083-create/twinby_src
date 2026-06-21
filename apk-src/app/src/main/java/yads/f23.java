package yads;

import java.util.Arrays;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f38341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f38342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f38343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f38346h;
    public final short[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f38347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f38349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f38351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f38352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f38353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f38354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f38355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f38356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f38357t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f38358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f38359v;

    public f23(int i, int i10, float f10, float f11, int i11) {
        this.f38339a = i;
        this.f38340b = i10;
        this.f38341c = f10;
        this.f38342d = f11;
        this.f38343e = i / i11;
        this.f38344f = i / 400;
        int i12 = i / 65;
        this.f38345g = i12;
        int i13 = i12 * 2;
        this.f38346h = i13;
        this.i = new short[i13];
        int i14 = i13 * i10;
        this.f38347j = new short[i14];
        this.f38349l = new short[i14];
        this.f38351n = new short[i14];
    }

    public final void a(short[] sArr, int i, int i10) {
        int i11 = this.f38346h / i10;
        int i12 = this.f38340b;
        int i13 = i10 * i12;
        int i14 = i * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] b(short[] sArr, int i, int i10) {
        int length = sArr.length;
        int i11 = this.f38340b;
        int i12 = length / i11;
        return i + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int a(short[] sArr, int i, int i10, int i11) {
        int i12 = i * this.f38340b;
        int i13 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                iAbs += Math.abs(sArr[i12 + i17] - sArr[(i12 + i10) + i17]);
            }
            if (iAbs * i15 < i14 * i10) {
                i15 = i10;
                i14 = iAbs;
            }
            if (iAbs * i13 > i16 * i10) {
                i13 = i10;
                i16 = iAbs;
            }
            i10++;
        }
        this.f38358u = i14 / i15;
        this.f38359v = i16 / i13;
        return i15;
    }

    public static void a(int i, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i - i18) * sArr2[i17])) / i);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0262 A[LOOP:4: B:13:0x004c->B:100:0x0262, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018f A[EDGE_INSN: B:110:0x018f->B:65:0x018f BREAK  A[LOOP:4: B:13:0x004c->B:100:0x0262], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.f23.a():void");
    }
}

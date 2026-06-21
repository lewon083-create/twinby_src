package yads;

import android.os.SystemClock;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ec extends to {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final im f38055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f38056h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f38057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f38058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f38059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f38060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f38061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r51 f38062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xv f38063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f38064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f38065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f38066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f38067t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public jo f38068u;

    public ec(k73 k73Var, int[] iArr, int i, im imVar, long j10, long j11, long j12, int i10, int i11, float f10, float f11, r51 r51Var, xv xvVar) {
        long j13;
        super(k73Var, iArr);
        if (j12 < j10) {
            kh1.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f38055g = imVar;
        this.f38056h = j10 * 1000;
        this.i = j11 * 1000;
        this.f38057j = j13 * 1000;
        this.f38058k = i10;
        this.f38059l = i11;
        this.f38060m = f10;
        this.f38061n = f11;
        this.f38062o = r51.a((Collection) r51Var);
        this.f38063p = xvVar;
        this.f38064q = 1.0f;
        this.f38066s = 0;
        this.f38067t = -9223372036854775807L;
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            n51 n51Var = (n51) arrayList.get(i);
            if (n51Var != null) {
                n51Var.a(new cc(j10, jArr[i]));
            }
        }
    }

    @Override // yads.pp0
    public final int d() {
        return this.f38066s;
    }

    @Override // yads.to, yads.pp0
    public final void disable() {
        this.f38068u = null;
    }

    @Override // yads.pp0
    public final int e() {
        return this.f38065r;
    }

    @Override // yads.pp0
    public final Object g() {
        return null;
    }

    public final int a(long j10) {
        long j11;
        dc0 dc0Var = (dc0) this.f38055g;
        synchronized (dc0Var) {
            j11 = dc0Var.f37716l;
        }
        long j12 = (long) (j11 * this.f38060m);
        this.f38055g.getClass();
        long j13 = (long) (j12 / this.f38064q);
        if (!this.f38062o.isEmpty()) {
            int i = 1;
            while (i < this.f38062o.size() - 1 && ((cc) this.f38062o.get(i)).f37332a < j13) {
                i++;
            }
            cc ccVar = (cc) this.f38062o.get(i - 1);
            cc ccVar2 = (cc) this.f38062o.get(i);
            long j14 = ccVar.f37332a;
            long j15 = ccVar.f37333b;
            j13 = j15 + ((long) (((j13 - j14) / (ccVar2.f37332a - j14)) * (ccVar2.f37333b - j15)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f43384b; i11++) {
            if (j10 == Long.MIN_VALUE || !b(i11, j10)) {
                if (a(i11).i <= j13) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // yads.to, yads.pp0
    public final void a() {
        this.f38067t = -9223372036854775807L;
        this.f38068u = null;
    }

    @Override // yads.to, yads.pp0
    public final int a(long j10, List list) {
        int i;
        int i10;
        ((i53) this.f38063p).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f38067t;
        if (j11 != -9223372036854775807L && jElapsedRealtime - j11 < 1000 && (list.isEmpty() || ((jo) xd1.a(list)).equals(this.f38068u))) {
            return list.size();
        }
        this.f38067t = jElapsedRealtime;
        this.f38068u = list.isEmpty() ? null : (jo) xd1.a(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jRound = ((jo) list.get(size - 1)).f37506g - j10;
        float f10 = this.f38064q;
        int i11 = lb3.f40466a;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / ((double) f10));
        }
        long j12 = this.f38057j;
        if (jRound >= j12) {
            if (!list.isEmpty()) {
                long j13 = ((jo) xd1.a(list)).f37506g;
            }
            nx0 nx0Var = this.f43386d[a(jElapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                jo joVar = (jo) list.get(i12);
                nx0 nx0Var2 = joVar.f37503d;
                long jRound2 = joVar.f37506g - j10;
                float f11 = this.f38064q;
                if (f11 != 1.0f) {
                    jRound2 = Math.round(jRound2 / ((double) f11));
                }
                if (jRound2 >= j12 && nx0Var2.i < nx0Var.i && (i = nx0Var2.f41381s) != -1 && i <= this.f38059l && (i10 = nx0Var2.f41380r) != -1 && i10 <= this.f38058k && i < nx0Var.f41381s) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // yads.to, yads.pp0
    public final void a(float f10) {
        this.f38064q = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    @Override // yads.pp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r8, long r10, long r12, java.util.List r14, yads.ak1[] r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ec.a(long, long, long, java.util.List, yads.ak1[]):void");
    }

    public static um2 a(np0[] np0VarArr) {
        int i;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i = 1;
            if (i13 >= np0VarArr.length) {
                break;
            }
            np0 np0Var = np0VarArr[i13];
            if (np0Var != null && np0Var.f41338b.length > 1) {
                n51 n51VarF = r51.f();
                n51VarF.a(new cc(0L, 0L));
                arrayList.add(n51VarF);
            } else {
                arrayList.add(null);
            }
            i13++;
        }
        int length = np0VarArr.length;
        long[][] jArr = new long[length][];
        for (int i14 = 0; i14 < np0VarArr.length; i14++) {
            np0 np0Var2 = np0VarArr[i14];
            if (np0Var2 == null) {
                jArr[i14] = new long[0];
            } else {
                jArr[i14] = new long[np0Var2.f41338b.length];
                int i15 = 0;
                while (true) {
                    if (i15 >= np0Var2.f41338b.length) {
                        break;
                    }
                    jArr[i14][i15] = np0Var2.f41337a.f40098e[r11[i15]].i;
                    i15++;
                }
                Arrays.sort(jArr[i14]);
            }
        }
        int[] iArr = new int[length];
        long[] jArr2 = new long[length];
        for (int i16 = 0; i16 < length; i16++) {
            long[] jArr3 = jArr[i16];
            jArr2[i16] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        a(arrayList, jArr2);
        b82 b82Var = b82.f36960b;
        b82Var.getClass();
        ux1 ux1VarB = new px1(b82Var).a().b();
        int i17 = 0;
        while (i17 < length) {
            long[] jArr4 = jArr[i17];
            if (jArr4.length <= i) {
                i10 = i12;
                i11 = length;
            } else {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i18 = i12;
                while (true) {
                    long[] jArr5 = jArr[i17];
                    int length3 = jArr5.length;
                    double dLog = ConfigValue.DOUBLE_DEFAULT_VALUE;
                    if (i18 >= length3) {
                        break;
                    }
                    int i19 = i12;
                    int i20 = length;
                    long j10 = jArr5[i18];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i18] = dLog;
                    i18++;
                    i12 = i19;
                    length = i20;
                }
                i10 = i12;
                i11 = length;
                int i21 = length2 - 1;
                double d10 = dArr[i21] - dArr[i10];
                int i22 = i10;
                while (i22 < i21) {
                    double d11 = dArr[i22];
                    i22++;
                    ux1VarB.a(Double.valueOf(d10 == ConfigValue.DOUBLE_DEFAULT_VALUE ? 1.0d : (((d11 + dArr[i22]) * 0.5d) - dArr[i10]) / d10), Integer.valueOf(i17));
                    i = i;
                }
            }
            i17++;
            i12 = i10;
            length = i11;
            i = i;
        }
        int i23 = i12;
        d0 d0Var = ux1VarB.f37939d;
        if (d0Var == null) {
            d0Var = new d0(ux1VarB);
            ux1VarB.f37939d = d0Var;
        }
        r51 r51VarA = r51.a((Collection) d0Var);
        for (int i24 = i23; i24 < r51VarA.size(); i24++) {
            int iIntValue = ((Integer) r51VarA.get(i24)).intValue();
            int i25 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i25;
            jArr2[iIntValue] = jArr[iIntValue][i25];
            a(arrayList, jArr2);
        }
        for (int i26 = i23; i26 < np0VarArr.length; i26++) {
            if (arrayList.get(i26) != null) {
                jArr2[i26] = jArr2[i26] * 2;
            }
        }
        a(arrayList, jArr2);
        n51 n51VarF2 = r51.f();
        for (int i27 = i23; i27 < arrayList.size(); i27++) {
            n51 n51Var = (n51) arrayList.get(i27);
            n51VarF2.a((Object) (n51Var == null ? r51.g() : n51Var.a()));
        }
        return n51VarF2.a();
    }
}

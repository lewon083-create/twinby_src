package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class eo implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38191b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u30 f38193d;

    public eo(boolean z5) {
        this.f38190a = z5;
    }

    @Override // yads.p30
    public final void a(u83 u83Var) {
        u83Var.getClass();
        if (this.f38191b.contains(u83Var)) {
            return;
        }
        this.f38191b.add(u83Var);
        this.f38192c++;
    }

    public final void b(u30 u30Var) {
        this.f38193d = u30Var;
        for (int i = 0; i < this.f38192c; i++) {
            u83 u83Var = (u83) this.f38191b.get(i);
            boolean z5 = this.f38190a;
            dc0 dc0Var = (dc0) u83Var;
            synchronized (dc0Var) {
                try {
                    um2 um2Var = dc0.f37699n;
                    if (z5 && (u30Var.i & 8) != 8) {
                        if (dc0Var.f37711f == 0) {
                            ((i53) dc0Var.f37709d).getClass();
                            dc0Var.f37712g = SystemClock.elapsedRealtime();
                        }
                        dc0Var.f37711f++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(int i) {
        u30 u30Var = this.f38193d;
        int i10 = lb3.f40466a;
        for (int i11 = 0; i11 < this.f38192c; i11++) {
            u83 u83Var = (u83) this.f38191b.get(i11);
            boolean z5 = this.f38190a;
            dc0 dc0Var = (dc0) u83Var;
            synchronized (dc0Var) {
                um2 um2Var = dc0.f37699n;
                if (z5 && (u30Var.i & 8) != 8) {
                    dc0Var.f37713h += (long) i;
                }
            }
        }
    }

    public final void d() {
        int i;
        d13 d13Var;
        float f10;
        long j10;
        u30 u30Var = this.f38193d;
        int i10 = lb3.f40466a;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f38192c) {
            u83 u83Var = (u83) this.f38191b.get(i12);
            boolean z5 = this.f38190a;
            dc0 dc0Var = (dc0) u83Var;
            synchronized (dc0Var) {
                try {
                    um2 um2Var = dc0.f37699n;
                    if (!z5 || (u30Var.i & 8) == 8) {
                        i = i12;
                    } else {
                        if (dc0Var.f37711f <= 0) {
                            throw new IllegalStateException();
                        }
                        ((i53) dc0Var.f37709d).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i13 = (int) (jElapsedRealtime - dc0Var.f37712g);
                        dc0Var.f37714j += (long) i13;
                        long j11 = dc0Var.f37715k;
                        long j12 = dc0Var.f37713h;
                        dc0Var.f37715k = j11 + j12;
                        if (i13 > 0) {
                            float f11 = (j12 * 8000.0f) / i13;
                            e13 e13Var = dc0Var.f37708c;
                            int iSqrt = (int) Math.sqrt(j12);
                            if (e13Var.f37966d != 1) {
                                Collections.sort(e13Var.f37964b, e13.f37962h);
                                e13Var.f37966d = 1;
                            }
                            int i14 = e13Var.f37969g;
                            if (i14 > 0) {
                                d13[] d13VarArr = e13Var.f37965c;
                                int i15 = i14 - 1;
                                e13Var.f37969g = i15;
                                d13Var = d13VarArr[i15];
                            } else {
                                d13Var = new d13();
                            }
                            int i16 = e13Var.f37967e;
                            e13Var.f37967e = i16 + 1;
                            d13Var.f37591a = i16;
                            d13Var.f37592b = iSqrt;
                            d13Var.f37593c = f11;
                            e13Var.f37964b.add(d13Var);
                            e13Var.f37968f += iSqrt;
                            while (true) {
                                int i17 = e13Var.f37968f;
                                int i18 = e13Var.f37963a;
                                if (i17 <= i18) {
                                    break;
                                }
                                int i19 = i17 - i18;
                                d13 d13Var2 = (d13) e13Var.f37964b.get(i11);
                                int i20 = d13Var2.f37592b;
                                if (i20 <= i19) {
                                    e13Var.f37968f -= i20;
                                    e13Var.f37964b.remove(i11);
                                    int i21 = e13Var.f37969g;
                                    if (i21 < 5) {
                                        d13[] d13VarArr2 = e13Var.f37965c;
                                        e13Var.f37969g = i21 + 1;
                                        d13VarArr2[i21] = d13Var2;
                                    }
                                } else {
                                    d13Var2.f37592b = i20 - i19;
                                    e13Var.f37968f -= i19;
                                }
                            }
                            if (dc0Var.f37714j >= 2000 || dc0Var.f37715k >= 524288) {
                                e13 e13Var2 = dc0Var.f37708c;
                                if (e13Var2.f37966d != 0) {
                                    Collections.sort(e13Var2.f37964b, e13.i);
                                    e13Var2.f37966d = i11;
                                }
                                float f12 = 0.5f * e13Var2.f37968f;
                                int i22 = i11;
                                int i23 = i22;
                                while (true) {
                                    if (i22 < e13Var2.f37964b.size()) {
                                        d13 d13Var3 = (d13) e13Var2.f37964b.get(i22);
                                        i23 += d13Var3.f37592b;
                                        if (i23 >= f12) {
                                            f10 = d13Var3.f37593c;
                                            break;
                                        }
                                        i22++;
                                    } else if (e13Var2.f37964b.isEmpty()) {
                                        f10 = Float.NaN;
                                    } else {
                                        ArrayList arrayList = e13Var2.f37964b;
                                        f10 = ((d13) arrayList.get(arrayList.size() - 1)).f37593c;
                                    }
                                }
                                dc0Var.f37716l = (long) f10;
                            }
                            long j13 = dc0Var.f37713h;
                            long j14 = dc0Var.f37716l;
                            if (i13 == 0 && j13 == 0) {
                                i = i12;
                                if (j14 == dc0Var.f37717m) {
                                    j10 = 0;
                                }
                                dc0Var.f37712g = jElapsedRealtime;
                                dc0Var.f37713h = j10;
                            } else {
                                i = i12;
                            }
                            dc0Var.f37717m = j14;
                            j10 = 0;
                            dc0Var.f37707b.a(i13, j13, j14);
                            dc0Var.f37712g = jElapsedRealtime;
                            dc0Var.f37713h = j10;
                        } else {
                            i = i12;
                        }
                        dc0Var.f37711f--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i12 = i + 1;
            i11 = 0;
        }
        this.f38193d = null;
    }

    public final void e() {
        for (int i = 0; i < this.f38192c; i++) {
            ((u83) this.f38191b.get(i)).getClass();
        }
    }
}

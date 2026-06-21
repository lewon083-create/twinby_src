package yads;

import android.os.Handler;
import android.util.Pair;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s63 f44073a = new s63();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u63 f44074b = new u63();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final se f44075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f44076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f44077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sm1 f44080h;
    public sm1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sm1 f44081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f44083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f44084m;

    public vm1(se seVar, Handler handler) {
        this.f44075c = seVar;
        this.f44076d = handler;
    }

    public final sm1 a() {
        sm1 sm1Var = this.f44080h;
        if (sm1Var == null) {
            return null;
        }
        if (sm1Var == this.i) {
            this.i = sm1Var.f42981l;
        }
        sm1Var.b();
        int i = this.f44082k - 1;
        this.f44082k = i;
        if (i == 0) {
            this.f44081j = null;
            sm1 sm1Var2 = this.f44080h;
            this.f44083l = sm1Var2.f42972b;
            this.f44084m = sm1Var2.f42976f.f43715a.f43369d;
        }
        this.f44080h = this.f44080h.f42981l;
        c();
        return this.f44080h;
    }

    public final void b() {
        if (this.f44082k == 0) {
            return;
        }
        sm1 sm1Var = this.f44080h;
        if (sm1Var == null) {
            throw new IllegalStateException();
        }
        this.f44083l = sm1Var.f42972b;
        this.f44084m = sm1Var.f42976f.f43715a.f43369d;
        while (sm1Var != null) {
            sm1Var.b();
            sm1Var = sm1Var.f42981l;
        }
        this.f44080h = null;
        this.f44081j = null;
        this.i = null;
        this.f44082k = 0;
        c();
    }

    public final void c() {
        n51 n51VarF = r51.f();
        for (sm1 sm1Var = this.f44080h; sm1Var != null; sm1Var = sm1Var.f42981l) {
            n51VarF.a(sm1Var.f42976f.f43715a);
        }
        sm1 sm1Var2 = this.i;
        this.f44076d.post(new q0.o(this, n51VarF, sm1Var2 == null ? null : sm1Var2.f42976f.f43715a, 22));
    }

    public final um1 a(v63 v63Var, sm1 sm1Var, long j10) {
        long j11;
        v63 v63Var2;
        long j12;
        Object obj;
        long j13;
        um1 um1Var = sm1Var.f42976f;
        long j14 = (sm1Var.f42984o + um1Var.f43719e) - j10;
        boolean z5 = false;
        if (um1Var.f43721g) {
            long j15 = 0;
            int iA = v63Var.a(v63Var.a(um1Var.f43715a.f43366a), this.f44073a, this.f44074b, this.f44078f, this.f44079g);
            if (iA == -1) {
                return null;
            }
            int i = v63Var.a(iA, this.f44073a, true).f42825d;
            Object obj2 = this.f44073a.f42824c;
            obj2.getClass();
            long j16 = um1Var.f43715a.f43369d;
            if (v63Var.a(i, this.f44074b, 0L).f43592p == iA) {
                Pair pairA = v63Var.a(this.f44074b, this.f44073a, i, -9223372036854775807L, Math.max(0L, j14));
                if (pairA == null) {
                    return null;
                }
                Object obj3 = pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                sm1 sm1Var2 = sm1Var.f42981l;
                if (sm1Var2 != null && sm1Var2.f42972b.equals(obj3)) {
                    j16 = sm1Var2.f42976f.f43715a.f43369d;
                } else {
                    j16 = this.f44077e;
                    this.f44077e = 1 + j16;
                }
                obj = obj3;
                j13 = jLongValue;
                j15 = -9223372036854775807L;
            } else {
                obj = obj2;
                j13 = 0;
            }
            an1 an1VarA = a(v63Var, obj, j13, j16, this.f44074b, this.f44073a);
            if (j15 != -9223372036854775807L && um1Var.f43717c != -9223372036854775807L) {
                if (v63Var.a(um1Var.f43715a.f43366a, this.f44073a).f42829h.f38023c > 0) {
                    e6 e6Var = this.f44073a.f42829h;
                    if (e6Var.a(e6Var.f38026f).f37637h) {
                        z5 = true;
                    }
                }
                if (an1VarA.a() && z5) {
                    j15 = um1Var.f43717c;
                } else if (z5) {
                    j13 = um1Var.f43717c;
                }
            }
            long j17 = j15;
            v63Var.a(an1VarA.f43366a, this.f44073a);
            if (an1VarA.a()) {
                return a(v63Var, an1VarA.f43366a, an1VarA.f43367b, an1VarA.f43368c, j17, an1VarA.f43369d);
            }
            return a(v63Var, an1VarA.f43366a, j13, j17, an1VarA.f43369d);
        }
        an1 an1Var = um1Var.f43715a;
        v63Var.a(an1Var.f43366a, this.f44073a);
        if (an1Var.a()) {
            int i10 = an1Var.f43367b;
            int i11 = this.f44073a.f42829h.a(i10).f37632c;
            if (i11 == -1) {
                return null;
            }
            int iA2 = this.f44073a.f42829h.a(i10).a(an1Var.f43368c);
            if (iA2 < i11) {
                return a(v63Var, an1Var.f43366a, i10, iA2, um1Var.f43717c, an1Var.f43369d);
            }
            long jLongValue2 = um1Var.f43717c;
            if (jLongValue2 == -9223372036854775807L) {
                u63 u63Var = this.f44074b;
                s63 s63Var = this.f44073a;
                Pair pairA2 = v63Var.a(u63Var, s63Var, s63Var.f42825d, -9223372036854775807L, Math.max(0L, j14));
                v63Var2 = v63Var;
                if (pairA2 == null) {
                    return null;
                }
                jLongValue2 = ((Long) pairA2.second).longValue();
            } else {
                v63Var2 = v63Var;
            }
            Object obj4 = an1Var.f43366a;
            int i12 = an1Var.f43367b;
            v63Var2.a(obj4, this.f44073a);
            long j18 = this.f44073a.f42829h.a(i12).f37631b;
            if (j18 == Long.MIN_VALUE) {
                j12 = this.f44073a.f42826e;
            } else {
                j12 = this.f44073a.f42829h.a(i12).f37636g + j18;
            }
            return a(v63Var, an1Var.f43366a, Math.max(j12, jLongValue2), um1Var.f43717c, an1Var.f43369d);
        }
        int iA3 = this.f44073a.a(an1Var.f43370e);
        if (this.f44073a.f42829h.a(an1Var.f43370e).f37637h) {
            d6 d6VarA = this.f44073a.f42829h.a(an1Var.f43370e);
            if (d6VarA.f37632c != -1 && d6VarA.f37634e[iA3] == 3) {
                z5 = true;
            }
        }
        if (iA3 != this.f44073a.f42829h.a(an1Var.f43370e).f37632c && !z5) {
            return a(v63Var, an1Var.f43366a, an1Var.f43370e, iA3, um1Var.f43719e, an1Var.f43369d);
        }
        Object obj5 = an1Var.f43366a;
        int i13 = an1Var.f43370e;
        v63Var.a(obj5, this.f44073a);
        long j19 = this.f44073a.f42829h.a(i13).f37631b;
        if (j19 == Long.MIN_VALUE) {
            j11 = this.f44073a.f42826e;
        } else {
            j11 = this.f44073a.f42829h.a(i13).f37636g + j19;
        }
        return a(v63Var, an1Var.f43366a, j11, um1Var.f43719e, an1Var.f43369d);
    }

    public final um1 a(v63 v63Var, Object obj, int i, int i10, long j10, long j11) {
        an1 an1Var = new an1(obj, i, i10, j11);
        long jA = v63Var.a(obj, this.f44073a).a(i, i10);
        long jMax = i10 == this.f44073a.a(i) ? this.f44073a.f42829h.f38024d : 0L;
        boolean z5 = this.f44073a.f42829h.a(i).f37637h;
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new um1(an1Var, jMax, j10, -9223372036854775807L, jA, z5, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.um1 a(yads.v63 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.vm1.a(yads.v63, java.lang.Object, long, long, long):yads.um1");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.um1 a(yads.v63 r18, yads.um1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            yads.an1 r3 = r2.f43715a
            boolean r4 = r3.a()
            r5 = 0
            r6 = 1
            r7 = -1
            if (r4 != 0) goto L17
            int r4 = r3.f43370e
            if (r4 != r7) goto L17
            r12 = r6
            goto L18
        L17:
            r12 = r5
        L18:
            boolean r4 = r3.a()
            if (r4 != 0) goto L40
            int r4 = r3.f43370e
            if (r4 != r7) goto L40
            java.lang.Object r4 = r3.f43366a
            yads.s63 r8 = r0.f44073a
            yads.s63 r4 = r1.a(r4, r8)
            int r4 = r4.f42825d
            java.lang.Object r8 = r3.f43366a
            int r8 = r1.a(r8)
            yads.u63 r9 = r0.f44074b
            r10 = 0
            yads.u63 r4 = r1.a(r4, r9, r10)
            int r4 = r4.f43593q
            if (r4 != r8) goto L40
            r13 = r6
            goto L41
        L40:
            r13 = r5
        L41:
            boolean r14 = r0.a(r1, r3, r12)
            yads.an1 r4 = r2.f43715a
            java.lang.Object r4 = r4.f43366a
            yads.s63 r8 = r0.f44073a
            r1.a(r4, r8)
            boolean r1 = r3.a()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L69
            int r1 = r3.f43370e
            if (r1 != r7) goto L5e
            goto L69
        L5e:
            yads.s63 r4 = r0.f44073a
            yads.e6 r4 = r4.f42829h
            yads.d6 r1 = r4.a(r1)
            long r10 = r1.f37631b
            goto L6a
        L69:
            r10 = r8
        L6a:
            boolean r1 = r3.a()
            if (r1 == 0) goto L7b
            yads.s63 r1 = r0.f44073a
            int r4 = r3.f43367b
            int r8 = r3.f43368c
            long r8 = r1.a(r4, r8)
            goto L8c
        L7b:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L88
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L86
            goto L88
        L86:
            r8 = r10
            goto L8c
        L88:
            yads.s63 r1 = r0.f44073a
            long r8 = r1.f42826e
        L8c:
            boolean r1 = r3.a()
            if (r1 == 0) goto L9f
            yads.s63 r1 = r0.f44073a
            int r4 = r3.f43367b
            yads.e6 r1 = r1.f42829h
            yads.d6 r1 = r1.a(r4)
            boolean r5 = r1.f37637h
            goto Lb0
        L9f:
            int r1 = r3.f43370e
            if (r1 == r7) goto Lb0
            yads.s63 r4 = r0.f44073a
            yads.e6 r4 = r4.f42829h
            yads.d6 r1 = r4.a(r1)
            boolean r1 = r1.f37637h
            if (r1 == 0) goto Lb0
            r5 = r6
        Lb0:
            yads.um1 r1 = new yads.um1
            r6 = r3
            long r3 = r2.f43716b
            r18 = r1
            long r0 = r2.f43717c
            r15 = r10
            r9 = r8
            r7 = r15
            r11 = r5
            r2 = r6
            r5 = r0
            r1 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.vm1.a(yads.v63, yads.um1):yads.um1");
    }

    public final boolean a(v63 v63Var, an1 an1Var, boolean z5) {
        int iA = v63Var.a(an1Var.f43366a);
        return !v63Var.a(v63Var.a(iA, this.f44073a, false).f42825d, this.f44074b, 0L).f43586j && v63Var.a(iA, this.f44073a, this.f44074b, this.f44078f, this.f44079g) == -1 && z5;
    }

    public final void a(n51 n51Var, an1 an1Var) {
        se seVar = this.f44075c;
        um2 um2VarA = n51Var.a();
        kb0 kb0Var = (kb0) seVar;
        jb0 jb0Var = kb0Var.f40139d;
        qe2 qe2Var = kb0Var.f40142g;
        qe2Var.getClass();
        jb0Var.getClass();
        jb0Var.f39804b = r51.a((Collection) um2VarA);
        if (!um2VarA.isEmpty()) {
            jb0Var.f39807e = (an1) um2VarA.get(0);
            an1Var.getClass();
            jb0Var.f39808f = an1Var;
        }
        if (jb0Var.f39806d == null) {
            jb0Var.f39806d = jb0.a(qe2Var, jb0Var.f39804b, jb0Var.f39807e, jb0Var.f39803a);
        }
        ao0 ao0Var = (ao0) qe2Var;
        ao0Var.r();
        jb0Var.a(ao0Var.Z.f38095a);
    }

    public final boolean a(sm1 sm1Var) {
        if (sm1Var != null) {
            int i = 0;
            if (sm1Var.equals(this.f44081j)) {
                return false;
            }
            this.f44081j = sm1Var;
            boolean z5 = false;
            while (true) {
                sm1Var = sm1Var.f42981l;
                if (sm1Var == null) {
                    break;
                }
                if (sm1Var == this.i) {
                    this.i = this.f44080h;
                    z5 = true;
                }
                sm1Var.b();
                this.f44082k--;
            }
            sm1 sm1Var2 = this.f44081j;
            if (sm1Var2.f42981l != null) {
                sm1Var2.a();
                sm1Var2.f42981l = null;
                while (true) {
                    w73 w73Var = sm1Var2.f42983n;
                    if (i >= w73Var.f44301a) {
                        break;
                    }
                    boolean zA = w73Var.a(i);
                    pp0 pp0Var = sm1Var2.f42983n.f44303c[i];
                    if (zA && pp0Var != null) {
                        pp0Var.a();
                    }
                    i++;
                }
            }
            c();
            return z5;
        }
        throw new IllegalStateException();
    }

    public static an1 a(v63 v63Var, Object obj, long j10, long j11, u63 u63Var, s63 s63Var) {
        v63Var.a(obj, s63Var);
        v63Var.a(s63Var.f42825d, u63Var, 0L);
        int iA = v63Var.a(obj);
        while (s63Var.f42826e == 0) {
            e6 e6Var = s63Var.f42829h;
            if (e6Var.f38023c <= 0 || !e6Var.a(e6Var.f38026f).f37637h || s63Var.b(0L) != -1) {
                break;
            }
            int i = iA + 1;
            if (iA >= u63Var.f43593q) {
                break;
            }
            v63Var.a(i, s63Var, true);
            obj = s63Var.f42824c;
            obj.getClass();
            iA = i;
        }
        v63Var.a(obj, s63Var);
        int iB = s63Var.b(j10);
        if (iB == -1) {
            return new an1(s63Var.a(j10), j11, obj);
        }
        return new an1(obj, iB, s63Var.a(iB), j11);
    }

    public final an1 a(v63 v63Var, Object obj, long j10) {
        long j11;
        int iA;
        Object obj2 = obj;
        int i = v63Var.a(obj2, this.f44073a).f42825d;
        Object obj3 = this.f44083l;
        if (obj3 != null && (iA = v63Var.a(obj3)) != -1 && v63Var.a(iA, this.f44073a, false).f42825d == i) {
            j11 = this.f44084m;
        } else {
            sm1 sm1Var = this.f44080h;
            while (true) {
                if (sm1Var != null) {
                    if (sm1Var.f42972b.equals(obj2)) {
                        j11 = sm1Var.f42976f.f43715a.f43369d;
                        break;
                    }
                    sm1Var = sm1Var.f42981l;
                } else {
                    sm1 sm1Var2 = this.f44080h;
                    while (true) {
                        if (sm1Var2 != null) {
                            int iA2 = v63Var.a(sm1Var2.f42972b);
                            if (iA2 != -1 && v63Var.a(iA2, this.f44073a, false).f42825d == i) {
                                j11 = sm1Var2.f42976f.f43715a.f43369d;
                                break;
                            }
                            sm1Var2 = sm1Var2.f42981l;
                        } else {
                            j11 = this.f44077e;
                            this.f44077e = 1 + j11;
                            if (this.f44080h == null) {
                                this.f44083l = obj2;
                                this.f44084m = j11;
                            }
                        }
                    }
                }
            }
        }
        long j12 = j11;
        v63Var.a(obj2, this.f44073a);
        v63Var.a(this.f44073a.f42825d, this.f44074b, 0L);
        boolean z5 = false;
        for (int iA3 = v63Var.a(obj); iA3 >= this.f44074b.f43592p; iA3--) {
            v63Var.a(iA3, this.f44073a, true);
            s63 s63Var = this.f44073a;
            boolean z10 = s63Var.f42829h.f38023c > 0;
            z5 |= z10;
            if (s63Var.b(s63Var.f42826e) != -1) {
                obj2 = this.f44073a.f42824c;
                obj2.getClass();
            }
            if (z5 && (!z10 || this.f44073a.f42826e != 0)) {
                break;
            }
        }
        return a(v63Var, obj2, j10, j12, this.f44074b, this.f44073a);
    }

    public final boolean a(v63 v63Var) {
        v63 v63Var2;
        sm1 sm1Var;
        sm1 sm1Var2 = this.f44080h;
        if (sm1Var2 == null) {
            return true;
        }
        int iA = v63Var.a(sm1Var2.f42972b);
        while (true) {
            v63Var2 = v63Var;
            iA = v63Var2.a(iA, this.f44073a, this.f44074b, this.f44078f, this.f44079g);
            while (true) {
                sm1Var = sm1Var2.f42981l;
                if (sm1Var == null || sm1Var2.f42976f.f43721g) {
                    break;
                }
                sm1Var2 = sm1Var;
            }
            if (iA == -1 || sm1Var == null || v63Var2.a(sm1Var.f42972b) != iA) {
                break;
            }
            sm1Var2 = sm1Var;
            v63Var = v63Var2;
        }
        boolean zA = a(sm1Var2);
        sm1Var2.f42976f = a(v63Var2, sm1Var2.f42976f);
        return !zA;
    }

    public final boolean a(v63 v63Var, long j10, long j11) {
        um1 um1VarA;
        um1 um1Var;
        boolean z5;
        um1 um1Var2;
        v63 v63Var2 = v63Var;
        sm1 sm1Var = this.f44080h;
        sm1 sm1Var2 = null;
        while (sm1Var != null) {
            um1 um1Var3 = sm1Var.f42976f;
            if (sm1Var2 == null) {
                um1VarA = a(v63Var2, um1Var3);
            } else {
                um1 um1VarA2 = a(v63Var2, sm1Var2, j10);
                if (um1VarA2 == null) {
                    return !a(sm1Var2);
                }
                if (um1Var3.f43716b != um1VarA2.f43716b || !um1Var3.f43715a.equals(um1VarA2.f43715a)) {
                    return !a(sm1Var2);
                }
                um1VarA = um1VarA2;
            }
            long j12 = um1Var3.f43717c;
            if (j12 == um1VarA.f43717c) {
                um1Var = um1VarA;
                z5 = true;
                um1Var2 = um1Var3;
            } else {
                z5 = true;
                um1Var2 = um1Var3;
                um1Var = new um1(um1VarA.f43715a, um1VarA.f43716b, j12, um1VarA.f43718d, um1VarA.f43719e, um1VarA.f43720f, um1VarA.f43721g, um1VarA.f43722h, um1VarA.i);
            }
            sm1Var.f42976f = um1Var;
            long j13 = um1Var2.f43719e;
            long j14 = um1VarA.f43719e;
            if (j13 != -9223372036854775807L && j13 != j14) {
                rm1 rm1Var = sm1Var.f42971a;
                if (rm1Var instanceof tv) {
                    long j15 = um1Var.f43718d;
                    if (j15 == -9223372036854775807L) {
                        j15 = Long.MIN_VALUE;
                    }
                    tv tvVar = (tv) rm1Var;
                    tvVar.f43449f = 0L;
                    tvVar.f43450g = j15;
                }
                boolean z10 = (sm1Var != this.i || um1Var.f43720f || (j11 != Long.MIN_VALUE && j11 < ((j14 > (-9223372036854775807L) ? 1 : (j14 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : sm1Var.f42984o + j14))) ? false : z5;
                if (a(sm1Var) || z10) {
                    return false;
                }
                return z5;
            }
            sm1Var2 = sm1Var;
            sm1Var = sm1Var.f42981l;
            v63Var2 = v63Var;
        }
        return true;
    }
}

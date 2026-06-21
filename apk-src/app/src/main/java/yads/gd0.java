package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import zl.c1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gd0 implements tk0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f38708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nn0 f38709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x11 f38710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f38711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f38713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38714h;
    public final ed0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ae0 f38715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fd0 f38716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f38717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f38718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f38719n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f38720o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f38721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public pn0 f38722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public zc0 f38723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zc0 f38724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Looper f38725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f38726u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f38727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f38728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public af2 f38729x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile bd0 f38730y;

    public gd0(UUID uuid, nn0 nn0Var, x11 x11Var, HashMap map, boolean z5, int[] iArr, boolean z10, ae0 ae0Var, long j10) {
        ni.a(uuid);
        ni.a("Use C.CLEARKEY_UUID instead", !jr.f39933b.equals(uuid));
        this.f38708b = uuid;
        this.f38709c = nn0Var;
        this.f38710d = x11Var;
        this.f38711e = map;
        this.f38712f = z5;
        this.f38713g = iArr;
        this.f38714h = z10;
        this.f38715j = ae0Var;
        this.i = new ed0();
        this.f38716k = new fd0(this);
        this.f38727v = 0;
        this.f38718m = new ArrayList();
        this.f38719n = oy2.a();
        this.f38720o = oy2.a();
        this.f38717l = j10;
    }

    public final nk0 a(Looper looper, pk0 pk0Var, nx0 nx0Var, boolean z5) {
        ArrayList arrayListA;
        if (this.f38730y == null) {
            this.f38730y = new bd0(this, looper);
        }
        lk0 lk0Var = nx0Var.f41378p;
        int i = 0;
        zc0 zc0Var = null;
        if (lk0Var == null) {
            int iD = jt1.d(nx0Var.f41375m);
            pn0 pn0Var = this.f38722q;
            pn0Var.getClass();
            if (pn0Var.b() != 2 || !vx0.f44218d) {
                int[] iArr = this.f38713g;
                while (true) {
                    if (i >= iArr.length) {
                        break;
                    }
                    if (iArr[i] != iD) {
                        i++;
                    } else if (i != -1 && pn0Var.b() != 1) {
                        zc0 zc0Var2 = this.f38723r;
                        if (zc0Var2 == null) {
                            o51 o51Var = r51.f42498c;
                            zc0 zc0VarA = a(um2.f43723f, true, (pk0) null, z5);
                            this.f38718m.add(zc0VarA);
                            this.f38723r = zc0VarA;
                        } else {
                            zc0Var2.b(null);
                        }
                        return this.f38723r;
                    }
                }
            }
            return null;
        }
        if (this.f38728w == null) {
            arrayListA = a(lk0Var, this.f38708b, false);
            if (arrayListA.isEmpty()) {
                cd0 cd0Var = new cd0(this.f38708b);
                kh1.b("DefaultDrmSessionMgr", kh1.a("DRM error", cd0Var));
                if (pk0Var != null) {
                    pk0Var.a(cd0Var);
                }
                return new tm0(new mk0(cd0Var, 6003));
            }
        } else {
            arrayListA = null;
        }
        if (this.f38712f) {
            Iterator it = this.f38718m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zc0 zc0Var3 = (zc0) it.next();
                if (lb3.a(zc0Var3.f45349a, arrayListA)) {
                    zc0Var = zc0Var3;
                    break;
                }
            }
        } else {
            zc0Var = this.f38724s;
        }
        if (zc0Var != null) {
            zc0Var.b(pk0Var);
            return zc0Var;
        }
        zc0 zc0VarA2 = a((List) arrayListA, false, pk0Var, z5);
        if (!this.f38712f) {
            this.f38724s = zc0VarA2;
        }
        this.f38718m.add(zc0VarA2);
        return zc0VarA2;
    }

    @Override // yads.tk0
    public final nk0 b(pk0 pk0Var, nx0 nx0Var) {
        if (this.f38721p <= 0) {
            throw new IllegalStateException();
        }
        Looper looper = this.f38725t;
        if (looper != null) {
            return a(looper, pk0Var, nx0Var, true);
        }
        throw new IllegalStateException();
    }

    @Override // yads.tk0
    public final void prepare() {
        int i = this.f38721p;
        this.f38721p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f38722q == null) {
            nn0 nn0Var = this.f38709c;
            UUID uuid = this.f38708b;
            ((c1) nn0Var).getClass();
            pn0 pn0VarB = xx0.b(uuid);
            this.f38722q = pn0VarB;
            pn0VarB.a(new ad0(this));
            return;
        }
        if (this.f38717l != -9223372036854775807L) {
            for (int i10 = 0; i10 < this.f38718m.size(); i10++) {
                ((zc0) this.f38718m.get(i10)).b(null);
            }
        }
    }

    @Override // yads.tk0
    public final void release() {
        int i = this.f38721p - 1;
        this.f38721p = i;
        if (i != 0) {
            return;
        }
        if (this.f38717l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f38718m);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((zc0) arrayList.get(i10)).a((pk0) null);
            }
        }
        ma3 it = w51.a(this.f38719n).iterator();
        while (it.hasNext()) {
            ((dd0) it.next()).release();
        }
        if (this.f38722q != null && this.f38721p == 0 && this.f38718m.isEmpty() && this.f38719n.isEmpty()) {
            pn0 pn0Var = this.f38722q;
            pn0Var.getClass();
            pn0Var.release();
            this.f38722q = null;
        }
    }

    public final zc0 a(List list, boolean z5, pk0 pk0Var) {
        this.f38722q.getClass();
        boolean z10 = this.f38714h | z5;
        UUID uuid = this.f38708b;
        pn0 pn0Var = this.f38722q;
        ed0 ed0Var = this.i;
        fd0 fd0Var = this.f38716k;
        int i = this.f38727v;
        byte[] bArr = this.f38728w;
        HashMap map = this.f38711e;
        x11 x11Var = this.f38710d;
        Looper looper = this.f38725t;
        looper.getClass();
        ae0 ae0Var = this.f38715j;
        af2 af2Var = this.f38729x;
        af2Var.getClass();
        zc0 zc0Var = new zc0(uuid, pn0Var, ed0Var, fd0Var, list, i, z10, z5, bArr, map, x11Var, looper, ae0Var, af2Var);
        zc0Var.b(pk0Var);
        if (this.f38717l != -9223372036854775807L) {
            zc0Var.b(null);
        }
        return zc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.zc0 a(java.util.List r10, boolean r11, yads.pk0 r12, boolean r13) {
        /*
            r9 = this;
            yads.zc0 r0 = r9.a(r10, r11, r12)
            int r1 = r0.f45362o
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 19
            r5 = 0
            r6 = 1
            if (r1 != r6) goto L56
            int r1 = yads.lb3.f40466a
            if (r1 < r4) goto L24
            yads.mk0 r1 = r0.c()
            r1.getClass()
            java.lang.Throwable r1 = r1.getCause()
            boolean r1 = r1 instanceof android.media.ResourceBusyException
            if (r1 == 0) goto L56
        L24:
            java.util.Set r1 = r9.f38720o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L56
            java.util.Set r1 = r9.f38720o
            yads.w51 r1 = yads.w51.a(r1)
            yads.ma3 r1 = r1.iterator()
        L36:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L46
            java.lang.Object r7 = r1.next()
            yads.nk0 r7 = (yads.nk0) r7
            r7.a(r5)
            goto L36
        L46:
            r0.a(r12)
            long r7 = r9.f38717l
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 == 0) goto L52
            r0.a(r5)
        L52:
            yads.zc0 r0 = r9.a(r10, r11, r12)
        L56:
            int r1 = r0.f45362o
            if (r1 != r6) goto Lc4
            int r1 = yads.lb3.f40466a
            if (r1 < r4) goto L6d
            yads.mk0 r1 = r0.c()
            r1.getClass()
            java.lang.Throwable r1 = r1.getCause()
            boolean r1 = r1 instanceof android.media.ResourceBusyException
            if (r1 == 0) goto Lc4
        L6d:
            if (r13 == 0) goto Lc4
            java.util.Set r13 = r9.f38719n
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto Lc4
            java.util.Set r13 = r9.f38719n
            yads.w51 r13 = yads.w51.a(r13)
            yads.ma3 r13 = r13.iterator()
        L81:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r13.next()
            yads.dd0 r1 = (yads.dd0) r1
            r1.release()
            goto L81
        L91:
            java.util.Set r13 = r9.f38720o
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto Lb3
            java.util.Set r13 = r9.f38720o
            yads.w51 r13 = yads.w51.a(r13)
            yads.ma3 r13 = r13.iterator()
        La3:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r13.next()
            yads.nk0 r1 = (yads.nk0) r1
            r1.a(r5)
            goto La3
        Lb3:
            r0.a(r12)
            long r6 = r9.f38717l
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 == 0) goto Lbf
            r0.a(r5)
        Lbf:
            yads.zc0 r10 = r9.a(r10, r11, r12)
            return r10
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gd0.a(java.util.List, boolean, yads.pk0, boolean):yads.zc0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        return 0;
     */
    @Override // yads.tk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.nx0 r6) {
        /*
            r5 = this;
            yads.pn0 r0 = r5.f38722q
            r0.getClass()
            int r0 = r0.b()
            yads.lk0 r1 = r6.f41378p
            r2 = 0
            if (r1 != 0) goto L26
            java.lang.String r6 = r6.f41375m
            int r6 = yads.jt1.d(r6)
            int[] r1 = r5.f38713g
            r3 = r2
        L17:
            int r4 = r1.length
            if (r3 >= r4) goto L25
            r4 = r1[r3]
            if (r4 != r6) goto L22
            r6 = -1
            if (r3 == r6) goto L25
            goto L8a
        L22:
            int r3 = r3 + 1
            goto L17
        L25:
            return r2
        L26:
            byte[] r6 = r5.f38728w
            if (r6 == 0) goto L2b
            goto L8a
        L2b:
            java.util.UUID r6 = r5.f38708b
            r3 = 1
            java.util.ArrayList r6 = a(r1, r6, r3)
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L5d
            int r6 = r1.f40567e
            if (r6 != r3) goto L89
            yads.kk0[] r6 = r1.f40564b
            r6 = r6[r2]
            java.util.UUID r2 = yads.jr.f39933b
            boolean r6 = r6.a(r2)
            if (r6 == 0) goto L89
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r6.<init>(r2)
            java.util.UUID r2 = r5.f38708b
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "DefaultDrmSessionMgr"
            yads.kh1.d(r2, r6)
        L5d:
            java.lang.String r6 = r1.f40566d
            if (r6 == 0) goto L8a
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L6a
            goto L8a
        L6a:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L79
            int r6 = yads.lb3.f40466a
            r1 = 25
            if (r6 < r1) goto L89
            goto L8a
        L79:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L89
            java.lang.String r1 = "cens"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L8a
        L89:
            return r3
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gd0.a(yads.nx0):int");
    }

    @Override // yads.tk0
    public final sk0 a(pk0 pk0Var, nx0 nx0Var) {
        if (this.f38721p > 0) {
            if (this.f38725t != null) {
                dd0 dd0Var = new dd0(this, pk0Var);
                dd0Var.a(nx0Var);
                return dd0Var;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // yads.tk0
    public final void a(Looper looper, af2 af2Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.f38725t;
                if (looper2 == null) {
                    this.f38725t = looper;
                    this.f38726u = new Handler(looper);
                } else if (looper2 == looper) {
                    this.f38726u.getClass();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f38729x = af2Var;
    }

    public static ArrayList a(lk0 lk0Var, UUID uuid, boolean z5) {
        ArrayList arrayList = new ArrayList(lk0Var.f40567e);
        for (int i = 0; i < lk0Var.f40567e; i++) {
            kk0 kk0Var = lk0Var.f40564b[i];
            if ((kk0Var.a(uuid) || (jr.f39934c.equals(uuid) && kk0Var.a(jr.f39933b))) && (kk0Var.f40226f != null || z5)) {
                arrayList.add(kk0Var);
            }
        }
        return arrayList;
    }
}

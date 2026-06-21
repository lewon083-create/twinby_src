package yads;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import zl.c1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zc0 implements nk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pn0 f45350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tc0 f45351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc0 f45352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f45354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f45355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f45356h;
    public final a00 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ae0 f45357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final af2 f45358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x11 f45359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UUID f45360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xc0 f45361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HandlerThread f45364q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public vc0 f45365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k20 f45366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public mk0 f45367t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f45368u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f45369v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ln0 f45370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public on0 f45371x;

    public zc0(UUID uuid, pn0 pn0Var, ed0 ed0Var, fd0 fd0Var, List list, int i, boolean z5, boolean z10, byte[] bArr, HashMap map, x11 x11Var, Looper looper, ae0 ae0Var, af2 af2Var) {
        if (i == 1 || i == 3) {
            ni.a(bArr);
        }
        this.f45360m = uuid;
        this.f45351c = ed0Var;
        this.f45352d = fd0Var;
        this.f45350b = pn0Var;
        this.f45353e = i;
        this.f45354f = z5;
        this.f45355g = z10;
        if (bArr != null) {
            this.f45369v = bArr;
            this.f45349a = null;
        } else {
            this.f45349a = Collections.unmodifiableList((List) ni.a(list));
        }
        this.f45356h = map;
        this.f45359l = x11Var;
        this.i = new a00();
        this.f45357j = ae0Var;
        this.f45358k = af2Var;
        this.f45362o = 2;
        this.f45361n = new xc0(this, looper);
    }

    public final void a(iz izVar) {
        Set set;
        a00 a00Var = this.i;
        synchronized (a00Var.f36595b) {
            set = a00Var.f36597d;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            izVar.accept((pk0) it.next());
        }
    }

    @Override // yads.nk0
    public final void b(pk0 pk0Var) {
        if (this.f45363p < 0) {
            kh1.b("DefaultDrmSession", "Session reference count less than zero: " + this.f45363p);
            this.f45363p = 0;
        }
        if (pk0Var != null) {
            a00 a00Var = this.i;
            synchronized (a00Var.f36595b) {
                try {
                    ArrayList arrayList = new ArrayList(a00Var.f36598e);
                    arrayList.add(pk0Var);
                    a00Var.f36598e = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) a00Var.f36596c.get(pk0Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(a00Var.f36597d);
                        hashSet.add(pk0Var);
                        a00Var.f36597d = Collections.unmodifiableSet(hashSet);
                    }
                    a00Var.f36596c.put(pk0Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.f45363p + 1;
        this.f45363p = i;
        if (i == 1) {
            if (this.f45362o != 2) {
                throw new IllegalStateException();
            }
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f45364q = handlerThread;
            handlerThread.start();
            this.f45365r = new vc0(this, this.f45364q.getLooper());
            if (f()) {
                a(true);
            }
        } else if (pk0Var != null && e() && this.i.a(pk0Var) == 1) {
            pk0Var.a(this.f45362o);
        }
        fd0 fd0Var = (fd0) this.f45352d;
        gd0 gd0Var = fd0Var.f38417a;
        if (gd0Var.f38717l != -9223372036854775807L) {
            gd0Var.f38720o.remove(this);
            Handler handler = fd0Var.f38417a.f38726u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // yads.nk0
    public final mk0 c() {
        if (this.f45362o == 1) {
            return this.f45367t;
        }
        return null;
    }

    @Override // yads.nk0
    public final k20 d() {
        return this.f45366s;
    }

    public final boolean e() {
        int i = this.f45362o;
        return i == 3 || i == 4;
    }

    public final boolean f() {
        if (e()) {
            return true;
        }
        try {
            byte[] bArrC = this.f45350b.c();
            this.f45368u = bArrC;
            this.f45350b.a(bArrC, this.f45358k);
            this.f45366s = this.f45350b.d(this.f45368u);
            this.f45362o = 3;
            a(new c1(4));
            this.f45368u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ed0 ed0Var = (ed0) this.f45351c;
            ed0Var.f38071a.add(this);
            if (ed0Var.f38072b == null) {
                ed0Var.f38072b = this;
                on0 on0VarA = this.f45350b.a();
                this.f45371x = on0VarA;
                vc0 vc0Var = this.f45365r;
                int i = lb3.f40466a;
                on0VarA.getClass();
                vc0Var.getClass();
                vc0Var.obtainMessage(0, new wc0(xf1.f44686a.getAndIncrement(), true, SystemClock.elapsedRealtime(), on0VarA)).sendToTarget();
            }
            return false;
        } catch (Exception e3) {
            a(1, e3);
            return false;
        }
    }

    public final Map g() {
        byte[] bArr = this.f45368u;
        if (bArr == null) {
            return null;
        }
        return this.f45350b.a(bArr);
    }

    @Override // yads.nk0
    public final int getState() {
        return this.f45362o;
    }

    public final void a(boolean z5) {
        Pair pair;
        String str;
        long jMin;
        if (this.f45355g) {
            return;
        }
        byte[] bArr = this.f45368u;
        int i = lb3.f40466a;
        int i10 = this.f45353e;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f45369v.getClass();
                this.f45368u.getClass();
                a(this.f45369v, 3, z5);
                return;
            }
            byte[] bArr2 = this.f45369v;
            if (bArr2 != null) {
                try {
                    this.f45350b.a(bArr, bArr2);
                } catch (Exception e3) {
                    a(1, e3);
                    return;
                }
            }
            a(bArr, 2, z5);
            return;
        }
        byte[] bArr3 = this.f45369v;
        if (bArr3 == null) {
            a(bArr, 1, z5);
            return;
        }
        if (this.f45362o != 4) {
            try {
                this.f45350b.a(bArr, bArr3);
            } catch (Exception e7) {
                a(1, e7);
                return;
            }
        }
        if (jr.f39935d.equals(this.f45360m)) {
            Map mapG = g();
            if (mapG == null) {
                pair = null;
            } else {
                long j10 = -9223372036854775807L;
                try {
                    str = (String) mapG.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j11 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j11);
                try {
                    String str2 = (String) mapG.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j10 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j10));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (this.f45353e == 0 && jMin <= 60) {
            kh1.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            a(bArr, 2, z5);
            return;
        }
        if (jMin <= 0) {
            a(2, new ne1());
        } else {
            this.f45362o = 4;
            a(new c1(7));
        }
    }

    @Override // yads.nk0
    public final UUID b() {
        return this.f45360m;
    }

    public final void a(Object obj, Object obj2) {
        if (obj == this.f45370w && e()) {
            this.f45370w = null;
            if (obj2 instanceof Exception) {
                Exception exc = (Exception) obj2;
                if (exc instanceof NotProvisionedException) {
                    ed0 ed0Var = (ed0) this.f45351c;
                    ed0Var.f38071a.add(this);
                    if (ed0Var.f38072b != null) {
                        return;
                    }
                    ed0Var.f38072b = this;
                    on0 on0VarA = this.f45350b.a();
                    this.f45371x = on0VarA;
                    vc0 vc0Var = this.f45365r;
                    int i = lb3.f40466a;
                    on0VarA.getClass();
                    vc0Var.getClass();
                    vc0Var.obtainMessage(0, new wc0(xf1.f44686a.getAndIncrement(), true, SystemClock.elapsedRealtime(), on0VarA)).sendToTarget();
                    return;
                }
                a(2, exc);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f45353e == 3) {
                    pn0 pn0Var = this.f45350b;
                    byte[] bArr2 = this.f45369v;
                    int i10 = lb3.f40466a;
                    pn0Var.b(bArr2, bArr);
                    a(new c1(5));
                    return;
                }
                byte[] bArrB = this.f45350b.b(this.f45368u, bArr);
                int i11 = this.f45353e;
                if ((i11 == 2 || (i11 == 0 && this.f45369v != null)) && bArrB != null && bArrB.length != 0) {
                    this.f45369v = bArrB;
                }
                this.f45362o = 4;
                a(new c1(6));
            } catch (Exception e3) {
                if (e3 instanceof NotProvisionedException) {
                    ed0 ed0Var2 = (ed0) this.f45351c;
                    ed0Var2.f38071a.add(this);
                    if (ed0Var2.f38072b != null) {
                        return;
                    }
                    ed0Var2.f38072b = this;
                    on0 on0VarA2 = this.f45350b.a();
                    this.f45371x = on0VarA2;
                    vc0 vc0Var2 = this.f45365r;
                    int i12 = lb3.f40466a;
                    on0VarA2.getClass();
                    vc0Var2.getClass();
                    vc0Var2.obtainMessage(0, new wc0(xf1.f44686a.getAndIncrement(), true, SystemClock.elapsedRealtime(), on0VarA2)).sendToTarget();
                    return;
                }
                a(1, e3);
            }
        }
    }

    @Override // yads.nk0
    public final boolean a() {
        return this.f45354f;
    }

    public final void a(byte[] bArr, int i, boolean z5) {
        try {
            ln0 ln0VarA = this.f45350b.a(bArr, this.f45349a, i, this.f45356h);
            this.f45370w = ln0VarA;
            vc0 vc0Var = this.f45365r;
            int i10 = lb3.f40466a;
            ln0VarA.getClass();
            vc0Var.getClass();
            vc0Var.obtainMessage(1, new wc0(xf1.f44686a.getAndIncrement(), z5, SystemClock.elapsedRealtime(), ln0VarA)).sendToTarget();
        } catch (Exception e3) {
            if (e3 instanceof NotProvisionedException) {
                ed0 ed0Var = (ed0) this.f45351c;
                ed0Var.f38071a.add(this);
                if (ed0Var.f38072b != null) {
                    return;
                }
                ed0Var.f38072b = this;
                on0 on0VarA = this.f45350b.a();
                this.f45371x = on0VarA;
                vc0 vc0Var2 = this.f45365r;
                int i11 = lb3.f40466a;
                on0VarA.getClass();
                vc0Var2.getClass();
                vc0Var2.obtainMessage(0, new wc0(xf1.f44686a.getAndIncrement(), true, SystemClock.elapsedRealtime(), on0VarA)).sendToTarget();
                return;
            }
            a(1, e3);
        }
    }

    @Override // yads.nk0
    public final void a(pk0 pk0Var) {
        int i = this.f45363p;
        if (i <= 0) {
            kh1.b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i - 1;
        this.f45363p = i10;
        if (i10 == 0) {
            this.f45362o = 0;
            xc0 xc0Var = this.f45361n;
            int i11 = lb3.f40466a;
            xc0Var.removeCallbacksAndMessages(null);
            vc0 vc0Var = this.f45365r;
            synchronized (vc0Var) {
                vc0Var.removeCallbacksAndMessages(null);
                vc0Var.f43994a = true;
            }
            this.f45365r = null;
            this.f45364q.quit();
            this.f45364q = null;
            this.f45366s = null;
            this.f45367t = null;
            this.f45370w = null;
            this.f45371x = null;
            byte[] bArr = this.f45368u;
            if (bArr != null) {
                this.f45350b.b(bArr);
                this.f45368u = null;
            }
        }
        if (pk0Var != null) {
            this.i.b(pk0Var);
            if (this.i.a(pk0Var) == 0) {
                pk0Var.d();
            }
        }
        ((fd0) this.f45352d).a(this, this.f45363p);
    }

    @Override // yads.nk0
    public final boolean a(String str) {
        pn0 pn0Var = this.f45350b;
        byte[] bArr = this.f45368u;
        if (bArr != null) {
            return pn0Var.a(str, bArr);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r6, java.lang.Exception r7) {
        /*
            r5 = this;
            yads.mk0 r0 = new yads.mk0
            int r1 = yads.lb3.f40466a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = yads.vk0.a(r7)
            if (r2 == 0) goto L14
            int r6 = yads.vk0.b(r7)
            goto L5a
        L14:
            r2 = 23
            if (r1 < r2) goto L1f
            boolean r2 = yads.wk0.a(r7)
            if (r2 == 0) goto L1f
            goto L4c
        L1f:
            r2 = 18
            if (r1 < r2) goto L2a
            boolean r4 = yads.uk0.b(r7)
            if (r4 == 0) goto L2a
            goto L58
        L2a:
            if (r1 < r2) goto L35
            boolean r1 = yads.uk0.a(r7)
            if (r1 == 0) goto L35
            r6 = 6007(0x1777, float:8.418E-42)
            goto L5a
        L35:
            boolean r1 = r7 instanceof yads.oa3
            if (r1 == 0) goto L3c
            r6 = 6001(0x1771, float:8.409E-42)
            goto L5a
        L3c:
            boolean r1 = r7 instanceof yads.cd0
            if (r1 == 0) goto L43
            r6 = 6003(0x1773, float:8.412E-42)
            goto L5a
        L43:
            boolean r1 = r7 instanceof yads.ne1
            if (r1 == 0) goto L4a
            r6 = 6008(0x1778, float:8.419E-42)
            goto L5a
        L4a:
            if (r6 != r3) goto L4f
        L4c:
            r6 = 6006(0x1776, float:8.416E-42)
            goto L5a
        L4f:
            r1 = 2
            if (r6 != r1) goto L55
            r6 = 6004(0x1774, float:8.413E-42)
            goto L5a
        L55:
            r1 = 3
            if (r6 != r1) goto L7c
        L58:
            r6 = 6002(0x1772, float:8.41E-42)
        L5a:
            r0.<init>(r7, r6)
            r5.f45367t = r0
            java.lang.String r6 = "DRM session error"
            java.lang.String r6 = yads.kh1.a(r6, r7)
            java.lang.String r0 = "DefaultDrmSession"
            yads.kh1.b(r0, r6)
            yi.f0 r6 = new yi.f0
            r0 = 20
            r6.<init>(r0, r7)
            r5.a(r6)
            int r6 = r5.f45362o
            r7 = 4
            if (r6 == r7) goto L7b
            r5.f45362o = r3
        L7b:
            return
        L7c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zc0.a(int, java.lang.Exception):void");
    }
}

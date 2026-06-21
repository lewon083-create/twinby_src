package l4;

import ad.a1;
import ad.b1;
import ad.j0;
import ad.w;
import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.measurement.h5;
import fh.of;
import i4.j1;
import j3.p0;
import j3.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import m3.z;
import s3.e0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a1 f27901k = new w(new d2.a(5));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f27902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f27903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final of f27904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f27905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f27906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b7 f27907h;
    public j3.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f27908j;

    public p(Context context) {
        of ofVar = new of();
        j jVar = j.F;
        this.f27902c = new Object();
        this.f27903d = context != null ? context.getApplicationContext() : null;
        this.f27904e = ofVar;
        if (jVar != null) {
            this.f27905f = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.a(jVar);
            this.f27905f = new j(iVar);
        }
        this.i = j3.d.f26224c;
        if (this.f27905f.A && context == null) {
            m3.b.s("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int b(j3.o oVar, j0 j0Var) {
        for (int i = 0; i < j0Var.size(); i++) {
            for (int i10 = 0; i10 < oVar.f26325c.size(); i10++) {
                if (((j3.p) oVar.f26325c.get(i10)).f26350b.equals(j0Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void c(j1 j1Var, j jVar, HashMap map) {
        for (int i = 0; i < j1Var.f20935a; i++) {
            q0 q0Var = (q0) jVar.f26384u.get(j1Var.a(i));
            if (q0Var != null) {
                p0 p0Var = q0Var.f26357a;
                q0 q0Var2 = (q0) map.get(Integer.valueOf(p0Var.f26353c));
                if (q0Var2 == null || (q0Var2.f26358b.isEmpty() && !q0Var.f26358b.isEmpty())) {
                    map.put(Integer.valueOf(p0Var.f26353c), q0Var);
                }
            }
        }
    }

    public static int d(j3.o oVar, String str, boolean z5) {
        if (!TextUtils.isEmpty(str) && str.equals(oVar.f26326d)) {
            return 4;
        }
        String strF = f(str);
        String strF2 = f(oVar.f26326d);
        if (strF2 == null || strF == null) {
            return (z5 && strF2 == null) ? 1 : 0;
        }
        if (strF2.startsWith(strF) || strF.startsWith(strF2)) {
            return 3;
        }
        String str2 = z.f28608a;
        return strF2.split("-", 2)[0].equals(strF.split("-", 2)[0]) ? 2 : 0;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair g(int i, t tVar, int[][][] iArr, m mVar, Comparator comparator) {
        int i10;
        RandomAccess randomAccessW;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i11 = tVar2.f27911a;
        int i12 = 0;
        while (i12 < i11) {
            if (i == tVar2.f27912b[i12]) {
                j1 j1Var = tVar2.f27913c[i12];
                for (int i13 = 0; i13 < j1Var.f20935a; i13++) {
                    p0 p0VarA = j1Var.a(i13);
                    b1 b1VarD = mVar.d(i12, p0VarA, iArr[i12][i13]);
                    int i14 = p0VarA.f26351a;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        n nVar = (n) b1VarD.get(i15);
                        int iA = nVar.a();
                        if (zArr[i15] || iA == 0) {
                            i10 = i11;
                        } else {
                            if (iA == 1) {
                                randomAccessW = j0.w(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    n nVar2 = (n) b1VarD.get(i16);
                                    int i17 = i11;
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    i11 = i17;
                                }
                                randomAccessW = arrayList2;
                            }
                            i10 = i11;
                            arrayList.add(randomAccessW);
                        }
                        i15++;
                        i11 = i10;
                    }
                }
            }
            i12++;
            tVar2 = tVar;
            i11 = i11;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((n) list.get(i18)).f27881d;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.f27880c, iArr2), Integer.valueOf(nVar3.f27879b));
    }

    @Override // l4.u
    public final void a() {
        b7 b7Var;
        k kVar;
        synchronized (this.f27902c) {
            try {
                Thread thread = this.f27906g;
                if (thread != null) {
                    h5.q("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (b7Var = this.f27907h) != null) {
            Handler handler = (Handler) b7Var.f3659d;
            Spatializer spatializer = (Spatializer) b7Var.f3658c;
            if (spatializer != null && (kVar = (k) b7Var.f3660e) != null && handler != null) {
                spatializer.removeOnSpatializerStateChangedListener(kVar);
                handler.removeCallbacksAndMessages(null);
            }
            this.f27907h = null;
        }
        this.f27917a = null;
        this.f27918b = null;
    }

    public final void e() {
        boolean z5;
        e0 e0Var;
        b7 b7Var;
        synchronized (this.f27902c) {
            try {
                z5 = this.f27905f.A && Build.VERSION.SDK_INT >= 32 && (b7Var = this.f27907h) != null && b7Var.f3657b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z5 || (e0Var = this.f27917a) == null) {
            return;
        }
        e0Var.i.e(10);
    }

    public final void h(j jVar) {
        boolean zEquals;
        synchronized (this.f27902c) {
            zEquals = this.f27905f.equals(jVar);
            this.f27905f = jVar;
        }
        if (zEquals) {
            return;
        }
        if (jVar.A && this.f27903d == null) {
            m3.b.s("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        e0 e0Var = this.f27917a;
        if (e0Var != null) {
            e0Var.i.e(10);
        }
    }
}

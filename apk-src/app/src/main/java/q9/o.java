package q9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements md.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f31946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f31947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f31948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f31949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f31950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f31951f;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f31946a = obj;
        this.f31947b = obj2;
        this.f31948c = obj3;
        this.f31949d = obj4;
        this.f31950e = obj5;
        this.f31951f = obj6;
    }

    public static i4.c0 k(j3.j0 j0Var, ad.j0 j0Var2, i4.c0 c0Var, j3.m0 m0Var) {
        s3.y yVar = (s3.y) j0Var;
        j3.o0 o0VarM = yVar.M();
        int iJ = yVar.J();
        Object objL = o0VarM.p() ? null : o0VarM.l(iJ);
        int iB = (yVar.S() || o0VarM.p()) ? -1 : o0VarM.f(iJ, m0Var, false).b(m3.z.M(yVar.K()) - m0Var.f26278e);
        for (int i = 0; i < j0Var2.size(); i++) {
            i4.c0 c0Var2 = (i4.c0) j0Var2.get(i);
            if (n(c0Var2, objL, yVar.S(), yVar.G(), yVar.H(), iB)) {
                return c0Var2;
            }
        }
        if (j0Var2.isEmpty() && c0Var != null && n(c0Var, objL, yVar.S(), yVar.G(), yVar.H(), iB)) {
            return c0Var;
        }
        return null;
    }

    public static boolean n(i4.c0 c0Var, Object obj, boolean z5, int i, int i10, int i11) {
        Object obj2 = c0Var.f20861a;
        int i12 = c0Var.f20862b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z5 && i12 == i && c0Var.f20863c == i10) {
            return true;
        }
        return !z5 && i12 == -1 && c0Var.f20865e == i11;
    }

    public static void r(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        r rVar = r.f31959g;
        u9.d dVar = rVar.f31960a;
        String str2 = rVar.f31963d.f34365b;
        dVar.getClass();
        u9.d.a(context, str2, bundle, new r3.b(21, dVar, context));
    }

    @Override // md.c
    public Object a(Class cls) {
        if (((Set) this.f31946a).contains(md.q.a(cls))) {
            Object objA = ((md.c) this.f31951f).a(cls);
            return !cls.equals(vd.c.class) ? objA : new md.r((Set) this.f31950e, (vd.c) objA);
        }
        throw new oc("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // md.c
    public Object b(md.q qVar) {
        if (((Set) this.f31946a).contains(qVar)) {
            return ((md.c) this.f31951f).b(qVar);
        }
        throw new oc("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // md.c
    public yd.a c(md.q qVar) {
        if (((Set) this.f31949d).contains(qVar)) {
            return ((md.c) this.f31951f).c(qVar);
        }
        throw new oc("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.");
    }

    @Override // md.c
    public yd.a d(Class cls) {
        return f(md.q.a(cls));
    }

    @Override // md.c
    public Set e(md.q qVar) {
        if (((Set) this.f31948c).contains(qVar)) {
            return ((md.c) this.f31951f).e(qVar);
        }
        throw new oc("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // md.c
    public yd.a f(md.q qVar) {
        if (((Set) this.f31947b).contains(qVar)) {
            return ((md.c) this.f31951f).f(qVar);
        }
        throw new oc("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    public void g(String str, String str2) {
        HashMap map = (HashMap) this.f31951f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public void h(ad.m0 m0Var, i4.c0 c0Var, j3.o0 o0Var) {
        if (c0Var == null) {
            return;
        }
        if (o0Var.b(c0Var.f20861a) != -1) {
            m0Var.n(c0Var, o0Var);
            return;
        }
        j3.o0 o0Var2 = (j3.o0) ((ad.g1) this.f31948c).get(c0Var);
        if (o0Var2 != null) {
            m0Var.n(c0Var, o0Var2);
        }
    }

    public y8.i i() {
        String strX = ((String) this.f31946a) == null ? " transportName" : "";
        if (((y8.m) this.f31948c) == null) {
            strX = strX.concat(" encodedPayload");
        }
        if (((Long) this.f31949d) == null) {
            strX = om1.x(strX, " eventMillis");
        }
        if (((Long) this.f31950e) == null) {
            strX = om1.x(strX, " uptimeMillis");
        }
        if (((HashMap) this.f31951f) == null) {
            strX = om1.x(strX, " autoMetadata");
        }
        if (strX.isEmpty()) {
            return new y8.i((String) this.f31946a, (Integer) this.f31947b, (y8.m) this.f31948c, ((Long) this.f31949d).longValue(), ((Long) this.f31950e).longValue(), (HashMap) this.f31951f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strX));
    }

    public Task j(Task task) {
        return task.e(new com.yandex.div.core.dagger.b(1), new bg.a(this));
    }

    public ArrayList l() {
        ArrayList arrayList;
        synchronized (this.f31947b) {
            arrayList = new ArrayList((LinkedHashSet) this.f31948c);
        }
        return arrayList;
    }

    public ArrayList m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.f31947b) {
            arrayList = new ArrayList();
            arrayList.addAll(l());
            synchronized (this.f31947b) {
                arrayList2 = new ArrayList((LinkedHashSet) this.f31950e);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public void o(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zE;
        int i10;
        PackageInfo packageInfoC;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        fd.g gVar = (fd.g) this.f31946a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f16760c.f16773b);
        ac.i iVar = (ac.i) this.f31947b;
        synchronized (iVar) {
            try {
                if (iVar.f755a == 0 && (packageInfoC = iVar.c("com.google.android.gms")) != null) {
                    iVar.f755a = packageInfoC.versionCode;
                }
                i = iVar.f755a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((ac.i) this.f31947b).a());
        ac.i iVar2 = (ac.i) this.f31947b;
        synchronized (iVar2) {
            try {
                if (((String) iVar2.f759e) == null) {
                    iVar2.j();
                }
                str3 = (String) iVar2.f759e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        fd.g gVar2 = (fd.g) this.f31946a;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f16759b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((zd.a) b4.b(((zd.c) ((zd.d) this.f31951f)).d())).f46244a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e3) {
            e = e3;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e7) {
            e = e7;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) b4.b(((zd.c) ((zd.d) this.f31951f)).c()));
        bundle.putString("cliv", "fcm-25.0.1");
        wd.f fVar = (wd.f) ((yd.a) this.f31950e).get();
        fe.b bVar = (fe.b) ((yd.a) this.f31949d).get();
        if (fVar == null || bVar == null) {
            return;
        }
        wd.c cVar = (wd.c) fVar;
        synchronized (cVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            wd.i iVar3 = (wd.i) cVar.f35235a.get();
            synchronized (iVar3) {
                zE = iVar3.e(wd.i.f35245b, jCurrentTimeMillis);
            }
            if (zE) {
                synchronized (iVar3) {
                    iVar3.f35248a.a(new fj.s0(2, iVar3, iVar3.b(System.currentTimeMillis())));
                }
                i10 = 3;
            } else {
                i10 = 1;
            }
        }
        if (i10 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(t.z.m(i10)));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    public Task p(String str, String str2, Bundle bundle) {
        int i;
        try {
            o(str, str2, bundle);
            la.b bVar = (la.b) this.f31948c;
            la.h hVar = la.h.f28078d;
            b8.a aVar = bVar.f28065c;
            if (aVar.l() < 12000000) {
                return aVar.m() != 0 ? bVar.a(bundle).f(hVar, new l6.i(2, bVar, bundle)) : b4.q(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            la.m mVarL = la.m.l(bVar.f28064b);
            synchronized (mVarL) {
                i = mVarL.f28098c;
                mVarL.f28098c = i + 1;
            }
            return mVarL.n(new la.l(i, 1, bundle, 1)).e(hVar, la.d.f28071c);
        } catch (InterruptedException | ExecutionException e3) {
            return b4.q(e3);
        }
    }

    public void q(j3.o0 o0Var) {
        ad.m0 m0Var = new ad.m0(4, 0);
        if (((ad.j0) this.f31947b).isEmpty()) {
            h(m0Var, (i4.c0) this.f31950e, o0Var);
            if (!Objects.equals((i4.c0) this.f31951f, (i4.c0) this.f31950e)) {
                h(m0Var, (i4.c0) this.f31951f, o0Var);
            }
            if (!Objects.equals((i4.c0) this.f31949d, (i4.c0) this.f31950e) && !Objects.equals((i4.c0) this.f31949d, (i4.c0) this.f31951f)) {
                h(m0Var, (i4.c0) this.f31949d, o0Var);
            }
        } else {
            for (int i = 0; i < ((ad.j0) this.f31947b).size(); i++) {
                h(m0Var, (i4.c0) ((ad.j0) this.f31947b).get(i), o0Var);
            }
            if (!((ad.j0) this.f31947b).contains((i4.c0) this.f31949d)) {
                h(m0Var, (i4.c0) this.f31949d, o0Var);
            }
        }
        this.f31948c = m0Var.d(true);
    }

    public o(String str, String str2, Set set) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f31946a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f31948c = str;
        this.f31949d = str2;
        this.f31950e = pb.a.f31454b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw om1.i(it);
        }
        this.f31947b = Collections.unmodifiableSet(hashSet);
    }
}

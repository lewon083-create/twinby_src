package fd;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.ads.om1;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import md.m;
import nd.k;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f16756k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h1.e f16757l = new h1.e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f16760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final md.f f16761d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f16764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yd.a f16765h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f16762e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f16763f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f16766j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, i iVar, String str) {
        ?? arrayList;
        int i = 0;
        this.f16758a = context;
        c0.f(str);
        this.f16759b = str;
        this.f16760c = iVar;
        a aVar = FirebaseInitProvider.f14907b;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new md.d(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f29327b;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i10 = 1;
        arrayList3.add(new md.d(i10, new FirebaseCommonRegistrar()));
        arrayList3.add(new md.d(i10, new ExecutorsRegistrar()));
        arrayList4.add(md.b.c(context, Context.class, new Class[0]));
        arrayList4.add(md.b.c(this, g.class, new Class[0]));
        arrayList4.add(md.b.c(iVar, i.class, new Class[0]));
        le.a aVar2 = new le.a(i);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.f14908c.get()) {
            arrayList4.add(md.b.c(aVar, a.class, new Class[0]));
        }
        md.f fVar = new md.f(arrayList3, arrayList4, aVar2);
        this.f16761d = fVar;
        Trace.endSection();
        this.f16764g = new m(new c(i, this, context));
        this.f16765h = fVar.d(wd.c.class);
        d dVar = new d(this);
        a();
        if (this.f16762e.get()) {
            oa.c.f29825f.f29826b.get();
        }
        this.i.add(dVar);
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f16756k) {
            try {
                for (g gVar : (h1.d) f16757l.values()) {
                    gVar.a();
                    arrayList.add(gVar.f16759b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static g e() {
        g gVar;
        synchronized (f16756k) {
            try {
                gVar = (g) f16757l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ua.b.f() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((wd.c) gVar.f16765h.get()).b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(String str) {
        g gVar;
        String str2;
        synchronized (f16756k) {
            try {
                gVar = (g) f16757l.get(str.trim());
                if (gVar == null) {
                    ArrayList arrayListD = d();
                    if (arrayListD.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListD);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((wd.c) gVar.f16765h.get()).b();
            } finally {
            }
        }
        return gVar;
    }

    public static g i(Context context) {
        synchronized (f16756k) {
            try {
                if (f16757l.containsKey("[DEFAULT]")) {
                    return e();
                }
                i iVarA = i.a(context);
                if (iVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return j(context, iVarA, "[DEFAULT]");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g j(Context context, i iVar, String str) {
        g gVar;
        AtomicReference atomicReference = e.f16753a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f16753a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        oa.c.b(application);
                        oa.c.f29825f.a(eVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f16756k) {
            h1.e eVar2 = f16757l;
            c0.k("FirebaseApp name " + strTrim + " already exists!", !eVar2.containsKey(strTrim));
            c0.j(context, "Application context cannot be null.");
            gVar = new g(context, iVar, strTrim);
            eVar2.put(strTrim, gVar);
        }
        gVar.h();
        return gVar;
    }

    public final void a() {
        c0.k("FirebaseApp was deleted", !this.f16763f.get());
    }

    public final void b() {
        if (this.f16763f.compareAndSet(false, true)) {
            synchronized (f16756k) {
                f16757l.remove(this.f16759b);
            }
            Iterator it = this.f16766j.iterator();
            if (it.hasNext()) {
                throw om1.i(it);
            }
        }
    }

    public final Object c(Class cls) {
        a();
        return this.f16761d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f16759b.equals(gVar.f16759b);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f16759b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f16760c.f16773b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void h() {
        HashMap map;
        if (!((UserManager) this.f16758a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f16759b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f16758a;
            AtomicReference atomicReference = f.f16754b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f16759b);
        Log.i("FirebaseApp", sb3.toString());
        md.f fVar2 = this.f16761d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f16759b);
        AtomicReference atomicReference2 = fVar2.f28846f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (fVar2) {
                    map = new HashMap(fVar2.f28841a);
                }
                fVar2.g(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((wd.c) this.f16765h.get()).b();
    }

    public final int hashCode() {
        return this.f16759b.hashCode();
    }

    public final boolean k() {
        boolean z5;
        a();
        de.a aVar = (de.a) this.f16764g.get();
        synchronized (aVar) {
            z5 = aVar.f15778d;
        }
        return z5;
    }

    public final void l(boolean z5) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            g gVar = ((d) it.next()).f16752a;
            if (!z5) {
                ((wd.c) gVar.f16765h.get()).b();
            }
        }
    }

    public final void m(Boolean bool) {
        a();
        de.a aVar = (de.a) this.f16764g.get();
        synchronized (aVar) {
            try {
                if (bool == null) {
                    aVar.f15776b.edit().remove("firebase_data_collection_default_enabled").apply();
                    aVar.b(aVar.a());
                } else {
                    boolean zEquals = Boolean.TRUE.equals(bool);
                    aVar.f15776b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                    aVar.b(zEquals);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        l6.i iVar = new l6.i(this);
        iVar.b(this.f16759b, "name");
        iVar.b(this.f16760c, RRWebOptionsEvent.EVENT_TAG);
        return iVar.toString();
    }
}

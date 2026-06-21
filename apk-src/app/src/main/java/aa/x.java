package aa;

import a0.d1;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Trace;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.play_billing.o1;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.Session;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import ob.g4;
import ob.r1;
import ob.w1;
import ob.x1;
import ob.z3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f719d;

    public /* synthetic */ x(int i, Object obj, Object obj2) {
        this.f717b = i;
        this.f718c = obj;
        this.f719d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2;
        String[] strArr;
        com.google.android.gms.internal.play_billing.d dVar;
        com.google.android.gms.internal.play_billing.d dVar2;
        com.google.android.gms.internal.play_billing.d dVar3;
        SharedPreferences sharedPreferences;
        boolean z5 = true;
        int i = 0;
        switch (this.f717b) {
            case 0:
                return ((a) this.f718c).getClickSignals((String) this.f719d);
            case 1:
                ci.e eVar = (ci.e) this.f719d;
                Context context = (Context) this.f718c;
                gj.a.b("FlutterLoader initTask");
                try {
                    try {
                        FlutterJNI flutterJNI = (FlutterJNI) eVar.f2296e;
                        flutterJNI.loadLibrary(context);
                        flutterJNI.updateRefreshRate();
                        ((ExecutorService) eVar.f2297f).execute(new d1(8, this));
                        File filesDir = context.getFilesDir();
                        if (filesDir == null) {
                            filesDir = new File(context.getDataDir().getPath(), "files");
                        }
                        String path = filesDir.getPath();
                        File codeCacheDir = context.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            codeCacheDir = context.getCacheDir();
                        }
                        if (codeCacheDir == null) {
                            codeCacheDir = new File(context.getDataDir().getPath(), "cache");
                        }
                        String path2 = codeCacheDir.getPath();
                        File dir = context.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                        if (dir == null) {
                            dir = new File(context.getDataDir().getPath(), "app_flutter");
                        }
                        dir.getPath();
                        ci.d dVar4 = new ci.d(path, path2);
                        Trace.endSection();
                        return dVar4;
                    } catch (UnsatisfiedLinkError e3) {
                        if (!e3.toString().contains("couldn't find \"libflutter.so\"") && !e3.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e3;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File((String) ((ci.b) eVar.f2295d).f2284e);
                        String[] list = file.list();
                        ArrayList arrayList = new ArrayList();
                        String[] strArr2 = Build.SUPPORTED_ABIS;
                        int length = strArr2.length;
                        int i10 = 0;
                        while (i10 < length) {
                            String str3 = strArr2[i10];
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("!");
                            String str4 = File.separator;
                            sb2.append(str4);
                            sb2.append("lib");
                            sb2.append(str4);
                            sb2.append(str3);
                            String string = sb2.toString();
                            String[] strArr3 = context.getApplicationInfo().splitSourceDirs;
                            ArrayList arrayList2 = new ArrayList();
                            if (strArr3 != null) {
                                int length2 = strArr3.length;
                                int i11 = i;
                                while (i11 < length2) {
                                    arrayList2.add(strArr3[i11] + string);
                                    i11++;
                                    list = list;
                                }
                                strArr = list;
                                arrayList.addAll(arrayList2);
                            } else {
                                strArr = list;
                            }
                            String str5 = context.getApplicationInfo().sourceDir;
                            if (str5 != null && !str5.isEmpty()) {
                                arrayList.add(str5 + string);
                            }
                            i10++;
                            list = strArr;
                            i = 0;
                        }
                        String[] strArr4 = list;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                        sb3.append(property);
                        sb3.append(", and the native libraries directory (with path ");
                        sb3.append(file.getAbsolutePath());
                        sb3.append(") ");
                        if (file.exists()) {
                            str = "contains the following files: " + Arrays.toString(strArr4);
                        } else {
                            str = "does not exist";
                        }
                        sb3.append(str);
                        if (arrayList.isEmpty()) {
                            str2 = "";
                        } else {
                            str2 = ", and the split and source libraries directory (with path(s) " + arrayList + ")";
                        }
                        sb3.append(str2);
                        sb3.append(".");
                        throw new UnsupportedOperationException(sb3.toString(), e3);
                    }
                } finally {
                }
            case 2:
                d8.e eVar2 = (d8.e) this.f718c;
                yi.f0 f0Var = (yi.f0) this.f719d;
                eVar2.getClass();
                try {
                    synchronized (eVar2.f15594a) {
                        dVar = eVar2.f15601h;
                        break;
                    }
                    if (dVar == null) {
                        eVar2.A(f0Var, d8.n0.f15669k, 119, null);
                    } else {
                        String packageName = eVar2.f15599f.getPackageName();
                        String str6 = eVar2.f15596c;
                        long jLongValue = eVar2.E.longValue();
                        int i12 = o1.f14257a;
                        Bundle bundle = new Bundle();
                        o1.b(bundle, str6, jLongValue);
                        ((com.google.android.gms.internal.play_billing.b) dVar).t4(packageName, bundle, new d8.a0(f0Var, eVar2.f15600g, eVar2.f15604l, (byte) 0));
                    }
                } catch (DeadObjectException e7) {
                    eVar2.A(f0Var, d8.n0.f15669k, 69, e7);
                } catch (Exception e10) {
                    eVar2.A(f0Var, d8.n0.i, 69, e10);
                }
                return null;
            case 3:
                d8.e eVar3 = (d8.e) this.f718c;
                yi.f0 f0Var2 = (yi.f0) this.f719d;
                try {
                    synchronized (eVar3.f15594a) {
                        dVar2 = eVar3.f15601h;
                        break;
                    }
                    if (dVar2 == null) {
                        eVar3.F(f0Var2, d8.n0.f15669k, 119, null);
                    } else {
                        String packageName2 = eVar3.f15599f.getPackageName();
                        String str7 = eVar3.f15596c;
                        long jLongValue2 = eVar3.E.longValue();
                        Bundle bundle2 = new Bundle();
                        o1.b(bundle2, str7, jLongValue2);
                        ((com.google.android.gms.internal.play_billing.b) dVar2).s4(packageName2, bundle2, new d8.a0(f0Var2, eVar3.f15600g, eVar3.f15604l));
                    }
                } catch (DeadObjectException e11) {
                    eVar3.F(f0Var2, d8.n0.f15669k, 62, e11);
                } catch (Exception e12) {
                    eVar3.F(f0Var2, d8.n0.i, 62, e12);
                }
                return null;
            case 4:
                d8.e eVar4 = (d8.e) this.f718c;
                s3.q qVar = (s3.q) this.f719d;
                eVar4.getClass();
                try {
                    synchronized (eVar4.f15594a) {
                        dVar3 = eVar4.f15601h;
                        break;
                    }
                    if (dVar3 == null) {
                        eVar4.C(qVar, d8.n0.f15669k, 119, null);
                    } else {
                        String packageName3 = eVar4.f15599f.getPackageName();
                        String str8 = eVar4.f15596c;
                        long jLongValue3 = eVar4.E.longValue();
                        int i13 = o1.f14257a;
                        Bundle bundle3 = new Bundle();
                        o1.b(bundle3, str8, jLongValue3);
                        ((com.google.android.gms.internal.play_billing.b) dVar3).q4(packageName3, bundle3, new d8.a0(qVar, eVar4.f15600g, eVar4.f15604l));
                    }
                } catch (DeadObjectException e13) {
                    eVar4.C(qVar, d8.n0.f15669k, 70, e13);
                } catch (Exception e14) {
                    eVar4.C(qVar, d8.n0.i, 70, e14);
                }
                return null;
            case 5:
                r1 r1Var = (r1) this.f718c;
                r1Var.f30382b.B();
                ob.n nVar = r1Var.f30382b.f30607d;
                z3.T(nVar);
                return nVar.x0((String) this.f719d);
            case 6:
                r1 r1Var2 = (r1) this.f719d;
                r1Var2.f30382b.B();
                return new ob.i(r1Var2.f30382b.o0(((g4) this.f718c).f30131b));
            case 7:
                g4 g4Var = (g4) this.f718c;
                String str9 = g4Var.f30131b;
                pa.c0.i(str9);
                z3 z3Var = (z3) this.f719d;
                x1 x1VarA = z3Var.a(str9);
                w1 w1Var = w1.ANALYTICS_STORAGE;
                if (x1VarA.i(w1Var) && x1.c(100, g4Var.f30148t).i(w1Var)) {
                    return z3Var.b0(g4Var).E();
                }
                z3Var.b().f30418o.f("Analytics storage consent denied. Returning null app instance id");
                return null;
            case 8:
                return ((p9.e) this.f718c).k((Context) this.f719d);
            case 9:
                Context context2 = (Context) this.f718c;
                Context context3 = (Context) this.f719d;
                if (context2 != null) {
                    t9.c0.m("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                    z5 = false;
                } else {
                    t9.c0.m("Attempting to read user agent from local cache.");
                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                }
                String string2 = sharedPreferences.getString(Session.JsonKeys.USER_AGENT, "");
                if (TextUtils.isEmpty(string2)) {
                    t9.c0.m("Reading user agent from WebSettings");
                    string2 = WebSettings.getDefaultUserAgent(context3);
                    if (z5) {
                        sharedPreferences.edit().putString(Session.JsonKeys.USER_AGENT, string2).apply();
                        t9.c0.m("Persisting user agent.");
                    }
                }
                return string2;
            default:
                t9.d0 d0Var = t9.g0.f33596l;
                String absolutePath = ((Context) this.f719d).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = (WebSettings) this.f718c;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3042i1)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ x(int i, Object obj, Object obj2, boolean z5) {
        this.f717b = i;
        this.f719d = obj;
        this.f718c = obj2;
    }

    public x(z3 z3Var, g4 g4Var) {
        this.f717b = 7;
        this.f718c = g4Var;
        Objects.requireNonNull(z3Var);
        this.f719d = z3Var;
    }
}

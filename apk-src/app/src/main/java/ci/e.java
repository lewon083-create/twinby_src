package ci;

import a0.u;
import aa.x;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.internal.measurement.t0;
import dl.k;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2298g;

    public e(Context context, t0 t0Var, Long l10) {
        this.f2293b = true;
        c0.i(context);
        Context applicationContext = context.getApplicationContext();
        c0.i(applicationContext);
        this.f2294c = applicationContext;
        this.f2297f = l10;
        if (t0Var != null) {
            this.f2296e = t0Var;
            this.f2293b = t0Var.f13971d;
            this.f2292a = t0Var.f13970c;
            this.f2298g = t0Var.f13973f;
            Bundle bundle = t0Var.f13972e;
            if (bundle != null) {
                this.f2295d = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }

    public static String c(Context context, String str) {
        if (!str.startsWith("--aot-shared-library-name=")) {
            throw new IllegalArgumentException("AOT shared library name flag was not specified correctly; please use --aot-shared-library-name=<path>.");
        }
        File file = new File(str.substring(26));
        try {
            String canonicalPath = file.getCanonicalPath();
            StringBuilder sbJ = pe.a.j(context.getApplicationContext().getFilesDir().getCanonicalPath());
            sbJ.append(File.separator);
            boolean zStartsWith = canonicalPath.startsWith(sbJ.toString());
            boolean zEndsWith = canonicalPath.endsWith(".so");
            if (zStartsWith && zEndsWith) {
                return "--aot-shared-library-name=".concat(canonicalPath);
            }
            Log.e("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e("FlutterLoader", "External path " + file.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public void a(Context context, String[] strArr) {
        if (this.f2293b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (((nc.e) this.f2294c) == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            gj.a.b("FlutterLoader#ensureInitializationComplete");
            try {
                d dVar = (d) ((Future) this.f2298g).get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + ((String) ((b) this.f2295d).f2284e) + File.separator + "libflutter.so");
                if (strArr != null) {
                    for (String str : strArr) {
                        if (str.startsWith("--aot-shared-library-name=")) {
                            String strC = c(context, str);
                            if (strC != null) {
                                str = strC;
                                arrayList.add(str);
                            } else {
                                Log.w("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
                            }
                        } else {
                            arrayList.add(str);
                        }
                    }
                }
                arrayList.add("--aot-shared-library-name=" + ((String) ((b) this.f2295d).f2281b));
                arrayList.add("--aot-shared-library-name=" + ((String) ((b) this.f2295d).f2284e) + File.separator + ((String) ((b) this.f2295d).f2281b));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(dVar.f2291b);
                arrayList.add(sb2.toString());
                Object obj = ((b) this.f2295d).f2283d;
                arrayList.add("--domain-network-policy=" + ((String) ((b) this.f2295d).f2283d));
                ((nc.e) this.f2294c).getClass();
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i = (int) ((r7.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false)) {
                        throw new IllegalArgumentException("io.flutter.embedding.android.DisableMergedPlatformUIThread is no longer allowed.");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false)) {
                        arrayList.add("--enable-flutter-gpu");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=" + (bundle == null ? true : bundle.getBoolean("io.flutter.embedding.android.LeakVM", true) ? "true" : "false"));
                ((FlutterJNI) this.f2296e).init(context, (String[]) arrayList.toArray(new String[0]), null, dVar.f2290a, dVar.f2291b, SystemClock.uptimeMillis() - this.f2292a, Build.VERSION.SDK_INT);
                this.f2293b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e3) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e3);
            throw new RuntimeException(e3);
        }
    }

    public String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) ((b) this.f2295d).f2282c);
        return u.o(sb2, File.separator, str);
    }

    public void d(Context context) {
        nc.e eVar = new nc.e();
        if (((nc.e) this.f2294c) != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        gj.a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f2294c = eVar;
            this.f2292a = SystemClock.uptimeMillis();
            this.f2295d = a.a(applicationContext);
            k kVarB = k.b((DisplayManager) applicationContext.getSystemService("display"), (FlutterJNI) this.f2296e);
            ((FlutterJNI) kVarB.f15872c).setAsyncWaitForVsyncDelegate((io.flutter.view.b) kVarB.f15874e);
            this.f2298g = ((ExecutorService) this.f2297f).submit(new x(1, this, applicationContext, false));
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

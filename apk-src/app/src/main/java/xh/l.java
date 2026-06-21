package xh;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.jw1;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.flutter.embedding.engine.FlutterEngine;
import io.sentry.protocol.SentryThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k6.t0;
import m.h3;
import z2.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends z2.w implements f, e {
    public static final int i = View.generateViewId();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f36145h;

    @Override // xh.f
    public final FlutterEngine b() {
        return null;
    }

    public final String k() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int l() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    public final String m() {
        String string;
        try {
            Bundle bundleO = o();
            string = bundleO != null ? bundleO.getString("io.flutter.Entrypoint") : null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return string != null ? string : SentryThread.JsonKeys.MAIN;
    }

    public final String n() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleO = o();
            if (bundleO != null) {
                return bundleO.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle o() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // z2.w, d.n, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f36145h.t(i10, i11, intent);
    }

    @Override // d.n, android.app.Activity
    public final void onBackPressed() {
        this.f36145h.R();
    }

    @Override // z2.w, d.n, t1.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        k kVar;
        Bundle bundleO;
        Bundle bundleO2;
        int i10;
        try {
            Bundle bundleO3 = o();
            if (bundleO3 != null && (i10 = bundleO3.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i10);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterFragmentActivity", "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
        this.f36145h = (k) i().D("flutter_fragment");
        super.onCreate(bundle);
        if (l() == 2) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        FrameLayout frameLayout = new FrameLayout(this);
        int i11 = i;
        frameLayout.setId(i11);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayout);
        Window window = getWindow();
        window.addFlags(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
        if (Build.VERSION.SDK_INT < 35) {
            window.setStatusBarColor(1073741824);
        }
        window.getDecorView().setSystemUiVisibility(1280);
        if (this.f36145h == null) {
            this.f36145h = (k) i().D("flutter_fragment");
        }
        if (this.f36145h == null) {
            int iL = l();
            int i12 = l() == 1 ? 1 : 2;
            int i13 = iL == 1 ? 1 : 2;
            boolean z5 = i12 == 1;
            if (getIntent().getStringExtra("cached_engine_id") != null) {
                getIntent().getStringExtra("cached_engine_id");
                getIntent().getBooleanExtra("destroy_engine_with_activity", false);
                String stringExtra = getIntent().getStringExtra("cached_engine_id");
                int i14 = k.Z;
                boolean zP = p();
                str = "flutter_fragment";
                boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
                try {
                    kVar = (k) k.class.getDeclaredConstructor(null).newInstance(null);
                    if (kVar == null) {
                        throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + k.class.getCanonicalName() + ") does not match the expected return type.");
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("cached_engine_id", stringExtra);
                    bundle2.putBoolean("destroy_engine_with_fragment", booleanExtra);
                    bundle2.putBoolean("handle_deeplinking", zP);
                    bundle2.putString("flutterview_render_mode", pe.a.u(i12));
                    bundle2.putString("flutterview_transparency_mode", pe.a.v(i13));
                    bundle2.putBoolean("should_attach_engine_to_activity", true);
                    bundle2.putBoolean("should_automatically_handle_on_back_pressed", true);
                    bundle2.putBoolean("should_delay_first_android_view_draw", z5);
                    kVar.P(bundle2);
                } catch (Exception e3) {
                    throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + k.class.getName() + ")", e3);
                }
            } else {
                str = "flutter_fragment";
                getIntent().getStringExtra("cached_engine_group_id");
                m();
                try {
                    bundleO2 = o();
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                String string = bundleO2 != null ? bundleO2.getString("io.flutter.EntrypointUri") : null;
                if (string != null) {
                    try {
                        Bundle bundleO4 = o();
                        if (bundleO4 != null) {
                            bundleO4.getString("io.flutter.EntrypointUri");
                        }
                    } catch (PackageManager.NameNotFoundException unused3) {
                    }
                }
                n();
                k();
                if (getIntent().getStringExtra("cached_engine_group_id") != null) {
                    String stringExtra2 = getIntent().getStringExtra("cached_engine_group_id");
                    int i15 = k.Z;
                    j jVar = new j(stringExtra2);
                    jVar.f36138b = m();
                    jVar.f36139c = n();
                    jVar.f36140d = p();
                    jVar.f36141e = i12;
                    jVar.f36142f = i13;
                    jVar.f36144h = z5;
                    jVar.f36143g = true;
                    try {
                        kVar = (k) k.class.getDeclaredConstructor(null).newInstance(null);
                        if (kVar == null) {
                            throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + k.class.getCanonicalName() + ") does not match the expected return type.");
                        }
                        kVar.P(jVar.a());
                    } catch (Exception e7) {
                        throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + k.class.getName() + ")", e7);
                    }
                } else {
                    int i16 = k.Z;
                    i iVar = new i();
                    iVar.f36127a = SentryThread.JsonKeys.MAIN;
                    iVar.f36128b = null;
                    iVar.f36130d = "/";
                    iVar.f36131e = false;
                    iVar.f36132f = null;
                    iVar.f36133g = null;
                    iVar.f36134h = 1;
                    iVar.i = 2;
                    iVar.f36135j = false;
                    iVar.f36136k = false;
                    iVar.f36127a = m();
                    try {
                        bundleO = o();
                    } catch (PackageManager.NameNotFoundException unused4) {
                    }
                    String string2 = bundleO != null ? bundleO.getString("io.flutter.EntrypointUri") : null;
                    iVar.f36128b = string2;
                    iVar.f36129c = (List) getIntent().getSerializableExtra("dart_entrypoint_args");
                    iVar.f36130d = n();
                    iVar.f36132f = k();
                    iVar.f36133g = t0.k(getIntent());
                    iVar.f36131e = p();
                    iVar.f36134h = i12;
                    iVar.i = i13;
                    iVar.f36136k = z5;
                    iVar.f36135j = true;
                    try {
                        kVar = (k) k.class.getDeclaredConstructor(null).newInstance(null);
                        if (kVar == null) {
                            throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + k.class.getCanonicalName() + ") does not match the expected return type.");
                        }
                        kVar.P(iVar.a());
                    } catch (Exception e10) {
                        throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + k.class.getName() + ")", e10);
                    }
                }
            }
            this.f36145h = kVar;
            h0 h0VarI = i();
            h0VarI.getClass();
            z2.a aVar = new z2.a(h0VarI);
            aVar.e(i11, this.f36145h, str, 1);
            aVar.d(false);
        }
    }

    @Override // d.n, android.app.Activity
    public final void onNewIntent(Intent intent) {
        k kVar = this.f36145h;
        if (kVar.U("onNewIntent")) {
            d dVar = kVar.W;
            dVar.c();
            FlutterEngine flutterEngine = dVar.f36107b;
            if (flutterEngine != null) {
                jw1 jw1Var = flutterEngine.f25544d;
                if (jw1Var.f()) {
                    gj.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                    try {
                        Iterator it = ((HashSet) ((h3) jw1Var.f6960g).f28254f).iterator();
                        while (it.hasNext()) {
                            ((ii.t) it.next()).onNewIntent(intent);
                        }
                        Trace.endSection();
                    } catch (Throwable th2) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
                }
                String strD = dVar.d(intent);
                if (strD != null && !strD.isEmpty()) {
                    a7.l lVar = dVar.f36107b.i;
                    lVar.getClass();
                    HashMap map = new HashMap();
                    map.put("location", strD);
                    ((ii.q) lVar.f491c).a("pushRouteInformation", map, null);
                }
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            }
        }
        super.onNewIntent(intent);
    }

    @Override // z2.w, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        k kVar = this.f36145h;
        if (kVar.U("onPostResume")) {
            d dVar = kVar.W;
            dVar.c();
            if (dVar.f36107b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            d1.b bVar = dVar.f36109d;
            if (bVar != null) {
                bVar.E();
            }
            dVar.f36107b.f25557r.k();
        }
    }

    @Override // z2.w, d.n, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        this.f36145h.D(i10, strArr, iArr);
    }

    @Override // d.n, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        this.f36145h.onTrimMemory(i10);
    }

    @Override // d.n, android.app.Activity
    public final void onUserLeaveHint() {
        k kVar = this.f36145h;
        if (kVar.U("onUserLeaveHint")) {
            d dVar = kVar.W;
            dVar.c();
            FlutterEngine flutterEngine = dVar.f36107b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            jw1 jw1Var = flutterEngine.f25544d;
            if (!jw1Var.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            gj.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((h3) jw1Var.f6960g).f28255g).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
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

    public final boolean p() {
        try {
            Bundle bundleO = o();
            if (bundleO == null || !bundleO.containsKey("flutter_deeplinking_enabled")) {
                return true;
            }
            return bundleO.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // xh.e
    public final void e(FlutterEngine flutterEngine) {
    }
}

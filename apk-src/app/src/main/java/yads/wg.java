package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.AppMetrica;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wg implements dh {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f44379g = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug f44380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fh f44381b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44384e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f44382c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rg f44383d = new rg();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f44385f = new Object();

    public wg(ug ugVar, fh fhVar) {
        this.f44380a = ugVar;
        this.f44381b = fhVar;
    }

    public final void a() {
        ug ugVar = this.f44380a;
        synchronized (ugVar.f43643a) {
            ugVar.f43644b.clear();
            Unit unit = Unit.f27471a;
        }
    }

    public final void b() {
        this.f44382c.postDelayed(new zl.a1(2, new vg(this)), f44379g);
    }

    public final void c() {
        synchronized (this.f44385f) {
            this.f44382c.removeCallbacksAndMessages(null);
            this.f44384e = false;
            Unit unit = Unit.f27471a;
        }
    }

    public static final void a(Function0 function0) {
        function0.invoke();
    }

    public final void a(Context context) {
        boolean z5;
        synchronized (this.f44385f) {
            try {
                if (this.f44384e) {
                    z5 = false;
                } else {
                    z5 = true;
                    this.f44384e = true;
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            b();
            this.f44381b.getClass();
            try {
                AppMetrica.requestStartupParams(context, new hh(this), ih.f39539a);
            } catch (Throwable unused) {
                ch chVar = ch.f37393b;
                c();
                this.f44383d.f42594a.getClass();
                String str = (String) sg.f42931a.get(chVar);
                if (str == null) {
                    str = "Unknown";
                }
                rg.a(str);
                a();
            }
        }
    }
}

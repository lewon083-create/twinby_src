package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d31 implements e31 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f37605h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh f37606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yg f37607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wg f37608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f37609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tg f37610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f31 f37611f = f31.f38360b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f37612g;

    public d31(Context context, fh fhVar, yg ygVar, wg wgVar, dj1 dj1Var) {
        this.f37606a = fhVar;
        this.f37607b = ygVar;
        this.f37608c = wgVar;
        this.f37609d = context.getApplicationContext();
        this.f37612g = dj1Var.a();
    }

    public final void a(tg tgVar) {
        synchronized (f37605h) {
            try {
                this.f37607b.getClass();
                String str = tgVar.f43316a;
                String str2 = tgVar.f43317b;
                String str3 = tgVar.f43318c;
                boolean z5 = true;
                if (!(str3 == null || str3.length() == 0)) {
                    if (!(str == null || str.length() == 0)) {
                        if (str2 != null && str2.length() != 0) {
                            z5 = false;
                        }
                        if (!z5) {
                            this.f37610e = tgVar;
                        }
                    }
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        wg wgVar = this.f37608c;
        Context context = this.f37609d;
        ug ugVar = wgVar.f44380a;
        synchronized (ugVar.f43643a) {
            ugVar.f43644b.add(this);
        }
        try {
            wgVar.a(context);
        } catch (Throwable unused) {
            wgVar.c();
        }
    }
}

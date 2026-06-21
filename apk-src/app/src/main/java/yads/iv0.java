package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class iv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f39648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c62 f39649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g72 f39650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f39651d;

    public /* synthetic */ iv0(Context context, w5 w5Var) {
        this(w5Var, new c62(context), new g72());
    }

    public final void a() {
        synchronized (this.f39651d) {
            this.f39649b.a();
            Unit unit = Unit.f27471a;
        }
    }

    public iv0(w5 w5Var, c62 c62Var, g72 g72Var) {
        this.f39648a = w5Var;
        this.f39649b = c62Var;
        this.f39650c = g72Var;
        this.f39651d = new Object();
    }
}

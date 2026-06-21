package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b21 implements a21, oy0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j21 f3562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r81 f3563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ux0 f3564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f3565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ed.d f3566h;

    public b21(Context context, j21 j21Var, ux0 ux0Var, r81 r81Var) {
        this.f3560b = 0;
        this.f3565g = new AtomicBoolean(false);
        this.f3566h = vv.d("E");
        this.f3561c = context;
        this.f3562d = j21Var;
        this.f3564f = ux0Var;
        this.f3563e = r81Var;
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void a(HashMap map) {
        switch (this.f3560b) {
            case 0:
                d(map);
                break;
            default:
                map.put("gs", this.f3566h);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void b(HashMap map) {
        switch (this.f3560b) {
            case 0:
                d(map);
                break;
            default:
                map.put("gs", this.f3566h);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void c(HashMap map, Context context, View view) {
        switch (this.f3560b) {
            case 0:
                d(map);
                break;
            default:
                map.put("gs", this.f3566h);
                break;
        }
    }

    public void d(HashMap map) {
        synchronized (this) {
            map.put("ai", this.f3566h);
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final ed.d h() {
        switch (this.f3560b) {
            case 0:
                if (this.f3565g.getAndSet(true)) {
                    return n81.f8237c;
                }
                return ((gx) this.f3563e).b(new do0(8, this));
            default:
                if (this.f3565g.getAndSet(true) || !this.f3564f.G()) {
                    return n81.f8237c;
                }
                return ((gx) this.f3563e).a(new kr0(8, this));
        }
    }

    public b21(Context context, j21 j21Var, r81 r81Var, ux0 ux0Var) {
        this.f3560b = 1;
        this.f3565g = new AtomicBoolean(false);
        this.f3566h = n81.f8237c;
        this.f3561c = context;
        this.f3562d = j21Var;
        this.f3563e = r81Var;
        this.f3564f = ux0Var;
    }
}

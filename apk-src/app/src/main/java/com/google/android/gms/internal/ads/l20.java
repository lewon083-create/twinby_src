package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l20 implements k20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9.e0 f7378b;

    public /* synthetic */ l20(t9.e0 e0Var, int i) {
        this.f7377a = i;
        this.f7378b = e0Var;
    }

    @Override // com.google.android.gms.internal.ads.k20
    public final void a(HashMap map) {
        switch (this.f7377a) {
            case 0:
                boolean z5 = Boolean.parseBoolean((String) map.get("content_url_opted_out"));
                t9.e0 e0Var = this.f7378b;
                e0Var.i();
                synchronized (e0Var.f33564a) {
                    try {
                        if (e0Var.f33583u == z5) {
                            return;
                        }
                        e0Var.f33583u = z5;
                        SharedPreferences.Editor editor = e0Var.f33570g;
                        if (editor != null) {
                            editor.putBoolean("content_url_opted_out", z5);
                            e0Var.f33570g.apply();
                        }
                        e0Var.j();
                        return;
                    } finally {
                    }
                }
            default:
                boolean z10 = Boolean.parseBoolean((String) map.get("content_vertical_opted_out"));
                t9.e0 e0Var2 = this.f7378b;
                e0Var2.i();
                synchronized (e0Var2.f33564a) {
                    try {
                        if (e0Var2.f33584v == z10) {
                            return;
                        }
                        e0Var2.f33584v = z10;
                        SharedPreferences.Editor editor2 = e0Var2.f33570g;
                        if (editor2 != null) {
                            editor2.putBoolean("content_vertical_opted_out", z10);
                            e0Var2.f33570g.apply();
                        }
                        e0Var2.j();
                        return;
                    } finally {
                    }
                }
        }
    }
}

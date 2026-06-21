package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.gms.internal.measurement.g4;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import m.h3;
import m.n2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13232b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj) {
        super(null);
        this.f13231a = i;
        this.f13232b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f13231a) {
            case 4:
                return true;
            case 5:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        Cursor cursor;
        switch (this.f13231a) {
            case 0:
                j jVar = (j) this.f13232b;
                synchronized (jVar.f13242d) {
                    jVar.f13243e = null;
                    p.i.incrementAndGet();
                    break;
                }
                synchronized (jVar) {
                    try {
                        Iterator it = jVar.f13244f.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                ((AtomicBoolean) ((h3) this.f13232b).f28250b).set(true);
                return;
            case 2:
                g4 g4Var = (g4) this.f13232b;
                synchronized (g4Var.f13760f) {
                    g4Var.f13761g = null;
                    g4Var.f13757c.run();
                    break;
                }
                synchronized (g4Var) {
                    try {
                        Iterator it2 = g4Var.f13762h.iterator();
                        if (it2.hasNext()) {
                            if (it2.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                onChange(z5, null);
                return;
            case 4:
                n2 n2Var = (n2) this.f13232b;
                if (!n2Var.f26833c || (cursor = n2Var.f26834d) == null || cursor.isClosed()) {
                    return;
                }
                n2Var.f26832b = n2Var.f26834d.requery();
                return;
            default:
                super.onChange(z5);
                xh.s sVar = (xh.s) this.f13232b;
                if (sVar.f36176k == null) {
                    return;
                }
                sVar.d();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Handler handler, int i) {
        super(handler);
        this.f13231a = i;
        this.f13232b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h3 h3Var) {
        super(null);
        this.f13231a = 1;
        Objects.requireNonNull(h3Var);
        this.f13232b = h3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n2 n2Var) {
        super(new Handler());
        this.f13231a = 4;
        this.f13232b = n2Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z5, Uri uri) {
        switch (this.f13231a) {
            case 3:
                io.flutter.view.h hVar = (io.flutter.view.h) this.f13232b;
                if (!hVar.f25865u) {
                    if (Settings.Global.getFloat(hVar.f25851f, "transition_animation_scale", 1.0f) == 0.0f) {
                        hVar.f25856l |= 4;
                    } else {
                        hVar.f25856l &= -5;
                    }
                    ((FlutterJNI) hVar.f25847b.f27325d).setAccessibilityFeatures(hVar.f25856l);
                    break;
                }
                break;
            default:
                super.onChange(z5, uri);
                break;
        }
    }
}

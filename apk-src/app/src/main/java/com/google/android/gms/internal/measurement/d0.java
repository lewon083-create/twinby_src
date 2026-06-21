package com.google.android.gms.internal.measurement;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.g f13692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.firebase.messaging.y f13693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bb.e f13694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f13695d;

    public d0() {
        s7.g gVar = new s7.g(5);
        this.f13692a = gVar;
        this.f13693b = ((com.google.firebase.messaging.y) gVar.f32796c).C();
        this.f13694c = new bb.e(6);
        this.f13695d = new t(3);
        final int i = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d0 f13644c;

            {
                this.f13644c = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i) {
                    case 0:
                        return new k4(this.f13644c.f13694c);
                    default:
                        return new k4(this.f13644c.f13695d);
                }
            }
        };
        z5 z5Var = (z5) gVar.f32798e;
        ((HashMap) z5Var.f14118a).put("internal.registerCallback", callable);
        final int i10 = 0;
        ((HashMap) z5Var.f14118a).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d0 f13644c;

            {
                this.f13644c = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i10) {
                    case 0:
                        return new k4(this.f13644c.f13694c);
                    default:
                        return new k4(this.f13644c.f13695d);
                }
            }
        });
    }

    public final boolean a(b bVar) throws p0 {
        bb.e eVar = this.f13694c;
        try {
            eVar.f2019c = bVar;
            eVar.f2020d = bVar.clone();
            ((ArrayList) eVar.f2021e).clear();
            ((com.google.firebase.messaging.y) this.f13692a.f32797d).E("runtime.counter", new g(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)));
            this.f13695d.d(this.f13693b.C(), eVar);
            if (((b) eVar.f2020d).equals((b) eVar.f2019c)) {
                return !((ArrayList) eVar.f2021e).isEmpty();
            }
            return true;
        } catch (Throwable th2) {
            throw new p0(th2);
        }
    }

    public final void b(x3 x3Var) {
        h hVar;
        try {
            s7.g gVar = this.f13692a;
            this.f13693b = ((com.google.firebase.messaging.y) gVar.f32796c).C();
            if (gVar.O(this.f13693b, (y3[]) x3Var.p().toArray(new y3[0])) instanceof f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (w3 w3Var : x3Var.q().p()) {
                List listQ = w3Var.q();
                String strP = w3Var.p();
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    n nVarO = gVar.O(this.f13693b, (y3) it.next());
                    if (!(nVarO instanceof k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    com.google.firebase.messaging.y yVar = this.f13693b;
                    if (yVar.D(strP)) {
                        n nVarG = yVar.G(strP);
                        if (!(nVarG instanceof h)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strP)));
                        }
                        hVar = (h) nVarG;
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strP)));
                    }
                    hVar.b(this.f13693b, Collections.singletonList(nVarO));
                }
            }
        } catch (Throwable th2) {
            throw new p0(th2);
        }
    }
}

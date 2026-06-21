package oa;

import ad.m0;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends z2.t implements h {
    public static final WeakHashMap W = new WeakHashMap();
    public final m0 V = new m0();

    @Override // z2.t
    public final void E() {
        this.E = true;
        m0 m0Var = this.V;
        m0Var.f839c = 3;
        Iterator it = ((Map) m0Var.f840d).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).d();
        }
    }

    @Override // z2.t
    public final void F(Bundle bundle) {
        this.V.x(bundle);
    }

    @Override // z2.t
    public final void G() {
        this.E = true;
        m0 m0Var = this.V;
        m0Var.f839c = 2;
        for (n nVar : ((Map) m0Var.f840d).values()) {
            nVar.f29863c = true;
            nVar.d();
        }
    }

    @Override // z2.t
    public final void H() {
        this.E = true;
        m0 m0Var = this.V;
        m0Var.f839c = 4;
        Iterator it = ((Map) m0Var.f840d).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).c();
        }
    }

    @Override // oa.h
    public final n a() {
        return (n) n.class.cast(((Map) this.V.f840d).get("ConnectionlessLifecycleHelper"));
    }

    @Override // oa.h
    public final void f(n nVar) {
        this.V.u(nVar);
    }

    @Override // z2.t
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.V.f840d).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).getClass();
        }
    }

    @Override // z2.t
    public final void t(int i, int i10, Intent intent) {
        super.t(i, i10, intent);
        this.V.w(i, i10, intent);
    }

    @Override // z2.t
    public final void w(Bundle bundle) {
        super.w(bundle);
        this.V.v(bundle);
    }

    @Override // z2.t
    public final void y() {
        this.E = true;
        m0 m0Var = this.V;
        m0Var.f839c = 5;
        Iterator it = ((Map) m0Var.f840d).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).getClass();
        }
    }
}
